package defpackage;
/* compiled from: PG */
/* renamed from: qmd  reason: default package */
/* loaded from: classes7.dex */
public final class qmd extends cqiw<qnd> {
    public static final int a = cqir.a();
    private final boolean b;

    public qmd(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<qnd> a() {
        cqmm fP;
        cqmp fR;
        cqmp[] cqmpVarArr = new cqmp[10];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-1);
        cqmpVarArr[3] = cqgr.dW(qlt.a);
        cqmpVarArr[4] = cqgr.x(ibk.b());
        cqmpVarArr[5] = cqgr.fR(new qvl(), qlu.a, new cqmp[0]);
        cqmpVarArr[6] = cqgr.fR(new rjk(), qlv.a, new cqmp[0]);
        cqmpVarArr[7] = cqgr.fR(new ico(), qlw.a, new cqmp[0]);
        if (this.b) {
            fP = cqgr.fP(new qmp(), qlx.a, cqgr.bw(48));
        } else {
            fP = cqgr.fP(new qmh(), qly.a, new cqmp[0]);
        }
        cqmpVarArr[8] = fP;
        if (this.b) {
            fR = jnq.y(cqgr.aR(Integer.valueOf(a)), cqgr.fw(new qks()), cqgr.fy(qlz.a), cqgr.fx(qma.a), cqgr.m6do(qmb.a));
        } else {
            fR = cqgr.fR(new qks(), qmc.a, new cqmp[0]);
        }
        cqmpVarArr[9] = fR;
        return cqgr.gd(cqmpVarArr);
    }
}
