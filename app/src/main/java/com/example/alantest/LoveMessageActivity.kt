package com.example.alantest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_love_message2.*

class LoveMessageActivity : AppCompatActivity() {

    companion object{
        const val  NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_love_message2)

        val name = intent.getStringExtra(NAME_EXTRA)
        love_message.text = "hii"

    }
}