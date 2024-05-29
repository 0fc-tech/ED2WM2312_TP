package com.eniecole.mod4statevm

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    //L'état mutable compteur (int)
    var compteur = mutableIntStateOf(0)
        private set
    //Mutateur inc

    //Mutateur dec
}