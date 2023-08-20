package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et:EditText=findViewById(R.id.editText)
        val btn:Button=findViewById(R.id.btn1)

        btn.setOnClickListener {
            var name:String=et.text.toString()
            var it:Intent=Intent(this,LuckyNumberActivity::class.java)
            it.putExtra("name",name)

            startActivity(it)

        }


    }
}