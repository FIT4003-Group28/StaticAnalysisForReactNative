package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: biab  reason: default package */
/* loaded from: classes3.dex */
final class biab implements axvp {
    private final bwrs<ilo> a;
    @dzsi
    private final decq b;

    public biab(bwrs<ilo> bwrsVar, @dzsi decq decqVar) {
        this.a = bwrsVar;
        this.b = decqVar;
    }

    @Override // defpackage.axvp
    public final void E(boolean z, @dzsi azvc azvcVar, Context context) {
        bvrj.UI_THREAD.c();
        if (z) {
            ilo c = this.a.c();
            dndi bZ = dndj.e.bZ();
            dbsk.s(c);
            dndn dndnVar = c.h().ah;
            if (dndnVar == null) {
                dndnVar = dndn.c;
            }
            dndj dndjVar = dndnVar.b;
            if (dndjVar == null) {
                dndjVar = dndj.e;
            }
            bZ.bC(dndjVar);
            decq decqVar = this.b;
            dbsk.s(decqVar);
            int i = decqVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dndj dndjVar2 = (dndj) bZ.b;
            dndjVar2.a |= 16;
            dndjVar2.d = i;
            dndj bK = bZ.bK();
            ily g = c.g();
            dvya bZ2 = dvyw.bv.bZ();
            bZ2.bC(c.h());
            dndm bZ3 = dndn.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dndn dndnVar2 = (dndn) bZ3.b;
            bK.getClass();
            dndnVar2.b = bK;
            dndnVar2.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvyw dvywVar = (dvyw) bZ2.b;
            dndn bK2 = bZ3.bK();
            bK2.getClass();
            dvywVar.ah = bK2;
            dvywVar.b |= 4194304;
            g.E(bZ2.bK());
            this.a.d(g.d());
        }
    }
}
