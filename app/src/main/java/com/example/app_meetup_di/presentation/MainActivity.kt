package com.example.app_meetup_di.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.app_meetup_di.data.repo.CarRepositoryImpl
import com.example.app_meetup_di.domain.usecase.SubscribeGetCarUseCaseImpl
import com.example.app_meetup_di.presentation.mapper.CarDomainToViewMapperImpl
import com.example.app_meetup_di.presentation.ui.theme.App_meetup_diTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App_meetup_diTheme {
                val repository = CarRepositoryImpl()
                val useCase = SubscribeGetCarUseCaseImpl(
                    repository = repository
                )
                val mapper = CarDomainToViewMapperImpl()
                val mainViewModel = MainViewModel(
                    useCase = useCase,
                    mapper = mapper
                )
                MainScreen(
                    viewModel = mainViewModel
                )
            }
        }
    }
}
