package work.socialhub.kbsky.model.app.bsky.undoc

import kotlinx.serialization.Serializable

@Serializable
data class UndocSearchFeedsPost(
    var createdAt: Long? = null,
    var text: String? = null,
    var user: String? = null,
)
