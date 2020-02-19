package com.gowtham.sampleimagedownloader.dagger

import android.app.Application
import com.gowtham.dagger.ViewModelModule
import com.gowtham.sampleimagedownloader.SampleImageDownloader
import com.gowtham.sampleimagedownloader.home.HomeBuilder
import com.gowtham.sampleimagedownloader.showList.ShowListBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        HomeBuilder::class,
        ShowListBuilder::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<SampleImageDownloader> {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: Application): Builder
    }
}