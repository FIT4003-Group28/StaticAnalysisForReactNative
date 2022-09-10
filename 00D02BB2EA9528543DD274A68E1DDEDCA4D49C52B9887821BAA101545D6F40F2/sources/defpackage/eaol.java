package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaol  reason: default package */
/* loaded from: classes.dex */
public final class eaol extends eaqg implements Serializable, eapp {
    private static final long serialVersionUID = -5171125899451703815L;

    public eaol() {
    }

    public static eaol a() {
        return new eaol();
    }

    public static eaol b(eaou eaouVar) {
        if (eaouVar == null) {
            throw new NullPointerException("Zone must not be null");
        }
        return new eaol(eaouVar);
    }

    @Override // defpackage.eaqc
    public final eaol c() {
        return this;
    }

    public final eaol d(eaou eaouVar) {
        eaou e = eaor.e(eaouVar);
        if (v() == e) {
            return this;
        }
        return new eaol(this.a, eaor.d(this.b).c(e));
    }

    public final eaol e(long j) {
        return j == this.a ? this : new eaol(j, this.b);
    }

    public final eaol f(eaou eaouVar) {
        eaok d = eaor.d(this.b.c(eaouVar));
        return d == this.b ? this : new eaol(this.a, d);
    }

    public final eaol g() {
        return p().m(v());
    }

    public final eaol h(eapt eaptVar) {
        return e(this.b.h(eaptVar, this.a));
    }

    public final eaol i(eapq eapqVar, int i) {
        if (eapqVar != null && i != 0) {
            long j = ((eaqh) eapqVar).b;
            if (j != 0 && i != 0) {
                return e(this.b.k(this.a, j, i));
            }
        }
        return this;
    }

    public final eaol j(eapq eapqVar) {
        return i(eapqVar, 1);
    }

    public final eaol k(int i) {
        return i == 0 ? this : e(this.b.B().e(this.a, i));
    }

    public final eaol l(int i) {
        return e(this.b.r().e(this.a, i));
    }

    public final eaol m(int i) {
        return i == 0 ? this : e(this.b.o().e(this.a, i));
    }

    public final eaol n(eapq eapqVar) {
        return i(eapqVar, -1);
    }

    public final eaph o() {
        return new eaph(this.a, this.b);
    }

    public final eapg p() {
        return new eapg(this.a, this.b);
    }

    public final eaol q(int i) {
        return e(this.b.C().p(this.a, i));
    }

    public final eaol r() {
        return e(this.b.B().g(this.a, 1));
    }

    public final eaol s() {
        return e(this.b.l().e(this.a, 1));
    }

    public final eaol t() {
        return e(this.b.m().p(this.a, 0));
    }

    public final eaol u() {
        return e(this.b.p().p(this.a, 0));
    }

    public eaol(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5);
    }

    public eaol(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        super(i, i2, i3, i4, i5);
    }

    public eaol(int i, int i2, int i3, int i4, int i5, int i6, int i7, eaok eaokVar) {
        super(i, i2, i3, i4, i5, i6, i7, eaokVar);
    }

    public eaol(int i, int i2, int i3, int i4, int i5, int i6, int i7, eaou eaouVar) {
        super(i, i2, i3, i4, i5, i6, i7, eaouVar);
    }

    public eaol(int i, int i2, int i3, int i4, int i5, int i6, eaou eaouVar) {
        super(i, i2, i3, i4, i5, i6, 0, eaouVar);
    }

    public eaol(int i, int i2, int i3, int i4, int i5, eaou eaouVar) {
        super(i, i2, i3, i4, i5, 0, 0, eaouVar);
    }

    public eaol(long j) {
        super(j);
    }

    public eaol(long j, eaok eaokVar) {
        super(j, eaokVar);
    }

    public eaol(long j, eaou eaouVar) {
        super(j, eaouVar);
    }

    public eaol(Object obj) {
        super(obj);
    }

    public eaol(Object obj, eaou eaouVar) {
        super(obj, eaouVar);
    }

    public eaol(eaou eaouVar) {
        super(eaor.a(), earp.X(eaouVar));
    }
}
