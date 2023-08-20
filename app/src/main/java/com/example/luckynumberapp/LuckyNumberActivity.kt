package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)
        val name1:TextView=findViewById(R.id.nameview)
        val share:Button=findViewById(R.id.sharebtn)
        val lucky:TextView=findViewById(R.id.resultview)
        var lucky_num=randomNumbers()
        var user_name=getstring()
        name1.setText("Hello Mr."+user_name)
        lucky.setText(""+lucky_num)
        share.setOnClickListener {
            sharing(user_name,lucky_num)

        }

    }
    fun getstring():String{
        var bundle:Bundle?=intent.extras
        var username=bundle?.getString("name").toString()
        return username
    }

    fun randomNumbers():Int{
        var number= Random.nextInt(1000)
        return number
    }
    fun sharing(user:String,numbers:Int){
        intent=Intent(Intent.ACTION_SEND)
        intent.setType("plain/text")
        intent.putExtra(Intent.EXTRA_SUBJECT,"Mr. $user is lucky today")
        intent.putExtra(Intent.EXTRA_TEXT,"His Lucky Number Is $numbers")
        startActivity(intent)
    }



}