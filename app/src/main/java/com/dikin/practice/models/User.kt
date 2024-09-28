package com.dikin.practice.models

data class User(
    val id: Int,
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String
) {
    fun getUserInfo(): String {
        return "Id: $id, First Name: $firstName, Last Name: $lastName, Email: $email"
    }

    fun updatePassword(password: String) {
        this.password = password
    }
}