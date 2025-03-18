package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.bmi.screens.ResultScreen
import br.senai.sp.jandira.bmi.screens.TelaInicial
import br.senai.sp.jandira.bmi.screens.UserScreen
import br.senai.sp.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BMITheme {

                var navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "home"
                ){
                    composable(
                        route = "home"
                    ) {
                        TelaInicial(navController)
                    }
                        composable(
                            route = "user_data"
                        ){
                            UserScreen(navController)
                        }
                        composable(
                            route = "result_screen"
                        ){
                            ResultScreen(navController)
                        }
                    }
                }

            }
        }
    }





//funcao de composiçao = letra maiuscula
//funcao normal = letra minuscula

