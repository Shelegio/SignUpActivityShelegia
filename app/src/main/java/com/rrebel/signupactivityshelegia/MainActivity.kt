package com.rrebel.signupactivityshelegia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var mail = 'defaultmail'
        var pass = 'defaultpass'
        setContentView(R.layout.activity_main)
        val btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener{
            var mail = findViewById(R.id.editTextTextEmailAddress)
            var pass = findViewById(R.id.editTextTextPassword)
            val intent = Intent(this, LogInActivity::class.kotlin).apply {

            }
            startActivity(intent)
        }




    }
}