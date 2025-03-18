package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserScreen(modifier: Modifier = Modifier) {

    var ageState = remember {
        mutableStateOf("")
    }

    var weightState = remember {
        mutableStateOf("")
    }

    var heightState = remember {
        mutableStateOf("")
    }




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
                text = stringResource(R.string.name),
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
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row(
                    modifier = Modifier
                        .height(200.dp)

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
                                width = 2.dp,
                                brush = Brush.horizontalGradient(
                                    listOf(
                                        Color(color = 0xFFFF5722),
                                        Color.Red,
                                    )
                                )
                            ),
                            elevation = CardDefaults
                                .cardElevation(2.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.boss),
                                contentDescription = ""
                            )
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp,
                                    vertical = 8.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Gray
                            )
                        ) {
                            Text(
                                text = stringResource(R.string.male),
                                color = Color.White

                            )
                        }
                    }
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
                                width = 2.dp,
                                brush = Brush.horizontalGradient(
                                    listOf(
                                        Color(color = 0xFFFF5722),
                                        Color.Red,
                                    )
                                )
                            )
                        ) {
                            Image(
                                painter = painterResource(R.drawable.businesswoman),
                                contentDescription = ""
                            )
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp,
                                    vertical = 8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(color = 0xFFAB3636)
                                    )
                        ) {
                            Text(
                                text = stringResource(R.string.female)
                            )
                        }
                    }
                }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 16.dp,
                            vertical = 16.dp
                        )
                ){
                    OutlinedTextField(
                        value = ageState.value,
                        onValueChange = {
                            ageState.value = it
                        },
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        label = {
                            Text(
                                text = stringResource(R.string.age)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Numbers,
                                contentDescription = "",
                                tint = Color(color = 0xFFFF5722)
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Next
                        ),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(color = 0xFFFF5722),
                            cursorColor = Color(color = 0xFFFF5722),
                            unfocusedBorderColor = Color(color = 0xFFFF5722)
                    )
                    )
                    OutlinedTextField(
                        value = weightState.value,
                        onValueChange = {
                            weightState.value = it
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 12.dp),
                        shape = RoundedCornerShape(16.dp),
                        label = {
                            Text(
                                text = stringResource(R.string.weight)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Balance,
                                contentDescription = "",
                                tint = Color(color = 0xFFFF5722)
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Decimal,
                            imeAction = ImeAction.Next
                        ),
                        textStyle = TextStyle(
                            fontSize = 19.sp
                        ),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(color = 0xFFFF5722),
                            cursorColor = Color(color = 0xFFFF5722),
                            unfocusedBorderColor = Color(color = 0xFFFF5722)
                        )
                    )
                    OutlinedTextField(
                        value = heightState.value,
                        onValueChange = {
                            heightState.value = it
                        },
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        label = {
                            Text(
                                text = stringResource(R.string.height)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Height,
                                contentDescription = "",
                                tint = Color(color = 0xFFFF5722)
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Decimal,
                            imeAction = ImeAction.Done
                        ),
                        textStyle = TextStyle(
                            fontSize = 19.sp
                        ),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(color = 0xFFFF5722),
                            cursorColor = Color(color = 0xFFFF5722),
                            unfocusedBorderColor = Color(color = 0xFFFF5722)
                        )
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(color = 0xFFAB3636)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.calculate),
                        color = Color.White
                    )
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


//card, text, row, tres column, vertical divider, column,  horizontal divider, button





















