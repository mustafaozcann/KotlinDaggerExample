package com.mzcn.daggerexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mzcn.daggerexample.R
import com.mzcn.daggerexample.di.DaggerAppComponent
import com.mzcn.daggerexample.model.Billing
import com.mzcn.daggerexample.model.Cargo
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


   @Inject
   lateinit var cargo: Cargo

   @Inject
   lateinit var billing: Billing


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DaggerAppComponent.builder().build().inject(this)
    }
}