package com.example.compoasesnippets

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FAB(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = { onClick() },
    ) {
        Icon(Icons.Filled.Add, "Floating action button.")
    }
}
@Composable
fun SmallFAB(onClick:()-> Unit){
    SmallFloatingActionButton(
        onClick = {onClick()},
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary
    ) {
        Icon(Icons.Filled.Add, "Small floating action button.")
    }
}

@Preview(showBackground = true)
@Composable
fun FButtonPreview() {
    Column() {
        FAB(onClick = {})
        SmallFAB(onClick = {})
    }
}