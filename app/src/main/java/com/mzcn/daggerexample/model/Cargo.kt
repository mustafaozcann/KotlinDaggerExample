package com.mzcn.daggerexample.model

import android.util.Log
import javax.inject.Inject

class Cargo @Inject constructor(user:User) {

    init {
        Log.e("debugPrint", "Cargo address: "+user.address)
    }

}