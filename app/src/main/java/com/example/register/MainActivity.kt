package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_checkAll = findViewById<Button>(R.id.register)
        //val firstname = findViewById<Button>(R.id.btn_firstname)
        //al secondname = findViewById<Button>(R.id.btn_secondname)

        btn_checkAll.setOnClickListener{
            val toast = Toast.makeText(applicationContext,"Vui long dien day du thong tin",Toast.LENGTH_SHORT)
            toast.show()
        }



    }
}