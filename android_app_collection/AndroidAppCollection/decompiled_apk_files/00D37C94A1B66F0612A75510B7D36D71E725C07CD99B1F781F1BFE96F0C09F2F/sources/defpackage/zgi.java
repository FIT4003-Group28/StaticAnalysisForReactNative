package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: zgi  reason: default package */
/* loaded from: classes4.dex */
public final class zgi implements snc {
    private final /* synthetic */ int a;

    public zgi() {
    }

    public zgi(int i) {
        this.a = i;
    }

    @Override // defpackage.snc
    public final long b() {
        if (this.a == 0) {
            return SystemClock.currentThreadTimeMillis();
        }
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // defpackage.snc
    public final long c() {
        if (this.a == 0) {
            return System.currentTimeMillis();
        }
        return System.currentTimeMillis();
    }

    @Override // defpackage.snc
    public final long d() {
        if (this.a == 0) {
            return SystemClock.elapsedRealtime();
        }
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.snc
    public final long e() {
        if (this.a == 0) {
            return SystemClock.elapsedRealtimeNanos();
        }
        if (sne.a) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }

    @Override // defpackage.snc
    public final long f() {
        if (this.a == 0) {
            return System.nanoTime();
        }
        return System.nanoTime();
    }

    @Override // defpackage.snc
    public final long g() {
        if (this.a == 0) {
            return SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis();
    }
}
