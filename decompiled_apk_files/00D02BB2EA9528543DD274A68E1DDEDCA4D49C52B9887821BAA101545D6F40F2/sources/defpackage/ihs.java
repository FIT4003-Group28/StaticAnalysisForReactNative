package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: ihs  reason: default package */
/* loaded from: classes6.dex */
final class ihs<T extends cqkp> extends cqiw<cqkp> {
    private final cqix<T> a;
    private final iif b;

    public ihs(cqix<T> cqixVar, iif iifVar) {
        super(cqixVar);
        this.a = cqixVar;
        this.b = iifVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cqkp> a() {
        cqnf bp;
        cqmp[] cqmpVarArr = new cqmp[4];
        cqmpVarArr[0] = cqgr.ce(cqrp.d(dcyn.a));
        cqmpVarArr[1] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr[2] = cqgr.bp(-1);
        cqmp[] cqmpVarArr2 = new cqmp[3];
        cqmpVarArr2[0] = cqgr.cd(-1);
        cqtv g = this.b.g();
        if (g != null) {
            bp = cqgr.bq(g);
        } else {
            bp = cqgr.bp(-1);
        }
        cqmpVarArr2[1] = bp;
        cqmpVarArr2[2] = cqgr.fO(this.a.a(), this.a.b(), new cqmp[0]);
        cqmpVarArr[3] = hye.a(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }
}
