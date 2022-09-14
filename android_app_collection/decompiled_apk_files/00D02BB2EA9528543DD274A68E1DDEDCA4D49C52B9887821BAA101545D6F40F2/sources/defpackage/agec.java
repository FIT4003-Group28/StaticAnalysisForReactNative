package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: agec  reason: default package */
/* loaded from: classes2.dex */
final class agec extends cqiw<agys> {
    private final boolean a;

    public agec(boolean z) {
        super(Boolean.valueOf(z));
        this.a = z;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agys agysVar, Context context, cqiv cqivVar) {
        cqivVar.e(agysVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agys> a() {
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = this.a ? cqgr.cd(-1) : cqgr.ce(cqrp.d(272.0d));
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.bR(cqrp.d(5.0d));
        cqmpVarArr[3] = cqgr.bG(cqrp.d(5.0d));
        cqmpVarArr[4] = cqgr.ck(C());
        return agxk.d(cqmpVarArr);
    }
}
