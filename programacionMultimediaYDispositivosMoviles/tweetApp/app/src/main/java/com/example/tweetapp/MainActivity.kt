package com.example.tweetapp

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tweetapp.R.drawable.foto
import com.example.tweetapp.R.drawable.todd
import com.example.tweetapp.R.drawable.verified_icon
import com.example.tweetapp.ui.theme.TweetAppTheme
import com.google.android.filament.Box
import java.nio.file.Files.size

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TweetAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}
@Preview
@Composable
fun Greeting() {
    val padding = 16.dp
    Column (
        Modifier
            .padding(padding)
            .fillMaxWidth()
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {

            Box {
                Image(painter = painterResource(id = todd), contentDescription = "Profile picture", Modifier.size(100.dp))
                Icon(painter = painterResource(id = verified_icon), contentDescription = "Icon",
                    Modifier

                        .padding(
                            60.dp
                        )
                        .size(50.dp)

                )
            }
            Column {
                Text("Todd Howard", fontSize = 25.sp)
                Text("@prettylittleliar",
                    color   = Color.Magenta,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                )
            }

        }

        Image(painter = painterResource(id = foto), contentDescription = "fotito", Modifier

            .size(700.dp)
        )
    }
}



