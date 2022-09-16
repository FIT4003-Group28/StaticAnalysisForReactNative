package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: ujx  reason: default package */
/* loaded from: classes7.dex */
public final class ujx {
    private static final cqtv a = cqrp.d(24.0d);
    private static final cqtv b = cqrp.d(24.0d);
    private static final cqtv c = cqrp.d(60.0d);
    private static final cqtv d = cqrp.d(36.0d);
    private static final cqtv e = cqrp.d(93.0d);
    private static final cqtv f = cqrp.d(6.0d);
    private static final cqtv g = cqrp.d(10.0d);
    private static final cqtv h = cqrp.d(233.0d);

    public static <T extends umc> cqmj<T> a(cqlc<T, CharSequence> cqlcVar, cqlc<T, cqtd> cqlcVar2, final boolean z, cqlc<T, cqss> cqlcVar3, cqmp<T> cqmpVar) {
        cqmp[] cqmpVarArr = new cqmp[10];
        cqmpVarArr[0] = cqgr.dr(0);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-2);
        cqmpVarArr[3] = cqgr.dU(ibn.f());
        cqmpVarArr[4] = cqgr.dQ(ibn.f());
        cqmpVarArr[5] = cqgr.az(true);
        cqmpVarArr[6] = cqjv.l(new cqlc(z) { // from class: ujp
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(ujx.c((umc) cqkpVar, this.a));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqgr.dB(a), cqgr.dC(0));
        cqmpVarArr[7] = cqgr.cH(c);
        cqtv cqtvVar = b;
        cqmpVarArr[8] = cqgr.gd(cqgr.aF(cqjv.x(cqlcVar2)), cqgr.dr(1), cqgr.bp(-1), cqgr.bR(ibn.d()), cqgr.bG(ibn.d()), cqgr.gc(cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.bw(48), cqgr.eG(cqlcVar2)), iuh.c(cqgr.aF(new cqlc(z) { // from class: ujq
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(ujx.c((umc) cqkpVar, this.a));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bV(ibn.d()), cqgr.bw(17)));
        cqmp[] cqmpVarArr2 = new cqmp[6];
        cqmpVarArr2[0] = cqgr.dr(1);
        cqmpVarArr2[1] = cqgr.cd(-1);
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = d(cqlcVar, cqlcVar3, cqmpVar);
        cqmpVarArr2[4] = cqgr.dE(new cqlc(z) { // from class: ujr
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                umc umcVar = (umc) cqkpVar;
                return (ujx.c(umcVar, this.a) || !umcVar.d().booleanValue()) ? cqrp.d(dcyn.a) : ibn.d();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[5] = z ? cqmp.e : e();
        cqmpVarArr[9] = cqgr.gd(cqmpVarArr2);
        return cqgr.gd(cqmpVarArr);
    }

    public static <T extends cqkp> cqmj<T> b(cqmj<T> cqmjVar, cqmj<T> cqmjVar2) {
        return cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(cqrp.d(80.0d)), cqgr.dQ(ibn.f()), cqgr.az(true), cqmjVar, cqmjVar2);
    }

    public static boolean c(umc umcVar, boolean z) {
        return !z && umcVar.b().booleanValue();
    }

    public static <T extends cqkp> cqmj<T> d(cqlc<T, CharSequence> cqlcVar, cqlc<T, cqss> cqlcVar2, cqmp<T> cqmpVar) {
        return cqgr.gq(cqgr.aF(cqjv.x(cqlcVar)), cqgr.eM(cqlcVar), cqgr.co(cqrp.d(1.0d), false), cqgr.bG(ibn.d()), cqgr.dQ(ibn.f()), cqmpVar, cqgr.eW(cqlcVar2), cqgr.eN(5));
    }

    public static <T extends umc> cqmj<T> e() {
        cqmp[] cqmpVarArr = {cqgr.aF(cqjv.x(ujt.a)), cqgr.ce(h), cqgr.bq(e), cqgr.bw(16), cqgr.ei(ImageView.ScaleType.FIT_XY), cqgr.V(uju.a), cqgr.cW(cqgr.q(ujv.a)), WebImageView.l(ujw.a), iue.b(cjtd.a(dtxs.aa))};
        cqtv cqtvVar = d;
        return abjc.c(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqic.f(ujs.a, new cqmp[0]), cqgr.bD(f), cqgr.bR(ibn.f()), cqgr.bV(g), WebImageView.a(cqmpVarArr), cqgr.gc(cqgr.bw(85), cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.eE(cqrt.f(2131231803))));
    }

    public static <T extends cqkp> cqmj<T> f(cqlc<T, Boolean> cqlcVar) {
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-1), ztj.q(cqgr.bp(-1), ztj.r(xym.a), cqgr.bk(cqlcVar), xym.g()));
    }

    public static <T extends cqkp> cqmj<T> g(cqlc<T, cqtd> cqlcVar, cqlc<T, Boolean> cqlcVar2, cqlc<T, Boolean> cqlcVar3, int i) {
        double d2 = i * 20;
        cqmp[] cqmpVarArr = {cqgr.aF(cqlcVar2), cqgr.bq(cqrp.d(d2)), ztj.r(xym.a), xym.g()};
        cqtv cqtvVar = b;
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cH(cqrp.d(80.0d)), ztj.q(cqmpVarArr), cqgr.gc(cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.bw(1), cqgr.aF(cqjv.x(cqlcVar)), cqgr.eG(cqlcVar)), ztj.q(cqgr.aF(cqlcVar3), cqgr.bq(cqrp.d(d2)), ztj.r(xym.a), xym.g()));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(cqlc<T, CharSequence> cqlcVar, cqlc<T, CharSequence> cqlcVar2, cqlc<T, cqss> cqlcVar3, cqmp<T> cqmpVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), d(cqlcVar, cqlcVar3, cqmpVar)), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), d(cqlcVar2, cqkz.a(ibl.p()), ibq.p())));
        gd.f(cqmpVarArr);
        return gd;
    }
}
