package com.eniecole.mod6datastore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.eniecole.mod6datastore.ui.theme.TPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TPTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FormSettings(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun FormSettings(modifier: Modifier = Modifier,
                 vm: SettingsViewModel = viewModel(factory =SettingsViewModel.Factory)) {
    Column(modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {
        CardForm(titre = "Adresse 1",
            label="Adresse",
            valueTextField = vm.adr1.collectAsState("").value ?: "",
            onValueChange = {
                vm.setAdr1(it)
            })
        CardForm(titre = "Adresse 2",
            label="Adresse comp.",
            valueTextField = "",
            onValueChange = {})
        CardForm(titre = "Code Entreprise",
            label="Code Entreprise",
            valueTextField = "",
            onValueChange = {})
        CardForm(titre = "ID Carte réduction",
            label="1324241",
            valueTextField = ""/*Transformer en chaîne de caractère */,
            onValueChange = {carteReduc->
                //TODO Parser carteReduc en Int
                //TODO Sauvegarder

            })

    }
}
@Composable
fun CardForm(modifier: Modifier = Modifier,
             titre :String,
             label : String,
             valueTextField : String,
             onValueChange : (String) -> Unit) {
    Card(modifier = modifier){
        Row(modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,){
            Column{
                Text(titre)
                TextField(value=valueTextField,
                    onValueChange = onValueChange,
                    label = {Text(label)})
            }
            Spacer(Modifier.weight(1f))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Done, contentDescription = null)
            }
        }
    }
}