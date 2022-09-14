package defpackage;

import android.media.AudioTrack;
/* compiled from: PG */
/* renamed from: clrz  reason: default package */
/* loaded from: classes5.dex */
final class clrz {
    public final clry a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public clrz(AudioTrack audioTrack) {
        if (cmny.a >= 19) {
            this.a = new clry(audioTrack);
            b();
            return;
        }
        this.a = null;
        e(3);
    }

    public final void a() {
        e(4);
    }

    public final void b() {
        if (this.a != null) {
            e(0);
        }
    }

    public final long c() {
        clry clryVar = this.a;
        if (clryVar != null) {
            return clryVar.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        clry clryVar = this.a;
        if (clryVar != null) {
            return clryVar.e;
        }
        return -1L;
    }

    public final void e(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.d = 10000L;
            return;
        } else {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
