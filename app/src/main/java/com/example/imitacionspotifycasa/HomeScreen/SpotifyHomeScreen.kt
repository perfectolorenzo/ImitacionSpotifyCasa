package com.example.imitacionspotifycasa.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imitacionspotifycasa.PlaylistItem.PlaylistItem
import com.example.imitacionspotifycasa.myComponents.BottomNavigationBar
import com.example.imitacionspotifycasa.myComponents.GoodMorningSection
import com.example.imitacionspotifycasa.myComponents.MadeForYouSection
import com.example.imitacionspotifycasa.myComponents.PopularPlaylistsSection
import com.example.imitacionspotifycasa.myComponents.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpotifyHomeScreen() {
    val scrollState = rememberScrollState()

    val goodMorningPlaylists = listOf(
        PlaylistItem(titulo = "Today's Top Hits", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_todasystop"),
        PlaylistItem(titulo = "Alan Gogoll", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_alangogoll"),
        PlaylistItem(titulo = "Dope Labs", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_drolabs"),
        PlaylistItem(titulo = "Chill Hits", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_chillhits"),
        PlaylistItem(titulo = "Latina To Latina", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_latinatolatina"),
        PlaylistItem(titulo = "Amanda Seales", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_amandaseales")

    )

    val madeForYou = listOf(
        PlaylistItem(titulo = "On Repeat", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_onrepeat"),
        PlaylistItem(titulo = "Your Discover Weekly", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_yourdiscoverweekly"),
        PlaylistItem(titulo = "Mix Daily", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_mixdaily")
    )

    val popularPlayLists = listOf(
        PlaylistItem(titulo = "Feelin' Good", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_feelingood"),
        PlaylistItem(titulo = "Pumped Pop", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_pumpedpop"),
        PlaylistItem(titulo = "Chill Vibes", imageUrl = "android.resource://com.example.imitacionspotifycasa/drawable/ic_chillvibes")
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.Black)
            .padding(16.dp)
    ){
        TopBar()
        Spacer(modifier = Modifier.height(16.dp))

        GoodMorningSection(playlists = goodMorningPlaylists)

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Made for you",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,

        )
        Spacer(modifier = Modifier.height(8.dp))
        MadeForYouSection(playlists = madeForYou)

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Popular playlists",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,

        )
        Spacer(modifier = Modifier.height(8.dp))
        PopularPlaylistsSection(playlists = popularPlayLists)

        Spacer(modifier = Modifier.height(8.dp))

        BottomNavigationBar()

    }


    }
@Preview
@Composable
fun SpotifyHomePreview() {
    SpotifyHomeScreen()
}