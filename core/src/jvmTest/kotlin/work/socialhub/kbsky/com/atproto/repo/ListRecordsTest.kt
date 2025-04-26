package work.socialhub.kbsky.com.atproto.repo

import work.socialhub.kbsky.ATProtocolFactory
import work.socialhub.kbsky.BlueskyFactory
import work.socialhub.kbsky.BlueskyTypes.FeedLike
import work.socialhub.kbsky.BlueskyTypes.FeedPost
import work.socialhub.kbsky.BlueskyTypes.GraphBlock
import work.socialhub.kbsky.api.entity.com.atproto.repo.RepoListRecordsRequest
import work.socialhub.kbsky.domain.Service.BSKY_SOCIAL
import kotlin.test.Test

class ListRecordsTest() {

    companion object {
        const val handle = "uakihir0.com"
    }

    @Test
    fun testListRecords() {

        val response = ATProtocolFactory
            .instance(BSKY_SOCIAL.uri)
            .repo()
            .listRecords(
                RepoListRecordsRequest(
                    repo = handle,
                    collection = FeedPost,
                ).also {
                    it.reverse = true
                    it.limit = 1
                }
            )

        response.data.records.forEach {
            print(checkNotNull(it.value))
        }
    }

    @Test
    fun testListRecordBlocks() {

        val response = BlueskyFactory
            .instance(BSKY_SOCIAL.uri)
            .repo()
            .listRecords(
                RepoListRecordsRequest(
                    repo = handle,
                    collection = GraphBlock,
                )
            )

        response.data.records.forEach {
            print(checkNotNull(it.value))
        }
    }

    @Test
    fun testListRecordLikes() {

        val response = BlueskyFactory
            .instance(BSKY_SOCIAL.uri)
            .repo()
            .listRecords(
                RepoListRecordsRequest(
                    repo = handle,
                    collection = FeedLike,
                )
            )

        response.data.records.forEach {
            print(checkNotNull(it.value))
        }
    }
}
