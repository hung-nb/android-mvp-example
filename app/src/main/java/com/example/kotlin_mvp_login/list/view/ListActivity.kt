package com.example.kotlin_mvp_login.list.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.kotlin_mvp_login.R
import com.example.kotlin_mvp_login.list.model.ItemObject
import com.example.kotlin_mvp_login.list.presenter.ListPresenterCompl
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity(), IListView {

    private var listPresenter = ListPresenterCompl(this)
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // Load list
        listPresenter.fetchListData()
    }

    override fun onListResult(result: List<ItemObject>?) {
        handler.postDelayed({
            listPresenter.setProgressBarVisiblity(View.GONE)
        }, 1000)

        if (result !== null) {
            println("++++++++++++++++++++++++++++++")
            println(result)
        }
    }

    override fun onSetProgressBarVisibility(visibility: Int) {
        spinnerList.visibility = visibility
    }
}
