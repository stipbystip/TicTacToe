package com.example.tictactoe

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tictactoe.ui.theme.MontserratBold
import com.example.tictactoe.ui.theme.MontserratRegular
import com.example.tictactoe.ui.theme.MontserratSemiBold

fun chosen(select: Int, text1: String) {
    if (text1 == "Против бота") {
        Chosen.chosen1 = select
    } else {
        Chosen.chosen2 = select
    }

}

@Composable
fun RowBut(text1: String, text2: String) {
    val selected = remember {
        mutableStateOf(0)
    }
    val selected1 = remember {
        mutableStateOf(1)
    }
    val selected2 = remember {
        mutableStateOf(2)
    }
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        But(
            isSelected = selected.value == selected1.value,
            onClick = { selected.value = selected1.value },
            text1
        )
        But(
            isSelected = selected.value == selected2.value,
            onClick = { selected.value = selected2.value },
            text2
        )
    }
    chosen(selected.value, text1)
}

@Composable
fun But(isSelected: Boolean, onClick: () -> Unit, text: String) {
    val color1: Color = Color(0xFFFBF6F5)
    val color2: Color = Color(0xFFEAA7AE)
    val bgColor: Color by animateColorAsState(if (isSelected) color2 else color1)

    Button(
        onClick = {
            onClick()
        },
        modifier = Modifier
            .border(1.dp, Color.Black)
            .background(bgColor),
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        shape = RoundedCornerShape(0.dp),
    ) {
        Text(
            text = text,
            color = Color.Black,
            fontFamily = MontserratSemiBold,
            fontSize = 15.sp
        )
    }

}


@Composable
fun StartGame() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.bg)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.2F)
                .padding(15.dp, 10.dp),
        ) {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Cirlce()
                Text(
                    text = "Крестики",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 45.sp,
                    fontFamily = MontserratBold

                )
            }
            Row {
                Cross()
                Text(
                    text = "Нолики",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    textAlign = TextAlign.Start,
                    fontSize = 45.sp,
                    fontFamily = MontserratBold
                )

            }
        }
        Box() {
            Text(
                text = "Выберите режим игры",
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                fontFamily = MontserratRegular,
                fontSize = 37.sp,
            )
        }
        RowBut(text1 = "Против бота", text2 = "Против человека")
        Box() {
            Text(
                text = "На чей стороне ты",
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                fontFamily = MontserratRegular,
                fontSize = 35.sp,
            )
        }
        RowBut(text1 = "Крестики", text2 = "Нолики")
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { },
                modifier = Modifier
                    .padding(0.dp, 5.dp)
                    .border(1.dp, Color.Black),
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(Color.Transparent)
            ) {
                Text(
                    text = "Начать",
                    color = Color.Black,
                    fontFamily = MontserratBold,
                    fontSize = 20.sp
                )
            }
        }
    }
}