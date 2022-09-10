package defpackage;

import android.text.Html;
/* compiled from: PG */
/* renamed from: cfoe  reason: default package */
/* loaded from: classes4.dex */
public class cfoe implements cfnu {
    @dzsi
    private cfnz a;
    @dzsi
    private cfny b;
    @dzsi
    private cfnw c;

    @Override // defpackage.cfnu
    @dzsi
    public cfnz a() {
        return this.a;
    }

    @Override // defpackage.cfnu
    @dzsi
    public cfny b() {
        return this.b;
    }

    @Override // defpackage.cfnu
    @dzsi
    public cfnw c() {
        return this.c;
    }

    public cfoe(cfos cfosVar, cfoq cfoqVar, cfok cfokVar, dieq dieqVar, dddi dddiVar, @dzsi Runnable runnable, mw<dspd> mwVar) {
        diei dieiVar;
        dieo dieoVar;
        this.a = null;
        this.b = null;
        this.c = null;
        int a = diep.a(dieqVar.b);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                if (dieqVar.b == 3) {
                    dieiVar = (diei) dieqVar.c;
                } else {
                    dieiVar = diei.c;
                }
                this.a = cfos.a(Html.fromHtml(dieiVar.a), runnable);
                cfoh a2 = cfokVar.a.a();
                cfok.a(a2, 1);
                cfok.a(dddiVar, 2);
                cfok.a(dieiVar, 3);
                cfok.a(mwVar, 4);
                this.c = new cfoj(a2, dddiVar, dieiVar, mwVar);
                return;
            } else if (i != 1) {
                return;
            } else {
                if (dieqVar.b == 4) {
                    dieoVar = (dieo) dieqVar.c;
                } else {
                    dieoVar = dieo.d;
                }
                this.a = cfos.a(Html.fromHtml(dieoVar.b), runnable);
                cfon a3 = cfoqVar.a.a();
                cfoq.a(a3, 1);
                cfoq.a(dddiVar, 2);
                cfoq.a(dieoVar, 3);
                cfoq.a(mwVar, 4);
                this.b = new cfop(a3, dddiVar, dieoVar, mwVar);
                return;
            }
        }
        throw null;
    }
}
