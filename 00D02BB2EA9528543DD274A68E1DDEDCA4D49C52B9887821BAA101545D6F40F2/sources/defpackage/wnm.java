package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wnm  reason: default package */
/* loaded from: classes7.dex */
public final class wnm {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqrp.f(20.0d);
    private static final cqss c = ibm.i();

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqlc<T, zef> cqlcVar, cqlc<T, jhk> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> b2 = b(new cqlc() { // from class: wnh
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = wnm.a;
                int i2 = brur.a;
                return ((zef) cqkpVar).l();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqmpVarArr);
        b2.f(zxb.b(cqlcVar2));
        return b2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, zvb> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = zxb.a(cqgr.cd(-2), cqgr.bp(-2), ibq.l(), cqgr.fj(1), ibq.w(), cqgr.cB(1), cqgr.eB(true));
        a2.f(cqmpVarArr);
        a2.f(zvb.b(cqlcVar));
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends zef> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqlc cqlcVar = wni.a;
        cqtv cqtvVar = b;
        cqmj<T> b2 = b(cqlcVar, zxb.b(wnj.a), zxb.d(cqtvVar), zxb.f(cqrt.d(R.dimen.directions_nearby_stations_short_line_name_width)), zxb.g(cqtvVar), cqgr.cH(cqtvVar), ibq.p(), cqgr.dF(irh.n()), cqgr.al(irh.n()), zxb.i(irh.n()));
        b2.f(cqmpVarArr);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqlc<T, CharSequence> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(ibq.p(), ibq.z(), ibq.x(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqnf<T>... cqnfVarArr) {
        cqmj<T> f = f(cqkz.a(iup.c(R.raw.ic_qu_accessible, ibm.p())), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_WHEELCHAIR_ACCESSIBLE)), itj.i(dtyc.eP));
        f.f(cqnfVarArr);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqlc<T, cqtd> cqlcVar, cqnf<T>... cqnfVarArr) {
        cqmj<T> gc = cqgr.gc(cqgr.eG(cqlcVar), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ch(cqrp.d(16.0d)), cqgr.bw(16));
        gc.f(cqnfVarArr);
        return gc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqmp<T>... cqmpVarArr) {
        cqmj<T> gs = cqgr.gs(cqgr.bq(cqrp.d(1.0d)), cqgr.z(c));
        gs.f(cqmpVarArr);
        return gs;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(cqlc<T, cqtd> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gc = cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(16), cqgr.eG(cqlcVar), cqgr.aF(cqjv.x(cqlcVar)));
        gc.f(cqmpVarArr);
        return gc;
    }
}
