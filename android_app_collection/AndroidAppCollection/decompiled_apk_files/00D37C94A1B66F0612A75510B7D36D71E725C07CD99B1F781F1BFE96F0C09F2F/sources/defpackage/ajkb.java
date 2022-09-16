package defpackage;
/* compiled from: PG */
/* renamed from: ajkb  reason: default package */
/* loaded from: classes.dex */
public enum ajkb {
    BROWSE("browse_"),
    HOME("home_"),
    CHANNEL("channel_"),
    SEARCH("search_"),
    WATCH("watch_"),
    ENGAGEMENT("engagement_"),
    SUGGESTED_PLAYLIST("suggested_playlist_"),
    LIVE_CHAT("live_chat_"),
    SHORTS("shorts_"),
    OTHERS("others_");
    
    public final String k;

    ajkb(String str) {
        this.k = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.k;
    }
}
