package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agss  reason: default package */
/* loaded from: classes.dex */
public final class agss {
    private final agnd a;
    private final Executor b;

    public agss(agnd agndVar, Executor executor) {
        this.a = agndVar;
        this.b = executor;
    }

    public static final boolean e(agqv agqvVar, boolean z) {
        if (agqvVar.A() || agqvVar.C() || agqvVar.s()) {
            return false;
        }
        return agqvVar.x() || agqvVar.w() || !agqvVar.b() || !agqvVar.a() || z;
    }

    public final ankt a(agqv agqvVar) {
        agqvVar.getClass();
        return anii.h(this.a.b(agqvVar.m()), new jbv(agqvVar, 5), this.b);
    }

    public final ankt b(agqv agqvVar) {
        if (agqvVar == null || ehi.e(agqvVar.m())) {
            return anlz.q(false);
        }
        return anii.h(this.a.b(agqvVar.m()), new jbv(agqvVar, 6), this.b);
    }

    public final ankt c(agqv agqvVar) {
        if (agqvVar == null || ehi.e(agqvVar.m())) {
            return anlz.q(false);
        }
        return anii.h(this.a.a(agqvVar.m()), new jbv(agqvVar, 3), this.b);
    }

    public final ankt d(agqv agqvVar) {
        if (agqvVar == null || ehi.e(agqvVar.m())) {
            return anlz.q(false);
        }
        return anii.h(this.a.b(agqvVar.m()), new jbv(agqvVar, 4), this.b);
    }
}
