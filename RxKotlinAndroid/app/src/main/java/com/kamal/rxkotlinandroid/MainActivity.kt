package com.kamal.rxkotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Observable.just("hello, hi")
            .subscribe { println(it) }
    }
}
