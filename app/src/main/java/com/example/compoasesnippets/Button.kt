package com.example.compoasesnippets

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compoasesnippets.ui.theme.CompoaseSnippetsTheme
//Buttonの例

@Composable
fun FilledButton(){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(),
    ){
        Text("Filled Button")
    }
}
@Composable
fun FilledTonalButton(){
    FilledTonalButton(
        onClick = {},
    ){
        Text("Tonal Button")
    }
}
@Composable
fun OutlinedButton() {
    OutlinedButton(
        onClick = {}
    ){
        Text("Outlined")
    }
}

@Composable
fun ElevatedButton() {
    ElevatedButton(
        onClick = {}
    ){
        Text("Elevated")
    }
}

@Composable
fun TextButton() {
    TextButton(
        onClick = {}
    ) {
        Text("Text Button")
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreiew() {
    Column() {
        FilledButton()
        FilledTonalButton()
        OutlinedButton()
        ElevatedButton()
        TextButton()
    }
}
