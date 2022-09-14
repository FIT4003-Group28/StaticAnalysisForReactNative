package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaqq  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqq extends eaok implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // defpackage.eaok
    public eaon A() {
        return eatk.K(eaop.o, x());
    }

    @Override // defpackage.eaok
    public eaox B() {
        return eatl.j(eaoz.g);
    }

    @Override // defpackage.eaok
    public eaon C() {
        return eatk.K(eaop.n, B());
    }

    @Override // defpackage.eaok
    public eaon D() {
        return eatk.K(eaop.j, B());
    }

    @Override // defpackage.eaok
    public eaon E() {
        return eatk.K(eaop.h, B());
    }

    @Override // defpackage.eaok
    public eaox F() {
        return eatl.j(eaoz.f);
    }

    @Override // defpackage.eaok
    public eaon G() {
        return eatk.K(eaop.m, F());
    }

    @Override // defpackage.eaok
    public eaox H() {
        return eatl.j(eaoz.c);
    }

    @Override // defpackage.eaok
    public eaon I() {
        return eatk.K(eaop.l, H());
    }

    @Override // defpackage.eaok
    public eaon J() {
        return eatk.K(eaop.k, H());
    }

    @Override // defpackage.eaok
    public eaox K() {
        return eatl.j(eaoz.e);
    }

    @Override // defpackage.eaok
    public eaon L() {
        return eatk.K(eaop.i, K());
    }

    @Override // defpackage.eaok
    public eaox M() {
        return eatl.j(eaoz.d);
    }

    @Override // defpackage.eaok
    public eaon N() {
        return eatk.K(eaop.g, M());
    }

    @Override // defpackage.eaok
    public eaon O() {
        return eatk.K(eaop.d, M());
    }

    @Override // defpackage.eaok
    public eaon P() {
        return eatk.K(eaop.f, M());
    }

    @Override // defpackage.eaok
    public eaox Q() {
        return eatl.j(eaoz.b);
    }

    @Override // defpackage.eaok
    public eaon R() {
        return eatk.K(eaop.e, Q());
    }

    @Override // defpackage.eaok
    public eaox S() {
        return eatl.j(eaoz.a);
    }

    @Override // defpackage.eaok
    public eaon T() {
        return eatk.K(eaop.c, S());
    }

    @Override // defpackage.eaok
    public long U(long j, int i, int i2, int i3) {
        return m().p(p().p(s().p(v().p(j, i), i2), i3), 0);
    }

    @Override // defpackage.eaok
    public long d(int i, int i2, int i3, int i4) {
        return n().p(D().p(L().p(N().p(0L, i), i2), i3), i4);
    }

    @Override // defpackage.eaok
    public long e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return m().p(p().p(s().p(v().p(D().p(L().p(N().p(0L, i), i2), i3), i4), i5), i6), i7);
    }

    @Override // defpackage.eaok
    public final void f(eapt eaptVar, int[] iArr) {
        int e = eaptVar.e();
        for (int i = 0; i < e; i++) {
            int i2 = iArr[i];
            eaon y = eaptVar.y(i);
            if (i2 < y.w()) {
                throw new eapb(y.a(), Integer.valueOf(i2), Integer.valueOf(y.w()), null);
            }
            if (i2 > y.A()) {
                throw new eapb(y.a(), Integer.valueOf(i2), null, Integer.valueOf(y.A()));
            }
        }
        for (int i3 = 0; i3 < e; i3++) {
            int i4 = iArr[i3];
            eaon y2 = eaptVar.y(i3);
            if (i4 < y2.z(eaptVar, iArr)) {
                throw new eapb(y2.a(), Integer.valueOf(i4), Integer.valueOf(y2.z(eaptVar, iArr)), null);
            }
            if (i4 > y2.D(eaptVar, iArr)) {
                throw new eapb(y2.a(), Integer.valueOf(i4), null, Integer.valueOf(y2.D(eaptVar, iArr)));
            }
        }
    }

    @Override // defpackage.eaok
    public final int[] g(eapt eaptVar, long j) {
        int e = eaptVar.e();
        int[] iArr = new int[e];
        for (int i = 0; i < e; i++) {
            iArr[i] = eaptVar.x(i).c(this).d(j);
        }
        return iArr;
    }

    @Override // defpackage.eaok
    public final long h(eapt eaptVar, long j) {
        int e = eaptVar.e();
        for (int i = 0; i < e; i++) {
            j = eaptVar.x(i).c(this).p(j, eaptVar.g(i));
        }
        return j;
    }

    @Override // defpackage.eaok
    public final int[] i(eapu eapuVar, long j, long j2) {
        int f = eapuVar.f();
        int[] iArr = new int[f];
        if (j != j2) {
            for (int i = 0; i < f; i++) {
                eaox a = eapuVar.g(i).a(this);
                int h = a.h(j2, j);
                j = a.e(j, h);
                iArr[i] = h;
            }
        }
        return iArr;
    }

    @Override // defpackage.eaok
    public final int[] j(eapu eapuVar, long j) {
        int f = eapuVar.f();
        int[] iArr = new int[f];
        long j2 = 0;
        if (j != 0) {
            for (int i = 0; i < f; i++) {
                eaox a = eapuVar.g(i).a(this);
                if (a.c()) {
                    int h = a.h(j, j2);
                    j2 = a.e(j2, h);
                    iArr[i] = h;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.eaok
    public final long k(long j, long j2, int i) {
        return (j2 == 0 || i == 0) ? j : easy.a(j, easy.c(j2, i));
    }

    @Override // defpackage.eaok
    public eaox l() {
        return eatl.j(eaoz.l);
    }

    @Override // defpackage.eaok
    public eaon m() {
        return eatk.K(eaop.y, l());
    }

    @Override // defpackage.eaok
    public eaon n() {
        return eatk.K(eaop.x, l());
    }

    @Override // defpackage.eaok
    public eaox o() {
        return eatl.j(eaoz.k);
    }

    @Override // defpackage.eaok
    public eaon p() {
        return eatk.K(eaop.w, o());
    }

    @Override // defpackage.eaok
    public eaon q() {
        return eatk.K(eaop.v, o());
    }

    @Override // defpackage.eaok
    public eaox r() {
        return eatl.j(eaoz.j);
    }

    @Override // defpackage.eaok
    public eaon s() {
        return eatk.K(eaop.u, r());
    }

    @Override // defpackage.eaok
    public eaon t() {
        return eatk.K(eaop.t, r());
    }

    @Override // defpackage.eaok
    public eaox u() {
        return eatl.j(eaoz.i);
    }

    @Override // defpackage.eaok
    public eaon v() {
        return eatk.K(eaop.s, u());
    }

    @Override // defpackage.eaok
    public eaon w() {
        return eatk.K(eaop.r, u());
    }

    @Override // defpackage.eaok
    public eaox x() {
        return eatl.j(eaoz.h);
    }

    @Override // defpackage.eaok
    public eaon y() {
        return eatk.K(eaop.p, u());
    }

    @Override // defpackage.eaok
    public eaon z() {
        return eatk.K(eaop.q, u());
    }
}
