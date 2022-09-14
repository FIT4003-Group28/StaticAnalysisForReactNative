package defpackage;
/* compiled from: PG */
/* renamed from: bruh  reason: default package */
/* loaded from: classes4.dex */
final class bruh extends cqiw<brvb> {
    public static Boolean e(brvb brvbVar) {
        boolean z = true;
        if (brvbVar.n() != dghs.CALL && brvbVar.n() != dghs.DIRECTIONS && brvbVar.n() != dghs.SAVE && brvbVar.n() != dghs.SEE_ON_MAP && brvbVar.n() != dghs.ADD_STOP) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean f(brvb brvbVar) {
        return Boolean.valueOf(brvbVar.n() == dghs.SAVE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brvb> a() {
        return cqgr.fY(cqgr.aG(B().q()), cqgr.fY(cqic.d(B().e(), new cqmp[0]), hyw.l(B().f(), B().a(iuf.a()), B().l(), B().b(), cqjv.o(brub.a, cqgr.dQ(cqrp.d(12.0d)), cqgr.dQ(cqrp.d(dcyn.a))), cqjv.o(bruc.a, cqgr.dB(cqrp.d(8.0d)), cqgr.dB(cqrp.d(dcyn.a))), cqgr.aE(brud.a)), cqgr.fY(cqgr.ch(cqrp.d(48.0d)), cqgr.dQ(cqrp.d(12.0d)), cqgr.dB(cqrp.d(8.0d)), cqgr.cU(B().a(iuf.a())), iue.b(B().l()), cqgr.R(B().b()), cqgr.gc(cqgr.J(false), cqgr.ch(cqrp.d(36.0d)), cqgr.bw(17), cqgr.eE(B().f())), cqgr.aH(brug.a))), cqgr.fY(cqic.a(B().e(), new cqmp[0]), cqgr.cH(cqrp.d(48.0d)), iue.b(B().l()), cqjv.o(brue.a, cqgr.bR(cqrp.d(12.0d)), cqgr.bR(cqrp.d(dcyn.a))), cqjv.o(bruf.a, cqgr.bD(cqrp.d(8.0d)), cqgr.bD(cqrp.d(dcyn.a))), cqgr.cU(B().a(iuf.a())), cqgr.R(B().b()), cpp.g(cpp.f()), hyw.v(B().f(), null, null, null, null, true, false, hyw.J(), cqgr.eI(B().k()), hyw.aw(false), cqgr.J(false), cqgr.az(false))));
    }
}
