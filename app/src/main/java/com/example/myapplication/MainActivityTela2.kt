package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            TelaTransporte()
//        }
//    }
//} 
//PROFESSOR, PARA VER O CODIGO RODANDO, VC PRECISA COMENTAR O MAIN DA "TELA1", E DESCOMENTAR ESSE

@Preview(showBackground = true)
@Composable
fun TelaTransporte() {

    Column(
        modifier = Modifier
            .fillMaxSize() // Ocupa toda a tela
            .background(Color.Black) // Fundo preto
            .padding(16.dp) // Espaçamento interno
    ) {

        Text(
            text = "🚌 Transporte",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 20.dp)
        )


        Card(
            colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "⏱️ 18 minutos | 💰 R$ 6,00",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(12.dp))


                Text(
                    text = "🚌 Linha 380 - DETRAN",
                    color = Color(0xFFFF9500), // Cor laranja
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }


        Card(
            colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "🟠", fontSize = 20.sp) // Ponto de origem

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = "📍 Praça Gen. Osório",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Saída: 09:49",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                }
            }
        }

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "🚌", fontSize = 24.sp)

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = "380 DETRAN",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Duração: 13 min no ônibus",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(
                text = "🚀 Começar Viagem",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
