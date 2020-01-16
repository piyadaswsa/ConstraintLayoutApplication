package com.example.constraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_standard.setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }

        open_constraint.setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java))
        }

        open_animation.setOnClickListener {
            startActivity(Intent(this, AnimateActivity::class.java))
        }

        title = "Layout Application"
    }
}
