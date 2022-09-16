package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bahm  reason: default package */
/* loaded from: classes2.dex */
public final class bahm extends baim implements Serializable, baig {
    private static final long serialVersionUID = -5171125899451703815L;

    public bahm() {
    }

    public final bahm a(int i) {
        return i == 0 ? this : e(this.b.F().b(this.a, i));
    }

    public final bahm b(int i) {
        return i == 0 ? this : e(this.b.G().b(this.a, i));
    }

    public final bahm c(int i) {
        return e(this.b.f().h(this.a, i));
    }

    public final bahm d(int i) {
        return e(this.b.k().h(this.a, i));
    }

    public final bahm e(long j) {
        return j == this.a ? this : new bahm(j, this.b);
    }

    public final bahm f(int i) {
        return e(this.b.p().h(this.a, i));
    }

    public final bahm g(int i) {
        return e(this.b.q().h(this.a, i));
    }

    public final bahm h(int i) {
        return e(this.b.w().h(this.a, i));
    }

    public final bahm i() {
        return e(this.b.B().b(this.a, 1));
    }

    public final bahm j() {
        return e(this.b.s().h(this.a, 0));
    }

    public bahm(long j) {
        super(j, bajl.O());
    }

    public bahm(long j, bahl bahlVar) {
        super(j, bahlVar);
    }

    public bahm(long j, baht bahtVar) {
        super(j, bahtVar);
    }

    public bahm(baht bahtVar) {
        super(bahq.a(), bajl.P(bahtVar));
    }
}
