package com.eniecole.enishopit.repository

import com.eniecole.enishopit.ui.screen.Product

object ProductRepository {
    fun getById(id: Int): Product? = _products.find { it.id == id }
    fun getAll() = _products
    private val _products = listOf(
        Product(
            0,
            "Smartphone Pro Max",
            "https://picsum.photos/seed/smartphonepromax/500/800",
            1099.99f,
            "Smartphone"
        ),
        Product(
            1,
            "Smartphone Lite",
            "https://picsum.photos/seed/smartphone-lite/500/800",
            499.99f,
            "Smartphone"
        ),
        Product(
            2,
            "Gaming Laptop 15\"",
            "https://picsum.photos/seed/gaming-laptop-15inch/500/800",
            1499.99f,
            "Laptop"
        ),
        Product(
            3,
            "Ultrabook Thin 13\"",
            "https://picsum.photos/seed/ultrabook-thin-13inch/500/800",
            999.99f,
            "Laptop"
        ),
        Product(
            4,
            "Tablet 10\" Plus",
            "https://picsum.photos/seed/tablet-10plus/500/800",
            599.99f,
            "Tablet"
        ),
        Product(
            5,
            "Tablet 8\" Mini",
            "https://picsum.photos/seed/tablet-8mini/500/800",
            399.99f,
            "Tablet"
        ),
        Product(
            6,
            "E-Reader Touch",
            "https://picsum.photos/seed/e-reader-touch/500/800",
            129.99f,
            "Tablet"
        ),
        Product(7,"Smartwatch 4", "https://picsum.photos/seed/smartwatch-4/500/800", 249.99f, "Watch"),
        Product(8,
            "Gaming Headset",
            "https://picsum.photos/seed/gaming-headset/500/800",
            79.99f,
            "Headphones"
        ),
        Product(9,
            "Wireless Mouse",
            "https://picsum.photos/seed/wireless-mouse/500/800",
            49.99f,
            "Mouse"
        ),
        Product(10,
            "Wireless Keyboard",
            "https://picsum.photos/seed/wireless-keyboard/500/800",
            59.99f,
            "Keyboard"
        ),
        Product(11,"USB-C Hub", "https://picsum.photos/seed/usb-c-hub/500/800", 39.99f, "Accessories"),
        Product(12,
            "Portable SSD 1TB",
            "https://picsum.photos/seed/portable-ssd-1tb/500/800",
            109.99f,
            "Accessories"
        ),
        Product(13,
            "Monitor 24\" LED",
            "https://picsum.photos/seed/monitor-24inch-led/500/800",
            199.99f,
            "Monitor"
        ),
        Product(14,
            "Graphics Tablet",
            "https://picsum.photos/seed/graphics-tablet/500/800",
            299.99f,
            "Tablet"
        ),
        Product(15,"External GPU", "https://picsum.photos/seed/external-gpu/500/800", 599.99f, "GPU"),
        Product(16,
            "Smartphone Stand",
            "https://picsum.photos/seed/smartphone-stand/500/800",
            19.99f,
            "Accesories"
        ),
        Product(17,
            "Laptop Cooling Pad",
            "https://picsum.photos/seed/laptop-cooling-pad/500/800",
            29.99f,
            "Laptop"
        ),
        Product(18,
            "Noise Cancelling Headphones",
            "https://picsum.photos/seed/noise-cancelling-headphones/500/800",
            349.99f,
            "Headphones"
        ),
        Product(19,
            "Bluetooth Speaker",
            "https://picsum.photos/seed/bluetooth-speaker/500/800",
            99.99f,
            "Speaker"
        ),
        Product(20,
            "Smart Home Hub",
            "https://picsum.photos/seed/smart-home-hub/500/800",
            89.99f,
            "Smartphone"
        ),
        Product(21,
            "Wireless Charger",
            "https://picsum.photos/seed/wireless-charger/500/800",
            29.99f,
            "Charger"
        ),
        Product(22,"VR Headset", "https://picsum.photos/seed/vr-headset/500/800", 399.99f, "VR"),
        Product(23,"Action Camera", "https://picsum.photos/seed/action-camera/500/800", 199.99f, "Camera"),
        Product(24,"Digital Pen", "https://picsum.photos/seed/digital-pen/500/800", 99.99f, "Pen"),
        Product(25,
            "Gaming Mouse Pad",
            "https://picsum.photos/seed/gaming-mouse-pad/500/800",
            19.99f,
            " Mouse "
        ),
        Product(26,
            "Docking Station",
            "https://picsum.photos/seed/docking-station/500/800",
            99.99f,
            " Accesories "
        ),
        Product(27,
            "Fitness Tracker",
            "https://picsum.photos/seed/fitness-tracker/500/800",
            149.99f,
            " Watch "
        ),
        Product(28,
            "Projector 4K",
            "https://picsum.photos/seed/projector-4k/500/800",
            899.99f,
            "Projector"
        ),
        Product(29,"Webcam HD", "https://picsum.photos/seed/webcam-hd/500/800", 69.99f, "Webcam"),
        Product(30,
            "Smart Light Bulb",
            "https://picsum.photos/seed/smart-light-bulb/500/800",
            14.99f,
            " Accesories "
        ),
        Product(31,
            "Wireless Earbuds",
            "https://picsum.photos/seed/wireless-earbuds/500/800",
            129.99f,
            " Headphones "
        ),
        Product(32,
            "Streaming Mic",
            "https://picsum.photos/seed/streaming-mic/500/800",
            99.99f,
            "Microphone"
        ),
        Product(33,
            "Dual Monitor Stand",
            "https://picsum.photos/seed/dual-monitor-stand/500/800",
            59.99f,
            "Monitor"
        )
    )
}