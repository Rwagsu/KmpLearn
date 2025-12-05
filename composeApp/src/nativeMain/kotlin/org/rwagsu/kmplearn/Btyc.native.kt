package org.rwagsu.kmplearn

actual class Btyc {
    actual fun GetBty() : Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
        val batteryLevel = UIDevice.currentDevice.batteryLevel
        
        return (batteryLevel * 100).roundToInt()
    }
}