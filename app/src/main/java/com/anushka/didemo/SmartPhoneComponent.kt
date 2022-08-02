package com.anushka.didemo

import androidx.appcompat.app.AppCompatActivity
import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun inject(mainActivity: ACMain)
}