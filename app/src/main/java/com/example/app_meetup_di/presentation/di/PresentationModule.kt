package com.example.app_meetup_di.presentation.di

import com.example.app_meetup_di.presentation.MainViewModel
import com.example.app_meetup_di.presentation.mapper.CarDomainToViewMapper
import com.example.app_meetup_di.presentation.mapper.CarDomainToViewMapperImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    single<CarDomainToViewMapper> { CarDomainToViewMapperImpl() }
    viewModel { MainViewModel(
        useCase = get(),
        mapper = get()
    ) }
}