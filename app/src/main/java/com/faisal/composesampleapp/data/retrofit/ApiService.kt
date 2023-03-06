package com.faisal.composesampleapp.data.retrofit

import retrofit2.http.POST

/**
 * Created By Faisal Abdirashid on Date : 3/6/2023.
 */
interface ApiService {

//     this is an example !!
    @POST("getNews")
    fun getNews()


}