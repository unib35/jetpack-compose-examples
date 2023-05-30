package com.example.rmarket_jetpack_compse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import com.example.jetpack_compose_example.ui.theme.JetpackcomposeexampleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposeexampleTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    Column(
                        modifier = Modifier
                            //여러가지 속성들을 메소드 체인으로 변경 가능
                            //순서가 차례대로 적용되므로 참고할것
                            .fillMaxSize()
                            .background(color = Color.Blue)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("text")
                        Text("World")
                        Text("RMarket")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name : String){
    Text(text = "Hello $name!")
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    JetpackcomposeexampleTheme() {
        Greeting("이종민")
    }
}

