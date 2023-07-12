package com.example.newbook.appui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController




@Composable
fun WelcomeScreen(
    onButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to BookApp",
            modifier = Modifier.padding(30.dp),
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(20.dp))

        PdfButton(onButtonClicked = onButtonClicked)

    }
}

@Composable
fun PdfButton(onButtonClicked: () -> Unit) {
    OutlinedButton(
        onClick = onButtonClicked
    ) {
        Text(text = "Click here to view pdf")
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePrev() {
    WelcomeScreen(onButtonClicked = {})
}