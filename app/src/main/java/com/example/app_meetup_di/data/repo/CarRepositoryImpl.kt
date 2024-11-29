package com.example.app_meetup_di.data.repo

import com.example.app_meetup_di.data.mock.MockCar
import com.example.app_meetup_di.domain.repo.CarRepository
import com.example.app_meetup_di.domain.entity.Car

/**
 * @author Lapoushko
 */
class CarRepositoryImpl : CarRepository{
    private val cars: List<Car> = MockCar().cars

    override suspend fun getCar() : Car {
        return cars[0]
    }
}