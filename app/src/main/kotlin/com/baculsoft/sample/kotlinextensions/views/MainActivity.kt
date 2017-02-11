package com.baculsoft.sample.kotlinextensions.views

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.baculsoft.sample.kotlinextensions.R
import com.baculsoft.sample.kotlinextensions.extensions.getHello
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar_main.title = title
        setSupportActionBar(toolbar_main)

        btn_main.setOnClickListener { view -> Snackbar.make(cl_main, getHello(), Snackbar.LENGTH_SHORT).show() }
    }
}