package org.rwagsu.kmplearn

interface Platform {

    val name : String
}

expect fun getPlatform() : Platform