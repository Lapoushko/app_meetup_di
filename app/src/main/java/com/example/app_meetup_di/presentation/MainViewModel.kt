package com.example.app_meetup_di.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app_meetup_di.domain.usecase.SubscribeGetCarUseCase
import com.example.app_meetup_di.presentation.mapper.CarDomainToViewMapper
import com.example.app_meetup_di.presentation.model.CarView
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * @author Lapoushko
 */
class MainViewModel(
    private val useCase: SubscribeGetCarUseCase,
    private val mapper: CarDomainToViewMapper
)  :  ViewModel(){
    private val _car: MutableStateFlow<CarView?> = MutableStateFlow(null)
    val car = _car.asStateFlow()

    init {
        viewModelScope.launch {
            _car.value = mapper.invoke(useCase.getCar())
        }
    }
}