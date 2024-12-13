package com.example.kotlin_project_9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_project_9.ui.theme.Blue
import com.example.kotlin_project_9.ui.theme.DarkGreen
import com.example.kotlin_project_9.ui.theme.Green
import com.example.kotlin_project_9.ui.theme.Kotlinproject9Theme
import com.example.kotlin_project_9.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlinproject9Theme {
                MyComponent()
            }
        }
    }
}

@Composable
fun MyComponent() {
    Text(
        text = "Polyakov AM, IKBO-12-22",

        modifier = Modifier
            .padding(30.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Green)
            .size(200.dp)
            .border(2.dp, DarkGreen, RoundedCornerShape(10.dp))
    )
}