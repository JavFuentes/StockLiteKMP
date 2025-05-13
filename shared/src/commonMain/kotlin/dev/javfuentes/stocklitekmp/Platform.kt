package dev.javfuentes.stocklitekmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform