package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetRecommendedContentItemsRequest {
    @dgto(a = "type")
    public final String type;

    public GetRecommendedContentItemsRequest() {
        this("");
    }

    public GetRecommendedContentItemsRequest(String str) {
        this.type = str;
    }
}
