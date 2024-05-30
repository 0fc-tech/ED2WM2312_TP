package com.eniecole.enishopit

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
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.eniecole.enishopit.ui.screen.DetailProductsScreen
import com.eniecole.enishopit.ui.screen.ListProductsScreen
import com.eniecole.enishopit.ui.screen.Product
import com.eniecole.enishopit.ui.theme.TPTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TPTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHostEniShopIt(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun NavHostEniShopIt(
    modifier: Modifier = Modifier,
    navController : NavHostController = rememberNavController(),
){
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = ListProductsPage
    ){
        //Construction de la page ListProducts
        composable<ListProductsPage>{
            //On affiche ListProductsScreen
            //Ici le callback onProductClick est déclenché lorsque clic sur produit dans la grille
            ListProductsScreen(onProductClick = { product ->
                //on récupère le produit appuyé, que l'on envoie dans la navigation vers DetailProductsPage
                navController.navigate(DetailProductsPage(product.id))
            })
        }
        //Ici la construction de la page DetailProducts, on récupère le arguments
        composable<DetailProductsPage>{ backStackEntry ->
            //On transforme les argument de la page en instance DetailProductsPage
            val detailProductsPage : DetailProductsPage = backStackEntry.toRoute()
            //On se sert de l'instance "detailProductsPage" pour récupérer le produit cliqué
            //Puis on l'envoie sur notre DetailProductsScreen
            DetailProductsScreen(detailProductsPage.productId)
        }
    }
}
//Déclaration des routes serializable avec leurs arguments
@Serializable
object ListProductsPage
@Serializable
class DetailProductsPage(val productId: Int)
