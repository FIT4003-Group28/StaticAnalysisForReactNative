package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aaix  reason: default package */
/* loaded from: classes2.dex */
public final class aaix extends cqiw<aaja> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aaja aajaVar, Context context, cqiv cqivVar) {
        for (aajb aajbVar : aajaVar.a()) {
            hyw.x(cqivVar, aajbVar, !aajbVar.b().isEmpty() ? aajbVar.g().booleanValue() ? new aaiw() : new aaif() : new aaio());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aaja> a() {
        return cqgr.ga(cqgr.ep(false), cqgr.gd(cqgr.ck(C())));
    }
}
