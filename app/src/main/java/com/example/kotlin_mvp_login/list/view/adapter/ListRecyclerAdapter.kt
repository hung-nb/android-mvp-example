package com.example.kotlin_mvp_login.list.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kotlin_mvp_login.R
import com.example.kotlin_mvp_login.list.model.ItemObject

class ListRecyclerAdapter(val context: Context, val listItem: List<ItemObject>) : RecyclerView.Adapter<ListRecyclerAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindItemObject(listItem[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return listItem.count()
    }

    // Holder class
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView = itemView?.findViewById<TextView>(R.id.txtTitle)
        val descriptionView = itemView?.findViewById<TextView>(R.id.txtDescription)

        fun bindItemObject(itemObject: ItemObject, context: Context) {
            titleView.text = itemObject.title
            descriptionView.text = itemObject.description
        }
    }
}