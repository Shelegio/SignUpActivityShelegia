package com.rrebel.signupactivityshelegia

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Log in Activity {
    class LoginInActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val mail1 = intent.extras.getString("mail")
            val pass1 = intent.extras.getString("pass")
            setContentView(R.layout.log_in_activity)

            val btn1 = (Button)findViewById(R.id.button1);
            btn1.setOnClickListener{
                if (findViewById(R.id.editTextTextEmailAddress) == mail1 && findViewById(R.id.editTextTextPassword) == pass1)
                    Toast.makeText("Thank you for logging in!",Toast.LENGTH_SHORT).show()
            }


}