package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aknl  reason: default package */
/* loaded from: classes2.dex */
final class aknl extends cqiw<akoe> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, akoe akoeVar, Context context, cqiv cqivVar) {
        akoe akoeVar2 = akoeVar;
        if (!akoeVar2.a().isEmpty()) {
            cqivVar.a(new hsd(), hsd.e(irh.c()));
            for (akod akodVar : akoeVar2.a()) {
                cqivVar.a(new aknj(), akodVar);
            }
            cqivVar.a(new hsd(), hsd.e(irh.c()));
        }
        for (akod akodVar2 : akoeVar2.b()) {
            cqivVar.a(new aknj(), akodVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<akoe> a() {
        return cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.bD(irh.c()), cqgr.gc(cqgr.ce(irh.r()), cqgr.bq(irh.r()), cqgr.eE(cqrt.g(2131231600, ibm.x()))), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.gq(cqgr.bR(irh.c()), cqgr.aJ(16), cqgr.eN(5), cqgr.cH(irh.r()), cqgr.eM(aknk.a), irn.l(), cqgr.eU(irg.J())), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(irh.c()), cqgr.ck(C()))));
    }
}
