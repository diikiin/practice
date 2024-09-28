package com.dikin.practice.models

import java.time.LocalDateTime

data class Workout(
    val fromHour: LocalDateTime,
    val toHour: LocalDateTime,
    var registeredPeople: Int,
    var maximumPeople: Int,
    var fulled: Boolean = false,
    var canceled: Boolean = false
) {

    fun addHuman() {
        if (!fulled || !canceled || registeredPeople < maximumPeople) {
            this.registeredPeople++
            fulled()
        }
    }

    fun fulled() {
        if (registeredPeople == maximumPeople)
            this.fulled = true
    }

    fun cancel() {
        this.canceled = true
    }
}
