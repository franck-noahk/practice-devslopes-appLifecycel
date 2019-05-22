package com.noahfranck.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_to_the_team.*

class WelcomeToTheTeam : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_to_the_team)
        get_started_button.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java);
            startActivity(leagueIntent)
        }
    }
}
