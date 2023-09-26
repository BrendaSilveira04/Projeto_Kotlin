package com.example.projeto_kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projeto_kotlin.ui.theme.Projeto_KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto_KotlinTheme {
                TelaLogin()
            }
        }
    }
}

@Composable
fun BotaoLogin(){

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaLogin() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFF27b1bf)
            )
    ) {
        Column (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ){
            Text(
                text = "Login",
                fontSize = 30.sp,
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),

        ){
            var User by remember{ mutableStateOf(TextFieldValue("")) }

            OutlinedTextField(value = User,
                label = {Text(text= "Email")},
                textStyle = TextStyle(color = Color.Black),
                onValueChange = {User = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Gray
                    , unfocusedBorderColor = Color.Gray),
            )

            
            var SenhaUser by remember{ mutableStateOf(TextFieldValue("")) }

            OutlinedTextField(value = SenhaUser,
                label = {Text(text= "Senha")},
                onValueChange = {SenhaUser = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Gray, unfocusedBorderColor = Color.Gray)
            )

        }
    }
}

@Preview
@Composable
fun  TelaLoginPreview(){
    TelaLogin()
}