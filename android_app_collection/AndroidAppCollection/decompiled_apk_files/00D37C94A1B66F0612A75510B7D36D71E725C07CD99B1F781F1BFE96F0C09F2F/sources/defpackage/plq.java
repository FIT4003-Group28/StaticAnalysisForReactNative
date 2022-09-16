package defpackage;

import android.media.AudioTrack;
/* compiled from: PG */
/* renamed from: plq  reason: default package */
/* loaded from: classes4.dex */
final class plq {
    public final plp a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public plq(AudioTrack audioTrack) {
        int i = pxi.a;
        this.a = new plp(audioTrack);
        d();
    }

    public final long a() {
        return this.a.e;
    }

    public final long b() {
        return this.a.a();
    }

    public final void c() {
        e(4);
    }

    public final void d() {
        e(0);
    }

    public final void e(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
        } else if (i == 1) {
            this.d = 10000L;
        } else if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            this.d = 500000L;
        }
    }
}
