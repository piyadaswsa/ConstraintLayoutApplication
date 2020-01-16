package com.example.constraintlayout

import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.animation_first.*

class AnimateActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_first)
        addAnimation()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Animation Layout"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun addAnimation() {
        var set = false
        val constraint1 = ConstraintSet()
        constraint1.clone(root)
        val constraint2 = ConstraintSet()
        constraint2.clone(this, R.layout.animation_second)

        val listener = View.OnClickListener{
            TransitionManager.beginDelayedTransition(root)
            val constraint = if(set) constraint1 else constraint2
            constraint.applyTo(root)
            set = !set
        }

        imageView.setOnClickListener(listener)
        imageView2.setOnClickListener(listener)
    }
}




