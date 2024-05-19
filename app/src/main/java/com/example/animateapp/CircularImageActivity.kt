package com.example.animateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.animateapp.databinding.ActivityCircularImageBinding
import com.larswerkman.lobsterpicker.LobsterPicker
import com.larswerkman.lobsterpicker.OnColorListener
import com.larswerkman.lobsterpicker.sliders.LobsterShadeSlider

class CircularImageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCircularImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCircularImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.borderWidth.onProgressChanged{ binding.ImageToCircle.borderWidth = it.toFloat()}
        binding.shadowRadius.onProgressChanged{ binding.ImageToCircle.shadowRadius = it.toFloat()}
        binding.lobsterpicker.onColorChanged {
            binding.ImageToCircle.borderColor = it
            binding.ImageToCircle.shadowColor = it
        }

    }

    private fun SeekBar.onProgressChanged(onProgressChanged: (Int) -> Unit){
        setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                onProgressChanged(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    private fun LobsterPicker.onColorChanged(onColorChanged: (Int) -> Unit) {
        addOnColorListener(object : OnColorListener {
            override fun onColorChanged(color: Int) {
                onColorChanged(color)
            }

            override fun onColorSelected(color: Int) {}
        })
    }
}
