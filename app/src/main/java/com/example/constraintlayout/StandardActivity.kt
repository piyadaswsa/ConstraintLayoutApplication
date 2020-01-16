package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StandardActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standard_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Standard Layout"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}