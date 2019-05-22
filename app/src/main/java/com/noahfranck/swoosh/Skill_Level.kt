package com.noahfranck.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Skill_Level : AppCompatActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_level)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
