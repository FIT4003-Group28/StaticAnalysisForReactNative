package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cgit  reason: default package */
/* loaded from: classes4.dex */
public final class cgit extends cqiw<cgvs> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cgvs cgvsVar, Context context, cqiv cqivVar) {
        cgvs cgvsVar2 = cgvsVar;
        int size = cgvsVar2.a().size();
        for (int i2 = 0; i2 < size; i2++) {
            cgvu cgvuVar = cgvsVar2.a().get(i2);
            cqivVar.a(new cgjm(), cgvuVar);
            if (i2 < size - 1) {
                cqivVar.a(new cgis(), cgvuVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cgvs> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(16.0d)), cqgr.bZ(new cgiq(new Object[0])), cqgr.ck(C()), cqgr.dB(cqrp.d(24.0d)));
    }
}
