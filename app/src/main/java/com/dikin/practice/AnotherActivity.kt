package com.dikin.practice

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class AnotherActivity : Activity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val date = intent.getStringExtra("date")
        val email = intent.getStringExtra("email")
        val isAgreed = intent.getStringExtra("agreed")

        val dateView = findViewById<TextView>(R.id.date)
        val emailView = findViewById<TextView>(R.id.email)
        val agreedView = findViewById<TextView>(R.id.agreed)

        dateView.text = "Date: $date"
        emailView.text = "Email: $email"
        agreedView.text = "Is agreed: $isAgreed"
    }
}