package post

object WallService {

    private var lastId: Int = 0
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = ++lastId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, thisPost) in posts.withIndex()) {
            if (post.id == thisPost.id) {
                posts.set(index, post)
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        lastId = 0
    }
}