package defpackage;

import android.media.MediaFormat;
import android.media.MediaMuxer;
/* compiled from: PG */
/* renamed from: vtf  reason: default package */
/* loaded from: classes4.dex */
public final class vtf {
    public final MediaMuxer a;

    public vtf(MediaMuxer mediaMuxer) {
        this.a = mediaMuxer;
    }

    public final int a(MediaFormat mediaFormat) {
        return this.a.addTrack(mediaFormat);
    }

    public final void b(int i) {
        this.a.setOrientationHint(i);
    }
}
