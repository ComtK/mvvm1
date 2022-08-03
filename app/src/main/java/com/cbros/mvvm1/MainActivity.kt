package com.cbros.mvvm1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin{
            androidContext(this@MainActivity)
            modules(AppModules.modules)
        }
        setContentView(R.layout.activity_main)
    }
}