package com.nabeel.mycoffeeapp.Screens.HomeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nabeel.mycoffeeapp.R
import com.nabeel.mycoffeeapp.Screens.ui_Components.MyBottomNavBar
import com.nabeel.mycoffeeapp.model.Product

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true ,  showSystemUi = true )
@Composable
fun HomeScree() {


    val  location =  "Behoar Bahg North Civillines"

    Scaffold(
        bottomBar = {
            MyBottomNavBar()
        }
    ) { innerPadding ->



        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )

                    )
                )

        )

        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp).padding(innerPadding)
        ) {

            Text(
                text  = "Location",
                color = Color.LightGray,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(location, color = Color.White, fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold)

                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "down",
                    tint = Color.White)
            }

            Spacer(modifier = Modifier.height(30.dp))

            MySearchBar()

            Spacer(modifier = Modifier.height(40.dp))
            Image(
                painter = painterResource(id = R.drawable.banner_1),
                contentDescription = "Bannner" )

            Spacer(modifier = Modifier.height(16.dp))
            HomeScreenCategories()

            //  Display  Produ
            val  products =  listOf(
                Product(id = 1 , "Espresso" , "Strong and rich ",   3.8 ,  R.drawable.coffee_2),
                Product(id = 2 , "Latte" ,    "smooth and creamy",  4.50,  R.drawable.coffee_3),
                Product(id = 3 , "Cappuccino","with chocolate",     4.20,  R.drawable.coffee_1),
                Product(id = 4 , "Mocha" ,    "with cocoa flavour", 4.70,  R.drawable.coffee_4),
                Product(id = 5 , "Macchiato" ,"Bold and Milky",     4.60,  R.drawable.coffee_5),
                Product(id = 6 , "Flat White","Velvety  smooth",    4.40,  R.drawable.coffee_6),
                Product(id = 7 , "Ice Macho" ,"Refreshing and rich",4.70,  R.drawable.coffee_4),
            )






        }
    }

}