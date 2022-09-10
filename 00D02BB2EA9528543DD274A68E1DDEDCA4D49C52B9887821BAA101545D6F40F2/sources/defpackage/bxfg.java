package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bxfg  reason: default package */
/* loaded from: classes4.dex */
public final class bxfg extends cqiw<bxob> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bxob bxobVar, Context context, cqiv cqivVar) {
        cqix<?> a;
        bxob bxobVar2 = bxobVar;
        if (bxobVar2.b() != null && bxobVar2.c().booleanValue()) {
            a = bxobVar2.b();
        } else if (bxobVar2.a() == null) {
            return;
        } else {
            a = bxobVar2.a();
        }
        cqivVar.e(a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bxob> a() {
        return cqgr.gd(cqgr.dc(bxff.a), cqgr.z(ibm.b()), cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.ck(C()));
    }
}
