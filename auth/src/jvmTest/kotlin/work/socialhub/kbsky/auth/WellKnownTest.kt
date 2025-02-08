package work.socialhub.kbsky.auth

import work.socialhub.kbsky.domain.Service.BSKY_SOCIAL
import work.socialhub.kbsky.domain.Service.OYSTER_US_EAST
import kotlin.test.Test

class WellKnownTest : AbstractTest() {

    @Test
    fun testWellKnownOAuthProtectedResource() {
        val response = AuthFactory
            .instance(OYSTER_US_EAST.uri)
            .wellKnown()
            .oAuthProtectedResource()
        println(response.data.authorizationServers[0])
    }

    @Test
    fun testWellKnownOAuthAuthorizationServer() {
        val response = AuthFactory
            .instance(BSKY_SOCIAL.uri)
            .wellKnown()
            .oAuthAuthorizationServer()
        println(response.data.issuer)
    }
}