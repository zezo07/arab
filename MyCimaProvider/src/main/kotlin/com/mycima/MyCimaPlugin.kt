package com.wecima
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class WeCimaPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(WeCima())
    }
}