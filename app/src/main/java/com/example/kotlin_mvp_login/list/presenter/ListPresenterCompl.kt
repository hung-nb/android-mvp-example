package com.example.kotlin_mvp_login.list.presenter

import com.example.kotlin_mvp_login.list.model.ItemObject
import com.example.kotlin_mvp_login.list.view.IListView

class ListPresenterCompl(val iListView : IListView) : IListPresenter {

    override fun fetchListData() {
        val testItem1 = ItemObject("Number One", "This is test item number one")
        val testItem2 = ItemObject("Number Two", "This is test item number two")
        val testList = listOf(
            testItem1,
            testItem2
        )
        iListView.onListResult(testList)
    }

    override fun setProgressBarVisiblity(visiblity: Int) {
        iListView.onSetProgressBarVisibility(visiblity)
    }
}