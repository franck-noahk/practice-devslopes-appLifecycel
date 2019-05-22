package com.noahfranck.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill_level.*

class Skill_Level : AppCompatActivity() {

    var league = ""
    var skillLevel = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_level)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        NoobToggle.setOnCheckedChangeListener { buttonView, isChecked -> buttonPressed("noob") }
        BallerToggle.setOnCheckedChangeListener { buttonView, isChecked -> buttonPressed("baller") }
    }

    fun buttonPressed(button : String){
        if (button == "noob"){
            BallerToggle.setChecked(false)
            skillLevel = "Beginner"
        }else if (button == "baller"){
            NoobToggle.setChecked(false)
            skillLevel  = "Baller"
        }
    }

}