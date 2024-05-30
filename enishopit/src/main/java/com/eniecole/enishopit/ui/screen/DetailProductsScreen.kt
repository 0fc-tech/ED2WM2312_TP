package com.eniecole.enishopit.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.eniecole.enishopit.repository.ProductRepository
import com.eniecole.enishopit.ui.theme.Typography

@Composable
fun DetailProductsScreen(product: Int, modifier: Modifier = Modifier) {
    val product = ProductRepository.getById(product)
    if(product== null)
        Text(text = "Product not found")
    else
        LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)){
        item {
            Text(product.title,
                style = Typography.titleLarge)
            Text("${product.price}€", style = Typography.labelLarge)
            Text("ou 400 €/mois", style = Typography.labelSmall)
            AsyncImage(
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth(),
                model = product.image,
                contentDescription = "iPhone")
            Text("Description",
                style = Typography.titleLarge,
                modifier = Modifier.padding(vertical = 4.dp))
            Text(product.category)
            Text("Caractéristiques",
                style = Typography.titleLarge,
                modifier = Modifier.padding(vertical = 4.dp))
            Text("Processeur ")
            Text("  19 coeurs ")
            Text("  125 AI Threads")
            Text("GPU")
            Text("  19 coeurs")
            Text("  125 AI Threads ")
            Text("OLED")
        }

    }
}