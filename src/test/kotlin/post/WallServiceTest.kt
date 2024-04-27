package post

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.util.*

class WallServiceTest {
    val date = Date()
    val currentDate = date.time

    val original = Post(
        id = 10,
        ownerId = 10,
        fromId = null,
        text = "Test",
        postType = "Test",
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        likes = Likes(20),
        date = currentDate
    )

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val newPost: Post = WallService.add(original)
        assertTrue(newPost.id != 0)
    }

    @Test
    fun updateExisting() {
        WallService.add(original)
        WallService.add(original.copy(text = "Test 2"))
        WallService.add(original.copy(text = "Test 3"))

        val update = original.copy(id = 3, text = "Update")

        val result = WallService.update(update)

        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        WallService.add(original)
        WallService.add(original.copy(text = "Test 2"))
        WallService.add(original.copy(text = "Test 3"))

        val update = original.copy(id = 4, text = "Update")

        val result = WallService.update(update)

        assertFalse(result)
    }
}