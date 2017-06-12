package com.dscs.flower.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import com.dscs.flower.R
import com.dscs.flower.adapter.MListAdapter
import com.dscs.flower.p.MainActivityAsC
import kotlinx.android.synthetic.main.activity_main.*
open class MainActivity : AppCompatActivity() {


    var listView: ListView? = null
    public var adapter: MListAdapter? = null
    val data: List<MainActivityAsC.DataBean> = ArrayList()

    class MyHandler(var context: MainActivity) : Handler() {
        override fun handleMessage(msg: Message?) {
            context.adapter?.data = msg!!.obj as List<MainActivityAsC.DataBean>?
            Log.i("show","获取到  ${context.adapter?.data?.size}  条数据")
            context.adapter?.notifyDataSetInvalidated()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        appTitle.text="科"
        initViewsss()
        initData()
    }

     fun initViewsss() {
        listView = findViewById(R.id.listView) as ListView?
        adapter = MListAdapter(this)
        adapter!!.data = data
        listView?.adapter = adapter
        listView?.setOnItemClickListener { parent, view, position, id -> start(position) }
    }

    fun start(position: Int) {
        var s: MainActivityAsC.DataBean = adapter!!.data?.get(position)!!

        val intent = Intent(this, CategoryActivity::class.java)
        var bundle: Bundle = Bundle()
        bundle.putSerializable("data", s)
        intent.putExtra("bundle", bundle)
        startActivity(intent)
    }

    fun initData() {
        val handler: MyHandler = MyHandler(this)
        MainActivityAsC.getData(handler)
    }

    fun AppCompatActivity.toast(message: String = "错误提示") {
        Toast.makeText(this, message, Toast.LENGTH_SHORT)
    }
}



