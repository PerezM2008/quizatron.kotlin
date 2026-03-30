package com.nomedaempresa.quizatron.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nomedaempresa.quizatron.R

@Composable
fun resultadoScreen (modifier: Modifier = Modifier, navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ){
        Image(
            modifier = Modifier
                .height(100.dp),
            contentDescription = "wfewq",
            painter = painterResource(R.drawable.quiz)

        )

        Card(
            modifier = Modifier
                .width(400.dp)
                .height(100.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.verdeC)
            ),
        ){


        }
    }

}