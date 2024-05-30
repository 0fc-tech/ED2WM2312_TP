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
import com.eniecole.enishopit.ui.theme.Typography

@Composable
fun DetailProductsScreen(product: Product, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)){
        item {
            Text("Apple iPhone Pro Max Edition 256 Go - Midnight Green",
                style = Typography.titleLarge)
            Text("2800€", style = Typography.labelLarge)
            Text("ou 400 €/mois", style = Typography.labelSmall)
            AsyncImage(
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth(),
                model = "https://static.fnac-static.com/multimedia/" +
                        "Images/FR/MDM/6c/12/04/17044076/1505-1/" +
                        "tsp20240422192454/Apple-iPhone-13-Pro-" +
                        "Max-6-7-5G-128-Go-Double-SIM-Bleu.jpg",
                contentDescription = "iPhone")
            Text("Description",
                style = Typography.titleLarge,
                modifier = Modifier.padding(vertical = 4.dp))
            Text("Ce téléphone vous permettrade passer un niveau suprérieur lorem ipsum ..........")
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