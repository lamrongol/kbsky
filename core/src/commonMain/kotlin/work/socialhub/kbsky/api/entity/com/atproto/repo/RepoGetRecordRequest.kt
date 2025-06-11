package work.socialhub.kbsky.api.entity.com.atproto.repo

import work.socialhub.kbsky.api.entity.share.MapRequest
import work.socialhub.kbsky.util.ATUriParser

data class RepoGetRecordRequest(
    /** The handle or DID of the repo. */
    var repo: String,
    /** The NSID of the record collection. */
    var collection: String,
    /** The key of the record. */
    var rkey: String? = null,
    /** (Library optional) */
    var uri: String? = null,
    /** The CID of the version of the record. If not specified, then return the most recent version.*/
    var cid: String? = null
) : MapRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("repo", repo)
            it.addParam("collection", collection)
            it.addParam("rkey", rkey())
            it.addParam("cid", cid)
        }
    }

    fun rkey(): String? {
        if (rkey != null) {
            return rkey
        }
        return if (uri != null) {
            ATUriParser.getRKey(uri!!)
        } else null
    }
}
