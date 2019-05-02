package com.example.kotlin_mvp_login.tutorial.Presenter

import com.example.kotlin_mvp_login.common.Constants
import com.example.kotlin_mvp_login.tutorial.Model.TutorialSlide
import com.example.kotlin_mvp_login.tutorial.View.ITutorialView

class TutorialPresenterImpl(val iTutorialView : ITutorialView) : ITutorialPresenter {

    override fun navigateToList(tutorialSlide: TutorialSlide) {
        if (tutorialSlide.position == Constants.totalTutorialSlides - 1 &&
            tutorialSlide.state == 1) {
            iTutorialView.navigateToList()
        }
    }

    override fun setActiveIndicator(position: Int) {
        iTutorialView.onSetActiveIndication(position)
    }
}