package com.androiddev.mugs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity : AppCompatActivity() {

    private lateinit var edtName : EditText
    private lateinit var edtEmail : EditText
    private lateinit var edtPhone : EditText
    private lateinit var edtPassword : EditText
    private lateinit var edtConfirmPassword : EditText
    private lateinit var signupBtn : Button
    private lateinit var loginBtn : TextView

    private lateinit var mAuth: FirebaseAuth
    private lateinit var mDbRef : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide() //hide action bar

        mAuth = FirebaseAuth.getInstance()

        edtName = findViewById(R.id.nameEdtText)
        edtEmail = findViewById(R.id.emailEdtText)
        edtPhone = findViewById(R.id.phoneEdtText)
        edtPassword = findViewById(R.id.passwordEdtText)
        edtConfirmPassword = findViewById(R.id.cnfPasswordEdtText)
        signupBtn = findViewById(R.id.signUpBtn)
        loginBtn = findViewById(R.id.sloginBtn)

        loginBtn.setOnClickListener {
            val lintent = Intent(this@SignUpActivity, LoginActivity::class.java)
            finish()
            startActivity(lintent)
        }

        signupBtn.setOnClickListener {
            val name = edtName.text.toString()
            val email = edtEmail.text.toString()
            val phone = edtPhone.text.toString()
            val password = edtPassword.text.toString()
            val cnfpassword = edtConfirmPassword.text.toString()

            if(password==cnfpassword && name.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && password.isNotEmpty() && cnfpassword.isNotEmpty()){
                signUp(name,email,phone,password)
            }else{
                Toast.makeText(this@SignUpActivity, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun signUp(name: String, email: String, phone: String, password: String) {
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener (this){ task ->
            if(task.isSuccessful){
                addUsertoDatabase(name,email,phone,mAuth.currentUser?.uid!!)
                val intent = Intent(this@SignUpActivity, MainActivity::class.java)
                finish()
                startActivity(intent)
            } else{
                Toast.makeText(this@SignUpActivity, "Some Error Occured", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun addUsertoDatabase(name: String, email: String, phone: String, uid: String) {
        mDbRef = FirebaseDatabase.getInstance().getReference()
        mDbRef.child("user").child(uid).setValue(User(name,email,phone,uid))
    }
}