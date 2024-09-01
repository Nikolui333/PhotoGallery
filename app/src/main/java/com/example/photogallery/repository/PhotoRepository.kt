package com.example.photogallery.repository

import androidx.lifecycle.LiveData
import com.example.photogallery.model.Photo
import com.example.photogallery.source.local.LocalDataSource

class PhotoRepository(private val localDataSource: LocalDataSource) {

    fun getPhotos(): LiveData<List<Photo>> {
        // Логика получения фотографий из локального или удаленного источника
        return TODO("Provide the return value")
    }
}