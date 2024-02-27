package com.example.businesscardwithlogging

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardwithlogging.ui.theme.BusinessCardWithLoggingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardWithLoggingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardExample("Android")
                }
            }
        }
        Log.i("SimpleDebug", "Creating")

//        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.i("SimpleDebug", "Starting")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SimpleDebug", "Resuming")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SimpleDebug", "Pausing")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SimpleDebug", "Stopping")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SimpleDebug", "Resuming")
    }
}

@Composable
fun BusinessCardExample(name: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.padding(vertical = 100.dp))
        Text(
            text = "Anna Zhuk",
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
//            modifier = Modifier.padding(start = 90.dp)
        )
        Text(
            text = "Junior System Analyst",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
//            modifier = Modifier.padding(start = 90.dp)
        )
    }
    Column(
    ) {
        Spacer(modifier = Modifier.padding(bottom = 500.dp))
        ContactRow(
            text = "+7 (921) 111-22-33",
            icon = Icons.Rounded.Phone,
        )
        ContactRow(
            text = "@SomeTG",
            icon = Icons.Rounded.Send,
        )
        ContactRow(
            text = "blabla@domain.com",
            icon = Icons.Rounded.Email,
        )
    }
}

@Composable
fun ContactRow(
    text: String,
    icon: ImageVector,
) {
    Row(
        modifier = Modifier.padding(start = 80.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.padding(bottom = 0.dp)
        )
        Text(
            text = text,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)


        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardWithLoggingTheme {
        BusinessCardExample("Anna")
    }
}