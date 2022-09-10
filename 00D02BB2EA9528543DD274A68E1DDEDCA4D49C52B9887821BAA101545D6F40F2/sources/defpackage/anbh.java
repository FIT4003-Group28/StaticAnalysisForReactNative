package defpackage;
/* compiled from: PG */
/* renamed from: anbh  reason: default package */
/* loaded from: classes.dex */
public final class anbh {
    public final anbi a;

    public anbh(anbi anbiVar) {
        this.a = anbiVar;
    }

    public final void a(boolean z) {
        anbi anbiVar = this.a;
        if (!anbiVar.c.a() || anbiVar.c.b() != dpsv.DINING || anbiVar.d()) {
            if (z) {
                if (anbiVar.c.a() && anbiVar.c.b() != anbiVar.d) {
                    anbiVar.c();
                    return;
                } else if (anbiVar.c.a()) {
                    return;
                }
            }
            anbiVar.a();
        }
    }

    public final void b(dpsv dpsvVar) {
        anbi anbiVar = this.a;
        if ((dpsvVar == dpsv.DINING && !anbiVar.d()) || dpsvVar == null || dpsvVar == dpsv.UNKNOWN_VERTICAL) {
            return;
        }
        if (anbiVar.c.a() && anbiVar.c.b() == dpsvVar) {
            return;
        }
        if (dpsvVar != dpsv.DINING || anbiVar.a.getSearchParameters().l()) {
            if (dpsvVar == dpsv.DINING && anbiVar.a.getSearchParameters().l()) {
                cjqp g = anbiVar.b.g();
                cjta cjtaVar = new cjta();
                cjtaVar.d = dtxn.r;
                cjtaVar.w(ddhj.VISIBILITY_VISIBLE);
                g.d(cjtaVar.a());
            }
            anbiVar.c = dbsg.i(dpsvVar);
            anbiVar.b();
            anbiVar.c();
        } else if (!anbiVar.a.getSearchParameters().m()) {
        } else {
            cjqp g2 = anbiVar.b.g();
            cjta cjtaVar2 = new cjta();
            cjtaVar2.d = dtxn.r;
            cjtaVar2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g2.d(cjtaVar2.a());
        }
    }
}
