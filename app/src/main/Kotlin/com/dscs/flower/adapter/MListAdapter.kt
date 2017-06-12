package com.dscs.flower.adapter

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.dscs.flower.R
import com.dscs.flower.p.MainActivityAsC
import com.dscs.flower.tools.MyBaseAdapter

/**
 *
 */
class MListAdapter(var context: AppCompatActivity) : MyBaseAdapter<MainActivityAsC.DataBean>(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        Log.i("tag","共 ${data?.size} 条数据 ")
        var convertView: View? = convertView
        var vh: ViewHodler? = null
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_main,null)
            vh = ViewHodler()
            vh!!.tv = convertView!!.findViewById(R.id.textView) as TextView?
            convertView.tag = vh
        }

        vh = convertView.tag as ViewHodler?
        vh!!.tv?.text = data!!.get(position).courseName
        return convertView
    }
    class ViewHodler(){
        public var tv: TextView? = null
    }

}