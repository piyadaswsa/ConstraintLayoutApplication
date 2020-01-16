package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ConstraintActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Constraint Layout"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}