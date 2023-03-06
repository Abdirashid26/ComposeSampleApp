package com.faisal.composesampleapp.data.repo

import com.faisal.composesampleapp.data.room.ArticleDao
import javax.inject.Inject

/**
 * Created By Faisal Abdirashid on Date : 3/6/2023.
 */
class AppRepository @Inject constructor(
//    create parameter constructor
private val articleDao: ArticleDao
) {

//    then you can  use your article dao here

}