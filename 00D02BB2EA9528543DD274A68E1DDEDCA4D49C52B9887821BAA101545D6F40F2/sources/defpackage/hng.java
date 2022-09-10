package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: hng  reason: default package */
/* loaded from: classes.dex */
public final class hng extends cqiw<izd> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, izd izdVar, Context context, cqiv cqivVar) {
        List<ize> a = izdVar.a();
        if (a == null || a.isEmpty()) {
            return;
        }
        cqivVar.f(new hne(), a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izd> a() {
        return cqgr.fY(cqgr.ck(C()), cqgr.fF(hnf.a));
    }
}
