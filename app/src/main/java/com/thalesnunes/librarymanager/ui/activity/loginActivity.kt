package com.thalesnunes.librarymanager.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.thalesnunes.librarymanager.R
import com.thalesnunes.librarymanager.ui.activity.ui.login.LoginFragment

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment.newInstance())
                .commitNow()
        }
    }

}
