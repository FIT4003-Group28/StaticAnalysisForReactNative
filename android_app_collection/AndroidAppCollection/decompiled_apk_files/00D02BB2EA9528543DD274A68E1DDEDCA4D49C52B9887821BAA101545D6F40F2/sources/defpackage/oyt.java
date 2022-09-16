package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oyt  reason: default package */
/* loaded from: classes7.dex */
public final class oyt implements cjyu<oxp> {
    private final oyc a;

    public oyt(oyc oycVar) {
        this.a = oycVar;
    }

    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ oxp a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        if ((dtkuVar.a & 512) != 0) {
            dtku dtkuVar2 = dtkxVar.b;
            if (dtkuVar2 == null) {
                dtkuVar2 = dtku.p;
            }
            dtlj dtljVar = dtkuVar2.j;
            if (dtljVar == null) {
                dtljVar = dtlj.b;
            }
            dtlj dtljVar2 = dtljVar;
            dtlb dtlbVar = dtlfVar.c;
            if (dtlbVar == null) {
                dtlbVar = dtlb.i;
            }
            return new oyu(context, cjztVar, dtljVar2, dtlbVar, this.a);
        }
        return null;
    }
}
