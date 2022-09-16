package defpackage;
/* compiled from: PG */
/* renamed from: mys  reason: default package */
/* loaded from: classes7.dex */
public final class mys extends cqiw<mzd> {
    private final boolean a;
    private final cqss b;

    public mys(boolean z, cqss cqssVar) {
        super(Boolean.valueOf(z), cqssVar);
        this.a = z;
        this.b = cqssVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<mzd> a() {
        cqmp[] cqmpVarArr = new cqmp[6];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.dr(1);
        cqmpVarArr[3] = cqgr.fP(new mzb(this.b), cqkz.a(cqkp.T), new cqmp[0]);
        cqmpVarArr[4] = cqgr.fR(new mza(), myr.a, new cqmp[0]);
        cqmpVarArr[5] = this.a ? nsc.b(cqgr.bD(cqrp.d(dcyn.a))) : cqmp.e;
        return cqgr.gd(cqmpVarArr);
    }
}
