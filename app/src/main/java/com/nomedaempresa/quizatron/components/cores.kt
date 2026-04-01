package com.nomedaempresa.quizatron.components

import android.R.attr.onClick
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.nomedaempresa.quizatron.R

@Composable
fun coresDinamicas(modifier: Modifier = Modifier, buttonOptionOne: Boolean, onClick: () -> Unit) {

    if (buttonOptionOne) {
        OutlinedButton(
            onClick = onClick,
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = colorResource(R.color.RosaBebe)
            )

        ) { }
    } else {
        OutlinedButton(
            onClick = onClick,
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = colorResource(R.color.verdeC)
            )

        ) { }
    }
}