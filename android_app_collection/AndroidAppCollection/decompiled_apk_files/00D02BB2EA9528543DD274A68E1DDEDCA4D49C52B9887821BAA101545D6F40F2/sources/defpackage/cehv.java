package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cehv  reason: default package */
/* loaded from: classes4.dex */
public final class cehv extends cqiw<cess> {
    public static final cqrp a = cqrp.d(210.0d);
    public static final cqrp b = cqrp.d(140.0d);
    public static final cqrp c = cqrp.d(8.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cess cessVar, Context context, cqiv cqivVar) {
        boolean z = true;
        for (cesq cesqVar : cessVar.j()) {
            if (!z) {
                cqivVar.c(new cehu());
            }
            cqivVar.a(new ceht(), cesqVar);
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cess> a() {
        cqrp cqrpVar = c;
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.bR(cqrpVar), cqgr.bG(cqrpVar), cqgr.bp(-2), cqgr.cd(-1), cqgr.ck(C())};
        cqrp f = ibn.f();
        return cqgr.gd(cqgr.aW(2), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.aF(cqjv.x(cehd.a)), cqgr.fP(new cerf(), cehe.a, new cqmp[0]), cqgr.gd(cqmpVarArr), cqgr.gq(cqgr.aF(cqjv.x(cehf.a)), cqgr.cd(-1), cqgr.cH(ibn.a()), cqgr.dz(f, f, f, f), cqgr.x(ibo.h()), cqgr.eM(cehg.a), ibq.u(), cqgr.eN(4), cqgr.cW(cqgr.q(cehh.a)), iue.c(cehi.a)));
    }
}
