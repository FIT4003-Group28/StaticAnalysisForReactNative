package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: blef  reason: default package */
/* loaded from: classes3.dex */
public final class blef extends cqiw<cebg> implements cqih {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cebg cebgVar, Context context, cqiv cqivVar) {
        cebg cebgVar2 = cebgVar;
        cqivVar.a(new hsd(), hsd.d(irh.b()));
        for (int i2 = 0; i2 < cebgVar2.a().intValue(); i2++) {
            blee bleeVar = new blee();
            cebf b = cebgVar2.b(i2);
            dbsk.s(b);
            cqivVar.a(bleeVar, b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cebg> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqqx.F(), cqgr.ck(C()));
    }
}
