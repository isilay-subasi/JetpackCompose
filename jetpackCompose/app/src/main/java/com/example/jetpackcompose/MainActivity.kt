package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainScreen()
        }

       // testFunction(5,::myTestFunction)

        testFunction(6){
            myTestFunction()
        }
    }

    fun testFunction(int : Int , myTestFunction : () -> Unit){

    }

    fun myTestFunction(){
        println("test")
    }



}

@Composable
fun MainScreen(){

    //Column, Row, Box

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
            CustomText(name = "Hello Android")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(name = "Hello World")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(name = "Hello Kotlin")


    }

}

//Oluşturulan composable baş harfi büyük olması gerekmektedir.
@Composable
fun CustomText(name : String){
    // Text(text = "Hello $name!",color = Color.Magenta)
    Text(modifier = Modifier
        .background(color = Color.Cyan)
        .padding(10.dp)
        .clickable {
            println("Hello World clicked")
        }
        .width(150.dp)
        //.height(34.dp)
        //.size(width = 100.dp,height = 100.dp)
        //.fillMaxWidth() //yüzdesini , doldurabildiği kadar doldur demektir.
        ,text = name,
        color = Color.Magenta,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,textAlign = TextAlign.Center

    )
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   MainScreen()
}