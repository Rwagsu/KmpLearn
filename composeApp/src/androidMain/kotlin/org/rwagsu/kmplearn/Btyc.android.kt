package org.rwagsu.kmplearn

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import kotlin.math.roundToInt

actual class Btyc (
    private val context : Context?
) {
    actual fun GetBty() : Int {
        if (context != null) {
            val intentFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
            val batteryState = context.registerReceiver(null, intentFilter)

            val level = batteryState?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) ?: -1
            val scale = batteryState?.getIntExtra(BatteryManager.EXTRA_SCALE, -1) ?: -1

            return (level / scale.toFloat() * 100).roundToInt()
        }
        return 0
    }
}