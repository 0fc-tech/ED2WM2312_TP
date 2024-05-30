package com.eniecole.mod6datastore

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SettingsRepository(val context: Context) {
    private val Context.dataStore by preferencesDataStore(name = "settings")
    //Tous les champs dans un companion object sont statiques
    companion object{
        val KEY_ADRESSE_1 = stringPreferencesKey("adresse_1")
        val KEY_ADRESSE_2 = stringPreferencesKey("adresse_2")
        val KEY_CODE_ENTREPRISE = stringPreferencesKey("code_entreprise")
        val KEY_CARTE_REDUCTION = intPreferencesKey("carte_reduction")
    }

    val adr1: Flow<String?> = context.dataStore.data.map {
        preferences -> preferences[KEY_ADRESSE_1] }
    suspend fun saveAdr1(adr: String) { context.dataStore.edit {
        it[KEY_ADRESSE_1] = adr }
    }

    val adr2: Flow<String?> = context.dataStore.data.map {
        preferences -> preferences[KEY_ADRESSE_2] }
    suspend fun saveAdr2(adr: String) { context.dataStore.edit {
        it[KEY_ADRESSE_2] = adr }
    }

    val codeEntreprise: Flow<String?> = context.dataStore.data.map {
        preferences -> preferences[KEY_CODE_ENTREPRISE] }
    suspend fun saveCodeEntreprise(codeEntrep: String) { context.dataStore.edit {
        it[KEY_CODE_ENTREPRISE] = codeEntrep }
    }

    val carteReduction: Flow<Int?> = context.dataStore.data.map {
        preferences -> preferences[KEY_CARTE_REDUCTION] }
    suspend fun saveCarteReduc(carteReduc: Int) { context.dataStore.edit {
        it[KEY_CARTE_REDUCTION] = carteReduc }
    }
}