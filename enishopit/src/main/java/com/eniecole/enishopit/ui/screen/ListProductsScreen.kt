package com.eniecole.enishopit.ui.screen

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
import java.util.ArrayList

//Utiliser le live template comp
@Composable
fun ListProductsScreen(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridCells.Adaptive(120.dp)
    ) {
        items(_products) {
            Card(Modifier.padding(8.dp)) {
                Text(it.title, Modifier.padding(16.dp))
                AsyncImage(model = it.image, contentDescription = "")
            }
        }
    }
}

data class Product(val title: String, val image: String, val price: Float, val category: String)

private val _products = listOf(
    Product(
        "Smartphone Pro Max",
        "https://picsum.photos/seed/smartphonepromax/500/800",
        1099.99f,
        "Smartphone"
    ),
    Product(
        "Smartphone Lite",
        "https://picsum.photos/seed/smartphone-lite/500/800",
        499.99f,
        "Smartphone"
    ),
    Product(
        "Gaming Laptop 15\"",
        "https://picsum.photos/seed/gaming-laptop-15inch/500/800",
        1499.99f,
        "Laptop"
    ),
    Product(
        "Ultrabook Thin 13\"",
        "https://picsum.photos/seed/ultrabook-thin-13inch/500/800",
        999.99f,
        "Laptop"
    ),
    Product(
        "Tablet 10\" Plus",
        "https://picsum.photos/seed/tablet-10plus/500/800",
        599.99f,
        "Tablet"
    ),
    Product(
        "Tablet 8\" Mini",
        "https://picsum.photos/seed/tablet-8mini/500/800",
        399.99f,
        "Tablet"
    ),
    Product(
        "E-Reader Touch",
        "https://picsum.photos/seed/e-reader-touch/500/800",
        129.99f,
        "Tablet"
    ),
    Product("Smartwatch 4", "https://picsum.photos/seed/smartwatch-4/500/800", 249.99f, "Watch"),
    Product(
        "Gaming Headset",
        "https://picsum.photos/seed/gaming-headset/500/800",
        79.99f,
        "Headphones"
    ),
    Product(
        "Wireless Mouse",
        "https://picsum.photos/seed/wireless-mouse/500/800",
        49.99f,
        "Mouse"
    ),
    Product(
        "Wireless Keyboard",
        "https://picsum.photos/seed/wireless-keyboard/500/800",
        59.99f,
        "Keyboard"
    ),
    Product("USB-C Hub", "https://picsum.photos/seed/usb-c-hub/500/800", 39.99f, "Accessories"),
    Product(
        "Portable SSD 1TB",
        "https://picsum.photos/seed/portable-ssd-1tb/500/800",
        109.99f,
        "Accessories"
    ),
    Product(
        "Monitor 24\" LED",
        "https://picsum.photos/seed/monitor-24inch-led/500/800",
        199.99f,
        "Monitor"
    ),
    Product(
        "Graphics Tablet",
        "https://picsum.photos/seed/graphics-tablet/500/800",
        299.99f,
        "Tablet"
    ),
    Product("External GPU", "https://picsum.photos/seed/external-gpu/500/800", 599.99f, "GPU"),
    Product(
        "Smartphone Stand",
        "https://picsum.photos/seed/smartphone-stand/500/800",
        19.99f,
        "Accesories"
    ),
    Product(
        "Laptop Cooling Pad",
        "https://picsum.photos/seed/laptop-cooling-pad/500/800",
        29.99f,
        "Laptop"
    ),
    Product(
        "Noise Cancelling Headphones",
        "https://picsum.photos/seed/noise-cancelling-headphones/500/800",
        349.99f,
        "Headphones"
    ),
    Product(
        "Bluetooth Speaker",
        "https://picsum.photos/seed/bluetooth-speaker/500/800",
        99.99f,
        "Speaker"
    ),
    Product(
        "Smart Home Hub",
        "https://picsum.photos/seed/smart-home-hub/500/800",
        89.99f,
        "Smartphone"
    ),
    Product(
        "Wireless Charger",
        "https://picsum.photos/seed/wireless-charger/500/800",
        29.99f,
        "Charger"
    ),
    Product("VR Headset", "https://picsum.photos/seed/vr-headset/500/800", 399.99f, "VR"),
    Product("Action Camera", "https://picsum.photos/seed/action-camera/500/800", 199.99f, "Camera"),
    Product("Digital Pen", "https://picsum.photos/seed/digital-pen/500/800", 99.99f, "Pen"),
    Product(
        "Gaming Mouse Pad",
        "https://picsum.photos/seed/gaming-mouse-pad/500/800",
        19.99f,
        " Mouse "
    ),
    Product(
        "Docking Station",
        "https://picsum.photos/seed/docking-station/500/800",
        99.99f,
        " Accesories "
    ),
    Product(
        "Fitness Tracker",
        "https://picsum.photos/seed/fitness-tracker/500/800",
        149.99f,
        " Watch "
    ),
    Product(
        "Projector 4K",
        "https://picsum.photos/seed/projector-4k/500/800",
        899.99f,
        "Projector"
    ),
    Product("Webcam HD", "https://picsum.photos/seed/webcam-hd/500/800", 69.99f, "Webcam"),
    Product(
        "Smart Light Bulb",
        "https://picsum.photos/seed/smart-light-bulb/500/800",
        14.99f,
        " Accesories "
    ),
    Product(
        "Wireless Earbuds",
        "https://picsum.photos/seed/wireless-earbuds/500/800",
        129.99f,
        " Headphones "
    ),
    Product(
        "Streaming Mic",
        "https://picsum.photos/seed/streaming-mic/500/800",
        99.99f,
        "Microphone"
    ),
    Product(
        "Dual Monitor Stand",
        "https://picsum.photos/seed/dual-monitor-stand/500/800",
        59.99f,
        "Monitor"
    )
)