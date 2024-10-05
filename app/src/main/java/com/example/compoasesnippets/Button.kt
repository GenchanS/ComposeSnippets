package com.example.compoasesnippets

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compoasesnippets.ui.theme.CompoaseSnippetsTheme

@Composable
fun Button1(){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(),
    ) {
        Text("Default Button")
    }
}


@Preview(showBackground = true)
@Composable
fun Button1_Preiew() {
    Button1()
}
