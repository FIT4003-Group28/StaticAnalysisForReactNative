package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ozk  reason: default package */
/* loaded from: classes7.dex */
public final class ozk implements cjyu<oxt> {
    private final ozm a;

    public ozk(ozm ozmVar) {
        this.a = ozmVar;
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ oxt a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        ozm ozmVar = this.a;
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtol dtolVar = dtkuVar.i;
        if (dtolVar == null) {
            dtolVar = dtol.q;
        }
        dtol dtolVar2 = dtolVar;
        cjqy a = ozmVar.a.a();
        ozm.a(a, 1);
        cecn a2 = ozmVar.b.a();
        ozm.a(a2, 2);
        bqsq a3 = ozmVar.c.a();
        ozm.a(a3, 3);
        btvo a4 = ozmVar.d.a();
        ozm.a(a4, 4);
        ozm.a(cjztVar, 5);
        ozm.a(dtolVar2, 6);
        return new ozl(a, a2, a3, a4, cjztVar, dtolVar2);
    }
}
