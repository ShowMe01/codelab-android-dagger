package com.example.android.dagger.registration

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.dagger.di.ViewModelFactory
import com.example.android.dagger.di.ViewModelKey
import com.example.android.dagger.registration.enterdetails.EnterDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class RegistrationViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    abstract fun bindRegistrationViewModel(viewModel: RegistrationViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(EnterDetailsViewModel::class)
    abstract fun bindEnterDetailsViewModel(viewModel: EnterDetailsViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
