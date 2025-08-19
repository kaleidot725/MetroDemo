package jp.kaleidot725.metro.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform