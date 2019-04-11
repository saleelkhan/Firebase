package com.saleel.firebase

import android.app.Application
import android.util.Log
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

class Appstate : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("saleel ","saleel")
        val options = FirebaseOptions.Builder()
            .setApplicationId("1:234541900483:android:c4485cef26609a40") // Required for Analytics.
            .setApiKey("AIzaSyA_pvWU1RIgtS5wQkvG8tCcKXWIRSD8Ss4") // Required for Auth.
            .setDatabaseUrl("https://fir-c9f9b.firebaseio.com/") // Required for RTDB.
            .build()
        FirebaseApp.initializeApp(this,options,"Firebase")
    }
}
