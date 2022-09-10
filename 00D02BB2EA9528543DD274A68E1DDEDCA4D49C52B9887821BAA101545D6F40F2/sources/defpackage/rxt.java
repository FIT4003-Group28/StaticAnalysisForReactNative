package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rxt  reason: default package */
/* loaded from: classes7.dex */
public final class rxt extends cqiw<sai> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final cqrp d = ibn.a();
    public static final cqrp e = cqrp.d(24.0d);
    public static final cqrp f = cqrp.d(48.0d);
    private static final cqrp g = cqrp.d(4.0d);

    public static <T extends sap> cqmj<T> d(cqmj<T> cqmjVar) {
        cqjg a2 = cqjg.a();
        cqjg a3 = cqjg.a();
        cqrp cqrpVar = e;
        cqmp[] cqmpVarArr = {cqgr.aT(a2), cqgr.aI(rvp.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(ibn.a()), cqgr.aJ(16), cqgr.cW(rvq.a), iue.c(rvr.a), cqgr.gc(cqgr.aT(a3), cqgr.ce(cqrpVar), cqgr.bq(cqrpVar), cqgr.bR(cqrp.d(24.0d)), cqgr.bY(cqjd.e(), cqjd.i()), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.z(ibm.b()), cqgr.eE(iut.a(cqrt.h(2131232139, ibm.x())))), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.A(a3)), cqgr.cH(cqrp.d(24.0d)), cqgr.bR(irh.k()), cqgr.aJ(16), cqgr.eM(rvs.a), cqgr.eN(5), ibq.l(), cqgr.eU(ibm.x()))};
        cqrp d2 = cqrp.d(8.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqmjVar, cqgr.gj(cqmpVarArr), g(R.string.NO_WALKING_TRANSFERS_AVAILABLE, cqgr.aI(rvt.a), cqgr.dz(d2, d2, d2, d2)));
    }

    public static <T extends sap> cqmj<T> e() {
        cqjd[] cqjdVarArr = {cqjd.f(), cqjd.t()};
        cqrp cqrpVar = e;
        return cqgr.fY(cqgr.aI(rvu.a), cqgr.ce(ibn.a()), cqgr.bq(ibn.a()), cqgr.bY(cqjdVarArr), cqgr.cW(rvv.a), iue.c(rvw.a), cqgr.gc(cqgr.ce(cqrpVar), cqgr.bq(cqrpVar), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.V(rvx.a), cqgr.eE(iut.a(cqrt.h(2131232209, ibm.p())))));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        cqmj<T> b2 = hye.b(cqgr.cd(-1), cqgr.bp(-2), cqgr.bA(cqrp.d(7.0d)), cqgr.z(ibm.b()));
        b2.f(cqmpVarArr);
        return b2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(int i, cqmp<T>... cqmpVarArr) {
        cqjg a2 = cqjg.a();
        cqrp cqrpVar = e;
        cqmj<T> gj = cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.gc(cqgr.aT(a2), cqgr.ce(cqrpVar), cqgr.bq(cqrpVar), cqgr.bR(irh.k()), cqgr.bY(cqjd.e(), cqjd.i()), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.z(ibm.b()), cqgr.eE(iut.a(cqrt.h(2131232461, ibm.D())))), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(irh.k()), cqgr.bY(cqjd.A(a2)), cqgr.cH(cqrp.d(24.0d)), cqgr.aJ(16), cqgr.eL(Integer.valueOf(i)), cqgr.eN(5), ibq.l(), cqgr.eU(ibm.D())));
        gj.f(cqmpVarArr);
        return gj;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.ce(g), cqgr.z(ibm.j()));
        fY.f(cqmpVarArr);
        return fY;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, sai saiVar, Context context, cqiv cqivVar) {
        sai saiVar2 = saiVar;
        cqivVar.a(saiVar2.e().booleanValue() ? new rwb() : saiVar2.d().booleanValue() ? new rwt() : new rwr(), saiVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<sai> a() {
        return cqgr.gd(cqgr.ck(C()), cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(17), cqgr.z(irg.a()));
    }
}
