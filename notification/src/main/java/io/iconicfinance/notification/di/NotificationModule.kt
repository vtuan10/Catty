package io.iconicfinance.notification.di

import android.app.AlarmManager
import android.app.NotificationManager
import android.content.Context
import io.iconicfinance.notification.domain.CattyAlarm
import io.iconicfinance.notification.domain.CattyAlarmImpl
import io.iconicfinance.notification.domain.CattyNotifier
import io.iconicfinance.notification.domain.CattyNotifierImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val notificationModule = module {
    single { androidContext().getSystemService(Context.ALARM_SERVICE) as AlarmManager }
    single<CattyNotifier> { CattyNotifierImpl(androidContext()) }
    single<CattyAlarm> { CattyAlarmImpl(androidContext(), get()) }
}