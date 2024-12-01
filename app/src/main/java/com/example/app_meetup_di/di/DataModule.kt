package com.example.app_meetup_di.di

import com.example.app_meetup_di.data.repo.CarRepositoryImpl
import com.example.app_meetup_di.domain.repo.CarRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

  @Provides
  @Singleton
  fun provideCarRepository(): CarRepository {
    return CarRepositoryImpl()
  }
}