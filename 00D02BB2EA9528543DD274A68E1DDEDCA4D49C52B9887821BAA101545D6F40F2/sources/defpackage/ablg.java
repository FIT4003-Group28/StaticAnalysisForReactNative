package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ablg  reason: default package */
/* loaded from: classes2.dex */
final class ablg extends cqiw<abis> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, abis abisVar, Context context, cqiv cqivVar) {
        abis abisVar2 = abisVar;
        int i2 = 0;
        while (i2 < abisVar2.g().size()) {
            int i3 = i2 + 1;
            cqivVar.a(new ablf(i3), abisVar2.g().get(i2));
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abis> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()));
    }
}
