package com.nomedaempresa.quizatron.screen

import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nomedaempresa.quizatron.R

@Composable
fun AberturaScreen (navController: NavController){

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(10.dp),
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
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Yellow),

                onClick = {
                    navController.navigate("Q1Screen")
                }
            ) {
                Text(
                    text = "Começar",
                    color = Color.Black
                )

            }
        }
    }

}