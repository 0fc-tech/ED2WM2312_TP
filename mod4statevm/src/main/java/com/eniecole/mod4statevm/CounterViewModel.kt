package com.eniecole.mod4statevm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    //L'état mutable compteur (int)
    var compteur :CounterState by mutableStateOf(CounterState.Init)
        private set
    //Mutateur inc
    fun inc(){compteur=
        CounterState.CounterChanged(compteur.count + 1)
    }
    //Mutateur dec
    fun dec(){compteur=
        CounterState.CounterChanged(compteur.count - 1)
    }
    //fun reset() { compteur = CounterState.Reset }
}
sealed class CounterState(val count : Int =0){
    object Init:CounterState(0)
    class CounterChanged(count:Int):CounterState(count)
    //object Reset:CounterState(0)
}