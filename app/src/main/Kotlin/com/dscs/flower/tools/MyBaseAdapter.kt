package com.dscs.flower.tools

import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 *
 */

 open class MyBaseAdapter<T> : BaseAdapter() {
    open override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return convertView!!
    }

    var data: List<T>? = null
    override fun getCount(): Int {
        Log.i("show", "getCount:执行 "+data!!.size);
        return data!!.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

}
