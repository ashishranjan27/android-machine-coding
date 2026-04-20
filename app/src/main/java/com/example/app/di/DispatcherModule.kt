package com.example.app.di

import com.example.app.helper.Dispatcher
import com.example.app.helper.DispatcherImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DispatcherModule {

    @Binds
    @Singleton
    abstract fun bindDispatcher(dispatcherImpl: DispatcherImpl): Dispatcher
}