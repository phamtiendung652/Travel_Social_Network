package datn.travel_social_network.app.ui


import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import datn.travel_social_network.R
import datn.travel_social_network.app.ui.login.TestFragment
import datn.travel_social_network.app.uilts.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        findNav(R.id.frmNavMain)
    }
}