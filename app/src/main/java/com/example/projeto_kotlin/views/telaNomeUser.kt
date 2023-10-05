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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto_kotlin.textFieldLogin

@Composable
fun telaNomeUser(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFF27b1bf)
            )
    ) {
        Row(
            modifier = Modifier

                .padding(70.dp)
                .background(color = Color.Magenta)
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
                space = 520.dp
            ),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            var usuario by remember { mutableStateOf(TextFieldValue("")) }
            textFieldLogin(result = usuario, label = "Usuário")


            Column (
                verticalArrangement = Arrangement.spacedBy(
                    space = 10.dp,
                    alignment = Alignment.Bottom
                ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                OutlinedButton(
                    onClick = { navController.navigate(route = "Login") },
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
                        text = "FINALIZAR",
                        style = TextStyle(
                            fontSize = 17.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        )
                    )
                }
                Row {
                    Text(
                        text = "Ao se cadastrar, você aceita os Termos de Serviço e Politica de Privacidade de Move It.",
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(
                                start = 25.dp,
                                end = 20.dp
                            )
                    )
                }
            }
        }

    }
}


