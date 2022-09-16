package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bait  reason: default package */
/* loaded from: classes2.dex */
public abstract class bait extends bahl implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // defpackage.bahl
    public bahv A() {
        return bakh.j(bahx.b);
    }

    @Override // defpackage.bahl
    public bahv B() {
        return bakh.j(bahx.g);
    }

    @Override // defpackage.bahl
    public bahv C() {
        return bakh.j(bahx.a);
    }

    @Override // defpackage.bahl
    public bahv D() {
        return bakh.j(bahx.h);
    }

    @Override // defpackage.bahl
    public bahv E() {
        return bakh.j(bahx.i);
    }

    @Override // defpackage.bahl
    public bahv F() {
        return bakh.j(bahx.l);
    }

    @Override // defpackage.bahl
    public bahv G() {
        return bakh.j(bahx.j);
    }

    @Override // defpackage.bahl
    public bahv H() {
        return bakh.j(bahx.e);
    }

    @Override // defpackage.bahl
    public bahv I() {
        return bakh.j(bahx.k);
    }

    @Override // defpackage.bahl
    public bahv J() {
        return bakh.j(bahx.f);
    }

    @Override // defpackage.bahl
    public bahv K() {
        return bakh.j(bahx.c);
    }

    @Override // defpackage.bahl
    public bahv L() {
        return bakh.j(bahx.d);
    }

    @Override // defpackage.bahl
    public final int[] M(baih baihVar, long j) {
        int c = baihVar.c();
        int[] iArr = new int[c];
        long j2 = 0;
        if (j != 0) {
            for (int i = 0; i < c; i++) {
                bahv a = baihVar.d(i).a(this);
                if (a.g()) {
                    int a2 = a.a(j, j2);
                    j2 = a.b(j2, a2);
                    iArr[i] = a2;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.bahl
    public bahn c() {
        return bakg.u(bahp.e, A());
    }

    @Override // defpackage.bahl
    public bahn d() {
        return bakg.u(bahp.r, E());
    }

    @Override // defpackage.bahl
    public bahn e() {
        return bakg.u(bahp.q, E());
    }

    @Override // defpackage.bahl
    public bahn f() {
        return bakg.u(bahp.j, B());
    }

    @Override // defpackage.bahl
    public bahn g() {
        return bakg.u(bahp.n, B());
    }

    @Override // defpackage.bahl
    public bahn h() {
        return bakg.u(bahp.h, B());
    }

    @Override // defpackage.bahl
    public bahn i() {
        return bakg.u(bahp.c, C());
    }

    @Override // defpackage.bahl
    public bahn j() {
        return bakg.u(bahp.o, D());
    }

    @Override // defpackage.bahl
    public bahn k() {
        return bakg.u(bahp.s, E());
    }

    @Override // defpackage.bahl
    public bahn l() {
        return bakg.u(bahp.p, E());
    }

    @Override // defpackage.bahl
    public bahn m() {
        return bakg.u(bahp.x, F());
    }

    @Override // defpackage.bahl
    public bahn n() {
        return bakg.u(bahp.y, F());
    }

    @Override // defpackage.bahl
    public bahn o() {
        return bakg.u(bahp.t, G());
    }

    @Override // defpackage.bahl
    public bahn p() {
        return bakg.u(bahp.u, G());
    }

    @Override // defpackage.bahl
    public bahn q() {
        return bakg.u(bahp.i, H());
    }

    @Override // defpackage.bahl
    public bahn r() {
        return bakg.u(bahp.v, I());
    }

    @Override // defpackage.bahl
    public bahn s() {
        return bakg.u(bahp.w, I());
    }

    @Override // defpackage.bahl
    public bahn t() {
        return bakg.u(bahp.m, J());
    }

    @Override // defpackage.bahl
    public bahn u() {
        return bakg.u(bahp.l, K());
    }

    @Override // defpackage.bahl
    public bahn v() {
        return bakg.u(bahp.k, K());
    }

    @Override // defpackage.bahl
    public bahn w() {
        return bakg.u(bahp.g, L());
    }

    @Override // defpackage.bahl
    public bahn x() {
        return bakg.u(bahp.f, L());
    }

    @Override // defpackage.bahl
    public bahn y() {
        return bakg.u(bahp.d, L());
    }
}
