package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oyv  reason: default package */
/* loaded from: classes7.dex */
public final class oyv implements cjyu<oxr> {
    private final cjqy a;
    private final oyc b;

    public oyv(cjqy cjqyVar, oyc oycVar) {
        this.a = cjqyVar;
        this.b = oycVar;
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ oxr a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
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
            return new oyy(context, cjztVar, dtljVar2, dtlbVar, this.a, this.b);
        }
        return null;
    }
}
