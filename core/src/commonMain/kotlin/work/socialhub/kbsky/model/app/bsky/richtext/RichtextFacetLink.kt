package work.socialhub.kbsky.model.app.bsky.richtext

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kbsky.BlueskyTypes

/**
 * A facet feature for links.
 */
@Serializable
data class RichtextFacetLink(
    @SerialName("\$type")
    override var type: String = TYPE,
    var uri: String? = null,
) : RichtextFacetFeatureUnion() {

    companion object {
        const val TYPE = BlueskyTypes.RichtextFacet + "#link"
    }
}
