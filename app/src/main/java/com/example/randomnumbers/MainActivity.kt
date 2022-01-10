package com.example.randomnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomButton.setOnClickListener(this)
        textNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.randomButton || v?.id == R.id.textNumber) {
            val id = random()
        }
    }

    fun random() : Int {
        return Random.nextInt(1, 50)
    }
}