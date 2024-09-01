package com.example.photogallery.source.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.photogallery.model.Photo

class LocalDataSource {

    fun getPhotos(): LiveData<List<Photo>> {
        // Здесь должна быть логика получения фотографий из локального хранилища
        // Например, это может быть запрос к базе данных или загрузка из файловой системы
        val photosLiveData = MutableLiveData<List<Photo>>()

        // Пример загрузки из базы данных или другого локального источника
        val photos = listOf(
            Photo("test", "test", "test", "test"),
            Photo("test", "test", "test", "test")
        )

        photosLiveData.value = photos
        return photosLiveData
    }

}