package ru.okay.whack_a_mole

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import ru.okay.whack_a_mole.di.viewModel

class GameApp : Application() {
    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@GameApp)
            modules(viewModel)
        }
    }
}