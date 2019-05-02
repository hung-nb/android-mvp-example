package com.example.kotlin_mvp_login

import com.example.kotlin_mvp_login.common.Constants
import com.example.kotlin_mvp_login.tutorial.Model.TutorialSlide
import com.example.kotlin_mvp_login.tutorial.Presenter.TutorialPresenterImpl
import com.example.kotlin_mvp_login.tutorial.View.ITutorialView
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TutorialPresenterTest {

    // Presenter
    private lateinit var tutorialPresenter : TutorialPresenterImpl

    // Dependencies
    private lateinit var tutorialView : ITutorialView


    @Before
    fun setup() {

        // Dependencies
        tutorialView = mock()

        // Presenter
        tutorialPresenter = TutorialPresenterImpl(tutorialView)
    }

    @Test
    fun whenScrollLastSlide_thenNavigateToList() {
        // Given
        val lastTutorialSlide = TutorialSlide(Constants.totalTutorialSlides - 1, 1)

        // When
        tutorialPresenter.navigateToList(lastTutorialSlide)

        // Then
        verify(tutorialView).navigateToList()
    }
}