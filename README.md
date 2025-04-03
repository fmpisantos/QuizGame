# kotlin-bootstrap

Clone this repository to have Kotlin + Javalin server up and running in no time!

## Tool Versions

| Tool   | Version | Notes                                                                                          |
| ------ | ------- | ---------------------------------------------------------------------------------------------- |
| Kotlin | 1.3.21  |                                                                                                |
| Gradle | 5.3.1   | Use the wrapper -- no need to install locally                                                  |
| SLF4J  | 1.7.5   | Only the API is used at compile time -- `log4j` is used as the runtime logging implementation. |
| log4j  | 2.11.1  |                                                                                                |
| Javalin | 2.8.0 | Lightweight REST API library. |

## Usage

The following instructions are for command line interaction. IntelliJ has tight integration with Gradle if you prefer the GUI.

### Compile

From the project root run: `./gradlew build`

### Run

From the project root run:

```bash
$ ./gradlew run

> Task :compileKotlin UP-TO-DATE
> Task :compileJava NO-SOURCE
> Task :processResources UP-TO-DATE
> Task :classes UP-TO-DATE

> Task :run
 INFO [main] (Log.java:193) - Logging initialized @581ms to org.eclipse.jetty.util.log.Slf4jLog
 INFO [main] (Javalin.java:134) - 
           __                      __ _
          / /____ _ _   __ ____ _ / /(_)____
     __  / // __ `/| | / // __ `// // // __ \
    / /_/ // /_/ / | |/ // /_/ // // // / / /
    \____/ \__,_/  |___/ \__,_//_//_//_/ /_/

        https://javalin.io/documentation

 INFO [main] (Javalin.java:139) - Starting Javalin ...
 INFO [main] (JettyServerUtil.kt:113) - Listening on http://localhost:7000/
 INFO [main] (Javalin.java:149) - Javalin started in 149ms \o/

```

To test the server:

```bash
$ curl -v localhost:7000/ping
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 7000 (#0)
> GET /ping HTTP/1.1
> Host: localhost:7000
> User-Agent: curl/7.64.1
> Accept: */*
> 
< HTTP/1.1 200 OK
< Date: Sat, 20 Apr 2019 20:56:00 GMT
< Server: Javalin
< Content-Type: application/json
< Content-Length: 18
< 
* Connection #0 to host localhost left intact
{"message":"pong"}* Closing connection 0
```

## Logging

`SLF4J` provides the logging API within the code and `log4j` provides the logging implementation. You will find the logging configuration at `src/main/resources/log4j2.properties`.
