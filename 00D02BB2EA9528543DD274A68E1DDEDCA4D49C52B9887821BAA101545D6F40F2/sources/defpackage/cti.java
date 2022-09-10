package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cti  reason: default package */
/* loaded from: classes5.dex */
public final class cti extends cqiw<ctm> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ctm ctmVar, Context context, cqiv cqivVar) {
        cqiw crzVar;
        Object obj;
        for (Object obj2 : ctmVar.b()) {
            if (obj2 instanceof ctn) {
                crzVar = new crz();
                obj = (ctn) obj2;
            } else if (obj2 instanceof cto) {
                crzVar = new csd();
                obj = (cto) obj2;
            }
            cqivVar.a(crzVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ctm> a() {
        cqlc cqlcVar = csx.a;
        cqlc cqlcVar2 = csz.a;
        cqlc cqlcVar3 = cta.a;
        cqlc cqlcVar4 = ctb.a;
        cqjb<ctm, cqiv> C = C();
        cqmp[] cqmpVarArr = {cqgr.eM(ctc.a), cqgr.dg(ctd.a)};
        cqmh cqmhVar = new cqmh(ctp.class, cqgr.cH(irh.a()), cqjv.f(cqfe.ON_ITEM_CLICK_LISTENER, cqlcVar4), cqgr.dp(cqgi.a(cqlcVar3)), cqgr.bf(cqlcVar2), cqgr.aU(33554432), cqgr.eB(true), cqgr.aQ(cqlcVar), cqgr.ck(C));
        cqmhVar.f(cqmpVarArr);
        hcl.h(cqmhVar);
        return hcl.e(cth.a, cqkz.a(irg.k()), csy.a, cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqmhVar, cqgr.gq(cqgr.bR(irh.e()), irn.n(), cqgr.eU(ibm.D()), cqgr.eM(cte.a), cqgr.aI(ctf.a)), iue.c(ctg.a)), new cqmp[0]);
    }
}
