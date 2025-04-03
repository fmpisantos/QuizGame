import io.javalin.Javalin

fun main () {
    val app = Javalin.create().start(7000)
    app.get("/ping") { ctx ->
        ctx.json(mapOf("message" to "pong"))
    }
}