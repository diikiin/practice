package com.dikin.practice.models

data class Gym(
    val id: Int,
    var name: String,
    var address: String,
    var gymSchedule: GymSchedule
) {

    fun updateAddress(address: String) {
        this.address = address
    }

    fun updateSchedule(gymSchedule: GymSchedule) {
        this.gymSchedule = gymSchedule
    }
}