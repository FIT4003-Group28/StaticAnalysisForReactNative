package defpackage;
/* compiled from: PG */
/* renamed from: alyd  reason: default package */
/* loaded from: classes.dex */
public abstract class alyd {
    public static final alyd a = q().A();

    public static alyc q() {
        alvq alvqVar = new alvq();
        alvqVar.t(0);
        alvqVar.x(alxl.m);
        alvqVar.r(0);
        alvqVar.s(0);
        alvqVar.q(2130706432);
        alvqVar.p(0.0f);
        alvqVar.v(0.0f);
        alvqVar.w(0.0f);
        alvqVar.m(0);
        alvqVar.n(0);
        alvqVar.l(0);
        alvqVar.o(0.0f);
        alvqVar.y(dcdc.e());
        alvqVar.z(1);
        alvqVar.k(false);
        alvqVar.u(false);
        return alvqVar;
    }

    public static alyd r(dmvl dmvlVar) {
        int n;
        float e = dmvlVar.e() / 8.0f;
        float r = dmvlVar.r() / 8.0f;
        float s = dmvlVar.s() / 8.0f;
        if (!dmvlVar.p() || dmvlVar.o() == 0) {
            n = dmvlVar.n();
        } else {
            n = dmvlVar.o();
        }
        boolean z = true;
        if (dmvlVar.v() <= 0 && dmvlVar.y() <= 0) {
            z = false;
        }
        dccx F = dcdc.F();
        for (int i = 0; i < dmvlVar.l(); i++) {
            F.g(dmlo.b(dmvlVar.m(i)));
        }
        int q = dmvlVar.q() == 0 ? 2130706432 : dmvlVar.q();
        alyc q2 = q();
        q2.t(dmvlVar.f());
        q2.x(new alxl(dmvlVar.d(), e, new int[0], 0.0f));
        q2.r(dmvlVar.n());
        q2.s(n);
        q2.q(q);
        q2.p(r);
        q2.z(dmst.a(dmvlVar.t()));
        q2.k(dmvlVar.u());
        q2.v(dmvlVar.z());
        q2.w(dmvlVar.A());
        q2.y(F.f());
        q2.m(dmvlVar.g());
        q2.n(dmvlVar.k());
        q2.l(dmvlVar.h());
        q2.o(s);
        q2.u(z);
        return q2.A();
    }

    public static alyd s(dmsu dmsuVar) {
        int i;
        float f = dmsuVar.c / 8.0f;
        float f2 = dmsuVar.m / 8.0f;
        float f3 = dmsuVar.n / 8.0f;
        if ((dmsuVar.a & 128) == 0 || (i = dmsuVar.k) == 0) {
            i = dmsuVar.j;
        }
        int i2 = 1;
        boolean z = dmsuVar.q.size() > 0 || dmsuVar.r.size() > 0;
        dcdc<dmlo> r = dcdc.r(new dsrh(dmsuVar.h, dmsu.i));
        int i3 = dmsuVar.l;
        if (i3 == 0) {
            i3 = 2130706432;
        }
        alyc q = q();
        q.t(dmsuVar.d);
        q.x(new alxl(dmsuVar.b, f, new int[0], 0.0f));
        q.r(dmsuVar.j);
        q.s(i);
        q.q(i3);
        q.p(f2);
        int a2 = dmst.a(dmsuVar.o);
        if (a2 != 0) {
            i2 = a2;
        }
        q.z(i2);
        q.k(dmsuVar.p);
        q.v(dmsuVar.s);
        q.w(dmsuVar.t);
        q.y(r);
        q.m(dmsuVar.e);
        q.n(dmsuVar.g);
        q.l(dmsuVar.f);
        q.o(f3);
        q.u(z);
        return q.A();
    }

    public abstract int a();

    public abstract alxl b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract float f();

    public abstract float g();

    public abstract float h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract float l();

    public abstract dcdc<dmlo> m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract int p();

    public final float t() {
        return Math.max(f() - c(), 0.0f);
    }

    public final float u() {
        return Math.max(f() - d(), 0.0f);
    }

    public final float v() {
        return f() + c();
    }

    public final float w() {
        return f() + d();
    }
}
