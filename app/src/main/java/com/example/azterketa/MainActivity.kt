package com.example.azterketa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.azterketa.ui.theme.AzterketaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Azterketa("Hellow Android")
        }
    }
}

@Composable
fun Azterketa( Texto: String) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.Cyan)
            .padding(start = 40.dp, end = 40.dp, top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Column(
                    modifier = Modifier
                        .padding(bottom = 40.dp)
                ) {
                    Text(
                        Texto,
                        modifier = Modifier
                            .background(Color.Red)
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(top = 40.dp, bottom = 40.dp),
                    horizontalAlignment = Alignment.End,
                ) {
                    Text(
                        Texto,
                        modifier = Modifier.background(Color.Red)
                    )
                    Text(
                        Texto,
                        modifier = Modifier.background(Color.Red)
                    )
                    Text(
                        Texto,
                        modifier = Modifier.background(Color.Red)
                    )
                }

            }
        }

        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(Texto)
        }

        Row(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .background(Color.Blue),
                horizontalAlignment = Alignment.Start
            ) {
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("1")
                }
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("2")
                }
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("3")
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Magenta),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("4")
                }
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("5")
                }
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("6")
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Black),
                horizontalAlignment = Alignment.End
            ) {
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("7")
                }
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("8")
                }
                Button(onClick = {}, modifier = Modifier.size(60.dp)) {
                    Text("9")
                }
            }
        }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(bottom = 40.dp)
                    .background(Color.Yellow),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Resultado")
                Text(text = "666")
            }
        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewAzterketa() {
    Azterketa("Hellow Android")
}