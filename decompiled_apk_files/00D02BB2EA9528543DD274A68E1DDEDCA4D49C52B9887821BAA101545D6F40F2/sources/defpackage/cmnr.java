package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cmnr  reason: default package */
/* loaded from: classes5.dex */
public final class cmnr implements cmnc {
    public clod a = clod.a;
    private final cmmq b;
    private boolean c;
    private long d;
    private long e;

    public cmnr(cmmq cmmqVar) {
        this.b = cmmqVar;
    }

    @Override // defpackage.cmnc
    public final clod RP() {
        return this.a;
    }

    public final void a() {
        if (!this.c) {
            this.e = SystemClock.elapsedRealtime();
            this.c = true;
        }
    }

    @Override // defpackage.cmnc
    public final long b() {
        long j = this.d;
        if (this.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
            clod clodVar = this.a;
            return j + (clodVar.b == 1.0f ? cllt.b(elapsedRealtime) : elapsedRealtime * clodVar.d);
        }
        return j;
    }

    @Override // defpackage.cmnc
    public final void c(clod clodVar) {
        if (this.c) {
            f(b());
        }
        this.a = clodVar;
    }

    public final void e() {
        if (this.c) {
            f(b());
            this.c = false;
        }
    }

    public final void f(long j) {
        this.d = j;
        if (this.c) {
            this.e = SystemClock.elapsedRealtime();
        }
    }
}
