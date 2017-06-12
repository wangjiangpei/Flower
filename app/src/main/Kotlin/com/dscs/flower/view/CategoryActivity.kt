package com.dscs.flower.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import com.dscs.flower.R
import com.dscs.flower.adapter.CategoryAdapter
import com.dscs.flower.p.MainActivityAsC

class CategoryActivity : AppCompatActivity() {
    var listView: ListView? = null
    var adapter: CategoryAdapter? = null
    var data:MainActivityAsC.DataBean? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        listView = findViewById(R.id.listView) as ListView?
        adapter = CategoryAdapter(this)
        data = intent.getBundleExtra("bundle").getSerializable("data") as MainActivityAsC.DataBean
        adapter?.data = data!!.categorys
        listView!!.adapter=adapter
        listView!!.setOnItemClickListener { parent, view, position, id -> click(position) }
    }

     fun click(position: Int){
         var s:MainActivityAsC.Category = data!!.categorys.get(position)
         val intent = Intent(this, ImageActivity::class.java)
         var bundle: Bundle = Bundle()
         bundle.putSerializable("data", s)
         intent.putExtra("bundle", bundle)
         startActivity(intent)
     }
}
