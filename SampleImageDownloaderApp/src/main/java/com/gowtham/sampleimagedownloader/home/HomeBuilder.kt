package com.gowtham.sampleimagedownloader.home

import androidx.lifecycle.ViewModel
import com.freshworks.dagger.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class HomeBuilder{

    @ContributesAndroidInjector
    abstract fun homeActivity(): HomeActivity

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(activityViewModel: HomeViewModel): ViewModel

}