package io.iconicfinance.notification.domain

import android.app.Notification
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import io.iconicfinance.notification.R

interface CattyNotifier {
    val notification: Notification
    fun showNotification()
}

class CattyNotifierImpl(private val context: Context) : CattyNotifier, BroadcastReceiver() {

    override val notification: Notification
        get() = NotificationCompat.Builder(context)
            .setContentTitle(context.resources.getString(R.string.notification_title))
            .setContentTitle(context.resources.getString(R.string.notification_content))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .build()

    override fun showNotification() = with(NotificationManagerCompat.from(context)) {
        notify((0..42).random(), notification)
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        showNotification()
    }
}