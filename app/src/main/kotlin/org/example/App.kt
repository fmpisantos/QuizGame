/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import io.javalin.Javalin

fun main() {
    val app =
            Javalin.create { config ->
                        // You can configure the app here if needed
                    }
                    .get("/") { ctx -> ctx.result("Hello World") }
                    .start(7070)
}
