package com.example.birthdaywisher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        createButton.setOnClickListener({
//
//        })
    }

    fun createButton(view: View) {
        //just like alert in JS
//        Toast.makeText(this,"button is clicked",Toast.LENGTH_LONG).show()

        //making an intent i.e a connector
        val name="Happy Birthday"
        val intent=Intent(this,BirthdayWishingActivity::class.java)
        intent.putExtra(BirthdayWishingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}
