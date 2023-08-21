package com.example.tictactoe

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun Cirlce() {
    val colorCircle: Color = Color(0xFF7C3EFF)
    Canvas(
        modifier = Modifier
            .size(50.dp)
            .padding(5.dp)
    ) {
        drawCircle(
            color = colorCircle,
            style = Stroke(width = 10f),
            center = Offset(x = 40.dp.toPx(), y = 25.dp.toPx())
        )
    }
}