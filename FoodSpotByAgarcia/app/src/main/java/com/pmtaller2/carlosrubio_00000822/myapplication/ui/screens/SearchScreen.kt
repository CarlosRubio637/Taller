package com.pmtaller2.carlosrubio_00000822.myapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pmtaller2.carlosrubio_00000822.myapplication.data.dummyRestaurants
import com.pmtaller2.carlosrubio_00000822.myapplication.model.Restaurant
import com.pmtaller2.carlosrubio_00000822.myapplication.ui.components.RestaurantCard

@Composable
fun SearchScreen(onRestaurantClick: (Restaurant) -> Unit) {
    var query by remember { mutableStateOf("") }

    val results = dummyRestaurants.filter { rest ->
        rest.name.contains(query, ignoreCase = true)
                || rest.category.contains(query, ignoreCase = true)
                || rest.menu.any { dish -> dish.name.contains(query, ignoreCase = true) }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
    ) {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Buscar...") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        if (results.isEmpty()) {
            Text(
                text = "No hay resultados",
                style = MaterialTheme.typography.bodyMedium
            )
        } else {
            LazyColumn {
                items(results) { restaurant ->
                    RestaurantCard(
                        restaurant = restaurant,
                        onClick = { onRestaurantClick(restaurant) }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

