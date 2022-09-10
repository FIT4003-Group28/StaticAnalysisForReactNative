package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oyq  reason: default package */
/* loaded from: classes7.dex */
public final class oyq implements cjyu<oxo> {
    private final bccu a;

    public oyq(bccu bccuVar) {
        this.a = bccuVar;
    }

    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ oxo a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        if ((dtkuVar.a & 4096) != 0) {
            dtku dtkuVar2 = dtkxVar.b;
            if (dtkuVar2 == null) {
                dtkuVar2 = dtku.p;
            }
            dtnv dtnvVar = dtkuVar2.l;
            if (dtnvVar == null) {
                dtnvVar = dtnv.g;
            }
            dtnv dtnvVar2 = dtnvVar;
            dtlb dtlbVar = dtlfVar.c;
            if (dtlbVar == null) {
                dtlbVar = dtlb.i;
            }
            return new oys(context, cjztVar, dtnvVar2, dtlbVar, this.a);
        }
        return null;
    }
}
