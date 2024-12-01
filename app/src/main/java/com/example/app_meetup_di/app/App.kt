package com.example.app_meetup_di.app

import android.app.Application
import com.example.app_meetup_di.data.di.dataModule
import com.example.app_meetup_di.domain.di.domainModule
import com.example.app_meetup_di.presentation.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(presentationModule, domainModule, dataModule))
        }
    }
}