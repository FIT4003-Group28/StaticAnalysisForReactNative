package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: pps  reason: default package */
/* loaded from: classes4.dex */
public final class pps implements ppy, ppx {
    public final long a;
    public pqb b;
    public ppy c;
    public long d = -9223372036854775807L;
    public final ppz e;
    private ppx f;
    private final axf g;

    public pps(ppz ppzVar, axf axfVar, long j) {
        this.e = ppzVar;
        this.g = axfVar;
        this.a = j;
    }

    private final long q(long j) {
        long j2 = this.d;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        ppy ppyVar = this.c;
        int i = pxi.a;
        return ppyVar.a(j, pkhVar);
    }

    @Override // defpackage.prj
    public final /* bridge */ /* synthetic */ void b(prk prkVar) {
        ppy ppyVar = (ppy) prkVar;
        ppx ppxVar = this.f;
        int i = pxi.a;
        ppxVar.b(this);
    }

    @Override // defpackage.ppx
    public final void c(ppy ppyVar) {
        ppx ppxVar = this.f;
        int i = pxi.a;
        ppxVar.c(this);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long d() {
        ppy ppyVar = this.c;
        int i = pxi.a;
        return ppyVar.d();
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        ppy ppyVar = this.c;
        int i = pxi.a;
        return ppyVar.e();
    }

    @Override // defpackage.ppy
    public final long f() {
        ppy ppyVar = this.c;
        int i = pxi.a;
        return ppyVar.f();
    }

    @Override // defpackage.ppy
    public final long g(long j) {
        ppy ppyVar = this.c;
        int i = pxi.a;
        return ppyVar.g(j);
    }

    @Override // defpackage.ppy
    public final long h(pvf[] pvfVarArr, boolean[] zArr, pri[] priVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.d;
        if (j3 == -9223372036854775807L || j != this.a) {
            j2 = j;
        } else {
            this.d = -9223372036854775807L;
            j2 = j3;
        }
        ppy ppyVar = this.c;
        int i = pxi.a;
        return ppyVar.h(pvfVarArr, zArr, priVarArr, zArr2, j2);
    }

    @Override // defpackage.ppy
    public final TrackGroupArray i() {
        ppy ppyVar = this.c;
        int i = pxi.a;
        return ppyVar.i();
    }

    @Override // defpackage.ppy
    public final void j(long j, boolean z) {
        ppy ppyVar = this.c;
        int i = pxi.a;
        ppyVar.j(j, z);
    }

    @Override // defpackage.ppy
    public final void k() {
        try {
            ppy ppyVar = this.c;
            if (ppyVar != null) {
                ppyVar.k();
                return;
            }
            pqb pqbVar = this.b;
            if (pqbVar == null) {
                return;
            }
            pqbVar.s();
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.ppy
    public final void l(ppx ppxVar, long j) {
        this.f = ppxVar;
        ppy ppyVar = this.c;
        if (ppyVar != null) {
            ppyVar.l(this, q(this.a));
        }
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
        ppy ppyVar = this.c;
        int i = pxi.a;
        ppyVar.m(j);
    }

    public final void n(ppz ppzVar) {
        long q = q(this.a);
        pqb pqbVar = this.b;
        ptx.a(pqbVar);
        ppy v = pqbVar.v(ppzVar, this.g, q);
        this.c = v;
        if (this.f != null) {
            v.l(this, q);
        }
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        ppy ppyVar = this.c;
        return ppyVar != null && ppyVar.o(j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean p() {
        ppy ppyVar = this.c;
        return ppyVar != null && ppyVar.p();
    }
}
