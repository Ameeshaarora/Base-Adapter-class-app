package com.ameesha.baseadapterclassapp

import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListAdapter
import android.widget.TextView

class baseAdapterClass(var studentlist:MutableList<StudentDataclass>): BaseAdapter()
{
    override fun getCount(): Int {
        return studentlist.size
    }
    override fun getItem(position: Int): Any {
        return studentlist[position]    
    }

    override fun getItemId(position: Int): Long {
        return studentlist[position].id ?: 0L

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view =LayoutInflater.from(parent?.context).inflate(R.layout.item_adapter, parent, false)
        var tvId = view.findViewById<TextView>(R.id.tvId)
        var tvName = view.findViewById<TextView>(R.id.tvName)
        tvId.setText("${studentlist[position].id}")
        tvName.setText("${studentlist[position].name}")
        return view
    }

    companion object
}