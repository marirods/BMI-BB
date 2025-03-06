package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserScreen(modifier: Modifier = Modifier){


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(color = 0xFFADA2A2),
                        Color(color = 0xFFFF0505)
                    )
                )
            ),
        contentAlignment = Alignment.BottomCenter
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp),
            shape = RoundedCornerShape(
                topStart = 50.dp,
                topEnd = 50.dp

            )

        ){
            Row {
                Column {

                }
            }
        }
    }

}

    @Preview(showSystemUi = true)
    @Composable
            private fun UserScreenPreview() {
        UserScreen()

    }





















