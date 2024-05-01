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
    val attachments: ArrayList<Attachment?>?
)


interface Attachment {
    val type: String
    val attachment: Any
}


class AudioAttachment(
    override val type: String = "audio",
    override val attachment: Audio
) : Attachment

data class Audio(
    val id: Int,
    val ownerId: Int,
    val title: String?,
    val url: String,
    val date: Int,
    val artist: String?,
    val duration: Int?,
    val lyricsId: Int?,
    val description: String?,
    val genreId: Int?,
    val noSearch: Boolean,
    val isHQ: Boolean,
    val albumId: Int?
)

class DocumentAttachment(
    override val type: String = "document",
    override val attachment: Document
) : Attachment

data class Document(
    val id: Int,
    val ownerId: Int,
    val title: String?,
    val url: String,
    val date: Int,
    val size: Int,
    val ext: String,
    val docType: Int?
)


class LinkAttachment(
    override val type: String = "link",
    override val attachment: Link
) : Attachment

data class Link(
    val id: Int,
    val ownerId: Int,
    val title: String?,
    val url: String,
    val date: Int,
    val caption: String,
    val previewPage: String,
    val previewUrl: String
)


class PhotoAttachment(
    override val type: String = "photo",
    override val attachment: Photo
) : Attachment

data class Photo(
    val id: Int,
    val ownerId: Int,
    val title: String?,
    val url: String,
    val date: Int,
    val userId: Int,
    val text: String?,
    val width: Int,
    val height: Int,
    val description: String,
    val albumId: Int?
)


class StickerAttachment(
    override val type: String = "sticker",
    override val attachment: Sticker
) : Attachment

data class Sticker(
    val id: Int? = null,
    val ownerId: Int? = null,
    val title: String? = null,
    val url: String? = null,
    val date: Int? = null,
    val productId: Int,
    val stickerId: Int
)
