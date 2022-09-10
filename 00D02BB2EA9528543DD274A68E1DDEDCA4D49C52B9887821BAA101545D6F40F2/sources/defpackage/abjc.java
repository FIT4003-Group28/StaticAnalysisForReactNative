package defpackage;

import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abjc  reason: default package */
/* loaded from: classes.dex */
public final class abjc {
    public static final cqtv a = cqrp.d(112.0d);
    public static final cqtv b = ibn.d();
    private static final dcdc<cqss> c = dcdc.m(ibm.w(), ibm.C(), ibm.G(), ibm.K(), iva.b(ibl.am(), ibl.al()), iva.b(cqrt.c(R.color.mod_google_pink500), cqrt.c(R.color.mod_google_pink400)), iva.b(cqrt.c(R.color.mod_google_purple500), cqrt.c(R.color.mod_google_purple400)), ibm.U());

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> E = cqqx.E(cqqx.i(cqrp.d(dcyn.a)), cqqx.g(cqrp.d(8.0d)), cqgr.x(aclp.a(ibm.b(), ibm.i(), cqrp.d(1.0d), cqrp.d(8.0d))));
        E.f(cqmpVarArr);
        return E;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        cqmj<T> E = cqqx.E(cqqx.i(iva.i(cqrp.d(2.0d), cqrp.d(dcyn.a))), cqqx.g(cqrp.d(8.0d)), cqqx.d(ibm.b()), cqqx.B(false));
        E.f(cqmpVarArr);
        return E;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqmj<T> E = cqqx.E(cqqx.i(iva.i(cqrp.d(2.0d), cqrp.d(dcyn.a))), cqgr.x(aclp.a(ibm.b(), ibm.i(), iva.i(cqrp.d(dcyn.a), cqrp.d(1.0d)), cqrp.d(8.0d))), cqqx.B(false));
        E.f(cqmpVarArr);
        return E;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqmp<T>... cqmpVarArr) {
        cqmj<T> f = iue.f(cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqrp.d(16.0d)), cqgr.bp(-2), cqgr.cd(-1), cqgr.bR(cqrp.d(20.0d)), cqgr.bG(cqrp.d(20.0d)), ibq.m(), ibq.v(), cqgr.eN(5));
        f.f(cqmpVarArr);
        return f;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(final cqlc<T, cqtv> cqlcVar, cqlc<T, cqtd> cqlcVar2, cqlc<T, cqtv> cqlcVar3, cqlc<T, jic> cqlcVar4, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.ci(cqlcVar), cqjv.l(cqjv.x(cqlcVar2), cqgr.y(new cqlc(cqlcVar) { // from class: abjb
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return aclp.a(ibm.b(), ibm.j(), cqrp.d(1.0d), cqsg.f((cqtv) ((cqlb) this.a).a, Float.valueOf(0.5f)));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.y(cqlcVar2)), WebImageView.a(cqgr.bk(cqjv.x(cqlcVar4)), cqgr.ci(cqlcVar3), cqgr.bw(17), WebImageView.l(cqlcVar4), cqjv.l(cqjv.x(cqlcVar2), cqgr.fm(ibm.x()), cqgr.fm(ibm.b()))));
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(4), cqgr.ar(TextUtils.TruncateAt.END), ibq.q(), ibq.y());
        gq.f(cqmpVarArr);
        return gq;
    }

    public static cqss g(int i) {
        dcdc<cqss> dcdcVar = c;
        return dcdcVar.get(i % dcdcVar.size());
    }
}
