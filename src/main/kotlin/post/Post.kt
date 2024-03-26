package post

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val text: String,
    val postType: String,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val likes: Likes,
    val date: Long
)