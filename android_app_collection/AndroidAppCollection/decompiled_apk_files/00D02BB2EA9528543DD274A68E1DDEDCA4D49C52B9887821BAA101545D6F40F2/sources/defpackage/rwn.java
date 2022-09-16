package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rwn  reason: default package */
/* loaded from: classes7.dex */
final class rwn extends cqiw<sam> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, sam samVar, Context context, cqiv cqivVar) {
        cqiw rwmVar;
        for (Object obj : samVar.a()) {
            if (obj instanceof saz) {
                rwmVar = new rxs();
                obj = (saz) obj;
            } else {
                rwmVar = new rwm();
            }
            cqivVar.a(rwmVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<sam> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.ck(C()), cqgr.cd(-1), cqgr.bp(-2));
    }
}
