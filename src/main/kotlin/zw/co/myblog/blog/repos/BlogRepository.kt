package zw.co.myblog.blog.repos

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import zw.co.myblog.blog.model.Blog

@Repository
interface BlogRepository : PagingAndSortingRepository<Blog, Long>