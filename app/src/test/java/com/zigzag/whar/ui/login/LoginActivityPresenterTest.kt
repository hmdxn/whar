package com.zigzag.whar.ui.login

import org.junit.Test

import org.mockito.Mockito
import org.mockito.Mockito.verify

/**
 * Created by salah on 30/12/17.
 */

class LoginActivityPresenterTest {

    @Test
    fun checkIfSubmitButtonIsDisabledInitially() {
        val loginActivityView = Mockito.mock(LoginContract.View::class.java)
        val loginActivityPresenter = LoginPresenter()
        loginActivityPresenter.view = loginActivityView
        verify(loginActivityView).disableSubmitButton()
    }
}