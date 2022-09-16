package defpackage;

import android.app.Activity;
import android.content.Context;
/* compiled from: PG */
/* renamed from: ozj  reason: default package */
/* loaded from: classes7.dex */
public final class ozj implements cjyu<izm> {
    private final ixf a;

    public ozj(ixf ixfVar) {
        this.a = ixfVar;
    }

    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ izm a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        if ((dtkuVar.a & 128) != 0) {
            dtku dtkuVar2 = dtkxVar.b;
            if (dtkuVar2 == null) {
                dtkuVar2 = dtku.p;
            }
            dtol dtolVar = dtkuVar2.i;
            if (dtolVar == null) {
                dtolVar = dtol.q;
            }
            if ((dtolVar.a & 1024) == 0) {
                dtku dtkuVar3 = dtkxVar.b;
                if (dtkuVar3 == null) {
                    dtkuVar3 = dtku.p;
                }
                dtol dtolVar2 = dtkuVar3.i;
                if (dtolVar2 == null) {
                    dtolVar2 = dtol.q;
                }
                if ((dtolVar2.a & 256) == 0) {
                    return null;
                }
            }
            ixf ixfVar = this.a;
            dtku dtkuVar4 = dtkxVar.b;
            if (dtkuVar4 == null) {
                dtkuVar4 = dtku.p;
            }
            dtol dtolVar3 = dtkuVar4.i;
            if (dtolVar3 == null) {
                dtolVar3 = dtol.q;
            }
            dtol dtolVar4 = dtolVar3;
            ixf.a(dtolVar4, 1);
            iyj a = ixfVar.a.a();
            ixf.a(a, 2);
            ixv a2 = ixfVar.b.a();
            ixf.a(a2, 3);
            ixb a3 = ixfVar.c.a();
            ixf.a(a3, 4);
            Activity activity = (Activity) ((dxjd) ixfVar.d).a;
            ixf.a(activity, 5);
            btvo a4 = ixfVar.e.a();
            ixf.a(a4, 6);
            return new ixe(dtolVar4, a, a2, a3, activity, a4);
        }
        return null;
    }
}
