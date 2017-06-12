package com.dscs.flower.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dscs.flower.R
import kotlinx.android.synthetic.main.activity_show_image.*

class ShowImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_image)
        smartImageView.setImageUrl(intent?.getStringExtra("url"))
    }



    val sb : StringBuilder get() {
            return StringBuilder().apply {
                append("sdasd")
            }
        }
}
