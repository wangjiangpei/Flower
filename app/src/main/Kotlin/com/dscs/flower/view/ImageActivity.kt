package com.dscs.flower.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ListView
import com.dscs.flower.R
import com.dscs.flower.adapter.ImageAdapter
import com.dscs.flower.p.MainActivityAsC

class ImageActivity : AppCompatActivity() {
    var listView: ListView? = null
    var adapter: ImageAdapter? = null
    var data:MainActivityAsC.Category? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        listView = findViewById(R.id.listView) as ListView?
        adapter = ImageAdapter(this)
        data = intent.getBundleExtra("bundle").getSerializable("data") as MainActivityAsC.Category
        adapter?.data = data!!.urls
        listView!!.adapter=adapter
        Log.i("shows", "s:s  ");
        listView!!.setOnItemClickListener { parent, view, position, id -> click(position) }
    }

     fun click(position: Int){
         Log.i("shows", "click点击 : ${
         data!!.urls!!.get(position)
         }");
         val intent = Intent(this, ShowImageActivity::class.java)
         intent.putExtra("url",data!!.urls!!.get(position))
         startActivity(intent)
     }
}
