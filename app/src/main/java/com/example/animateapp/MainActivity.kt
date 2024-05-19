package com.example.animateapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.animateapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listener()

    }

    private fun listener(){
        binding.zoomIn.setOnClickListener{ zoomIn() }
        binding.zoomOut.setOnClickListener{ zoomOut() }
        binding.fadeIn.setOnClickListener{ fadeIn() }
        binding.fadeOut.setOnClickListener{ fadeOut() }
        binding.slideLeft.setOnClickListener{ slideLeft() }
        binding.slideRight.setOnClickListener{ slideRight() }
        binding.slideUp.setOnClickListener{ slideUp() }
        binding.slideDown.setOnClickListener{ slideDown() }
        binding.rotate.setOnClickListener{ rotate() }
        binding.move.setOnClickListener{ move() }
        binding.circularImage.setOnClickListener{ circlarImage() }
    }

    //Zoom
    private fun zoomIn(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in))
    }

    private fun zoomOut(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_out))
    }

    //Fade
    private fun fadeIn(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in))
    }

    private fun fadeOut(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_out))
    }

    //Slide
    private fun slideLeft(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_left))
    }

    private fun slideRight(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_right))
    }

    private fun slideUp(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_up))
    }

    private fun slideDown(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_down))
    }

    //Rotate
    private fun rotate(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
    }

    //Move
    private fun move(){
        binding.mainImage.startAnimation(AnimationUtils.loadAnimation(this, R.anim.move))
    }

    //Circlar Image
    private fun circlarImage(){
        startActivity(Intent(this, CircularImageActivity::class.java))
    }

}