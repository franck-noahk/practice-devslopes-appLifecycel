package com.noahfranck.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill_level.*

class Skill_Level : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_level)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
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
            player.skill = "Beginner"
        }else if (button == "baller"){

            BallerToggle.setChecked(true)
            player.skill = "Baller"
        }
    }

    fun goToNextActivity(view: View){
        if(player.skill != "" && player.League != ""){
            val finishActivity = Intent(this,SearchActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please enter your skill level",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }
}
