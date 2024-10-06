package com.example.compoasesnippets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.compoasesnippets.ui.theme.CompoaseSnippetsTheme
//import java.lang.reflect.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun FilledButton_(onClick: () -> Unit){
    Button(
        onClick = onClick,//ボタン押下時にここがコールバック関数として呼ばれる
        colors = ButtonDefaults.buttonColors(),
    ){
        Text("Filled Button")
    }
}
@Composable
fun FilledTonalButton_(onClick: () -> Unit){
    FilledTonalButton(
        onClick = onClick,
    ){
        Text("Tonal Button")
    }
}
@Composable
fun OutlinedButton_(onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick
    ){
        Text("Outlined")
    }
}

@Composable
fun ElevatedButton_(onClick: () -> Unit) {
    ElevatedButton(
        onClick = onClick
    ){
        Text("Elevated")
    }
}

@Composable
fun TextButton_(onClick: () -> Unit) {
    TextButton(
        onClick = onClick
    ) {
        Text("Text Button")
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonPreiew() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center  // 垂直方向にも中央に配置
    ) {
        var count by remember { mutableIntStateOf(0) }
        FilledButton_(onClick = { count++ })
        //FilledTonalButton_(onClick = { count++ })
        //OutlinedButton_(onClick = { count++ })
        //ElevatedButton_(onClick = { count++ })
        //TextButton_(onClick = { count++ })

        Text(text = "Count: $count")
    }
}
