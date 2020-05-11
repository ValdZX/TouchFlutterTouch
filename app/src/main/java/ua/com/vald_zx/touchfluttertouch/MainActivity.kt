package ua.com.vald_zx.touchfluttertouch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ua.com.vald_zx.touchfluttertouch.ui.main.LoginFragment
import ua.com.vald_zx.touchfluttertouch.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, LoginFragment.newInstance())
                    .commitNow()
        }
        findViewById<View>(R.id.toMainButton).setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        findViewById<View>(R.id.toLoginButton).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment.newInstance())
                .commitNow()
        }
    }
}
