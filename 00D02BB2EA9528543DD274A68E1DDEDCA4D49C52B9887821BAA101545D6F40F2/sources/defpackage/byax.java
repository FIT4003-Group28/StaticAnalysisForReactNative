package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: byax  reason: default package */
/* loaded from: classes4.dex */
public final class byax extends bybp {
    public final bycb a;
    public dcdc<byay> b = dcdc.e();
    @dzsi
    public byca c;
    private final bvrb e;

    public byax(bvrb bvrbVar, bycb bycbVar) {
        this.e = bvrbVar;
        this.a = bycbVar;
    }

    @Override // defpackage.bybp
    public final boolean a(byay byayVar) {
        return byayVar.b != null;
    }

    public final void b(byay byayVar) {
        byca bycaVar = this.c;
        dbsk.s(bycaVar);
        bvrj.UI_THREAD.c();
        bvrj.UI_THREAD.c();
        dehn<List<? extends bqyh>> dehnVar = bycaVar.g;
        if (dehnVar == null) {
            deig d = deig.d();
            bycaVar.e.b(new bybv(bycaVar, d), bvrj.BACKGROUND_THREADPOOL);
            bycaVar.g = deew.h(d, bycaVar.i, dege.a);
            dehnVar = bycaVar.g;
        }
        deha.q(deew.h(dehnVar, bycaVar.h, dege.a), new byav(this, byayVar), this.e.h());
    }

    public final void c(byay byayVar, @dzsi bqyh bqyhVar) {
        if (bqyhVar == null) {
            return;
        }
        byayVar.a = bqyhVar.b.S();
        byayVar.b = bqyhVar;
        byayVar.c = dcyn.a;
        f();
    }

    @Override // defpackage.bybp
    public final /* bridge */ /* synthetic */ List d() {
        return this.b;
    }
}
