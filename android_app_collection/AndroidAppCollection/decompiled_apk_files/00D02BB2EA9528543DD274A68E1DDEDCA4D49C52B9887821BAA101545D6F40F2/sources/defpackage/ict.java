package defpackage;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: ict  reason: default package */
/* loaded from: classes.dex */
public final class ict {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(@dzsi cqtd cqtdVar, cqmp<T>... cqmpVarArr) {
        return c(cqtdVar, ibn.b(), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, cqtd> cqlcVar, cqmp<T>... cqmpVarArr) {
        return d(cqlcVar, cqkz.a(ibn.b()), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(@dzsi cqtd cqtdVar, cqtv cqtvVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gc = cqgr.gc(cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.eE(cqtdVar));
        gc.f(cqmpVarArr);
        return gc;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqlc<T, cqtd> cqlcVar, cqlc<T, ? extends cqtv> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> gc = cqgr.gc(cqgr.cg(cqlcVar2), cqgr.bs(cqlcVar2), cqgr.eG(cqlcVar));
        gc.f(cqmpVarArr);
        return gc;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, jic> cqlcVar, cqmp<T>... cqmpVarArr) {
        return f(cqlcVar, cqkz.a(ibn.b()), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqlc<T, jic> cqlcVar, cqlc<T, cqtv> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> a = WebImageView.a(cqgr.cg(cqlcVar2), cqgr.bs(cqlcVar2), WebImageView.l(cqlcVar));
        a.f(cqmpVarArr);
        return a;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(@dzsi cqtd cqtdVar, @dzsi cqss cqssVar, cqmp<T>... cqmpVarArr) {
        cqtv b = ibn.b();
        cqrp d = cqrp.d(6.0d);
        cqmj<T> a = jfx.a(cqgr.ce(ibn.b()), cqgr.bq(ibn.b()), c(cqtdVar, b, cqgr.z(cqssVar), cqgr.dz(d, d, d, d)));
        a.f(cqmpVarArr);
        return a;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(cqlc<T, cqtd> cqlcVar, cqlc<T, cqss> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqlc a = cqkz.a(ibn.b());
        cqrp d = cqrp.d(6.0d);
        cqmj<T> a2 = jfx.a(cqgr.ce(ibn.b()), cqgr.bq(ibn.b()), d(cqlcVar, a, cqgr.B(cqlcVar2), cqgr.dz(d, d, d, d)));
        a2.f(cqmpVarArr);
        return a2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> i(cqlc<T, cqsn> cqlcVar, final cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> d = hyb.d(cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(ibn.a()), ibn.s(), cqgr.aJ(17), cqgr.az(true), cqgr.cW(cqlcVar2), cqgr.K(new cqlc(cqlcVar2) { // from class: icp
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(!cqjv.v((View.OnClickListener) this.a.a(cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), iue.c(cqlcVar3), cqgr.aZ(false), ibq.z(), ibq.r(), cqgr.cj(Float.valueOf(0.01f)), cqgr.eU(iva.b(ibl.H(), ibl.af())), cqgr.eM(cqlcVar));
        d.f(cqmpVarArr);
        return d;
    }

    public static <T extends cqkp> cqmj<T> j(cqlc<T, Boolean> cqlcVar, cqlc<T, Boolean> cqlcVar2, cqmj<T> cqmjVar, cqmj<T> cqmjVar2) {
        cqjg a = cqjg.a();
        cqjg a2 = cqjg.a();
        cqmjVar.g(cqgr.aT(a));
        cqmjVar2.g(cqgr.aT(a2));
        return cqgr.gv(cqgr.cd(-2), cqgr.bp(-2), cqgr.aF(cqlcVar), cqgr.o(false), cqgr.aY(r(0.0f, 1.0f)), cqgr.du(r(1.0f, 0.0f)), cqjv.l(cqlcVar2, cqgr.ac(a), cqgr.ac(a2)), cqmjVar, cqmjVar2);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> k(cqtv cqtvVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> t = itj.t(cqgr.bR(cqtvVar), cqgr.z(ibl.az()), cqgr.bq(ibn.B()));
        t.f(cqmpVarArr);
        return t;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> l(cqlc<T, cqtv> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> t = itj.t(cqgr.bT(cqlcVar), cqgr.z(ibl.az()), cqgr.bq(ibn.B()));
        t.f(cqmpVarArr);
        return t;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> m(final cqlc<T, Boolean> cqlcVar, cqmp<T>... cqmpVarArr) {
        return l(new cqlc(cqlcVar) { // from class: icq
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((Boolean) ((cqlb) this.a).a).booleanValue() ? ibn.t() : cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> n(boolean z, cqmp<T>... cqmpVarArr) {
        return k(z ? ibn.t() : cqrp.d(dcyn.a), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqiw<T> o(cqtv cqtvVar, cqmp<T>... cqmpVarArr) {
        return new ics(cqtvVar, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqiw<T> p(boolean z, cqmp<T>... cqmpVarArr) {
        return new ics(Boolean.valueOf(z), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> q(cqmp<T>... cqmpVarArr) {
        cqmj<T> w = itj.w(cqgr.bV(cqrp.d(12.0d)), cqgr.bD(cqrp.d(12.0d)), cqgr.z(iva.b(ibl.i(), ibl.s())), cqgr.ce(cqrp.d(1.0d)));
        w.f(cqmpVarArr);
        return w;
    }

    private static Animation r(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(irf.a);
        return alphaAnimation;
    }
}
