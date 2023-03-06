package com.faisal.composesampleapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created By Faisal Abdirashid on Date : 3/6/2023.
 */
@Entity
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val title : String,
    val description : String
)
