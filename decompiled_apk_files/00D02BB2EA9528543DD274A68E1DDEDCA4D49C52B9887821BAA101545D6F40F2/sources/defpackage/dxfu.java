package defpackage;

import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.PlaybackPosition;
import com.spotify.protocol.types.PlaybackSpeed;
/* compiled from: PG */
/* renamed from: dxfu  reason: default package */
/* loaded from: classes6.dex */
public final class dxfu {
    public final dxgx a;

    public dxfu(dxgx dxgxVar) {
        this.a = dxgxVar;
    }

    public final void a(long j) {
        this.a.b("com.spotify.seek_to_relative_position", new PlaybackPosition(j), Empty.class);
    }

    public final void b(PlaybackSpeed playbackSpeed) {
        this.a.b("com.spotify.set_playback_speed", playbackSpeed, Empty.class);
    }
}
