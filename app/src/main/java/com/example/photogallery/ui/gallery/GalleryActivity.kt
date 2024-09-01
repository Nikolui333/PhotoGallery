package com.example.photogallery.ui.gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.photogallery.ui.details.ui.theme.PhotoGalleryTheme

class GalleryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhotoGalleryTheme {
/*                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    SimpleLazyColumn()
                }
            //}
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    PhotoGalleryTheme {
        Greeting2("Android")
    }
}

@Composable
fun SimpleLazyColumn() {
    val items = List(100) { "Item #$it" } // Генерация списка из 100 элементов

    LazyVerticalGrid(
        columns = GridCells.Fixed(3), // Устанавливаем 3 столбца
        contentPadding = PaddingValues(8.dp) // Отступы вокруг сетки
    ) {
        items(items) { item ->
            Text(
                text = item,
                modifier = Modifier
                    .padding(8.dp) // Отступы для каждой ячейки
                    .background(MaterialTheme.colorScheme.primary) // Цвет фона ячейки (по желанию)
                    .fillMaxWidth() // Заполнение ширины ячейки
            )
        }
    }
    

/*    LazyColumn {
        items(items) { item ->
            Text(text = item, modifier = Modifier.padding(16.dp))
        }
    }*/
}