package com.myhome.android.shoppinglist.presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myhome.android.shoppinglist.R
import com.myhome.android.shoppinglist.domain.ShopItem

class ShopItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    private val tvName = view.findViewById<TextView>(R.id.tv_name)
    private val tvCount = view.findViewById<TextView>(R.id.tv_count)

    fun bind(item: ShopItem) {
        tvName.text = item.name
        tvCount.text = item.count.toString()
    }
}