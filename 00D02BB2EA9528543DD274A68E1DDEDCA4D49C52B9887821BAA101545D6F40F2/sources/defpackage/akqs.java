package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: akqs  reason: default package */
/* loaded from: classes.dex */
public class akqs implements Serializable {
    public final akqq a;
    public final akqq b;

    public akqs() {
        this.b = new akqq();
        this.a = new akqq();
    }

    public static akqr a() {
        return new akqr();
    }

    public static akqs d(dgrt dgrtVar) {
        dgrn dgrnVar = dgrtVar.b;
        if (dgrnVar == null) {
            dgrnVar = dgrn.d;
        }
        akqq m = akqq.m(dgrnVar);
        dgrn dgrnVar2 = dgrtVar.c;
        if (dgrnVar2 == null) {
            dgrnVar2 = dgrn.d;
        }
        try {
            return new akqs(m, akqq.m(dgrnVar2));
        } catch (IllegalArgumentException e) {
            bvoo.f(e);
            return new akqs(new akqq(dcyn.a, dcyn.a), new akqq(dcyn.a, dcyn.a));
        }
    }

    public static double h(akqs akqsVar, akqs akqsVar2) {
        akqs akqsVar3;
        dbsk.s(akqsVar);
        dbsk.s(akqsVar2);
        if (!akqsVar.i(akqsVar2)) {
            akqsVar3 = null;
        } else {
            akqsVar3 = new akqs(new akqq(Math.max(akqsVar.a.a, akqsVar2.a.a), akqsVar.m(akqsVar2.a.b) ? akqsVar2.a.b : akqsVar.a.b), new akqq(Math.min(akqsVar.b.a, akqsVar2.b.a), akqsVar.m(akqsVar2.b.b) ? akqsVar2.b.b : akqsVar.b.b));
        }
        return akqsVar3 == null ? dcyn.a : akqsVar3.g();
    }

    private final boolean m(double d) {
        double d2 = this.a.b;
        double d3 = this.b.b;
        return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public final boolean b(akqq akqqVar) {
        double d = akqqVar.a;
        return this.a.a <= d && d <= this.b.a && m(akqqVar.b);
    }

    public final akqq c() {
        akqq akqqVar = this.b;
        double d = akqqVar.a;
        akqq akqqVar2 = this.a;
        double d2 = akqqVar2.a;
        double d3 = akqqVar2.b;
        return new akqq((d + d2) / 2.0d, d3 + (akqo.g(d3, akqqVar.b) / 2.0d));
    }

    public final dgrt e() {
        dgrs bZ = dgrt.d.bZ();
        dgrn n = this.a.n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgrt dgrtVar = (dgrt) bZ.b;
        n.getClass();
        dgrtVar.b = n;
        dgrtVar.a |= 1;
        dgrn n2 = this.b.n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgrt dgrtVar2 = (dgrt) bZ.b;
        n2.getClass();
        dgrtVar2.c = n2;
        dgrtVar2.a |= 2;
        return bZ.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akqs)) {
            return false;
        }
        akqs akqsVar = (akqs) obj;
        return this.a.equals(akqsVar.a) && this.b.equals(akqsVar.b);
    }

    public final dcvu f() {
        return dcvu.f(this.a.u(), this.b.u());
    }

    public final double g() {
        return Math.toRadians(akqo.g(this.a.b, this.b.b)) * Math.abs(Math.sin(Math.toRadians(this.b.a)) - Math.sin(Math.toRadians(this.a.a)));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final boolean i(akqs akqsVar) {
        if (this.b.a < akqsVar.a.a) {
            return false;
        }
        double d = this.a.a;
        akqq akqqVar = akqsVar.b;
        if (d > akqqVar.a) {
            return false;
        }
        return m(akqqVar.b) || m(akqsVar.a.b) || akqsVar.m(this.b.b) || akqsVar.m(this.a.b);
    }

    public final akqq j() {
        return new akqq(this.b.a, this.a.b);
    }

    public final akqq k() {
        return new akqq(this.a.a, this.b.b);
    }

    public final dpuq l() {
        dpup bZ = dpuq.d.bZ();
        dpum h = this.a.h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpuq dpuqVar = (dpuq) bZ.b;
        h.getClass();
        dpuqVar.b = h;
        dpuqVar.a |= 1;
        dpum h2 = this.b.h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpuq dpuqVar2 = (dpuq) bZ.b;
        h2.getClass();
        dpuqVar2.c = h2;
        dpuqVar2.a |= 2;
        return bZ.bK();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("southwest", this.a);
        b.b("northeast", this.b);
        return b.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public akqs(defpackage.akqq r17, double r18, double r20) {
        /*
            r16 = this;
            r0 = r17
            akqq r1 = new akqq
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r18 / r2
            double r2 = r20 / r2
            double r6 = r0.a
            double r6 = r6 - r4
            double r8 = r0.b
            double r8 = r8 - r2
            r10 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r8 = r8 + r10
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r8 = r8 % r12
            r14 = -4582834833314545664(0xc066800000000000, double:-180.0)
            double r8 = r8 + r14
            r1.<init>(r6, r8)
            akqq r6 = new akqq
            double r7 = r0.a
            double r7 = r7 + r4
            double r4 = r0.b
            double r4 = r4 + r2
            double r4 = r4 + r10
            double r4 = r4 % r12
            double r4 = r4 + r14
            r6.<init>(r7, r4)
            r0 = r16
            r0.<init>(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqs.<init>(akqq, double, double):void");
    }

    public akqs(akqq akqqVar, akqq akqqVar2) {
        dbsk.t(akqqVar, "Null southwest");
        dbsk.t(akqqVar2, "Null northeast");
        double d = akqqVar2.a;
        double d2 = akqqVar.a;
        dbsk.j(d >= d2, "Southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(akqqVar2.a));
        this.a = akqqVar;
        this.b = akqqVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public akqs(defpackage.dpuq r7) {
        /*
            r6 = this;
            akqq r0 = new akqq
            dpum r1 = r7.b
            if (r1 != 0) goto L8
            dpum r1 = defpackage.dpum.d
        L8:
            double r1 = r1.b
            dpum r3 = r7.b
            if (r3 != 0) goto L10
            dpum r3 = defpackage.dpum.d
        L10:
            double r3 = r3.c
            r0.<init>(r1, r3)
            akqq r1 = new akqq
            dpum r2 = r7.c
            if (r2 != 0) goto L1d
            dpum r2 = defpackage.dpum.d
        L1d:
            double r2 = r2.b
            dpum r7 = r7.c
            if (r7 != 0) goto L25
            dpum r7 = defpackage.dpum.d
        L25:
            double r4 = r7.c
            r1.<init>(r2, r4)
            r6.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqs.<init>(dpuq):void");
    }
}
