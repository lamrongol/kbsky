package work.socialhub.kbsky.api.entity.app.bsky.graph

import kotlinx.serialization.Serializable
import work.socialhub.kbsky.api.entity.com.atproto.repo.RepoCreateRecordResponse

@Serializable
data class GraphFollowResponse(
    val dummy: Unit = Unit,
) : RepoCreateRecordResponse()
