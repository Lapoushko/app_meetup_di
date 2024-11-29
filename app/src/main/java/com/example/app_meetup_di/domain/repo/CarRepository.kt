package com.example.app_meetup_di.domain.repo

import com.example.app_meetup_di.domain.entity.Car

/**
 * @author Lapoushko
 */
interface CarRepository {
    suspend fun getCar() : Car
}