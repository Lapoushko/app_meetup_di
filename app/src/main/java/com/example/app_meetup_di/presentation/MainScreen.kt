package com.example.app_meetup_di.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app_meetup_di.presentation.model.CarView

/**
 * @author Lapoushko
 */
@Composable
fun MainScreen(
    viewModel: MainViewModel
) {
    val car = viewModel.car.collectAsState().value
    Scaffold { innerPadding ->
        CardCar(
            car = car!!,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
private fun CardCar(
    car: CarView,
    modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        car.apply {
            CarDescription(text = name)
            CarDescription(text = body)
            CarDescription(text = engine)
            CarDescription(text = wheels)
        }
    }
}

@Composable
private fun CarDescription(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.padding(vertical = 4.dp)
    )
}