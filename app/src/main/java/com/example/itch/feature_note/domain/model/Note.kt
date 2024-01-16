package com.example.itch.feature_note.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.itch.ui.theme.Black
import com.example.itch.ui.theme.Cyan
import com.example.itch.ui.theme.Grey
import com.example.itch.ui.theme.Lime
import com.example.itch.ui.theme.Orange
import com.example.itch.ui.theme.Pink
import com.example.itch.ui.theme.Purple
import com.example.itch.ui.theme.White
import com.example.itch.ui.theme.Yellow

//this is a class of our entity
@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    //hardcoded list of colors an object may have
    companion object{
        val noteColors = listOf(Pink, Orange, Lime, Cyan, Purple,Yellow, Grey, Black, White)
    }
}
