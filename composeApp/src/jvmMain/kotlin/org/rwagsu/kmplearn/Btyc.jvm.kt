package org.rwagsu.kmplearn

import oshi.SystemInfo
import kotlin.math.roundToInt

actual class Btyc {

    actual fun GetBty() : Int {
        val systemInfo = SystemInfo()
        val batteryLevel = systemInfo.hardware.powerSources.firstOrNull()
        
        return batteryLevel?.remainingCapacityPercent?.times(-1)?.roundToInt() ?: -1
    }
}