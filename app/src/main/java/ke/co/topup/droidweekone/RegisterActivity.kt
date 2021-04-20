package ke.co.topup.droidweekone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.topup.droidweekone.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backImage.setOnClickListener {
            onBackPressed()
        }
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this@RegisterActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}