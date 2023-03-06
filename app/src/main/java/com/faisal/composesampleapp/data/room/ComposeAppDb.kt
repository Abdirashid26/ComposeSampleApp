package com.faisal.composesampleapp.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.faisal.composesampleapp.data.model.Article

/**
 * Created By Faisal Abdirashid on Date : 3/6/2023.
 */
@Database(entities = [Article::class], version = 1)
abstract class ComposeAppDb : RoomDatabase() {

//    add your dao's here
    abstract fun articlesDao(): ArticleDao

}