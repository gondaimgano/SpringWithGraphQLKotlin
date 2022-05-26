package zw.co.myblog.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import zw.co.myblog.blog.model.Blog
import zw.co.myblog.blog.repos.BlogRepository

@SpringBootApplication
class BlogApplication {

    @Bean
    fun generateRunner(repository: BlogRepository): ApplicationRunner {
        return ApplicationRunner {
            val gondai = Blog(username = "gondai", password = "Mgano", comment = "Gemmeee")
            val bob = Blog(username = "bob", password = "Mgano", comment = "Gemmeee", id = 0L)
            val users= listOf(Blog(username = "Richard"), Blog(username = "Brent"), Blog(username = "Fish"),gondai,bob)
           repository.saveAll(users)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}


