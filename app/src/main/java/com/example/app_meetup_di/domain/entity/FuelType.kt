package com.example.app_meetup_di.domain.entity

enum class FuelType(name: String){
    GASOLINE("Бензин"),
    DIESEL("Дизель"),
    BIOFUEL("Биотопливо")
}

fun String.getFuelTypeEngine() = FuelType.entries.find { it.name == this }
