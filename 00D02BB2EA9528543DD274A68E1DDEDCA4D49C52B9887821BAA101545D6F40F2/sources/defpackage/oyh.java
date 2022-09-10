package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oyh  reason: default package */
/* loaded from: classes7.dex */
public final class oyh implements cjyu<oxi> {
    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ oxi a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtlb dtlbVar = null;
        if ((dtkuVar.a & 1) != 0) {
            dtku dtkuVar2 = dtkxVar.b;
            if (dtkuVar2 == null) {
                dtkuVar2 = dtku.p;
            }
            dtkf dtkfVar = dtkuVar2.b;
            if (dtkfVar == null) {
                dtkfVar = dtkf.n;
            }
            if ((dtlfVar.a & 2) != 0 && (dtlbVar = dtlfVar.c) == null) {
                dtlbVar = dtlb.i;
            }
            return new oyj(context, cjztVar, dtkfVar, dtlbVar);
        }
        return null;
    }
}
