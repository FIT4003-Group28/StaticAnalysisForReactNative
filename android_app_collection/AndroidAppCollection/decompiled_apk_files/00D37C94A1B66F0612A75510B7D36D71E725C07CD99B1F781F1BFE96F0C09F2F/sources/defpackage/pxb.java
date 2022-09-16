package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: pxb  reason: default package */
/* loaded from: classes4.dex */
public final class pxb implements pwj {
    public pjt a = pjt.a;
    private boolean b;
    private long c;
    private long d;

    public final void d(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void e() {
        if (!this.b) {
            this.d = SystemClock.elapsedRealtime();
            this.b = true;
        }
    }

    public final void f() {
        if (this.b) {
            d(jF());
            this.b = false;
        }
    }

    @Override // defpackage.pwj
    public final long jF() {
        long j = this.c;
        if (this.b) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
            pjt pjtVar = this.a;
            return j + (pjtVar.b == 1.0f ? phk.c(elapsedRealtime) : elapsedRealtime * pjtVar.d);
        }
        return j;
    }

    @Override // defpackage.pwj
    public final pjt jG() {
        return this.a;
    }

    @Override // defpackage.pwj
    public final void jH(pjt pjtVar) {
        if (this.b) {
            d(jF());
        }
        this.a = pjtVar;
    }
}
