package ke.co.topup.droidweekone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.topup.droidweekone.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tVForgot.setOnClickListener {
           val intent = Intent(this@LoginActivity,ForgotPassword::class.java)
            startActivity(intent)
        }
        binding.loginBtn.setOnClickListener {
            val intent = Intent(this@LoginActivity,HomeActivity::class.java)
            startActivity(intent)
        }
        binding.signUpTv.setOnClickListener {
            val intent = Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}