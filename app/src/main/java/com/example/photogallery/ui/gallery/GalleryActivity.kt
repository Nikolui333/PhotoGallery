package com.example.photogallery.ui.gallery

import android.content.Intent
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
import com.example.photogallery.R
import com.example.photogallery.ui.details.ui.theme.PhotoGalleryTheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.platform.LocalContext
import com.example.photogallery.ui.details.PhotoDetailActivity

class GalleryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhotoGalleryTheme {
                MyScreen()
                }
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
fun MyScreen() {
    val imageResIds = listOf(
        R.drawable.heart,
        R.drawable.man,
        R.drawable.figures,
        R.drawable.heart,
        R.drawable.man,
        R.drawable.figures,

        R.drawable.heart,
        R.drawable.man,
        R.drawable.figures,

        R.drawable.heart,
        R.drawable.man,
        R.drawable.figures,

        R.drawable.heart,
        R.drawable.man,
        R.drawable.figures,

        // Добавьте больше изображений по мере необходимости
    )
    SimpleLazyColumn(imageResIds)
}

@Composable
fun SimpleLazyColumn(imageResIds: List<Int>) {

    val context = LocalContext.current

    LazyVerticalGrid(
        columns = GridCells.Fixed(3), // Устанавливаем 3 столбца
        contentPadding = PaddingValues(8.dp) // Отступы вокруг сетки
    ) {
        items(imageResIds) { imageResId ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.padding(8.dp).clickable {
                    val intent = Intent(context, PhotoDetailActivity::class.java).apply {
                        putExtra("ITEM_ID", imageResId) // Передаем данные
                    }
                    context.startActivity(intent)
                }
            ) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp) // Устанавливаем размер изображения
                )
            }
        }
   }

}