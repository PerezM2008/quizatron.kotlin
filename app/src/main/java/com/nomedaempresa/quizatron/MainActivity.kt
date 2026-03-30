package com.nomedaempresa.quizatron

import android.R.attr.contentDescription
import android.R.attr.onClick
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nomedaempresa.quizatron.screen.AberturaScreen
import com.nomedaempresa.quizatron.screen.PrimeiraPerguntaScreen
import com.nomedaempresa.quizatron.screen.SegundaPerguntaScreen
import com.nomedaempresa.quizatron.screen.TerceiraPerguntaScreen
import com.nomedaempresa.quizatron.screen.resultadoScreen
import com.nomedaempresa.quizatron.ui.theme.QuizatronTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizatronTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "inicial",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Down
                            )
                        },
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Up
                            )
                        }
                    ){
                     composable (
                         route = "inicial",
                         exitTransition = {
                             slideOutOfContainer(
                                 towards = AnimatedContentTransitionScope
                                     .SlideDirection.Up,
                                 animationSpec = tween (3000)
                             )
                         },

                     ){ AberturaScreen (navController = navController) }

                     composable (
                         route = "Q1Screen",
                         enterTransition = {
                             slideIntoContainer(
                                 towards = AnimatedContentTransitionScope
                                     .SlideDirection.Up,
                                 animationSpec = tween(3000)
                             )
                         }
                     ){ PrimeiraPerguntaScreen (navController = navController) }

                     composable (
                            route = "Q2Screen",
                            enterTransition = {
                                slideIntoContainer(
                                    towards = AnimatedContentTransitionScope
                                        .SlideDirection.Up,
                                    animationSpec = tween(3000)
                                )
                            }
                        ){ SegundaPerguntaScreen (navController = navController) }

                    composable (
                        route = "Q3Screen",
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Up,
                                animationSpec = tween(3000)
                            )
                        }
                    ){ TerceiraPerguntaScreen (navController = navController) }

                    composable (
                        route = "ResultadoScreen",
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Up,
                                animationSpec = tween(3000)
                            )
                        }
                    ){ resultadoScreen (navController = navController) }



                    } // final do navhost

//                    AberturaScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )


                }
            }
        }
    }
}

