package com.pmtaller2.carlosrubio_00000822.myapplication.data

import com.pmtaller2.carlosrubio_00000822.myapplication.model.*

val dummyRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Burger House",
        description = "Especialistas en hamburguesas artesanales.",
        category = "Comida Rápida",
        imageUrl = "https://example.com/burger.jpg",
        menu = listOf(
            Dish("Hamburguesa Clásica", "Pan, carne y queso", "https://example.com/hamburguesa.jpg"),
            Dish("Doble Queso", "Más queso y sabor", "https://example.com/doblequeso.jpg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Tacos El Rey",
        description = "Auténticos tacos mexicanos.",
        category = "Comida Mexicana",
        imageUrl = "https://example.com/tacos.jpg",
        menu = listOf(
            Dish("Taco al Pastor", "Con piña y carne adobada", "https://example.com/taco.jpg"),
            Dish("Taco de Asada", "Carne asada con guacamole", "https://example.com/asada.jpg")
        )
    )
)
