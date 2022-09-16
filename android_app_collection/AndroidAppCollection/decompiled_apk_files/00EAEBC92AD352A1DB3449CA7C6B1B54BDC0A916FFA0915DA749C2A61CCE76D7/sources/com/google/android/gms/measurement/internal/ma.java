package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ma extends na {

    /* renamed from: g  reason: collision with root package name */
    private c.e.a.b.d.g.u0 f7509g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ga f7510h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(ga gaVar, String str, int i, c.e.a.b.d.g.u0 u0Var) {
        super(str, i);
        this.f7510h = gaVar;
        this.f7509g = u0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.na
    public final int a() {
        return this.f7509g.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Long l, Long l2, c.e.a.b.d.g.q1 q1Var, boolean z) {
        b4 v;
        String c2;
        String str;
        Boolean a2;
        boolean z2 = c.e.a.b.d.g.x9.a() && this.f7510h.l().d(this.f7534a, r.e0);
        boolean r = this.f7509g.r();
        boolean s = this.f7509g.s();
        boolean u = this.f7509g.u();
        boolean z3 = r || s || u;
        Boolean bool = null;
        Integer num = null;
        bool = null;
        if (z && !z3) {
            b4 B = this.f7510h.c().B();
            Integer valueOf = Integer.valueOf(this.f7535b);
            if (this.f7509g.n()) {
                num = Integer.valueOf(this.f7509g.o());
            }
            B.a("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        c.e.a.b.d.g.s0 q = this.f7509g.q();
        boolean s2 = q.s();
        if (q1Var.s()) {
            if (!q.p()) {
                v = this.f7510h.c().v();
                c2 = this.f7510h.i().c(q1Var.p());
                str = "No number filter for long property. property";
                v.a(str, c2);
            } else {
                a2 = na.a(q1Var.t(), q.q());
                bool = na.a(a2, s2);
            }
        } else if (!q1Var.u()) {
            if (q1Var.q()) {
                if (q.n()) {
                    a2 = na.a(q1Var.r(), q.o(), this.f7510h.c());
                } else if (!q.p()) {
                    v = this.f7510h.c().v();
                    c2 = this.f7510h.i().c(q1Var.p());
                    str = "No string or number filter defined. property";
                } else if (v9.a(q1Var.r())) {
                    a2 = na.a(q1Var.r(), q.q());
                } else {
                    this.f7510h.c().v().a("Invalid user property value for Numeric number filter. property, value", this.f7510h.i().c(q1Var.p()), q1Var.r());
                }
                bool = na.a(a2, s2);
            } else {
                v = this.f7510h.c().v();
                c2 = this.f7510h.i().c(q1Var.p());
                str = "User property has no value, property";
            }
            v.a(str, c2);
        } else if (!q.p()) {
            v = this.f7510h.c().v();
            c2 = this.f7510h.i().c(q1Var.p());
            str = "No number filter for double property. property";
            v.a(str, c2);
        } else {
            a2 = na.a(q1Var.v(), q.q());
            bool = na.a(a2, s2);
        }
        this.f7510h.c().B().a("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f7536c = true;
        if (u && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.f7509g.r()) {
            this.f7537d = bool;
        }
        if (bool.booleanValue() && z3 && q1Var.n()) {
            long o = q1Var.o();
            if (l != null) {
                o = l.longValue();
            }
            if (z2 && this.f7509g.r() && !this.f7509g.s() && l2 != null) {
                o = l2.longValue();
            }
            if (this.f7509g.s()) {
                this.f7539f = Long.valueOf(o);
            } else {
                this.f7538e = Long.valueOf(o);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.na
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.na
    public final boolean c() {
        return false;
    }
}
