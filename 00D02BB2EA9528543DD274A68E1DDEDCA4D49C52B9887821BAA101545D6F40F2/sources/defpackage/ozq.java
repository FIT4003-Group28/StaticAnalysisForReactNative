package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ozq  reason: default package */
/* loaded from: classes7.dex */
public final class ozq implements cjyu<oxx> {
    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ oxx a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        if ((dtkuVar.a & 2) != 0) {
            dtku dtkuVar2 = dtkxVar.b;
            if (dtkuVar2 == null) {
                dtkuVar2 = dtku.p;
            }
            dtqe dtqeVar = dtkuVar2.c;
            if (dtqeVar == null) {
                dtqeVar = dtqe.f;
            }
            return new ozs(cjztVar, dtqeVar);
        }
        return null;
    }
}
