package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: agcu  reason: default package */
/* loaded from: classes2.dex */
final class agcu extends cqiw<agcv> {
    private final int a;
    private final int b;
    private final boolean c;

    public agcu(int i, int i2, boolean z) {
        super(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agcv agcvVar, Context context, cqiv cqivVar) {
        cqivVar.e(agcvVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agcv> a() {
        cqnf ce;
        cqmp[] cqmpVarArr = new cqmp[11];
        if (this.c) {
            ce = cqgr.cd(-1);
        } else {
            ce = cqgr.ce(agss.f(0.85f));
        }
        cqmpVarArr[0] = ce;
        cqmpVarArr[1] = cqgr.cz(cqrp.d(300.0d));
        cqmpVarArr[2] = cqgr.bp(-2);
        cqmpVarArr[3] = cqgr.bR(cqrp.d(this.a));
        cqmpVarArr[4] = cqgr.bG(cqrp.d(this.b));
        cqmpVarArr[5] = cqqx.i(cqrp.d(dcyn.a));
        cqmpVarArr[6] = cqqx.g(cqrp.d(8.0d));
        cqmpVarArr[7] = cqgr.L(false);
        cqmpVarArr[8] = cqgr.P(false);
        cqmpVarArr[9] = cqgr.x(aclp.a(ibm.b(), ibm.i(), cqrp.d(1.0d), cqrp.d(8.0d)));
        cqmpVarArr[10] = cqgr.ck(C());
        return cqqx.E(cqmpVarArr);
    }
}
