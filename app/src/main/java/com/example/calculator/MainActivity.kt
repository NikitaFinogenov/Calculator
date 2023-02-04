package com.example.calculator

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {

                    mainScreen()
                }
            }
        }
    }
}

@Composable
fun mainScreen() {

    var a by rememberSaveable() {
        mutableStateOf(1)
    }
    var alisa by rememberSaveable() {
        mutableStateOf("")
    }
    var result by rememberSaveable() {
        mutableStateOf(0)
    }
    //var result = 0
    var garrry by rememberSaveable() {
        mutableStateOf(0)
    }





    Column {

        Text(text = "$alisa, $garrry", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = "$result", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Row() {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "%")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "CE")
            }
            Button(onClick = {
                alisa = ""
                result = 0
                a = 1
                garrry = 0
            }) {
                Text(text = "C")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Del")
            }
        }
        Row() {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "1/x")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "x^2")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "sqrt")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "/")
            }
        }
        Row() {
            Button(onClick = { alisa += "7" }) {
                Text(text = "7")
            }
            Button(onClick = { alisa += "8" }) {
                Text(text = "8")
            }
            Button(onClick = { alisa += "9" }) {
                Text(text = "9")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "*")
            }
        }
        Row() {
            Button(onClick = { alisa += "4" }) {
                Text(text = "4")
            }
            Button(onClick = { alisa += "5" }) {
                Text(text = "5")
            }
            Button(onClick = { alisa += "6" }) {
                Text(text = "6")
            }
            Button(onClick = {
                if (a == 1) {
                    garrry = alisa.toInt()
                    alisa = ""
                    a = 0
                } else {
                    result = result + garrry - alisa.toInt()
                    garrry = alisa.toInt()
                    //result -= alisa.toInt()
                    alisa = ""
                }
            }) {
                Text(text = "-")
            }
        }
        Row() {
            Button(onClick = { alisa += "1" }) {
                Text(text = "1")
            }
            Button(onClick = { alisa += "2" }) {
                Text(text = "2")
            }
            Button(onClick = { alisa += "3" }) {
                Text(text = "3")
            }
            Button(onClick = {

                if (a == 1) {
                    garrry = alisa.toInt()
                    alisa = ""
                    a = 0
                } else {
                    result += garrry + alisa.toInt()
                    garrry = alisa.toInt()
                    result -= alisa.toInt()
                    alisa = ""

                }
                Log.d("$garrry - G | $result - R | $alisa - A", "results")
            }) {
                Text(text = "+")
            }

        }
        Row() {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "+/-")
            }
            Button(onClick = { alisa += "0" }) {
                Text(text = "0")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = ".")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "=")
            }
        }
    }

}

/*
alisa
+
garry = alisa
alisa = ""
input: alisa
+
result = result + garry + alisa
garry = alisa
alisa = ""
input: alisa
+
 */

/*

 */







