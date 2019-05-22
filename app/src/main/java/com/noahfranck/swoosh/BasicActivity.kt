package com.noahfranck.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BasicActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName} On Create" )
        super.onCreate(savedInstanceState)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${javaClass.simpleName} On restart")
    }
    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName} On Destroy" )
        super.onDestroy()
    }

    override fun onResume() {

        Log.d(TAG,"${javaClass.simpleName} On resume" )
        super.onResume()
    }
    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName} On start" )
        super.onStart()
    }

    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} on Pause")
        super.onPause()
    }
}
