package com.example.mad_practical8_21012011088

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {

    companion object {
        val ALARMSTOP = "STOP"
        val ALARMKEY = "KEY"
        val ALARMSTART = "START"
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent != null) {
            val data = intent.getStringExtra(ALARMKEY)

            if (data != null) {
                val intentservice = Intent(context, AlarmService::class.java)
                if (data == ALARMSTART) {
                    context.startService(intentservice)
                }
                else{
                    context.stopService(intentservice)
                }
            }
        }
    }
}