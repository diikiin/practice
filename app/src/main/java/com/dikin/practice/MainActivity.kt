package com.dikin.practice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val datePicker = findViewById<DatePicker>(R.id.date_picker)
        val editText = findViewById<EditText>(R.id.edit_text)
        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val day = datePicker.dayOfMonth
            val month = datePicker.month
            val year = datePicker.year
            val date = "$day/$month/$year"

            val email = editText.text.toString()

            val isAgreed = checkBox.isChecked

            val intent = Intent(this, AnotherActivity::class.java)
            intent.putExtra("date", date)
            intent.putExtra("email", email)
            intent.putExtra("agreed", isAgreed)

            startActivity(intent)
        }
    }
}
