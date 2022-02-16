package me.user.shared

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    @Throws(Throwable::class)
    suspend fun greetingAsync(): String {
        //throw IllegalArgumentException("aaa")
        println("before delay")
        delay(1000)
        println("after delay")
        return "Hello, ${Platform().platform}"
    }

    suspend fun greetingAsyncNullable(): String? {
        return "Hello, ${Platform().platform}"
    }
}
