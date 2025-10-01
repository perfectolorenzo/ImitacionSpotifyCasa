package com.example.imitacionspotifycasa.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontLoadingStrategy.Companion.Async
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.imitacionspotifycasa.PlaylistItem.PlaylistItem
import org.jetbrains.annotations.Async

@Composable
fun GoodMorningCard(playlist: PlaylistItem, modifier: Modifier = Modifier) {
    Row (
        modifier = modifier
            .height(60.dp)
            .background(Color.DarkGray, shape = RoundedCornerShape(6.dp))
            .clickable {}
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = playlist.imageUrl,
            contentDescription = playlist.titulo,
            modifier = Modifier
                .size(44.dp)
                .background(Color.Gray, shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = playlist.titulo,
            color = Color.White,
            fontSize = 14.sp,
            maxLines = 1
        )
    }
}