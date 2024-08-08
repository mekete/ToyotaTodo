package com.toyota.todo.data.db.repository

import android.content.Context
import com.toyota.todo.data.db.database.TodoDatabase


interface AppContainer {
    val itemsRepository: ItemsRepository
}

class AppDataContainer(private val context: Context) : AppContainer {

    override val itemsRepository: ItemsRepository by lazy {
        OfflineItemsRepository(TodoDatabase.getDatabase(context).itemDao())
    }
}
