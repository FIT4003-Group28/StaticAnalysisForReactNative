package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: phm  reason: default package */
/* loaded from: classes4.dex */
public class phm implements piv {
    private final axf a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private int g;
    private boolean h;

    public phm() {
        axf axfVar = new axf(true, 65536);
        j(2500, 0, "bufferForPlaybackMs", "0");
        j(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(50000, 50000, "maxBufferMs", "minBufferMs");
        j(0, 0, "backBufferDurationMs", "0");
        this.a = axfVar;
        this.b = phk.c(50000L);
        this.c = phk.c(50000L);
        this.d = phk.c(2500L);
        this.e = phk.c(5000L);
        this.g = 13107200;
        this.f = phk.c(0L);
    }

    private static void j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        ptx.d(z, sb.toString());
    }

    private final void k(boolean z) {
        this.g = 13107200;
        this.h = false;
        if (z) {
            this.a.b();
        }
    }

    @Override // defpackage.piv
    public long a() {
        return this.f;
    }

    @Override // defpackage.piv
    public boolean b(long j, long j2, float f) {
        int a = this.a.a();
        int i = this.g;
        long j3 = this.b;
        if (f > 1.0f) {
            j3 = Math.min(pxi.k(j3, f), this.c);
        }
        boolean z = false;
        if (j2 < Math.max(j3, 500000L)) {
            if (a < i) {
                z = true;
            }
            this.h = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || a >= i) {
            this.h = false;
        }
        return this.h;
    }

    @Override // defpackage.piv
    public boolean c(long j, float f, boolean z, long j2) {
        long m = pxi.m(j, f);
        long j3 = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || m >= j3 || this.a.a() >= this.g;
    }

    @Override // defpackage.piv
    public final void d() {
        k(false);
    }

    @Override // defpackage.piv
    public final void e() {
        k(true);
    }

    @Override // defpackage.piv
    public final void f() {
        k(true);
    }

    @Override // defpackage.piv
    public final void g(pkd[] pkdVarArr, TrackGroupArray trackGroupArray, pvf[] pvfVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < pkdVarArr.length) {
                if (pvfVarArr[i] != null) {
                    int R = pkdVarArr[i].R();
                    if (R != 1) {
                        if (R == 2) {
                            i3 = 131072000;
                        } else if (R != 3 && R != 5 && R != 6) {
                            throw new IllegalArgumentException();
                        } else {
                            i3 = 131072;
                        }
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.g = max;
                this.a.c(max);
                return;
            }
        }
    }

    @Override // defpackage.piv
    public final boolean h() {
        return false;
    }

    @Override // defpackage.piv
    public final axf i() {
        return this.a;
    }
}
