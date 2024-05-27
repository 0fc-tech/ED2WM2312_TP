package com.eniecole.filmserie

enum class Vu{
    DEJA_VU,
    A_VOIR
}
val mapFilmSerie = mutableMapOf<String, Vu>()
var saisieUtilisateur = 0

fun main(){
    while(saisieUtilisateur != 4){
        afficherMenu()
        saisieUtilisateur = readln().toIntOrNull() ?: -1
        when(saisieUtilisateur){
            1 ->{
                println("Nom du film / série:")
                ajouterFilmSerie(readln(), Vu.DEJA_VU)
            }
            2 -> {
                println("Nom du film / série:")
                ajouterFilmSerie(readln(), Vu.A_VOIR)
            }
            3 -> afficherListe()
            4 -> break
            else -> println("Saisie invalide")
        }
    }
}

fun afficherListe() = println(mapFilmSerie.toList().toString())


fun afficherMenu() = println(
    "1 - Ajouter un film déjà vu \n" +
    "2 - Ajouter film à voir\n"+
    "3 - Voir toute la liste\n"+
    "4 - Exit")

fun ajouterFilmSerie(filmSerie: String, vu: Vu)= mapFilmSerie.put(filmSerie, vu)