package com.dikin.practice.models

data class GymSchedule(
    var workouts: List<Workout>,
    var workingDays: IntRange,
    var holiday: Boolean = false
) {
    fun getGymSchedule(): String {
        return "Workouts: $workouts, Working Daya: $workingDays, Holiday: $holiday"
    }

    fun setHoliday() {
        this.holiday = true
    }
}
