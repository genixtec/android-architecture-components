package com.genix.architecturecomponents.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.genix.architecturecomponents.ui.login.LoginViewModel
import com.genix.architecturecomponents.ui.main.MainViewModel
import com.genix.architecturecomponents.viewmodelfactory.ArchViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(loginActivityModule: LoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ArchViewModelFactory): ViewModelProvider.Factory
}