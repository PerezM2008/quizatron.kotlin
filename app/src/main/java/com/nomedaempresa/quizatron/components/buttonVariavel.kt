package com.nomedaempresa.quizatron.components

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun buttonOptionOne (modifier: Modifier, onClick: () -> Unit, text: String, resposta: Boolean) {
    OutlinedButton(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .width(500.dp)
            .background(Color.White),
        onClick = onClick,

    ) {
        Text(
            text = text
        )


    }
}
//fun buttonOptionOne (onClick: () -> Unit, text: String ) {
//    OutlinedButton(
//        shape = RoundedCornerShape(15.dp),
//        modifier = Modifier
//            .width(500.dp)
//            .background(Color.White),
//        onClick = onClick,
//
//        ) {
//        Text(
//            text = text
//        )
//
//    }
//}
//fun buttonOptionThree (onClick: () -> Unit, text: String ) {
//    OutlinedButton(
//        shape = RoundedCornerShape(15.dp),
//        modifier = Modifier
//            .width(500.dp)
//            .background(Color.White),
//        onClick = onClick,
//
//        ) {
//        Text(
//            text = text
//        )
//
//    }
//}
//fun buttonOptionFour (onClick: () -> Unit, text: String ) {
//    OutlinedButton(
//        shape = RoundedCornerShape(15.dp),
//        modifier = Modifier
//            .width(500.dp)
//            .background(Color.White),
//        onClick = onClick,
//
//        ) {
//        Text(
//            text = text
//        )
//
//    }
//}
//
