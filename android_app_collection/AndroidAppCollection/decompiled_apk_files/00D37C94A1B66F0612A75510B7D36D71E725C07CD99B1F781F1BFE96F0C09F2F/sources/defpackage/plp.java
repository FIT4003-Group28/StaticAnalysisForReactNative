package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* compiled from: PG */
/* renamed from: plp  reason: default package */
/* loaded from: classes4.dex */
final class plp {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;

    public plp(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
