package com.noahfranck.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
        println(league)
        NoobToggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                buttonPressed("noob")
                BallerToggle.setChecked(false)
            }

        }
        BallerToggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                buttonPressed("baller")
                NoobToggle.setChecked(false)
            }

        }
    }

    fun buttonPressed(button : String){
        if (button == "noob"){

            NoobToggle.setChecked(true)
            skillLevel = "Beginner"
        }else if (button == "baller"){

            BallerToggle.setChecked(true)
            skillLevel  = "Baller"
        }
        Log.d(TAG,skillLevel)
    }

    fun goToNextActivity(view: View){
        Log.d(TAG,skillLevel)
        if(skillLevel != "" && league != ""){
            val finishActivity = Intent(this,SearchActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL, skillLevel)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please enter your skill level",Toast.LENGTH_SHORT).show()
        }
    }
}
