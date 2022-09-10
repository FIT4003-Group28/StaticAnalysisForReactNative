package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eapm  reason: default package */
/* loaded from: classes6.dex */
public final class eapm extends eaqg implements Cloneable, Serializable, eapp, eapr {
    private static final long serialVersionUID = 2852608688135209575L;

    public eapm() {
    }

    @Override // defpackage.eaqg
    public final void Th(long j) {
        super.Th(j);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public final void d(eaou eaouVar) {
        eaou e = eaor.e(eaouVar);
        eaou e2 = eaor.e(v());
        if (e == e2) {
            return;
        }
        long r = e2.r(e, this.a);
        this.b = eaor.d(this.b.c(e));
        super.Th(r);
    }

    public final void e() {
        super.Th(this.b.u().e(this.a, 1));
    }

    public final void f() {
        super.Th(this.b.m().p(this.a, 0));
    }

    public final void i() {
        super.Th(this.b.s().p(this.a, 0));
    }

    public final void j() {
        super.Th(this.b.p().p(this.a, 0));
    }

    @Override // defpackage.eaqc
    public final String toString() {
        return eaul.g.f(this);
    }

    public eapm(long j) {
        super(j);
    }

    public eapm(long j, eaou eaouVar) {
        super(j, eaouVar);
    }
}
