package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: ckgv  reason: default package */
/* loaded from: classes.dex */
public final class ckgv {
    private final ckcp a;
    private final cqat b;
    private boolean c;
    private long d;
    private long e = -1;

    public ckgv(ckcp ckcpVar, cqat cqatVar) {
        this.a = ckcpVar;
        this.b = cqatVar;
    }

    public final synchronized void a() {
        if (this.c) {
            cqat cqatVar = ckhh.a;
        }
        this.d = SystemClock.elapsedRealtime();
        this.c = true;
    }

    public final synchronized void b() {
        if (this.c) {
            long j = this.e;
            if (j < 0) {
                this.e = 0L;
                j = 0;
            }
            this.e = j + (SystemClock.elapsedRealtime() - this.d);
            this.c = false;
        }
    }

    public final synchronized void c() {
        long j = this.e;
        if (j >= 0) {
            this.a.a(j);
            this.e = -1L;
        }
        this.c = false;
    }
}
