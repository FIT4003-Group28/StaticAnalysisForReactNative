package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cqaz  reason: default package */
/* loaded from: classes.dex */
public final class cqaz implements cqat {
    public static final /* synthetic */ int a = 0;
    private static final boolean b;

    static {
        boolean z;
        try {
            SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        b = z;
    }

    @Override // defpackage.cqat
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.cqat
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.cqat
    public final long d() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // defpackage.cqat
    public final long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.cqat
    public final long f() {
        if (b) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }

    @Override // defpackage.cqat
    public final long g() {
        return SystemClock.uptimeMillis();
    }
}
