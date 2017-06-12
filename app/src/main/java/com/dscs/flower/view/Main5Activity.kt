package com.dscs.flower.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import com.dscs.flower.R
import java.util.*

class Main5Activity : AppCompatActivity() {

    private var listView: ListView? = null
    private var adapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        listView = findViewById(R.id.listView) as ListView
        adapter = MyAdapter()
        val list = ArrayList<String>()
        for (i in 0..4) {
            list.add("2")
        }
        adapter!!.data = list
        listView!!.adapter = adapter
    }

    class MyAdapter : BaseAdapter() {
        var data:List<String>? = null
        override fun getItem(position: Int): Any {
            return 0
        }
        override fun getItemId(position: Int): Long {
            return 0
        }
        override fun getCount(): Int {
            Log.i("show", "getCount : ${data?.size} 个");
            return data?.size!!
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            Log.i("show", "getView 执行" + data!!.size)
            return convertView!!
        }
    }
}
