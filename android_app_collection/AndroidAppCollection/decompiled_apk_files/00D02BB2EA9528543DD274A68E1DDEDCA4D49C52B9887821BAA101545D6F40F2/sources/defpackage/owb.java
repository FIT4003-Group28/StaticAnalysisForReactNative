package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: owb  reason: default package */
/* loaded from: classes7.dex */
public final class owb extends cqiw<oxx> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, oxx oxxVar, Context context, cqiv cqivVar) {
        List<oxw> b = oxxVar.b();
        int min = Math.min(b.size(), 4);
        for (int i2 = 0; i2 < min; i2++) {
            cqivVar.a(new owa(), b.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxx> a() {
        cqrp d = cqrp.d(16.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dz(d, d, d, d), cqgr.dr(0), cqgr.ck(C()));
    }
}
