package uz.aliensoft.uzpos.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.ui.main.MainActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton.setOnClickListener {
           var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
