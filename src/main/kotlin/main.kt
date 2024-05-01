import post.*
import java.util.*

fun main() {

    val date = Date()
    val currentDate = date.time

    val audio = Audio(
        id = 1,
        ownerId = 2,
        title = "title",
        url = "",
        date = 0,
        artist = null,
        duration = 120,
        lyricsId = null,
        description = null,
        genreId = null,
        noSearch = true,
        isHQ = true,
        albumId = null
    )

    val audioAttachment = AudioAttachment(attachment = audio)

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
        date = currentDate,
        attachments = arrayListOf(audioAttachment)
    )
    WallService.add(original)
}