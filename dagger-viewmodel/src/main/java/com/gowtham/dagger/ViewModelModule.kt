package com.gowtham.dagger

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

/**
 *
 * This module does nothing except registering our [ViewModelFactory] to be injected,
 * when somebody requests a [ViewModelProvider.Factory]
 */
@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}