
package com.example.projeto_kotlin

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto_kotlin.ui.theme.Projeto_KotlinTheme
import com.example.projeto_kotlin.views.telaCadastro
import com.example.projeto_kotlin.views.telaHome
import com.example.projeto_kotlin.views.telaNomeUser

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto_KotlinTheme {
                val NavController = rememberNavController()

                NavHost(navController = NavController, startDestination = "Login"){
                    composable(
                        route = "Login"
                    ){
                        TelaLogin(navController = NavController)
                    }
                    composable(
                        route = "Cadastro"
                    ){
                        telaCadastro(navController = NavController)
                    }
                    composable(
                        route = "NomeUser"
                    ){
                        telaNomeUser(navController = NavController)
                    }
                    composable(
                        route = "Home"
                    ){
                        telaHome(navController = NavController)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textFieldLogin(
    result: TextFieldValue,
    label:String
){
    var result by remember{ mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier
            .padding(0.5.dp)
            .width(400.dp)
            .height(52.dp)
            .background(
                color = Color.Transparent
            )
            .border(
                width = 1.dp,
                color = Color(0xFF000000),
                shape = RoundedCornerShape(size = 28.dp)
            ),

        value = result,
        label = {
            Text(
                text= label
            )
        },
        textStyle = TextStyle(
            color = Color.Black

        ),
        onValueChange = {
            result = it
        },
        shape = RoundedCornerShape(28.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            containerColor = Color.White
        ),
    )

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaLogin(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(listOf(
                    Color.White,
                    Color.Cyan
                    )
                )
            )
    ) {
        Column (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(60.dp)

        ){
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
            Image(
                painter = painterResource(R.drawable.rw_1),
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Transparent),
            verticalArrangement = Arrangement.spacedBy(
                space = 25.dp,
                alignment = Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally,

            ){

            var User by remember{ mutableStateOf(TextFieldValue("")) }
            textFieldLogin(result = User, label = "Usuário ou Email")


            var SenhaUser by remember{ mutableStateOf(TextFieldValue("")) }

            textFieldLogin(result = SenhaUser, label = "Senha")

            ElevatedButton(
                onClick = {navController.navigate(route = "Home")},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(
                        0xFFE9EEF4
                    )
                ),


                modifier = Modifier
                    .width(190.dp)
                    .height(58.dp)
                    .border(
                        width = (1.dp),
                        color = Color(
                            0xFF000000
                        ),
                        shape = RoundedCornerShape(28.dp)
                    )
                    .background(
                        color = Color(
                            0xFFE9EEF4
                        ),
                        shape = RoundedCornerShape(28.dp)
                    )





            ) {
                Text(
                    text = "LOGIN",
                    style = TextStyle(
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                    )
                )
            }
            TextButton(
                onClick = {}

            ) {
                Text(
                    text = "ESQUECI A SENHA",
                    style = TextStyle(
                        color = Color.Black,
                        background = Color.Transparent,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                    )
                )
            }

            TextButton(
                onClick = {navController.navigate(route = "Cadastro")}

            ) {
                Text(
                    text = "CADASTRE-SE",
                    style = TextStyle(
                        color = Color.Black,
                        background = Color.Transparent,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                    )
                )
            }

        }
    }
}






