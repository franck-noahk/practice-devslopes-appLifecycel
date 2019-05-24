package com.noahfranck.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.Touch
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {


    var selectedButton = ""
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        women_toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                men_toggle.setChecked(false)
                co_ed_toggle.setChecked(false)
                player.League = "Women"
            }else{
                player.League = ""
            }


        }

        co_ed_toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                men_toggle.setChecked(false)
                women_toggle.setChecked(false)
                player.League = "Co Ed"
            }else{
                player.League = ""
            }


        }

        men_toggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                women_toggle.setChecked(false)
                co_ed_toggle.setChecked(false)
                player.League = "Men"
            }else{
                player.League = ""
            }


        }
    }
    fun LeagueNextClicked(view: View) {
        if (player.League != "") {
            val skillActivity = Intent(this, Skill_Level::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            val myToast = Toast.makeText(this,"Please make a selection.",Toast.LENGTH_SHORT).show()
//            val newActivity = Intent(this,LeagueActivity::class.java)
//            startActivity(newActivity)
        }
    }

}
