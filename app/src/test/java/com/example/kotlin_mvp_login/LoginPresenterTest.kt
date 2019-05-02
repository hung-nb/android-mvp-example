package com.example.kotlin_mvp_login

import android.view.View
import com.example.kotlin_mvp_login.common.network.ILoginRequest
import com.example.kotlin_mvp_login.login.presenter.ILoginPresenter
import com.example.kotlin_mvp_login.login.presenter.LoginPresenterCompl
import com.example.kotlin_mvp_login.login.view.ILoginView
import com.example.kotlin_mvp_login.login.view.LoginActivity
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import okhttp3.Response
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito
import org.mockito.ArgumentCaptor

@RunWith(JUnit4::class)
class LoginPresenterTest {

    // Presenter
    private lateinit var loginPresenter : LoginPresenterCompl

    // Dependencies
    private lateinit var loginView : ILoginView
    private lateinit var loginRequest : ILoginRequest

    @Before
    fun setup() {

        // Dependencies
        loginView = mock()
        loginRequest = mock()

        // Presenter
        loginPresenter = LoginPresenterCompl(loginView, loginRequest)
    }

    @Test
    fun whenLoggedIn_thenHideSpinner() {

//        // Given
//        whenever(loginRequest.requestLogin("", "")).thenReturn(true)
//
//        // When
//        loginPresenter.doLogin("", "")
//
//        // Then
//        verify(loginView).onSetProgressBarVisibility(View.GONE)
    }
}