package zw.co.myblog.blog.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
 class Blog(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0L,
    var username: String,
    var password: String="nopassword",
    var comment: String="No comment"
)