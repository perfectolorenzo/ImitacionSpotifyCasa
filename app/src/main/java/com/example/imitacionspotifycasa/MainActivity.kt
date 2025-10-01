package com.example.imitacionspotifycasa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.example.imitacionspotifycasa.ui.theme.ImitacionSpotifyCasaTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.imitacionspotifycasa.HomeScreen.SpotifyHomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() //Habilita el modo de pantalla completa
        setContent { //Establecer el contenido de la actividad
            ImitacionSpotifyCasaTheme { // para establecer el tema de la actividad
                SpotifyHomeScreen()


                }
            }
        }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SpotifyHomeScreenPreview() {
    ImitacionSpotifyCasaTheme {
        SpotifyHomeScreen()


    }
}