package com.noahfranck.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        SearchLeaguesText.text = "Looking for a ${player.League} ${player.skill} league near you..."
    }
}
