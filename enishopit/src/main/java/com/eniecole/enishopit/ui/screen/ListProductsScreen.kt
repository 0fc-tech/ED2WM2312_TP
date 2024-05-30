package com.eniecole.enishopit.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.eniecole.enishopit.repository.ProductRepository
import kotlinx.serialization.Serializable
import java.util.ArrayList

//Utiliser le live template comp
@Composable
fun ListProductsScreen(modifier: Modifier = Modifier,onProductClick: (Product) -> Unit) {
    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridCells.Adaptive(120.dp)
    ) {
        items(ProductRepository.getAll()) {product ->
            Card(Modifier.padding(8.dp).clickable{onProductClick(product)}) {
                Text(product.title, Modifier.padding(16.dp))
                AsyncImage(model = product.image, contentDescription = "")
            }
        }
    }
}
@Serializable
data class Product(
    val id: Int ,
    val title: String,
    val image: String,
    val price: Float,
    val category: String
)
