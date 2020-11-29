package com.example.birthdaywisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BirthdayWishingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wishing)
        val name=intent.getStringExtra(NAME_EXTRA)
    }
}