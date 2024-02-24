package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card(
                        stringResource(R.string.name),
                        stringResource(R.string.title),
                        stringResource(R.string.phone),
                        stringResource(R.string.social_handle),
                        stringResource(R.string.email)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, title: String, phone:String, socialHandle:String, email:String, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFe6fff1))
    ){
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)

        ){

        }

        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = modifier
                .fillMaxWidth()
                .weight(1f)


        ){


            Row {
                Spacer(modifier = Modifier.weight(1f))

                Box (
                    modifier = modifier
                        .weight(1.5f)

                        .background(Color(0xFF000000))

                ){
                    Image(
                        painter = painterResource(id = R.drawable.android_logo),
                        contentDescription = "Android Logo"
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
            }

        }
        Column (
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(20.dp)

        ){
           // Image(painter = R.drawable.ic_launcher_foreground , contentDescription ="Logo")

            Text(text = name, textAlign = TextAlign.Center, fontSize = 50.sp)
            Text(
                text = title,
                textAlign = TextAlign.Center,
                color = Color(0xFF3ddc84),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(50.dp)
        ){
            Column(
                verticalArrangement = Arrangement.Bottom,
                //horizontalAlignment = Alignment.CenterHorizontally,

             ) {
                
                Row {
                    Icon(
                        Icons.Filled.Phone,
                        contentDescription = "Phone",
                        tint = Color(0xFF3ddc84),

                        )
                    Text("  $phone")
                }
                Spacer(Modifier.height(20.dp))
                Row {
                    Icon(
                        Icons.Filled.Share,
                        contentDescription = "Share",
                        tint = Color(0xFF3ddc84),

                        )
                    Text("  $socialHandle")
                }
                Spacer(Modifier.height(20.dp))
                Row {
                    Icon(
                        Icons.Filled.Email,
                        contentDescription = "Mail",
                        tint = Color(0xFF3ddc84),

                        )
                    Text("  $email")
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Card(
            stringResource(R.string.name),
            stringResource(R.string.title),
            stringResource(R.string.phone),
            stringResource(R.string.social_handle),
            stringResource(R.string.email)
        )
    }
}