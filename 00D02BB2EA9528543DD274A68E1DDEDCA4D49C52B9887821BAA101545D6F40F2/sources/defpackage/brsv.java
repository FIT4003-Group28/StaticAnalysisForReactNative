package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: brsv  reason: default package */
/* loaded from: classes4.dex */
public final class brsv extends cqiw<bdzw> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bdzw bdzwVar, Context context, cqiv cqivVar) {
        bdzw bdzwVar2 = bdzwVar;
        if (bdzwVar2.a().isEmpty()) {
            return;
        }
        boolean z = bdzwVar2.a().size() == 1;
        cqivVar.a(new brsu(z, null), bdzwVar2.a().get(0));
        cqivVar.f(new brsu(z), dcft.u(bdzwVar2.a(), 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdzw> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(17), cqgr.dr(0), cqgr.ep(false), cqgr.ck(C()));
    }
}
