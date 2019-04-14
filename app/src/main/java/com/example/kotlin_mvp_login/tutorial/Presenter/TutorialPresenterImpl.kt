package com.example.kotlin_mvp_login.tutorial.Presenter

import com.example.kotlin_mvp_login.tutorial.View.ITutorialView

class TutorialPresenterImpl(val iTutorialView : ITutorialView) : ITutorialPresenter {

    override fun setActiveIndicator(position: Int) {
        iTutorialView.onSetActiveIndication(position)
    }
}