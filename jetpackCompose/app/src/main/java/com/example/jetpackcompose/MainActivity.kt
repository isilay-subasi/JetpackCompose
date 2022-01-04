package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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

    Column() {
        // Text(text = "Hello $name!",color = Color.Magenta)
        Text(text = "Hello Android",color = Color.Magenta,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Hello World",color = Color.Magenta,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }




}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   MainScreen()
}