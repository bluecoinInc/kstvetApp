package com.krypt.kstvetapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.krypt.kstvetapp.ui.theme.KstvetAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {


                Row {
                    Button(onClick = {

                    }) {
                        Text(text = "This is not a button")
                    }

                    Text(text = "Okara")
                    Text(text = "Isoe")
                }
                Row {
                    Button(onClick = {
                        Toast.makeText(
                            this@MainActivity,
                            "yea",
                            Toast.LENGTH_LONG
                        )
                    }) {
                        Text(text = "This is not a button")
                    }

                    Text(text = "Okara")
                    Text(text = "Isoe")
                }
            }
        }

    }
}