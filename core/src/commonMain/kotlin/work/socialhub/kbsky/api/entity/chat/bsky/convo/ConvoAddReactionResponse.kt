package work.socialhub.kbsky.api.entity.chat.bsky.convo

import kotlinx.serialization.Serializable
import work.socialhub.kbsky.model.chat.bsky.convo.ConvoDefsMessageView

@Serializable
data class ConvoAddReactionResponse(
    val message: ConvoDefsMessageView
)