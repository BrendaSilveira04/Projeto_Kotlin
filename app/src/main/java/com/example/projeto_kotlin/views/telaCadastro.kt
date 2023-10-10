package com.example.projeto_kotlin.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto_kotlin.textFieldLogin

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textFieldCadastro(
    navController: NavController,
    result: TextFieldValue,
    label:String) {

    var result by remember { mutableStateOf(TextFieldValue("")) }
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
                text = label
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
@Composable
fun telaCadastro(navController: NavController,) {
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
        Row(
            modifier = Modifier
                .padding(80.dp)
        ) {
            Text(
                text = "Cadastro",
                fontSize = 30.sp,

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

            ) {

            var UserEmail by remember { mutableStateOf(TextFieldValue("")) }
            textFieldLogin(result = UserEmail, label = "Email")

            var UserConfirmacao by remember { mutableStateOf(TextFieldValue("")) }
            textFieldLogin(result = UserConfirmacao, label = "Confirmação de Email")

            var UserSenha by remember { mutableStateOf(TextFieldValue("")) }
            textFieldLogin(result = UserSenha, label = "Senha")

            var SenhaConfirmacao by remember { mutableStateOf(TextFieldValue("")) }

            textFieldLogin(result = SenhaConfirmacao, label = "Confirmação de Senha")

            ElevatedButton(
                onClick = { navController.navigate(route = "NomeUser") },
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
                        shape = RoundedCornerShape(28.dp),
                    )
                    .background(
                        color = Color(
                            0xFFE9EEF4
                        ),
                        shape = RoundedCornerShape(28.dp)

                    )


            ) {
                Text(
                    text = "PROXIMO",
                    style = TextStyle(
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
    }
}