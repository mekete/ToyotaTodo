package com.toyota.todo.ui.main.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.toyota.todo.TodoApplication

/**
 * Provides Factory to create instance of ViewModel for the entire Todo app
 */
object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            ItemEditViewModel(
                this.createSavedStateHandle(),
                TodoApplication().container.itemsRepository
            )
        }
        initializer {
            ItemEntryViewModel(TodoApplication().container.itemsRepository)
        }

        initializer {
            ItemDetailsViewModel(
                this.createSavedStateHandle(),
                TodoApplication().container.itemsRepository
            )
        }

        initializer {
            HomeViewModel(TodoApplication().container.itemsRepository)
        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [TodoApplication].
 */
fun CreationExtras.TodoApplication(): TodoApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as TodoApplication)
