package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlaybackPosition implements Item {
    @dgto(a = "position_ms")
    public final long position;

    private PlaybackPosition() {
        this(0L);
    }

    public PlaybackPosition(long j) {
        this.position = j;
    }
}
