package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cxez  reason: default package */
/* loaded from: classes5.dex */
public final class cxez {
    private static final cqat a = new cqaz();
    private final dzsj<Integer> c;
    private final Object b = new Object();
    private int d = 0;
    private long e = 0;

    public cxez(dzsj<Integer> dzsjVar) {
        this.c = dzsjVar;
    }

    public static cxez a(dzsj<Integer> dzsjVar) {
        return new cxez(dzsjVar);
    }

    public static cxez b(final int i) {
        return a(new dzsj(i) { // from class: cxey
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return Integer.valueOf(this.a);
            }
        });
    }

    public final boolean c() {
        int intValue = this.c.a().intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue != Integer.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (this.b) {
                if (elapsedRealtime - this.e <= 1000) {
                    if (this.d >= intValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.b) {
            this.d++;
            if (elapsedRealtime - this.e > 1000) {
                this.d = 0;
                this.e = elapsedRealtime;
            }
        }
    }
}
