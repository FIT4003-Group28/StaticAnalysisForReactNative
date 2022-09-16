package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnv  reason: default package */
/* loaded from: classes2.dex */
public final class afnv implements afks {
    private final afnu a;

    public afnv(afnu afnuVar) {
        dbsk.s(afnuVar);
        this.a = afnuVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        dvzl dvzlVar = duqpVar.j;
        if (dvzlVar == null) {
            dvzlVar = dvzl.g;
        }
        boolean z = true;
        if ((dvzlVar.a & 1) == 0) {
            if ((duqpVar.a & 8) == 0) {
                throw new afkt("No place details request or response present.");
            }
            afnu afnuVar = this.a;
            dvzj dvzjVar = duqpVar.e;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            return afnuVar.a(dvzjVar);
        }
        dvzl dvzlVar2 = duqpVar.j;
        if (dvzlVar2 == null) {
            dvzlVar2 = dvzl.g;
        }
        ily ilyVar = new ily();
        dvyw dvywVar = dvzlVar2.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ilyVar.E(dvywVar);
        ilyVar.G(dvzlVar2.c);
        ilyVar.e = true;
        ilo d = ilyVar.d();
        if (intent == null || !affw.b(intent)) {
            z = false;
        }
        return this.a.b(d, z);
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_SEARCH;
    }
}
