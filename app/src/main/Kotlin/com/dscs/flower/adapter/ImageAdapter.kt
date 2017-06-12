package com.dscs.flower.adapter

import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dscs.flower.R
import com.dscs.flower.tools.MyBaseAdapter
import com.loopj.android.image.SmartImageView

/**
 *
 */
class ImageAdapter(var context: AppCompatActivity) : MyBaseAdapter<String>(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView: View? = convertView
        var vh: ViewHodler? = null
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_images,null)
            vh = ViewHodler()
            vh!!.image = convertView!!.findViewById(R.id.smartImageView) as SmartImageView?
            convertView.tag = vh
        }
        vh = convertView.tag as ViewHodler?
        vh!!.image?.setImageUrl(data!!.get(position))
        return convertView
    }
    class ViewHodler(){
        public var image: SmartImageView? = null
    }

}