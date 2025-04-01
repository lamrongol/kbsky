package work.socialhub.kbsky.model.app.bsky.richtext

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kbsky.BlueskyTypes

/**
 * A facet feature for actor mentions.
 */
@Serializable
data class RichtextFacetMention(
    @SerialName("\$type")
    override var type: String = TYPE,
    var did: String? = null,
) : RichtextFacetFeatureUnion() {

    companion object {
        const val TYPE = BlueskyTypes.RichtextFacet + "#mention"
    }
}
