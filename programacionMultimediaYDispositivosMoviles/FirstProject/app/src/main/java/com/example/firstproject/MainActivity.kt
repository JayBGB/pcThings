package com.example.firstproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstproject.ui.theme.FirstProjectTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    val TAG = "Estado"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectTheme {
                    Greeting("Hersiker")
            }
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "Start")
    }

    override fun onPause(){

        super.onPause()
        Log.d(TAG, "Pause")
    }

    override fun onResume(){

        super.onResume()
        Log.d(TAG, "Resume")
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var animationState by remember { mutableStateOf(AnimationState.START) }
    val animatableAlpha = remember { Animatable(0f) }
    val animatableTranslationX = remember { Animatable(700.dp.value) }

    LaunchedEffect(animationState) {
        animatableAlpha.animateTo(
            targetValue = if (animationState == AnimationState.START) 1f else 0f,
            animationSpec = tween(durationMillis = 1000)
        )

        animatableTranslationX.animateTo(
            targetValue = if (animationState == AnimationState.START) 0f else 700.dp.value,
            animationSpec = tween(durationMillis = 1000)
        )

        // Switch animation state
        animationState = if (animationState == AnimationState.START) AnimationState.END else AnimationState.START
    }

    Surface(color = Color.Magenta,
            modifier= Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .padding(50.dp)
                .alpha(animatableAlpha.value)
                .offset(x = animatableTranslationX.value.dp)
        ) {
            Text(
                text = "Hello there, my name is $name!",
                fontSize = 45.sp,
                fontFamily = FontFamily.Cursive,
                lineHeight = 75.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,

            )
        }
    }
}

enum class AnimationState {
    START,
    END
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstProjectTheme {
        Greeting("Hersiker")
    }
}



