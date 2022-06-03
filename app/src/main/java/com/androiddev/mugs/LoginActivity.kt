package com.androiddev.mugs

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var edtEmail : EditText
    private lateinit var edtPassword : EditText
    private lateinit var loginBtn : Button
    private lateinit var signUpBtn : TextView

    private lateinit var mAuth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        edtEmail = findViewById(R.id.emailEdtText)
        edtPassword = findViewById(R.id.passwordEdtText)
        loginBtn = findViewById(R.id.loginBtn)
        signUpBtn = findViewById(R.id.ssignUpBtn)

        val user = FirebaseAuth.getInstance().currentUser

        if(user!=null){
            val i = Intent(this@LoginActivity, MainActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            finish()
            startActivity(i)
        }else{
            Log.d(ContentValues.TAG, "OnAuthStateChanged:signed_out")
        }
        mAuth = FirebaseAuth.getInstance()
        signUpBtn.setOnClickListener {
            val sintent = Intent(this@LoginActivity, SignUpActivity::class.java)
            finish()
            startActivity(sintent)
        }

        loginBtn.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                login(email,password)
            }
        }
    }

    private fun login(email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this) { task ->
            if(task.isSuccessful){
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                finish()
                startActivity(intent)
            }else{
                Toast.makeText(this@LoginActivity, "User does not exist", Toast.LENGTH_SHORT).show()
            }
        }
    }
}