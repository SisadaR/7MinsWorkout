package com.example.a7minsworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class ExceriseActicity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excerise_acticity)

        val toolbarActivity = findViewById<Toolbar>(R.id.toolbar_excrcise_activity)
        setSupportActionBar(toolbarActivity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbarActivity.setNavigationOnClickListener {
            onBackPressed()
        }

    }
}