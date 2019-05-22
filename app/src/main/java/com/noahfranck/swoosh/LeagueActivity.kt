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

        women_toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                men_toggle.setChecked(false)
                co_ed_toggle.setChecked(false)
            }
            womonButtonPressed = true
        }

        co_ed_toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                men_toggle.setChecked(false)
                women_toggle.setChecked(false)
            }
            coedButtonPressed = true
        }

        men_toggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                women_toggle.setChecked(false)
                co_ed_toggle.setChecked(false)
            }
            menButtonPressed = true
        }
        fun LeagueNextClicked(view: View) {
            if (menButtonPressed || womonButtonPressed || coedButtonPressed) {
                val skillActivity = Intent(this, Skill_Level::class.java)
                startActivity(skillActivity)
            }else{
                val newActivity = Intent(this,LeagueActivity::class.java)
                startActivity(newActivity)
            }
        }
    }
}
