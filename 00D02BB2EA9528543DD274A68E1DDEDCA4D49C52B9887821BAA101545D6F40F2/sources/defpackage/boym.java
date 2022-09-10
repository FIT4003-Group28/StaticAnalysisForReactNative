package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boym  reason: default package */
/* loaded from: classes3.dex */
public final class boym implements ink {
    final /* synthetic */ boys a;

    public boym(boys boysVar) {
        this.a = boysVar;
    }

    @Override // defpackage.ink
    public final void a(ilo iloVar) {
        this.a.i(iloVar);
    }

    @Override // defpackage.ink
    public final void b(ilo iloVar) {
        boys boysVar = this.a;
        if (boysVar.aD) {
            for (int i = 0; i < boysVar.aC.size(); i++) {
                if (iloVar.ai().p(boysVar.aC.get(i).ai())) {
                    inj injVar = boysVar.au;
                    View q = boysVar.q();
                    dbsk.s(q);
                    injVar.e(i, q, boysVar.H());
                    return;
                }
            }
            iloVar.ai().o();
        }
    }
}
