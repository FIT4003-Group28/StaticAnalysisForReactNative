package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vix  reason: default package */
/* loaded from: classes7.dex */
public class vix extends cqiw<zfg> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<zfg> a() {
        return f(irh.b(), irh.b(), cqrp.d(20.0d), cqkz.a(null));
    }

    protected cqmp<zfg> e() {
        Boolean a = B().a();
        CharSequence d = B().d();
        CharSequence g = B().g();
        CharSequence f = B().f();
        CharSequence h = B().h();
        cqmp[] cqmpVarArr = {cqgr.bV(cqrp.d(18.0d)), cqjv.k(B().b(), cqgr.bR(irh.b()), cqgr.bR(irh.e()))};
        cqmj fY = cqgr.fY(cqgr.gq(cqgr.aG(a), vlb.a(), irn.m(), irn.E(), irn.v(), cqgr.eJ(cqrt.l(R.string.MOSTLY_FLAT_ROUTE))), cqgr.gd(cqgr.aD(a), cqgr.gq(cqgr.ai(cqrt.f(2131231121)), cqgr.al(cqrp.d(4.0d)), irn.m(), irn.E(), irn.v(), cqgr.eI(d), cqgr.R(f)), cqgr.gq(cqgr.bR(irh.g()), irn.m(), irn.E(), irn.v(), cqgr.eI("·")), cqgr.gq(cqgr.bR(irh.g()), cqgr.ai(cqrt.f(2131231119)), cqgr.al(cqrp.d(4.0d)), irn.m(), irn.v(), cqgr.eI(g), cqgr.R(h))));
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<zfg> f(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqlc<zfg, zto> cqlcVar) {
        cqtd c = B().c();
        cqmp[] cqmpVarArr = {cqjv.i(ztg.ELEVATION_PROFILE_DETAIL_LEVEL, B().l(), zth.a), cqgr.bR(cqtvVar), cqgr.bG(cqtvVar2), cqgr.bD(cqtvVar3), cqjv.g(ztg.ON_TRIP_ELEVATION_DISTANCE_OFFSET_CHANGE, cqlcVar, zth.a)};
        cqmh cqmhVar = new cqmh(ztp.class, cqgr.x(c));
        cqmhVar.f(cqmpVarArr);
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.R(B().e()), e(), cqgr.fY(cqgr.aG(B().b()), cqgr.bp(B().i()), cqmhVar));
    }
}
