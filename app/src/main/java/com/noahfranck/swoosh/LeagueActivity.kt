package com.noahfranck.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun LeagueNextClicked (view: View) {
        val skillActivity = Intent(this,Skill_Level::class.java)
        startActivity(skillActivity)
    }
}
