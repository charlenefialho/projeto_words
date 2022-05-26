package com.ds.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

const val EXTRA_MESSAGE ="com.ds.words.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View){
        val button = findViewById<Button>(R.id.button)
        /*val intent = Intent(this,DisplayMessageActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)*/

    }
}