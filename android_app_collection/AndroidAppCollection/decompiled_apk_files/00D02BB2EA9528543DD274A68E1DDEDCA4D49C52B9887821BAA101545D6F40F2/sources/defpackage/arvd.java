package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arvd  reason: default package */
/* loaded from: classes2.dex */
public final class arvd extends mb {
    final /* synthetic */ arvh d;

    public arvd(arvh arvhVar) {
        this.d = arvhVar;
    }

    @Override // defpackage.mb
    public final void a(PlaybackStateCompat playbackStateCompat) {
        this.d.F(playbackStateCompat);
    }

    @Override // defpackage.mb
    public final void b(MediaMetadataCompat mediaMetadataCompat) {
        this.d.E(mediaMetadataCompat);
    }
}
