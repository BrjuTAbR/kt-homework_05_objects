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
    val date: Long,
    val attachments: Attachment?
)


interface Attachment {
    val type: String
    val id: Int?
    val ownerId: Int?
    val title: String?
    val url: String?
    val date: Int?
}


class AudioAttachment(
    override val type: String = "audio",
    override val id: Int,
    override val ownerId: Int,
    override val title: String?,
    override val url: String,
    override val date: Int,
    val artist: String?,
    val duration: Int?,
    val lyricsId: Int?,
    val description: String,
    val genreId: Int?,
    val noSearch: Boolean,
    val isHQ: Boolean,
    val albumId: Int?
) : Attachment

class DocumentAttachment(
    override val type: String = "document",
    override val id: Int,
    override val ownerId: Int,
    override val title: String?,
    override val url: String,
    override val date: Int,
    val size: Int,
    val ext: String,
    val docType: Int?
) : Attachment

class LinkAttachment(
    override val type: String = "link",
    override val id: Int,
    override val ownerId: Int,
    override val title: String?,
    override val url: String,
    override val date: Int,
    val caption: String,
    val previewPage: String,
    val previewUrl: String
) : Attachment

class PhotoAttachment(
    override val type: String = "photo",
    override val id: Int,
    override val ownerId: Int,
    override val title: String?,
    override val url: String,
    override val date: Int,
    val userId: Int,
    val text: String?,
    val width: Int,
    val height: Int,
    val description: String,
    val albumId: Int?
) : Attachment

class StickerAttachment(
    override val type: String = "sticker",
    override val id: Int? = null,
    override val ownerId: Int? = null,
    override val title: String? = null,
    override val url: String? = null,
    override val date: Int? = null,
    val productId: Int,
    val stickerId: Int
) : Attachment