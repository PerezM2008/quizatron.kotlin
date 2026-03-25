package com.nomedaempresa.quizatron.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nomedaempresa.quizatron.R

@Composable
fun AberturaScreen (navController: NavController){

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center


    ) {

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),


            ) {
            Image(
                modifier = Modifier
                    .height(100.dp),
                painter = painterResource(R.drawable.quiz),
                contentDescription = "Foto QUIZ"
            )

            Text(

                text = "QUIZATRON 3000",
                color = Color.White
            )
            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,

                    ),
                onClick = {navController.navigate("Q1Screen")}
            ) {
                Text(
                    text = "Começar",
                    color = Color.Black
                )

            }
        }
    }

}