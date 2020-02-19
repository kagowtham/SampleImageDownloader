package com.gowtham.sampleimagedownloader.showList

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ShowListBuilder {

    @ContributesAndroidInjector
    abstract fun showListActivity(): ShowListActivity

}