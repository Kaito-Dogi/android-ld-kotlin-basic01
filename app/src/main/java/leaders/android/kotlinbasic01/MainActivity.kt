package leaders.android.kotlinbasic01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import leaders.android.kotlinbasic01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("Hello World!")
    }
}
