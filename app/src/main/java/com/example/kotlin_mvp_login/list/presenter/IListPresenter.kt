package com.example.kotlin_mvp_login.list.presenter

interface IListPresenter {
    fun fetchListData()
    fun setProgressBarVisiblity(visiblity: Int)
}