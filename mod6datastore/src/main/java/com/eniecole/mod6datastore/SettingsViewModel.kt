package com.eniecole.mod6datastore

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class SettingsViewModel(
    private val settingsRepository: SettingsRepository) : ViewModel(){
    //Récupération des différents champs du Repo
    val adr1 : Flow<String?> = settingsRepository.adr1
    val adr2 : Flow<String?> = settingsRepository.adr2
    val codeEntreprise : Flow<String?> = settingsRepository.codeEntreprise
    val reduction : Flow<String> = settingsRepository.carteReduction.map { it?.toString() ?: "" }

    //Mutateur permettant la modification des champs
    fun setAdr1(adr1 : String){
        viewModelScope.launch(context = Dispatchers.IO) {
            settingsRepository.saveAdr1(adr1)
        }
    }
    fun setAdr2(adr2: String){
        viewModelScope.launch(context = Dispatchers.IO) {
            settingsRepository.saveAdr2(adr2)
        }
    }
    fun setCodeEntreprise(codeEntreprise : String){
        viewModelScope.launch(context = Dispatchers.IO) {
            settingsRepository.saveCodeEntreprise(codeEntreprise)
        }
    }

    fun setCarteReduction(reduc : String){
        viewModelScope.launch(context = Dispatchers.IO) {
            //Si la carte de réduction renseignée est bien un entier alors sauvegarder dans le repo
            if(reduc.toIntOrNull() != null)
                settingsRepository.saveCarteReduc(reduc.toInt())
        }
    }

    companion object{
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras):T {
                val application = checkNotNull(
                    extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY])
                return SettingsViewModel(SettingsRepository(application.baseContext)) as T
            }
        }
    }


}