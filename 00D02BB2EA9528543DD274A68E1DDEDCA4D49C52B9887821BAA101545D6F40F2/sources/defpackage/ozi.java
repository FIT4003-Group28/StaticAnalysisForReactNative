package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ozi  reason: default package */
/* loaded from: classes7.dex */
public final class ozi implements cjyu<jbj> {
    private final iyj a;

    public ozi(iyj iyjVar) {
        this.a = iyjVar;
    }

    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ jbj a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtol dtolVar = dtkuVar.i;
        if (dtolVar == null) {
            dtolVar = dtol.q;
        }
        if ((dtolVar.a & 1024) != 0) {
            iyj iyjVar = this.a;
            dtku dtkuVar2 = dtkxVar.b;
            if (dtkuVar2 == null) {
                dtkuVar2 = dtku.p;
            }
            dtol dtolVar2 = dtkuVar2.i;
            if (dtolVar2 == null) {
                dtolVar2 = dtol.q;
            }
            return iyjVar.a(dtolVar2, true);
        }
        return null;
    }
}
