package com.charan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.charan.utils.UtilsData
import com.charan.utils.UtilsData.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        debug_print(padZeroBeforeInt(1, 3))
    }
}
