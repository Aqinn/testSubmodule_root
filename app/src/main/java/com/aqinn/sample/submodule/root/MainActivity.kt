package com.aqinn.sample.submodule.root

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aqinn.sample.subtree.subapplication.SubAppUtils

class MainActivity : AppCompatActivity() {

    lateinit var btTest: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btTest = findViewById(R.id.bt_test)
        btTest.setOnClickListener {
            SubAppUtils.sayHi(this@MainActivity)
        }

        // test 同时修改主仓和子仓

        // test 同时修改主仓和子仓 2
    }
}