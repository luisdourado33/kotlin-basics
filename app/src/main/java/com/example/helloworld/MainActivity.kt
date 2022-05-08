package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var userEmail: EditText
    lateinit var userPassword: EditText
    lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userEmail = findViewById(R.id.userEmail)
        userPassword = findViewById(R.id.userPassword)
        submitButton = findViewById(R.id.loginSubmit)

        submitButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, "My first message!", Toast.LENGTH_LONG).show()
            }
        })
    }
}