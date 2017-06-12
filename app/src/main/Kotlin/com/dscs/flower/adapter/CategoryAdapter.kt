package com.dscs.flower.adapter

import android.support.v7.app.AppCompatActivity
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
class CategoryAdapter(var context: AppCompatActivity) : MyBaseAdapter<MainActivityAsC.Category>(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView: View? = convertView
        var vh: ViewHodler? = null
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_main,null)
            vh = ViewHodler()
            vh!!.tv = convertView!!.findViewById(R.id.textView) as TextView?
            convertView.tag = vh
        }
        vh = convertView.tag as ViewHodler?
        vh!!.tv?.text = data!!.get(position).categoryName
        return convertView!!
    }
    class ViewHodler(){
        public var tv: TextView? = null
    }

}