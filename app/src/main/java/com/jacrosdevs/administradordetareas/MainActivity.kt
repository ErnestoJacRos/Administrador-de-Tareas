package com.jacrosdevs.administradordetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jacrosdevs.administradordetareas.ui.theme.AdministradorDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdministradorDeTareasTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AdministratorTaks(title = "All tasks completed", subTitle = "Nice work!")
                }
            }
        }
    }
}

@Composable
fun AdministratorTaks(title: String, subTitle: String ,modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        var imagen = painterResource(id = R.drawable.ic_task_completed)
        Image(painter = imagen, contentDescription = null)
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
        Text(text = subTitle,
            fontSize = 16.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdministradorDeTareasTheme {
        AdministratorTaks(title = "All tasks completed", subTitle = "Nice work!")
    }
}