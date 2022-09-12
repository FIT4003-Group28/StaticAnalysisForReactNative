package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nre  reason: default package */
/* loaded from: classes7.dex */
public final class nre {
    public static final Typeface a = cqgm.e;
    public static final Typeface b = cqgm.d;

    public static final <T extends cqkp> cqmn<T> a() {
        return cqmn.a(cqgr.aw(a), cqgr.ar(TextUtils.TruncateAt.END));
    }

    public static final cqvj b() {
        return cqvh.a(cqgm.e);
    }

    public static <T extends cqkp> cqmn<T> c(cqlc<T, cqss> cqlcVar) {
        return cqmn.a(cqjv.j(cqfe.TEXT_TYPEFACE, new nqx()), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eW(cqlcVar), cqgr.fh(nqo.d));
    }

    public static <T extends cqkp> cqmn<T> d(cqss cqssVar) {
        nrb k = nrc.k(ibq.F());
        k.n(nqo.e, nqo.f);
        k.b(nql.bn);
        k.l(TextUtils.TruncateAt.END);
        k.f(0.0f);
        k.b(cqssVar);
        return k.m();
    }

    public static <T extends cqkp> cqmn<T> e() {
        return nrd.e().m();
    }

    public static <T extends cqkp> cqmn<T> f(cqss cqssVar) {
        nrb e = nrd.e();
        e.b(cqssVar);
        return e.m();
    }

    public static <T extends cqkp> cqmn<T> g() {
        return nrd.f().m();
    }

    public static <T extends cqkp> cqmn<T> h(cqss cqssVar) {
        nrb f = nrd.f();
        f.b(cqssVar);
        return f.m();
    }

    public static <T extends cqkp> cqmn<T> i() {
        return h(nql.aW);
    }

    public static <T extends cqkp> cqmn<T> j() {
        return nrd.g().m();
    }

    public static <T extends cqkp> cqmn<T> k(cqss cqssVar) {
        nrb g = nrd.g();
        g.b(cqssVar);
        return g.m();
    }

    public static <T extends cqkp> cqmn<T> l(cqlc<T, cqss> cqlcVar) {
        nrb g = nrd.g();
        g.d(cqlcVar);
        return g.m();
    }

    public static <T extends cqkp> cqmn<T> m() {
        return k(nql.aX);
    }

    public static <T extends cqkp> cqmn<T> n() {
        return nrd.a().m();
    }

    public static <T extends cqkp> cqmn<T> o(cqtv cqtvVar, cqtv cqtvVar2) {
        nrb a2 = nrd.a();
        a2.i(cqtvVar);
        a2.g(cqtvVar2);
        return a2.m();
    }

    public static <T extends cqkp> cqmn<T> p(cqss cqssVar) {
        nrb a2 = nrd.a();
        a2.b(cqssVar);
        return a2.m();
    }

    public static <T extends cqkp> cqmn<T> q(cqss cqssVar, cqrp cqrpVar) {
        nrb a2 = nrd.a();
        a2.b(cqssVar);
        a2.n(cqrpVar, nqo.p);
        return a2.m();
    }

    public static <T extends cqkp> cqmn<T> r() {
        return nrd.b().m();
    }

    public static <T extends cqkp> cqmn<T> s(cqtv cqtvVar, cqtv cqtvVar2) {
        nrb b2 = nrd.b();
        b2.i(cqtvVar);
        b2.g(cqtvVar2);
        return b2.m();
    }

    public static <T extends cqkp> cqmn<T> t(dbsg<? extends cqtv> dbsgVar, dbsg<? extends cqtv> dbsgVar2) {
        nrb b2 = nrd.b();
        b2.j(dbsgVar);
        b2.h(dbsgVar2);
        return b2.m();
    }

    public static <T extends cqkp> cqmn<T> u(cqss cqssVar) {
        nrb b2 = nrd.b();
        b2.b(cqssVar);
        return b2.m();
    }

    public static <T extends cqkp> cqmn<T> v(cqss cqssVar, cqrp cqrpVar) {
        nrb b2 = nrd.b();
        b2.b(cqssVar);
        b2.n(cqrpVar, nqo.r);
        return b2.m();
    }

    public static <T extends cqkp> cqmn<T> w() {
        return nrd.d().m();
    }

    public static <T extends cqkp> cqmn<T> x(cqss cqssVar) {
        nrb d = nrd.d();
        d.b(cqssVar);
        return d.m();
    }

    public static cqtv y(final cqtv cqtvVar, dbsg<? extends cqtv> dbsgVar) {
        return (cqtv) dbsgVar.h(new dbrn(cqtvVar) { // from class: nqw
            private final cqtv a;

            {
                this.a = cqtvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cqtv cqtvVar2 = this.a;
                Typeface typeface = nre.a;
                return cqsg.d(cqtvVar2, (cqtv) obj);
            }
        }).c(cqtvVar);
    }
}
