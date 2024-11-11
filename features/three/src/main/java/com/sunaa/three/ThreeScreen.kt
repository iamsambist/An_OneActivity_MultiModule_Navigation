package com.sunaa.three

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScreenThree() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 5.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hello I am Three Feature")
    }
}