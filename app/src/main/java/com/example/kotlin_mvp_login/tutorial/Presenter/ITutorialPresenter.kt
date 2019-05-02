package com.example.kotlin_mvp_login.tutorial.Presenter

import com.example.kotlin_mvp_login.tutorial.Model.TutorialSlide

interface ITutorialPresenter {
    fun setActiveIndicator(view: Int)
    fun navigateToList(tutorialSlide: TutorialSlide)
}