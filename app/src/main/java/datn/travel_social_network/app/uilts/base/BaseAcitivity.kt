package datn.travel_social_network.app.uilts.base

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

open class BaseActivity : AppCompatActivity() {
    fun findNav(id: Int): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(id) as NavHostFragment?
        return navHostFragment!!.navController
    }
}