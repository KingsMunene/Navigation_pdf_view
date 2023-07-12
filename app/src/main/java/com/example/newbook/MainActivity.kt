package com.example.newbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.newbook.appui.PdfViewer
import com.example.newbook.appui.WelcomeScreen
import com.example.newbook.ui.theme.NewBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewBookTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        AppEntry()
                }
            }
        }
    }
}

enum class AppScreen{
    Start,
    ViewPdf
}

@Composable
fun AppEntry(
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = AppScreen.Start.name,
        modifier = Modifier
    ){
        composable(route = AppScreen.Start.name){
            WelcomeScreen(
                onButtonClicked = {
                    navController.navigate(AppScreen.ViewPdf.name)
                }
            )
        }

        composable(route = AppScreen.ViewPdf.name){
            PdfViewer()
        }
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewBookTheme {
        AppEntry()
    }
}