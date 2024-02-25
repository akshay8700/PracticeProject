package com.example.practiceproject

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.R

// Toast function
fun mToast(context: Context) {
    Toast.makeText(context, "Clicked! yeah its working!!!", Toast.LENGTH_LONG).show()
}

@Composable
fun allButtons() {
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ){

        // 1st is simple
        SimpleButton()
        // 2nd Button with gray background
        ButtonWithColor()
        // 3rd Button with Multiple text
        ButtonWithTwoTextView()
        // 4th
        ButtonWithIcon()
        // 5th
        ButtonWithCutCornerShape()
        // 6th
        ButtonWithBorder()
        // 7th
        ButtonWithElevation()
    }
}

@Composable
fun SimpleButton() {
    // Fatching local context
    val c = LocalContext.current
    var myModifier = Modifier
        .fillMaxSize()
        .background(color = Color.Green)

    Column (modifier = myModifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Button(onClick = { mToast(context = c)
            // onclick code
            myModifier.background(color = Color.Red)

            
            }) {
            Text("Click Me!")
        }
    }
}

@Composable
fun ButtonWithColor(){
    Button(onClick = {
        //your onclick code
    },
        colors = ButtonDefaults.buttonColors(Color.DarkGray))

    {
        Text(text = "Button with gray background",color = Color.White)
    }
}

@Composable
fun ButtonWithTwoTextView() {
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Click ", color = Color.Magenta)
        Text(text = "Here", color = Color.Green)
    }
}

@Composable
fun ButtonWithIcon() {
    Button(onClick = {}) {
        Image(
            painterResource(id = R.drawable.ic_call_answer),
            contentDescription ="Cart button icon",
            modifier = Modifier.size(20.dp))

        Text(text = "Add to cart", Modifier.padding(start = 10.dp))
    }
}

@Composable
fun ButtonWithCutCornerShape() {
    //CutCornerShape(percent: Int)- it will consider as percentage
    //CutCornerShape(size: Dp)- you can pass Dp also.
    //Here we use Int, so it will take percentage.
    Button(onClick = {}, shape = CutCornerShape(20)) {
        Text(text = "Cut corner shape")
    }
}

@Composable
fun ButtonWithBorder() {
    Button(
        onClick = {
            //your onclick code
        },
        border = BorderStroke(1.dp, Color.Red),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
    ) {
        Text(text = "Button with border", color = Color.DarkGray)
    }
}

@Composable
fun ButtonWithElevation() {
    Button(onClick = {
        //your onclick code here
    },elevation =  ButtonDefaults.elevatedButtonElevation(
        defaultElevation = 10.dp,
        pressedElevation = 15.dp,
        disabledElevation = 0.dp
    )) {
        Text(text = "Button with elevation")
    }
}

fun changeColor() {

}