package com.pmtaller2.carlosrubio_00000822.myapplication.data

import com.pmtaller2.carlosrubio_00000822.myapplication.model.Restaurant
import com.pmtaller2.carlosrubio_00000822.myapplication.model.Dish

val dummyRestaurants = listOf(
    // 🍔 Comida Rápida
    Restaurant(
        id = 1,
        name = "La Casa de la Burger",
        description = "Especialistas en hamburguesas artesanales.",
        category = "Comida Rápida",
        imageUrl = "https://imag.bonviveur.com/hamburguesa-clasica.jpg",
        menu = listOf(
            Dish(
                name = "Hamburguesa Clásica",
                description = "Pan, carne y queso",
                imageUrl = "https://www.serargentino.com/public/images/2021/01/16109941330-17-burger-773x458.jpg"
            ),
            Dish(
                name = "Doble Queso",
                description = "Más queso y sabor",
                imageUrl = "https://static.wixstatic.com/media/29cc8e_d71742bc6ab84e769b4937b344c72ebd~mv2.jpg/v1/fill/w_1000,h_563,al_c,q_85,usm_0.66_1.00_0.01/29cc8e_d71742bc6ab84e769b4937b344c72ebd~mv2.jpg"
            )
        )
    ),

    // 🌮 Comida Mexicana
    Restaurant(
        id = 2,
        name = "Tacos Epale",
        description = "Tacos auténticos y llenos de sabor mexicano.",
        category = "Comida Mexicana",
        imageUrl = "https://danosseasoning.com/wp-content/uploads/2022/03/Beef-Tacos-1024x767.jpg",
        menu = listOf(
            Dish(
                name = "Tacos al Pastor",
                description = "Carne adobada con piña y cilantro",
                imageUrl = "https://comedera.com/wp-content/uploads/sites/9/2017/08/tacos-al-pastor-receta.jpg"
            ),
            Dish(
                name = "Tacos Dorados",
                description = "Tortilla crujiente rellena de pollo y queso",
                imageUrl = "https://comedera.com/wp-content/uploads/sites/9/2017/09/tacos-dorados.jpg"
            )
        )
    ),

    // 🍝 Comida Italiana
    Restaurant(
        id = 3,
        name = "Pasta Linguini",
        description = "Pastas y salsas caseras al estilo italiano.",
        category = "Comida Italiana",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBV6QrKYNEAcpjZoXAPF97RRTiqhJDtVnSrA&s",
        menu = listOf(
            Dish(
                name = "Spaghetti Carbonara",
                description = "Pasta con salsa cremosa y tocino",
                imageUrl = "https://static01.nyt.com/images/2021/02/14/dining/carbonara-horizontal/carbonara-horizontal-mediumSquareAt3X-v2.jpg"
            ),
            Dish(
                name = "Pizza Margherita",
                description = "Tomate, mozzarella y albahaca",
                imageUrl = "https://safrescobaldistatic.blob.core.windows.net/media/2022/11/PIZZA-MARGHERITA.jpg"
            )
        )
    ),

    // 🍣 Comida Asiática
    Restaurant(
        id = 4,
        name = "I <3 Sushi",
        description = "Sushi fresco y rolls innovadores.",
        category = "Comida Asiática",
        imageUrl = "https://asianinspirations.com.au/wp-content/uploads/2018/12/R01459_Easy-Sushi-Rolls-2.jpg",
        menu = listOf(
            Dish(
                name = "Nigiri de Salmón",
                description = "Salmón fresco sobre arroz",
                imageUrl = "https://martiko.com/wp-content/uploads/2024/12/Nigiris-de-salmon-ahumado-noruego-marinado_web.jpg"
            ),
            Dish(
                name = "California Roll",
                description = "Cangrejo, aguacate y pepino",
                imageUrl = "https://www.pressurecookrecipes.com/wp-content/uploads/2021/02/california-roll.jpg"
            )
        )
    ),

    // 🥗 Comida Saludable
    Restaurant(
        id = 5,
        name = "V de Verde",
        description = "Opciones ligeras y nutritivas.",
        category = "Comida Saludable",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT30uRKN3TDAPZqULe-mFR7P0qL9jRvfo-PdA&s",
        menu = listOf(
            Dish(
                name = "Bowl de Quinoa",
                description = "Quinoa, pollo, verduras y aderezo cítrico",
                imageUrl = "https://images.themodernproper.com/production/posts/2020/QuinoaBowl_4.jpg?w=1200&h=1200&q=60&fm=jpg&fit=crop&dm=1737605526&s=b91b6baac05eb76bd048a76d12f4a9cd"
            ),
            Dish(
                name = "Ensalada César",
                description = "Lechuga, pollo, croutons y parmesano",
                imageUrl = "https://www.gourmet.cl/wp-content/uploads/2016/09/EnsaladaCesar2.webp"
            )
        )
    ),

    // 🍰 Postres y Dulces
    Restaurant(
        id = 6,
        name = "Dulce Dia",
        description = "Pasteles, helados y más golosinas caseras.",
        category = "Postres y Dulces",
        imageUrl = "https://www.paulinacocina.net/wp-content/uploads/2024/01/receta-de-postre-de-maracuya-Paulina-Cocina-Recetas-1722251880-1200x676.jpg",
        menu = listOf(
            Dish(
                name = "Cheesecake de Fresa",
                description = "Tarta de queso con coulis de fresa",
                imageUrl = "https://www.splenda.com/wp-content/themes/bistrotheme/assets/recipe-images/strawberry-topped-cheesecake.jpg"
            ),
            Dish(
                name = "Brownie",
                description = "Bloque de chocolate para deleitarte",
                imageUrl = "https://recetasdecocina.elmundo.es/wp-content/uploads/2016/11/brownie-de-chocolate.jpg"
            )
        )
    )
)