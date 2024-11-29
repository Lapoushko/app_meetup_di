package com.example.app_meetup_di.presentation.mapper

import com.example.app_meetup_di.domain.entity.Car
import com.example.app_meetup_di.presentation.model.CarView

/**
 * @author Lapoushko
 */
interface CarDomainToViewMapper {
    fun invoke(car: Car): CarView
}

class CarDomainToViewMapperImpl : CarDomainToViewMapper {
    override fun invoke(car: Car): CarView {
        return CarView(
            name = "Название автомобиля: ${car.name.ifEmpty { "Нет указано" }}",
            body = "Тип кузова автомобиля: ${car.body.ifEmpty { "Нет указано" }}",
            engine = "Описание двигателя: ${
                if (car.engine != null)
                    "\nНазвание: ${car.engine.name} \n Мощность: ${car.engine.capacity} \n Топливо: ${car.engine.fuelType.name}"
                else
                    "Двигатель не указан"
            }",
            wheels = "Название колёс: ${if (car.wheels.isNotEmpty()) car.wheels[0].name else "Не указано"}"
        )
    }

}