package com.example.app_meetup_di.domain.di

import com.example.app_meetup_di.domain.usecase.SubscribeGetCarUseCase
import com.example.app_meetup_di.domain.usecase.SubscribeGetCarUseCaseImpl
import org.koin.dsl.module

val domainModule = module {
    single<SubscribeGetCarUseCase> { SubscribeGetCarUseCaseImpl(
        repository = get()
    ) }
}