package com.dikin.practice.models

import java.time.LocalDate
import java.time.LocalDateTime

data class WorkoutSchedule(
    var date: LocalDate,
    var workout: Workout,
    var gymName: String,
    var gymAddress: String,
    var user: User,
    var confirmed: Boolean = false
) {
    fun updateWorkout(workout: Workout) {
        this.workout = workout
    }

    fun confirm() {
        this.confirmed = true
    }
}