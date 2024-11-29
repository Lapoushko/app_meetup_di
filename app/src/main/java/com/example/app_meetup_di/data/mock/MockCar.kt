package com.example.app_meetup_di.data.mock

import com.example.app_meetup_di.domain.entity.Car
import com.example.app_meetup_di.domain.entity.Engine
import com.example.app_meetup_di.domain.entity.FuelType
import com.example.app_meetup_di.domain.entity.Wheel

/**
 * @author Lapoushko
 */
class MockCar {
    private val wheel = Wheel(
        name = "175 / 65 R14",
        diameter = 14.0
    )
    val cars = listOf(
        Car(
            name = "LADA Granta",
            body = "Седан",
            engine = Engine(
                name = "ВАЗ-11183",
                capacity = 82,
                fuelType = FuelType.GASOLINE
            ),
            wheels = List(4) { wheel }
        )
    )
}