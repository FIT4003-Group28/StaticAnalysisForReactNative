package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aalz  reason: default package */
/* loaded from: classes2.dex */
public final class aalz extends cqiw<aang> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aang aangVar, Context context, cqiv cqivVar) {
        boolean z = true;
        for (aanf aanfVar : aangVar.a()) {
            cqivVar.a(new aalx(Boolean.valueOf(z)), aanfVar);
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aang> a() {
        return cqgr.gd(cqgr.aI(aaly.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()));
    }
}
