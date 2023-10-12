package com.odhiambopaul.contact

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform