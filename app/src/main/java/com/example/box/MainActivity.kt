package com.example.box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box.ui.theme.BoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyBox(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyBox(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Green)){
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.Center))
        {
            Text(text = "Centro", fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.CenterEnd))
        {
            Text(text = "Centro Derecha",fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.CenterStart))
        {
            Text(text = "Centro Izquierda",fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.TopStart))
        {
            Text(text = "Arriba Izquierda",fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.TopCenter))
        {
            Text(text = "Arriba Centro",fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.TopEnd))
        {
            Text(text = "arriba derecha",fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.BottomStart))
        {
            Text(text = "abajo izquierda",fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.BottomCenter))
        {
            Text(text = "abajo centro",fontSize = 14.sp)
        }
        Box(modifier = Modifier.background(Color.Red).width(60.dp).height(60.dp).align(Alignment.BottomEnd))
        {
            Text(text = "Abajo Derecha",fontSize = 14.sp)
        }
    }}

@Preview(showBackground = true)
@Composable
fun MyBoxPreview() {
        BoxTheme {
            MyBox()
    }
}

