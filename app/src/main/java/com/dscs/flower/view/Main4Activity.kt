package com.dscs.flower.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.dscs.flower.R

import java.io.File

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val s = intent.getBundleExtra("").getSerializable("") as File
    }
}
