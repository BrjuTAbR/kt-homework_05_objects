import post.Likes
import post.Post
import post.WallService
import java.util.*

fun main() {

    val date = Date()
    val currentDate = date.time

    val original = Post(
        id = 10,
        ownerId = 10,
        fromId = 10,
        text = "Test",
        postType = "Test",
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        likes = Likes(15),
        date = currentDate
    )
    WallService.add(original)
}