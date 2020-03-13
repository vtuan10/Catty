package io.iconicfinance.notification.domain

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.SystemClock

interface CattyAlarm {
    fun setAlarm()
}

class CattyAlarmImpl(
    private val context: Context,
    private val alarmManager: AlarmManager
) : CattyAlarm, BroadcastReceiver() {
    private val notificationIntent: PendingIntent
        get() = Intent(context, CattyNotifier::class.java).let { intent ->
            PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        }

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "android.intent.action.BOOT_COMPLETED") {
            setRepeatingDailyAlarm()
        }
    }

    override fun setAlarm() {
        alarmManager.cancel(notificationIntent)
        setRepeatingDailyAlarm()
    }

    private fun setRepeatingDailyAlarm() {
        alarmManager.setInexactRepeating(
            AlarmManager.ELAPSED_REALTIME_WAKEUP,
            SystemClock.elapsedRealtime() + AlarmManager.INTERVAL_DAY,
            AlarmManager.INTERVAL_HALF_HOUR,
            notificationIntent
        )
    }
}