package com.noahfranck.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var womonButtonPressed = false
    var menButtonPressed = false
    var coedButtonPressed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        women_toggle.setOnClickListener {
            if (menButtonPressed || coedButtonPressed){
                menButtonPressed = false
                coedButtonPressed = false
            }
            womonButtonPressed = true
        }

        co_ed_toggle.setOnClickListener {
            if (menButtonPressed || womonButtonPressed) {
                menButtonPressed = false
                womonButtonPressed = false
            }
        }
    }

    fun LeagueNextClicked (view: View) {
        if (menButtonPressed || womonButtonPressed || coedButtonPressed) {
            val skillActivity = Intent(this, Skill_Level::class.java)
            startActivity(skillActivity)
        }
    }

    fun menToggleClicked(view: View){
        if (womonButtonPressed || coedButtonPressed){
            womonButtonPressed = false
            coedButtonPressed = false
        }
        menButtonPressed = true
    }


}
