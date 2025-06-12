package work.socialhub.kbsky.api.entity.app.bsky.actor

import work.socialhub.kbsky.api.entity.share.AuthRequest
import work.socialhub.kbsky.api.entity.share.MapRequest
import work.socialhub.kbsky.auth.AuthProvider

data class ActorGetProfileRequest(
    override val auth: AuthProvider,
    var actor: String? = null,
) : AuthRequest(auth), MapRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("actor", actor)
        }
    }
}
