package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bbft  reason: default package */
/* loaded from: classes3.dex */
final class bbft extends cqiw<bbhp> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bbhp bbhpVar, Context context, cqiv cqivVar) {
        cqiw bbhgVar;
        bbhp bbhpVar2;
        bbhp bbhpVar3 = bbhpVar;
        bbho bbhoVar = bbho.PLACE;
        int ordinal = bbhpVar3.a().ordinal();
        if (ordinal == 0) {
            bbhgVar = new bbhg();
            bbhpVar2 = (bbht) bbhpVar3;
        } else if (ordinal != 1 && ordinal != 2) {
            return;
        } else {
            bbhgVar = new bbgc();
            bbhpVar2 = (bbhr) bbhpVar3;
        }
        cqivVar.a(bbhgVar, bbhpVar2);
    }

    @Override // defpackage.cqiw
    public final cqmj<bbhp> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.ck(C()));
    }
}
