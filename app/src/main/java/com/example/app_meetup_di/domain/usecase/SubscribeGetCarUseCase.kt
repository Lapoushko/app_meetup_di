package com.example.app_meetup_di.domain.usecase

import com.example.app_meetup_di.domain.repo.CarRepository
import com.example.app_meetup_di.domain.entity.Car

/**
 * @author Lapoushko
 */
interface SubscribeGetCarUseCase {
    suspend fun getCar(): Car
}

class SubscribeGetCarUseCaseImpl(
    private val repository: CarRepository
) : SubscribeGetCarUseCase {
    override suspend fun getCar(): Car {
        return repository.getCar()
    }
}