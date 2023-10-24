package com.example.jetpackthirdtask

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackthirdtask.ui.theme.JETPACKThirdTaskTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ComponationBox()
            //ComponationColumnFinally()
            ComponationRowsFinally()
        }
    }
}

@Composable
public fun ComponationBox() {
    Box(
        modifier = Modifier
            .size(300.dp, 250.dp)
            .background(Color.Blue)
    )
}

//@Composable
//public fun Componation2() {
//    Box( modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center )
//    {
//        Box(modifier = Modifier.background(Color.Blue).size(300.dp))
//        Box(modifier = Modifier.background(Color.LightGray).size(200.dp))
//        Text("Hello METANIT.COM!", style = TextStyle(fontSize = 22.sp))
//    }
//}

//@Composable
//public fun ComponationColumn() {
//    Column {
//        Text("Hello", style = TextStyle(fontSize = 22.sp))
//        Text("World", style = TextStyle(fontSize = 22.sp))
//        Text("from", style = TextStyle(fontSize = 22.sp))
//        Text("Jetpack Compose", style = TextStyle(fontSize = 22.sp))
//    }
//}

@Composable
public fun ComponationColumnFinally() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween )
    {
        Box(modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp))
        Box(modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .height(100.dp))
        Box(modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
    }
}

@Composable
public fun ComponationRowsFinally() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly)
    {
        Box(modifier = Modifier
            .background(Color.Red)
            .height(150.dp)
            .width(100.dp))
        Box(modifier = Modifier
            .background(Color.Yellow)
            .height(150.dp)
            .width(100.dp))
        Box(modifier = Modifier
            .background(Color.Green)
            .height(150.dp)
            .width(100.dp))
    }
}


