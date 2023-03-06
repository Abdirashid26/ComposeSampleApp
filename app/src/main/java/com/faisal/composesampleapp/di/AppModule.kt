package com.faisal.composesampleapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.faisal.composesampleapp.data.retrofit.ApiService
import com.faisal.composesampleapp.data.room.ArticleDao
import com.faisal.composesampleapp.data.room.ComposeAppDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created By Faisal Abdirashid on Date : 3/6/2023.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {


//    provides application context - used to initialize Room
    @Provides
    @Singleton
    fun providesRetrofitApi() : Retrofit{
        return  Retrofit.Builder()
            .baseUrl("BASE_URL")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

//    provides api client like this
    @Provides
    @Singleton
    fun providesApiClient(retrofit: Retrofit) : ApiService {
        return retrofit.create(ApiService::class.java)
    }


//    provides Room
    @Provides
    @Singleton
    fun providesRoomDb(@ApplicationContext context: Context) : RoomDatabase{
        return Room.databaseBuilder(context, ComposeAppDb::class.java,"compose_app_db")
            .fallbackToDestructiveMigration()   // this line will help us not to do any migrations but rather detroy the whole db and recreate a new instance
            .build()
    }

    @Provides
    @Singleton
    fun providesDao(composeAppDb: ComposeAppDb) : ArticleDao{
        return composeAppDb.articlesDao()
    }



}