package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nqk  reason: default package */
/* loaded from: classes7.dex */
public final class nqk {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqsg.g(nqo.O, cqrp.d(12.0d));

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = nsc.a(cqqx.i(nqo.ae), cqgr.aR(Integer.valueOf(nrk.a)), cqgr.J(true), nsc.s(true), cqgr.az(false), cqgr.M(true), cqgr.N(b()), cqgr.x(d()), cqqx.g(nqo.ad));
        a2.f(cqmpVarArr);
        return a2;
    }

    public static ViewOutlineProvider b() {
        return new nqi();
    }

    public static ViewOutlineProvider c() {
        return new nqj();
    }

    public static cqtd d() {
        return nqu.n(nqo.ad, nql.aM);
    }

    public static cqtd e() {
        return nqu.n(cqrp.d(dcyn.a), nql.aM);
    }

    @SafeVarargs
    @Deprecated
    public static <T extends cqkp> cqmj<T> f(cqkl cqklVar, @dzsi cjtd cjtdVar, cqmj<T> cqmjVar, cqnf<T> cqnfVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(nqo.O), r(cqnfVar, cqgr.bG(nqo.aJ)), cqgr.gd(cqgr.dr(0), t(cqklVar, nqu.s(), false, cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bw(8388627), cqgr.aJ(8388611), cqgr.T(cqrt.l(R.string.BACK_BUTTON)), iue.b(cjtdVar)), cqmjVar), q());
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, cjtd> cqlcVar4, cqlc<T, ?> cqlcVar5, cqmp<T>... cqmpVarArr) {
        return h(cqlcVar, cqlcVar2, p(cqlcVar3, cqlcVar4), cqlcVar5, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqmj<T> cqmjVar, cqlc<T, ?> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(nqo.O), s(cqlcVar3, cqgr.bG(nqo.aJ)), cqgr.gd(cqgr.dr(0), u(cqlcVar, cqkz.a(nqu.s()), false, cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bw(8388627), cqgr.aJ(8388611), cqgr.T(cqrt.l(R.string.BACK_BUTTON)), iue.c(cqlcVar2)), cqmjVar), q());
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    @Deprecated
    public static <T extends cqkp> cqmj<T> i(Boolean bool, cqkl cqklVar, @dzsi cjtd cjtdVar, cqkl cqklVar2, @dzsi cjtd cjtdVar2, CharSequence charSequence, cqmp<T>... cqmpVarArr) {
        cqmj f = f(cqklVar, cjtdVar, t(cqklVar2, nqu.w(), true, cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bw(16), cqgr.aJ(8388613), cqgr.T(cqrt.l(R.string.CLOSE_BUTTON)), iue.b(cjtdVar2)), cqgr.eI(charSequence), cqmpVarArr);
        f.g(cqgr.aG(bool));
        cqmj l = l(cqklVar2, cjtdVar2, cqgr.eI(charSequence), cqmpVarArr);
        l.g(cqgr.aD(bool));
        return cqgr.fY(f, l);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> j(cqlc<T, Boolean> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqlc<T, View.OnClickListener> cqlcVar4, cqlc<T, cjtd> cqlcVar5, cqlc<T, ?> cqlcVar6, cqmp<T>... cqmpVarArr) {
        cqmj h = h(cqlcVar2, cqlcVar3, p(cqlcVar4, cqlcVar5), cqlcVar6, cqmpVarArr);
        h.g(cqgr.aI(cqlcVar));
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(nqo.O), s(cqlcVar6, cqgr.bR(nqo.aO), cqgr.bG(nqo.aJ)), u(cqlcVar4, cqkz.a(nqu.w()), true, cqgr.cd(-1), cqgr.bw(8388629), cqgr.aJ(8388613), cqgr.T(cqrt.l(R.string.CLOSE_BUTTON)), iue.c(cqlcVar5)), q());
        fY.f(cqmpVarArr);
        fY.g(cqgr.aF(cqlcVar));
        return cqgr.fY(h, fY);
    }

    public static <T extends cqkp> cqmj<T> k(cqlc<T, Boolean> cqlcVar, cqlc<T, Boolean> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, cjtd> cqlcVar4, cqlc<T, View.OnClickListener> cqlcVar5, cqlc<T, cjtd> cqlcVar6, cqlc<T, CharSequence> cqlcVar7, cqlc<T, View.OnClickListener> cqlcVar8, cqlc<T, cjtd> cqlcVar9, cqlc<T, cqtd> cqlcVar10, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(nqo.O), r(cqgr.eM(cqlcVar7), cqgr.bG(cqsg.d(nqo.aJ, nqo.Y))), u(cqlcVar3, cqkz.a(nqu.s()), false, cqgr.bw(8388627), cqgr.aJ(8388611), cqgr.T(cqrt.l(R.string.BACK_BUTTON)), iue.c(cqlcVar4), cqic.f(cqlcVar, new cqmp[0])), u(cqlcVar8, cqlcVar10, false, cqgr.bw(16), cqgr.bw(8388613), cqgr.bG(cqrp.d(64.0d)), iue.c(cqlcVar9), cqic.f(cqlcVar2, new cqmp[0])), u(cqlcVar5, cqkz.a(nqu.w()), true, cqgr.bw(16), cqgr.bw(8388613), cqgr.T(cqrt.l(R.string.CLOSE_BUTTON)), iue.c(cqlcVar6)), q());
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    @Deprecated
    public static <T extends cqkp> cqmj<T> l(cqkl cqklVar, @dzsi cjtd cjtdVar, cqnf<T> cqnfVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(nqo.O), r(cqnfVar, cqgr.bR(nqo.aO), cqgr.bG(nqo.aJ)), t(cqklVar, nqu.w(), true, cqgr.cd(-1), cqgr.bw(8388629), cqgr.aJ(8388613), cqgr.T(cqrt.l(R.string.CLOSE_BUTTON)), iue.b(cjtdVar)), q());
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> m(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqlc<T, CharSequence> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(nqo.O), u(cqlcVar, cqkz.a(nqu.s()), false, cqgr.cd(-1), cqgr.bw(8388627), cqgr.aJ(8388611), cqgr.T(cqrt.l(R.string.BACK_BUTTON)), iue.c(cqlcVar2)), s(cqlcVar3, cqgr.bG(nqo.ab)), q());
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> n(cqnf<T> cqnfVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.bR(nqo.aa), cqgr.aJ(8388627), cqnfVar, cqgr.ar(TextUtils.TruncateAt.END), nre.j(), cqgr.cB(1));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> o(final cqlc<T, View.OnClickListener> cqlcVar, cqnf<T> cqnfVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gj = cqgr.gj(cqgr.cd(-2), cqgr.bp(-2), itj.h(cqlcVar), cqgr.aB(nqd.a), cqgr.aa(false), cqgr.gc(cqgr.ce(nqo.aa), cqgr.bq(nqo.aa), cqgr.ei(ImageView.ScaleType.CENTER), cqnfVar), cqgr.fY(cqgr.am(true), cqgr.bq(cqrp.d(60.0d)), cqgr.ce(cqrp.d(60.0d)), cqgr.bA(cqrp.d(6.0d)), nqu.j(nqe.a, null, false, cqrp.d(60.0d))));
        gj.f(cqmpVarArr);
        gj.g(cqgr.K(new cqlc(cqlcVar) { // from class: nqf
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                int i = nqk.a;
                return Boolean.valueOf(!cqjv.v((View.OnClickListener) cqlcVar2.a(cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        return gj;
    }

    private static <T extends cqkp> cqmj<T> p(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2) {
        return u(cqlcVar, cqkz.a(nqu.w()), true, cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bw(16), cqgr.aJ(8388613), cqgr.T(cqrt.l(R.string.CLOSE_BUTTON)), iue.c(cqlcVar2));
    }

    private static <T extends cqkp> cqmj<T> q() {
        return nsc.d(cqgr.bw(80));
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> r(cqnf<T> cqnfVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.bR(nqo.aa), cqgr.cd(-2), cqgr.aJ(8388627), cqnfVar, nre.j(), cqgr.cB(1));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> s(cqlc<T, ?> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.bR(nqo.aa), cqgr.cd(-2), cqgr.aJ(8388627), cqgr.eM(cqlcVar), nre.j(), cqgr.cB(1));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    @Deprecated
    private static <T extends cqkp> cqmj<T> t(cqkl cqklVar, @dzsi cqtd cqtdVar, boolean z, cqmp<T>... cqmpVarArr) {
        cqrp cqrpVar = z ? nqo.aJ : nqo.aa;
        cqmp[] cqmpVarArr2 = {cqgr.ce(cqrpVar), cqgr.bq(nqo.O), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqtdVar)};
        cqtv cqtvVar = b;
        cqmj<T> gj = cqgr.gj(cqgr.cd(-2), cqgr.bp(-2), itj.g(cqklVar), cqgr.az(npv.a()), cqgr.aa(false), cqgr.gc(cqmpVarArr2), cqgr.fY(cqgr.am(true), cqgr.ce(cqrpVar), cqgr.bq(nqo.O), cqgr.fY(cqgr.am(true), cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.bw(17), nqu.h(npv.a(), null, false, nqo.aa))));
        gj.f(cqmpVarArr);
        return gj;
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> u(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cqtd> cqlcVar2, boolean z, cqmp<T>... cqmpVarArr) {
        cqrp cqrpVar = z ? nqo.aJ : nqo.aa;
        cqmp[] cqmpVarArr2 = {cqgr.ce(cqrpVar), cqgr.bq(nqo.O), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eG(cqlcVar2)};
        cqtv cqtvVar = b;
        cqmj<T> gj = cqgr.gj(cqgr.cd(-2), cqgr.bp(-2), itj.h(cqlcVar), cqgr.aB(nqg.a), cqgr.aa(false), cqgr.gc(cqmpVarArr2), cqgr.fY(cqgr.am(true), cqgr.ce(cqrpVar), cqgr.bq(nqo.O), cqgr.fY(cqgr.am(true), cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.bw(17), nqu.j(nqh.a, null, false, nqo.aa))));
        gj.f(cqmpVarArr);
        return gj;
    }
}
