package com.example.app_meetup_di.di

import com.example.app_meetup_di.domain.repo.CarRepository
import com.example.app_meetup_di.domain.usecase.SubscribeGetCarUseCase
import com.example.app_meetup_di.domain.usecase.SubscribeGetCarUseCaseImpl
import com.example.app_meetup_di.presentation.mapper.CarDomainToViewMapper
import com.example.app_meetup_di.presentation.mapper.CarDomainToViewMapperImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

  @Provides
  fun provideSubscribeGetCarUseCase(carRepository: CarRepository): SubscribeGetCarUseCase {
    return SubscribeGetCarUseCaseImpl(carRepository)
  }

  @Provides
  fun provideCarDomainToViewMapper(): CarDomainToViewMapper {
    return CarDomainToViewMapperImpl()
  }
}