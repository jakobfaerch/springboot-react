package name.jakobfaerch

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootreactApplication

fun main(args: Array<String>) {
    SpringApplication.run(BootreactApplication::class.java, *args)
}
