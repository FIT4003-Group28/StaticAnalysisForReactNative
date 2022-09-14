package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaow  reason: default package */
/* loaded from: classes.dex */
public final class eaow extends eaqh implements Serializable, eapq {
    public static final eaow a = new eaow(0);
    private static final long serialVersionUID = 2471658376918L;

    public eaow(long j) {
        super(j);
    }

    public static eaow a(long j) {
        return new eaow(easy.c(j, 86400000));
    }

    public static eaow b(long j) {
        return new eaow(easy.c(j, 3600000));
    }

    public static eaow c(long j) {
        return j == 0 ? a : new eaow(easy.c(j, 60000));
    }

    public static eaow d(long j) {
        return j == 0 ? a : new eaow(easy.c(j, 1000));
    }

    public static eaow e(long j) {
        return j == 0 ? a : new eaow(j);
    }

    public final long f() {
        return this.b / 60000;
    }

    public final long g() {
        return this.b / 1000;
    }

    @Override // defpackage.eaqb, defpackage.eapq
    public final eaow h() {
        return this;
    }

    public final eaow i(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return new eaow(easy.a(this.b, easy.c(j, i)));
    }

    public final eaow j(eapq eapqVar) {
        return i(((eaqh) eapqVar).b, 1);
    }

    public final eaow k(eapq eapqVar) {
        return eapqVar == null ? this : i(eapqVar.o(), -1);
    }

    public final eaow l(long j) {
        return new eaow(this.b / j);
    }

    public final eaow m() {
        if (this.b == Long.MIN_VALUE) {
            throw new ArithmeticException("Negation of this duration would overflow");
        }
        return new eaow(-this.b);
    }

    public final void n() {
        long j = this.b;
    }

    public eaow(long j, long j2) {
        super(j, j2);
    }

    public eaow(eapr eaprVar, eapr eaprVar2) {
        super(eaprVar, eaprVar2);
    }
}
