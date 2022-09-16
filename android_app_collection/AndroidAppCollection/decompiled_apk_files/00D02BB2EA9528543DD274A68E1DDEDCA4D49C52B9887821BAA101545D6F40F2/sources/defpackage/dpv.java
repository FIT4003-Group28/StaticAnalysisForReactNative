package defpackage;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dpv  reason: default package */
/* loaded from: classes6.dex */
public final class dpv implements dfeq<dfhp> {
    final /* synthetic */ dpw a;
    private final dki b;

    public dpv(dpw dpwVar) {
        this.a = dpwVar;
        dkj dkjVar = dpwVar.c;
        dbsg<cjqp> dbsgVar = dpwVar.a;
        dkh a = dkjVar.a.a();
        dkj.a(a, 1);
        cjqy a2 = dkjVar.b.a();
        dkj.a(a2, 2);
        dkj.a(dbsgVar, 3);
        this.b = new dki(a, a2, dbsgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(@dzsi akqi akqiVar) {
        dki dkiVar = this.b;
        if (Objects.equals(dkiVar.a, akqiVar)) {
            return;
        }
        dkiVar.a = akqiVar;
        dkiVar.c();
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(dfhp dfhpVar) {
        dpu dpuVar;
        dfhp dfhpVar2 = dfhpVar;
        this.b.n(dfhpVar2);
        dpw dpwVar = this.a;
        dfer dferVar = dpwVar.e;
        if (dferVar != null && (dpuVar = dpwVar.f) != null) {
            dferVar.f(dpuVar.a(dfhpVar2.a));
        }
        for (dfeq<dfhp> dfeqVar : this.a.d) {
            dfeqVar.n(dfhpVar2);
        }
    }
}
