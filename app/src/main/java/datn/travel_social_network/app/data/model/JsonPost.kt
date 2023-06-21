package datn.travel_social_network.app.data.model

data class JsonPost(
    val account: JsonAccount,
    val accountId: Int,
    val blog: Boolean,
    val comments: Any,
    val content: String,
    val id: Int,
    val location: String,
    val medias: Any,
    val notifications: Any,
    val reactions: Any,
    val regions: String,
    val stt: Boolean,
    val time: String,
    val title: String
)