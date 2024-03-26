package post

class Likes(likes: Int) {
    var likes = likes
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }

    @Override
    override fun toString(): String {
        return likes.toString()
    }
}