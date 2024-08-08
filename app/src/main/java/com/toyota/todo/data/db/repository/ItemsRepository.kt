package com.toyota.todo.data.db.repository

import com.toyota.todo.model.Item
import kotlinx.coroutines.flow.Flow


interface ItemsRepository {

    fun getAllItemsStream(): Flow<List<Item>>

    fun getItemStream(id: Int): Flow<Item?>

    suspend fun insertItem(item: Item)

    suspend fun deleteItem(item: Item)

    suspend fun updateItem(item: Item)
}
