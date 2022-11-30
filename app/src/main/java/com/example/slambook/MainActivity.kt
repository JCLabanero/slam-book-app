package com.example.slambook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<LinearLayout>(R.id.linearLayout3)

        val btnLogin = findViewById<Button>(R.id.button)

        val username = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextTextPassword)
        val signup = layout.findViewById<TextView>(R.id.textViewSignUp)

        signup.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


        btnLogin.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            if(username.getText().toString()=="johncarlolabanero@gmail.com"&&password.getText().toString()=="password"){
                startActivity(intent)
            } else{
                Toast.makeText(this, "User does not exist", Toast.LENGTH_SHORT).show()
            }
        }
    }
}