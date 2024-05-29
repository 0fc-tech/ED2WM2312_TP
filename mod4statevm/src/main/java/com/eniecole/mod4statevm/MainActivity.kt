package com.eniecole.mod4statevm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.eniecole.mod4statevm.ui.theme.TPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TPTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterPage(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CounterPage(modifier: Modifier = Modifier,vm : CounterViewModel = viewModel()) {
    //TODO Afficher une row avec un icon button ArrowDown et ArrowUp avec
    // au milieu un texte affichant le compteur
    vm.compteur

    //Le compteur est récupéré depuis le viewmodel
}