package com.example.notes.plcoding.cleanNoteApp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notes.ui.*

@Entity
data class Note(
    val title : String,
    val content : String,
    val timestamp : Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, RedPink, LightGreen, Violet, BabyBlue)
    }
}

class InvalidNoteException(message : String) : Exception(message)
