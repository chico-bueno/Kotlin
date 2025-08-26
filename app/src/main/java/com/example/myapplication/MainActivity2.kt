package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*


class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            TelaTransporte()
            TelaPrincipal()
            }
        }
    }


@Composable
fun TelaPrincipal() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .padding(16.dp)) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 90.dp) // espaço para o rodapé
        ) {
            Pesquisa()
            Frequentes()
            FavoritosCasa()
            FavoritoTrabalho()
            FavoritoDestino()
        }

        Rodape(
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )
    }
}


@Composable
fun Background(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ){}
}

@Composable
fun Pesquisa(){

    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        modifier = Modifier
            .height(56.dp)
            .padding(top = 16.dp)

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Column {
                Text("      Para onde você quer ir?", style = MaterialTheme.typography.bodyLarge, color = Color.White)
            }


            Surface(
                modifier = Modifier.size(56.dp),
                color = Color(0xFFFF9500)
            ) {
                Image(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    modifier = Modifier.size(40.dp)
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
        }
    }
}


@Composable
fun Frequentes(){
    Spacer(modifier = Modifier.width(20.dp))
    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        modifier = Modifier
            .height(200.dp)
            .padding(10.dp)

    ) {

        Row(
            modifier = Modifier.width(350.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text("Destinos frequentes", style = MaterialTheme.typography.labelMedium, color = Color.White)
                Text("Para ABO - Associação Brasileira de Odontologia - Secção Paraná", style = MaterialTheme.typography.headlineSmall, color = Color.White)
                Surface(
                    modifier = Modifier
                        .width(200.dp)
                        .height(35.dp),
                    color = Color.LightGray,
                ) {
                    Text(text = "➡ 380 Detran ➡ 👤", style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .width(100.dp)
                    )

                }
            }
        }
    }
}

@Composable
fun FavoritosCasa() {
    Spacer(modifier = Modifier.width(20.dp))
    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        modifier = Modifier
            .height(100.dp)
            .padding(10.dp)

    ) {

        Row(
            modifier = Modifier.width(350.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "🏠 Casa ", style = MaterialTheme.typography.titleLarge, color = Color.White,
                modifier = Modifier.padding(16.dp),

                )

            Text(
                text = "Voce esta perto",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White,
                modifier = Modifier.padding(16.dp),
            )

            Spacer(modifier = Modifier.width(20.dp))
        }
    }
}

@Composable
fun FavoritoTrabalho(){
    Spacer(modifier = Modifier.width(20.dp))
    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        modifier = Modifier
            .height(100.dp)
            .padding(10.dp)

    ) {

        Row(
            modifier = Modifier.width(350.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "🌇 Trabalho ", style = MaterialTheme.typography.titleLarge, color = Color.White,
                modifier = Modifier.padding(16.dp),

                )

            Text(
                text = "Toque para Editar",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White,
                modifier = Modifier.padding(16.dp),
            )

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable

fun FavoritoDestino(){
    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        modifier = Modifier
            .height(200.dp)
            .padding(10.dp)

    ) {
        Column(
            modifier = Modifier.width(350.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "☸ ABO-Associoação Brasileira de Odontologia - Secção Paraná", style = MaterialTheme.typography.titleLarge, color = Color.White,
                modifier = Modifier.padding(bottom = 4.dp),
            )

            Text(
                text = "Rua Dias da Rocha Filho - Alto da XV, Curitiba - PR, Brasil", style = MaterialTheme.typography.titleLarge, color = Color.White,
            )

        }
    }
}

@Composable
fun Rodape(modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Direções   |   Estações   |   Linhas   |   Passagens",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        }
    }
}