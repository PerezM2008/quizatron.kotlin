package com.nomedaempresa.quizatron.screen

import android.R.attr.left
import android.R.attr.start
import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nomedaempresa.quizatron.R

@Composable
fun PrimeiraPerguntaScreen (navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)

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
                    containerColor = Color.Green),
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = 40.dp, end = 40.dp, bottom = 20.dp, top = 20.dp),
                ){
                    Text(
                        fontSize = 20.sp,
                        text = "Pergunta 1 de 3"
                    )
                }


            }

            Card(
                modifier = Modifier

            ) {
                Column (
                    modifier = Modifier
                        .padding(150.dp),

                ) {
                Button(
                    modifier = Modifier,

                    onClick = {}
                ) {

                }
                }
            }
        }
    }
}