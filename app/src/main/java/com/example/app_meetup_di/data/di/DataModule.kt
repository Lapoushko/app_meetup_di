package com.example.app_meetup_di.data.di

import com.example.app_meetup_di.data.repo.CarRepositoryImpl
import com.example.app_meetup_di.domain.repo.CarRepository
import org.koin.dsl.module

val dataModule = module {
    single<CarRepository> { CarRepositoryImpl() }
}