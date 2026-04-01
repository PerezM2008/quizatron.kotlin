package com.nomedaempresa.quizatron.screen

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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nomedaempresa.quizatron.R
import com.nomedaempresa.quizatron.components.buttonOptionOne

@Composable
fun PrimeiraPerguntaScreen (navController: NavController) {

//    var alternativaSelecionada by remember(
//        mutableStateOf("")
//    ) { }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.RosaBebe))
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            Image(
                modifier = Modifier
                    .height(100.dp),
                contentDescription = "wfewq",
                painter = painterResource(R.drawable.quiz)

            )

            Card(
                modifier = Modifier,
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.verdeC)
                ),
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = 40.dp, end = 40.dp, bottom = 20.dp, top = 20.dp),
                ) {
                    Text(
                        fontSize = 20.sp,
                        color = Color.White,
                        text = "Pergunta 1 de 3"
                    )
                }


            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier


            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color.White),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Qual seu filme Favorito?",
                        fontFamily = FontFamily.Monospace,
                        fontStyle = FontStyle.Italic

                    )
                }


                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.spacedBy(20.dp)

                ) {
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {
                            navController.navigate(route = "Q2Screen")
                        },
                        text = "Piratas do Caribe",
                        resposta = false

                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = { navController.navigate(route = "Q2Screen")
                                  },
                        text = "Pearch Jackson",
                        resposta = false
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = { navController.navigate(route = "Q2Screen") },
                        text = "Barbie e os viados encantados",
                        resposta = true
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = { navController.navigate(route = "Q2Screen") },
                        text = "Vingadores Ultimato",
                        resposta = false

                    )
                }
            }

        }
    }
}

@Composable
fun SegundaPerguntaScreen (navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.RosaBebe))
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            Image(
                modifier = Modifier
                    .height(100.dp),
                contentDescription = "wfewq",
                painter = painterResource(R.drawable.quiz)

            )

            Card(
                modifier = Modifier,
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.verdeC)
                ),
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = 40.dp, end = 40.dp, bottom = 20.dp, top = 20.dp),
                ){
                    Text(
                        fontSize = 20.sp,
                        color = Color.White,
                        text = "Pergunta 2 de 3"
                    )
                }


            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White),
                modifier = Modifier


            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color.White),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Quanto Equivale o PI",
                        fontFamily = FontFamily.Monospace,
                        fontStyle = FontStyle.Italic
                    )
                }


                Column (
                    modifier = Modifier
                        .padding(20.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.spacedBy(20.dp)

                ) {
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {
                            navController.navigate(route = "Q3Screen")
                        },
                        text = "3.1415926535999999cm",
                        resposta = false
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {navController.navigate(route = "Q3Screen")},
                        text = "3.13mm",
                        resposta = false
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {navController.navigate(route = "Q3Screen")},
                        text = "31.14mm",
                        resposta = true
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {navController.navigate(route = "Q3Screen")},
                        text = "3.41",
                        resposta = false
                    )
                }
            }

        }
    }
}

@Composable
fun TerceiraPerguntaScreen(modifier: Modifier = Modifier, navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.RosaBebe))
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            Image(
                modifier = Modifier
                    .height(100.dp),
                contentDescription = "wfewq",
                painter = painterResource(R.drawable.quiz)

            )

            Card(
                modifier = Modifier,
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.verdeC)
                ),
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = 40.dp, end = 40.dp, bottom = 20.dp, top = 20.dp),
                ){
                    Text(
                        fontSize = 20.sp,
                        color = Color.White,
                        text = "Pergunta 3 de 3"
                    )
                }


            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White),
                modifier = Modifier


            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color.White),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "ddddd",
                        fontFamily = FontFamily.Monospace,
                        fontStyle = FontStyle.Italic
                    )
                }


                Column (
                    modifier = Modifier
                        .padding(20.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.spacedBy(20.dp)

                ) {
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {
                            navController.navigate(route = "ResultadoScreen")
                        },
                        text = "3.1415926535999999cm",
                        resposta = true
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {navController.navigate(route = "ResultadoScreen")},
                        text = "3.13mm",
                        resposta = false
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {navController.navigate(route = "ResultadoScreen")},
                        text = "31.14mm",
                        resposta = false
                    )
                    buttonOptionOne(
                        modifier = Modifier,
                        onClick = {navController.navigate(route = "ResultadoScreen")},
                        text = "3.41mm",
                        resposta = false
                    )
                }
            }

        }
    }
}
