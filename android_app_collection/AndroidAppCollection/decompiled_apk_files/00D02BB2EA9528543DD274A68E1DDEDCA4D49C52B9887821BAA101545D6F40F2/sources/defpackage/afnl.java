package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnl  reason: default package */
/* loaded from: classes2.dex */
public final class afnl implements afks {
    private final boolean a;
    private final afnk b;

    public afnl(boolean z, afnk afnkVar) {
        this.a = z;
        dbsk.s(afnkVar);
        this.b = afnkVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        if (duqpVar != null) {
            dvzl dvzlVar = duqpVar.j;
            if (dvzlVar == null) {
                dvzlVar = dvzl.g;
            }
            amvh amvhVar = null;
            if ((dvzlVar.a & 1) != 0) {
                dvzl dvzlVar2 = duqpVar.j;
                if (dvzlVar2 == null) {
                    dvzlVar2 = dvzl.g;
                }
                dvyw dvywVar = dvzlVar2.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                ily ilyVar = new ily();
                ilyVar.E(dvywVar);
                amvhVar = ilyVar.d().d();
            } else if ((duqpVar.a & 8) != 0) {
                dvzj dvzjVar = duqpVar.e;
                if (dvzjVar == null) {
                    dvzjVar = dvzj.y;
                }
                bgej bgejVar = new bgej(dvzjVar, null);
                amvg P = amvh.P();
                P.a = dpjs.ENTITY_TYPE_DEFAULT;
                dvzj dvzjVar2 = bgejVar.a;
                P.b = dvzjVar2.c;
                P.c = akqi.f(dvzjVar2.b);
                if ((dvzjVar2.a & 4) != 0) {
                    dhjz dhjzVar = dvzjVar2.d;
                    if (dhjzVar == null) {
                        dhjzVar = dhjz.e;
                    }
                    P.d = akqq.j(dhjzVar);
                }
                amvhVar = P.a();
            }
            duqc duqcVar = duqpVar.x;
            if (duqcVar == null) {
                duqcVar = duqc.f;
            }
            if (amvhVar != null) {
                return this.b.a(amvhVar, duqcVar, this.a ? qbs.NAVIGATION : qbs.DEFAULT);
            }
            throw new afkt("no place details");
        }
        throw new afkt("null external invocation response");
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_DIRECTIONS;
    }
}
