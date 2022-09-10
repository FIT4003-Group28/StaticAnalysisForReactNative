package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bddl  reason: default package */
/* loaded from: classes3.dex */
public final class bddl implements bdah {
    private final btvo a;
    private final bddt b;

    public bddl(btvo btvoVar, bddt bddtVar) {
        this.a = btvoVar;
        this.b = bddtVar;
    }

    @Override // defpackage.bdah
    @dzsi
    public final /* bridge */ /* synthetic */ jbt a(bczw bczwVar) {
        if (!this.a.getUgcOfferingsParameters().i()) {
            return null;
        }
        bddt bddtVar = this.b;
        dwfl a = bczwVar.a();
        Activity activity = (Activity) ((dxjd) bddtVar.a).a;
        bddt.a(activity, 1);
        cqhn a2 = bddtVar.b.a();
        bddt.a(a2, 2);
        cqkj a3 = bddtVar.c.a();
        bddt.a(a3, 3);
        ccst a4 = bddtVar.d.a();
        bddt.a(a4, 4);
        bvrb a5 = bddtVar.e.a();
        bddt.a(a5, 5);
        gfw gfwVar = (gfw) ((dxjd) bddtVar.f).a;
        bddt.a(gfwVar, 6);
        bddt.a(a, 7);
        return new bdds(activity, a2, a3, a4, a5, gfwVar, a);
    }
}
