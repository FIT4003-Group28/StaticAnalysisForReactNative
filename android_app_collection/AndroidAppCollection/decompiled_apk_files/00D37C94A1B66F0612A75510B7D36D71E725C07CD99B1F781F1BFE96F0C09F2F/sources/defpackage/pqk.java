package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: pqk  reason: default package */
/* loaded from: classes4.dex */
final class pqk implements ppy, ppx {
    public final ppy a;
    private final long b;
    private ppx c;

    public pqk(ppy ppyVar, long j) {
        this.a = ppyVar;
        this.b = j;
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        return this.a.a(j - this.b, pkhVar) + this.b;
    }

    @Override // defpackage.prj
    public final /* bridge */ /* synthetic */ void b(prk prkVar) {
        ppy ppyVar = (ppy) prkVar;
        ppx ppxVar = this.c;
        ptx.a(ppxVar);
        ppxVar.b(this);
    }

    @Override // defpackage.ppx
    public final void c(ppy ppyVar) {
        ppx ppxVar = this.c;
        ptx.a(ppxVar);
        ppxVar.c(this);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        long e = this.a.e();
        if (e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e + this.b;
    }

    @Override // defpackage.ppy
    public final long f() {
        long f = this.a.f();
        if (f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return f + this.b;
    }

    @Override // defpackage.ppy
    public final long g(long j) {
        return this.a.g(j - this.b) + this.b;
    }

    @Override // defpackage.ppy
    public final long h(pvf[] pvfVarArr, boolean[] zArr, pri[] priVarArr, boolean[] zArr2, long j) {
        pri[] priVarArr2 = new pri[priVarArr.length];
        int i = 0;
        while (true) {
            pri priVar = null;
            if (i >= priVarArr.length) {
                break;
            }
            pql pqlVar = (pql) priVarArr[i];
            if (pqlVar != null) {
                priVar = pqlVar.a;
            }
            priVarArr2[i] = priVar;
            i++;
        }
        long h = this.a.h(pvfVarArr, zArr, priVarArr2, zArr2, j - this.b);
        for (int i2 = 0; i2 < priVarArr.length; i2++) {
            pri priVar2 = priVarArr2[i2];
            if (priVar2 == null) {
                priVarArr[i2] = null;
            } else {
                pri priVar3 = priVarArr[i2];
                if (priVar3 == null || ((pql) priVar3).a != priVar2) {
                    priVarArr[i2] = new pql(priVar2, this.b);
                }
            }
        }
        return h + this.b;
    }

    @Override // defpackage.ppy
    public final TrackGroupArray i() {
        return this.a.i();
    }

    @Override // defpackage.ppy
    public final void j(long j, boolean z) {
        this.a.j(j - this.b, z);
    }

    @Override // defpackage.ppy
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.ppy
    public final void l(ppx ppxVar, long j) {
        this.c = ppxVar;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
        this.a.m(j - this.b);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        return this.a.o(j - this.b);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean p() {
        return this.a.p();
    }
}
