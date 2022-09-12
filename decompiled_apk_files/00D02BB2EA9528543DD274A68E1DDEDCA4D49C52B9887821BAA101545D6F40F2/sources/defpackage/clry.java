package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* compiled from: PG */
/* renamed from: clry  reason: default package */
/* loaded from: classes5.dex */
final class clry {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;

    public clry(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
