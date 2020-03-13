package io.iconicfinance.catty

import android.app.Application
import io.iconicfinance.cats.di.catsModule
import io.iconicfinance.catty.di.cattyModule
import io.iconicfinance.login.di.loginModule
import io.iconicfinance.networking.di.networkingModule
import io.iconicfinance.notification.di.notificationModule
import io.iconicfinance.notification.domain.CattyAlarm
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CattyApplication : Application() {

    private val cattyAlarm: CattyAlarm by inject()

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@CattyApplication)
            modules(
                listOf(
                    cattyModule,
                    catsModule,
                    loginModule,
                    networkingModule,
                    notificationModule
                )
            )
        }
        cattyAlarm.setAlarm()
    }
}
