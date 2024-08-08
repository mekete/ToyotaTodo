package com.toyota.todo

import android.app.Application
import com.toyota.todo.data.db.repository.AppContainer
import com.toyota.todo.data.db.repository.AppDataContainer

class TodoApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
