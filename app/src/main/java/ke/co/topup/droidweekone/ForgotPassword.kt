package ke.co.topup.droidweekone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.topup.droidweekone.databinding.ActivityForgotPasswordBinding

class ForgotPassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backImage.setOnClickListener {
            onBackPressed()
        }
    }
}