package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R


@Composable
fun ResultScreen(navController: NavHostController?) {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(color = 0xFFAB3636),
                        Color(color = 0xFFCCADAC)
                    )
                )
            ),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string.bmi_result),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .weight(1f),
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(730.dp),
            shape = RoundedCornerShape(
                topStart = 32.dp,
                topEnd = 32.dp,

                ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .size(100.dp),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 4.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(color = 0xFFAB3636),
                                    Color(color = 0xFFFF9800)
                                )
                            )
                        ),
                        elevation = CardDefaults
                            .cardElevation(2.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        )
                        {
                            Text(
                                text = stringResource(R.string.number),
                                color = Color.Black,
                                fontSize = 29.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier

                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = stringResource(R.string.description),
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                        Card(
                            modifier = Modifier
                                .width(350.dp)
                                .height(110.dp)
                                .padding(15.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(color = 0xFFB06261)
                            )
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(10.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .weight(1f),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = stringResource(R.string.idade),
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                    Text(
                                        text = stringResource(R.string.number_idade),
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                                VerticalDivider()
                                Column(
                                    modifier = Modifier
                                        .weight(1f),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = stringResource(R.string.peso),
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                    Text(
                                        text = stringResource(R.string.number_peso),
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                                VerticalDivider()
                                Column(
                                    modifier = Modifier
                                        .weight(1f),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = stringResource(R.string.altura),
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                    Text(
                                        text = stringResource(R.string.number_altura),
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(350.dp)
                        ) {

                        }
                        HorizontalDivider()
                        Button(
                            onClick = {
                                navController?.navigate("user_data")
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    horizontal = 12.dp,
                                    vertical = 8.dp
                                ),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(color = 0xFFAB3636),
                            )
                        ) {
                            Text(
                                text = stringResource(R.string.calcular),
                                color = Color.White

                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun ResultScreenPreview() {
    ResultScreen(null)

}