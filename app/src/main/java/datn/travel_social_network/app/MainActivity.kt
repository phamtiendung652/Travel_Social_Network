package datn.travel_social_network.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import datn.travel_social_network.R
import datn.travel_social_network.app.UI.change_password.ChangePasswordFragment
import datn.travel_social_network.app.UI.forgot.ForgotFragment
import datn.travel_social_network.app.UI.login.LoginFragment
import datn.travel_social_network.app.UI.register.RegisterFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val frmUI = ChangePasswordFragment()

        supportFragmentManager.beginTransaction().replace(R.id.frm,frmUI).commit()
    }
}