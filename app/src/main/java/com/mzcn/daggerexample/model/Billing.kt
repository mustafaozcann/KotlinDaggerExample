package com.mzcn.daggerexample.model

import android.util.Log
import javax.inject.Inject

class Billing @Inject constructor(user: User) {
    init {
        Log.e("debugPrint", "Internet billing address: " + user.address)
    }
}