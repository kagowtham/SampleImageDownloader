package com.gowtham.sampleimagedownloader.home

import android.os.Bundle
import com.gowtham.sampleimagedownloader.R
import com.gowtham.sampleimagedownloader.base.BaseActivity

class HomeActivity : BaseActivity(){

    override fun contentViewLayoutId() = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}