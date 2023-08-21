package com.example.tictactoe

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tictactoe.ui.theme.MontserratRegular
import com.example.tictactoe.ui.theme.MontserratSemiBold

@Preview
@Composable
fun GameScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp, 5.dp)
            .background(colorResource(R.color.bg)),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Игрок 'O': 0", fontSize = 15.sp, fontFamily = MontserratSemiBold)
            Text(text = "Ничья: 0", fontSize = 15.sp, fontFamily = MontserratSemiBold)
            Text(text = "Игрок 'X': 0", fontSize = 15.sp, fontFamily = MontserratSemiBold)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .shadow(
                    elevation = 10.dp,
                    shape = RoundedCornerShape(15.dp)
                )
                .background(color = colorResource(R.color.bg), shape = RoundedCornerShape(10.dp))
        ) {
            Borad()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Ход игрока:'O'", fontSize = 15.sp, fontFamily = MontserratRegular)
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .border(1.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                shape = RoundedCornerShape(0.dp),
            ) {
                Text(
                    text = "Новая игра",
                    fontFamily = MontserratSemiBold,
                    fontSize = 16.sp,
                    color = Color.Black
                )
            }
        }
    }
}