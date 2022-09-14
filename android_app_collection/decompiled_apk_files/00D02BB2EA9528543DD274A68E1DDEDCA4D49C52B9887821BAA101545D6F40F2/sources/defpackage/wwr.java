package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: wwr  reason: default package */
/* loaded from: classes7.dex */
public final class wwr extends cqiw<wyj> {
    public static final cqtv a = cqrp.d(1.0d);
    public static final cqtv b = cqrp.d(20.0d);
    private static final cqiw<cqkp> c = new wwq();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, wyj wyjVar, Context context, cqiv cqivVar) {
        wyj wyjVar2 = wyjVar;
        for (wyi wyiVar : wyjVar2.b()) {
            cqivVar.a(new wwl(), wyiVar);
        }
        if (!wyjVar2.b().isEmpty() && !wyjVar2.c().isEmpty()) {
            cqivVar.c(c);
        }
        for (wyi wyiVar2 : wyjVar2.c()) {
            cqivVar.a(new wwl(), wyiVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<wyj> a() {
        return cqgr.fY(cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.x(wws.m), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.aJ(80), cqgr.ck(C())), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.aJ(80), cqgr.gq(ibq.r(), cqgr.bp(-2), cqgr.cd(-1), cqgr.cH(ibn.a()), cqgr.aJ(17), cqgr.eM(wwm.a), cqgr.J(true), cqgr.x(irm.d), cqgr.eU(ibm.x()), cqgr.eN(4), cqgr.cW(cqgr.q(wwn.a)), iue.c(wwo.a))), iue.c(wwp.a)));
    }
}
