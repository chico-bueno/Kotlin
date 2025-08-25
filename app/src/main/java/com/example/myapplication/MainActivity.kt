package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview
@Composable
fun Pesquisa(){
    Card(
        colors = CardDefaults.cardColors(Color.Black),
        modifier = Modifier.height(56.dp)

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
                color = Color.Yellow
            ) {
                Image(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun Frequentes(){
    Card(
        colors = CardDefaults.cardColors(Color.Black),
        modifier = Modifier.height(200.dp)

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
                    modifier = Modifier.width(200.dp).height(35.dp),
                    color = Color.LightGray,
                ) {
                    Text("380 Detran", style = MaterialTheme.typography.titleLarge)

                    Image(
                        imageVector = Icons.Default.Person,
                        contentDescription = "",
                        modifier = Modifier.size(20.dp),
//                        horizontalAlignment =
                    )

                }
            }

        }
    }
}