package datn.travel_social_network.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import datn.travel_social_network.R
import datn.travel_social_network.app.UI.login.LoginFragment
import datn.travel_social_network.app.UI.register.RegisterFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frmUI = LoginFragment()

        supportFragmentManager.beginTransaction().replace(R.id.frm,frmUI).commit()
    }
}