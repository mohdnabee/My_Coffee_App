package com.nabeel.mycoffeeapp.Screens.WelcomeScreen

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nabeel.mycoffeeapp.R

@Preview(showBackground = true )
@Composable
fun WelcomeScreen() {

    Box(
        modifier = Modifier.fillMaxSize().background(color = Color.Black)
    ){
        Image(painter = painterResource(id = R.drawable.coffesplash),
            contentDescription = "welcome image ",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)

        Box(modifier = Modifier.fillMaxSize().background(color = Color.Black.copy(alpha = 0.4f))){

            Column(modifier = Modifier.fillMaxSize().padding(bottom = 70.dp,  ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom) {

                Text("Fall in Love with Coffee in blissful delight!"
                    , fontSize = 28.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center)


                Spacer(modifier = Modifier.height(16.dp))

                Text("Welcome to our cozy  coffee corner , where every  cup  is a delight for you.",
                    fontSize = 15.sp,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,  
                    modifier = Modifier.padding(horizontal = 5.dp))

                Spacer(modifier = Modifier.height(50.dp))

                androidx.compose.material3.Button(
                    onClick ={},
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp).height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xfffffff),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(10.dp)
                ){

                    Text("Get Started" ,  fontSize = 18.sp)

                }

            }

        }

    }

}