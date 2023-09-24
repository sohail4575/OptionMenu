package com.example.optionmenu

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

     lateinit var back: LinearLayout

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        back = findViewById(R.id.back)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.tool)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.redColors -> back.setBackgroundColor(Color.parseColor("#FF0000"))
            R.id.greenColors -> back.setBackgroundColor(Color.parseColor("#00FF00"))
            R.id.blueColors -> back.setBackgroundColor(Color.parseColor("#0000FF"))
            R.id.text -> Toast.makeText(
                this,
                "This item will be shown always on the action bar",
                Toast.LENGTH_SHORT
            ).show()

        }
        return super.onOptionsItemSelected(item)
    }
}