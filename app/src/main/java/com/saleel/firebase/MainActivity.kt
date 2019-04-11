package com.saleel.firebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var myRef:DatabaseReference
    private lateinit var database:FirebaseDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       database = FirebaseDatabase.getInstance()
        myRef = FirebaseDatabase.getInstance().reference
        button.setOnClickListener {
            writeNewUser(editText.text.toString(),editText2.text.toString().toInt())
        }

    }

    private fun writeNewUser(name:String,Id:Int){
        val userObject =User(name,Id)
        myRef.child("users").child(name).setValue(userObject)
    }
}
