package com.zigzag.whar.ui.login

import com.zigzag.whar.arch.BasePresenter
import javax.inject.Inject

/**
 * Created by salah on 30/12/17.
 */

class LoginActivityPresenter @Inject constructor() : BasePresenter<LoginActivityContract.View>(), LoginActivityContract.Presenter  {

    override fun attemptLogin(username: String, password: String) {

    }

    override fun validate(username: String, password: String): Boolean {
        return false
    }

}
