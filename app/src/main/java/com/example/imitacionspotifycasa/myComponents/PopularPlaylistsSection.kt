package com.example.imitacionspotifycasa.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.imitacionspotifycasa.PlaylistItem.PlaylistItem
import org.jetbrains.annotations.Async

@Composable
fun PopularPlaylistsSection(playlists: List<PlaylistItem>) {
    LazyRow (horizontalArrangement = Arrangement.spacedBy(12.dp)){
        items(playlists.size) { index ->
            Column (
                modifier = Modifier
                    .width(120.dp)
                    .clickable{}
            ){
                AsyncImage(
                    model = playlists[index].imageUrl,
                    contentDescription = playlists[index].titulo,
                    modifier = Modifier
                        .size(120.dp)
                        .background(Color.Gray, RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = playlists[index].titulo,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}