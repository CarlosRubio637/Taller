package com.pmtaller2.carlosrubio_00000822.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.pmtaller2.carlosrubio_00000822.myapplication.data.dummyRestaurants
import com.pmtaller2.carlosrubio_00000822.myapplication.model.Restaurant

@Composable
fun RestaurantListScreen(onRestaurantClick: (Restaurant) -> Unit) {
    val grouped = dummyRestaurants.groupBy { it.category }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        grouped.forEach { (category, restaurants) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            item {
                LazyRow {
                    items(restaurants) { restaurant ->
                        Card(
                            modifier = Modifier
                                .padding(end = 8.dp)
                                .width(200.dp)
                                .height(150.dp),
                            onClick = { onRestaurantClick(restaurant) }
                        ) {
                            Column {
                                Image(
                                    painter = rememberImagePainter(restaurant.imageUrl),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(100.dp),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = restaurant.name,
                                    style = MaterialTheme.typography.bodyMedium,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
