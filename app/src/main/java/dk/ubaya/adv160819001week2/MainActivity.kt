package dk.ubaya.adv160819001week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        navController = Navigation.findNavController(this, R.id.hostFragment)
//        NavigationUI.setupActionBarWithNavController(this,navController)
    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        return NavigationUI.navigateUp(navController,null)
//    }
}