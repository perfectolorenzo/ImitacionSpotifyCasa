package com.example.imitacionspotifycasa.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.imitacionspotifycasa.PlaylistItem.PlaylistItem

@Composable
fun GoodMorningSection(playlists: List<PlaylistItem>) {
    Column {
        for (i in playlists.indices step 2) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                GoodMorningCard(playlists[i], modifier = Modifier.weight(1f))
                if (i + 1 < playlists.size) {
                    GoodMorningCard(playlists[i + 1], modifier = Modifier.weight(1f))
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}