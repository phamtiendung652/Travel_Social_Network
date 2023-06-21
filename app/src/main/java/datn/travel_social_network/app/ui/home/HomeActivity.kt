package datn.travel_social_network.app.ui.home

import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import datn.travel_social_network.R
import datn.travel_social_network.app.ui.post.PostFragment
import datn.travel_social_network.app.ui.post.PostInFragment
import datn.travel_social_network.app.ui.profile.ProfileFragment
import datn.travel_social_network.app.uilts.base.BaseActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_home)

        val btmHome = findViewById<BottomNavigationView>(R.id.btmHome)
        btmHome.setOnItemSelectedListener{
            when(it.itemId){
                R.id.btnHome -> replaceFragment(PostFragment())
                R.id.btnSearch -> replaceFragment(PostFragment())
                R.id.btnPost -> replaceFragment(PostInFragment())
                R.id.btnOutstand-> replaceFragment(PostInFragment())
                R.id.btnProfile -> replaceFragment(ProfileFragment())
                else -> {
                    CoroutineScope(Dispatchers.Main).launch {
                        delay(3000)
                    }
                    Toast.makeText(this,"Load",Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

    private fun replaceFragment(frm: Fragment){
        val frmTransaction =  supportFragmentManager.beginTransaction()
        frmTransaction.replace(R.id.frmNavHome,frm).commit()
    }
}