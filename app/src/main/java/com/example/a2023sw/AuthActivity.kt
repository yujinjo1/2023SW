package com.example.a2023sw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a2023sw.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}