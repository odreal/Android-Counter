package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter: Long = 0
        var bRemove = findViewById<Button>(R.id.removeOne)
        var bAdd = findViewById<Button>(R.id.addOne)
        var bExpo = findViewById<Button>(R.id.opeExpo)
        var bReset = findViewById<Button>(R.id.opeReset)

        bAdd.setOnClickListener { v ->
            var t = findViewById<TextView>(R.id.countLabel)
            counter += 1
            t.text = counter.toString()
        }

        bRemove.setOnClickListener { v ->
            var t = findViewById<TextView>(R.id.countLabel)
            counter -= 1
            t.text = counter.toString()
        }

        bExpo.setOnClickListener { v ->
            var t = findViewById<TextView>(R.id.countLabel)
            counter = counter*counter
            t.text = counter.toString()
        }

        bReset.setOnClickListener { v ->
            var t = findViewById<TextView>(R.id.countLabel)
            counter = 0
            t.text = counter.toString()
        }




    }
}
