package zw.co.myblog.blog.controller

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import zw.co.myblog.blog.model.Blog
import zw.co.myblog.blog.repos.BlogRepository
import java.util.*

@Controller
class BlogController

constructor(val repository: BlogRepository){


    @QueryMapping
    fun findAll(): MutableIterable<Blog> {
        return repository.findAll()
    }
    @QueryMapping
    fun findById(
        @Argument
        id: Long): Optional<Blog> {
        return repository.findById(id)
    }
  @QueryMapping
    fun findAllByPage(
      @Argument
      page: Int,
      @Argument
      size: Int): Page<Blog> {
                val pageRequest= PageRequest.of(page, size)
        return repository.findAll(pageRequest)
    }

    @MutationMapping
    fun addPost(
        @Argument
        blog: Blog
    ): Blog {
        return repository.save(blog)
    }

}