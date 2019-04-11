package com.example.kotlin_mvp_login.list.view

import com.example.kotlin_mvp_login.list.model.ItemObject

interface IListView {
    fun onListResult(result: List<ItemObject>?)
    fun onSetProgressBarVisibility(visibility: Int)
}