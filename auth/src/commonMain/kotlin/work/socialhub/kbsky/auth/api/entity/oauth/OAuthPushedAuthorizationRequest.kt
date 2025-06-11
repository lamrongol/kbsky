package work.socialhub.kbsky.auth.api.entity.oauth

import work.socialhub.kbsky.api.entity.share.MapRequest
import work.socialhub.kbsky.auth.domain.OAuthScopes

data class OAuthPushedAuthorizationRequest(
    var scope: List<String> = listOf(
        OAuthScopes.ATProto.value,
        OAuthScopes.TransitionGeneric.value,
        OAuthScopes.TransitionChatBsky.value,
    ),
    var responseType: String = "code",
    var clientId: String = "",
    var redirectUri: String = "",
    var codeChallenge: String? = null,
    var codeChallengeMethod: String = "S256",
    /**
     * Required for confidential OAuth clients.
     */
    var keyId: String? = null,
    var clientAssertionType: String? = null,
    var clientAssertion: String? = null,
    var state: String? = null,
    // var nonce: String? = null
    var loginHint: String? = null,
) : MapRequest {

    override fun toMap(): Map<String, Any> =
        mutableMapOf<String, Any>().also {
            it.addParam("client_assertion_type", clientAssertionType)
            it.addParam("client_assertion", clientAssertion)
            it.addParam("client_id", clientId)
            it.addParam("redirect_uri", redirectUri)
            it.addParam("response_type", responseType)
            it.addParam("scope", scope.joinToString(" "))
            it.addParam("code_challenge", codeChallenge)
            it.addParam("code_challenge_method", codeChallengeMethod)

            it.addParam("login_hint", loginHint)
            it.addParam("state", state)
        }
}