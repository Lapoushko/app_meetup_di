package com.example.app_meetup_di.domain.entity

/**
 * @author Lapoushko
 */
data class Car(
    val name: String,
    val body: String,
    val engine: Engine?,
    val wheels: List<Wheel>
)
