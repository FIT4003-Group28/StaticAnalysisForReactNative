package defpackage;
/* compiled from: PG */
/* renamed from: byhi  reason: default package */
/* loaded from: classes4.dex */
public final class byhi extends cqiw<cqkp> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(12.0d);
    private static final cqfc c = f(0);
    private static final cqfc d = f(160);
    private static final cqfc e = f(320);
    private static final cqfc f = f(480);

    private static cqmj<cqkp> e(float f2, int i, cqfc cqfcVar) {
        cqss g = irg.g();
        cqrp cqrpVar = b;
        return cqgr.gd(cqgr.cd(-1), cqgr.bR(irh.c()), cqgr.bG(irh.c()), cqgr.bD(cqrp.d(i)), cqgr.gs(cqgr.x(cqtt.l(g, cqsg.f(cqrpVar, Float.valueOf(0.5f)))), cqgr.bq(cqrpVar), cqgr.cd(0), cqgr.ca(Float.valueOf(f2)), cqgr.fD(cqfcVar)), cqgr.gs(cqgr.cd(0), cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f - f2))));
    }

    private static cqfc f(int i) {
        return new byhh(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cqkp> a() {
        cqss x = ibm.x();
        cqmp[] cqmpVarArr = {cqgr.aD(false), cqgr.fr(cqrp.d(-4.0d)), cqgr.bD(cqrp.d(18.0d))};
        cqfc cqfcVar = c;
        cqfc cqfcVar2 = d;
        cqfc cqfcVar3 = e;
        cqfc cqfcVar4 = f;
        return cqgr.gd(cqgr.cd(-1), cqgr.dr(1), iue.b(cjtd.a(dtyc.bh)), cqmb.a(x, cqmpVarArr), e(0.75f, 12, cqfcVar), e(0.65f, 42, cqfcVar), e(0.75f, 12, cqfcVar2), e(0.65f, 42, cqfcVar2), e(0.75f, 12, cqfcVar3), e(0.65f, 42, cqfcVar3), e(0.75f, 12, cqfcVar4), e(0.65f, 42, cqfcVar4));
    }
}
