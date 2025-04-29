package com.pmtaller2.carlosrubio_00000822.myapplication.model

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val category: String,
    val imageUrl: String,
    val menu: List<Dish>
)
