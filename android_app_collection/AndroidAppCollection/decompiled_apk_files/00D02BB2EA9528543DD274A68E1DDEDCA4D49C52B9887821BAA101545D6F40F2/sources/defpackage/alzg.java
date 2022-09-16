package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alzg  reason: default package */
/* loaded from: classes.dex */
public final class alzg implements alzp {
    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        if (altvVar == null) {
            return;
        }
        String o = altvVar.a.o();
        int i = 0;
        while (true) {
            if (i >= ((dmxh) dmxgVar.b).c.size()) {
                i = -1;
                break;
            }
            int a = dmww.a(dmxgVar.a(i).b);
            if (a != 0 && a == 3 && dmxgVar.a(i).c.equals(akry.INDOOR.J)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        dmwx a2 = dmxgVar.a(i);
        dsqp dsqpVar = (dsqp) a2.cu(5);
        dsqpVar.bC(a2);
        dmwu dmwuVar = (dmwu) dsqpVar;
        dmws bZ = dmwt.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmwt dmwtVar = (dmwt) bZ.b;
        int i2 = dmwtVar.a | 1;
        dmwtVar.a = i2;
        dmwtVar.b = "lv";
        o.getClass();
        dmwtVar.a = i2 | 2;
        dmwtVar.c = o;
        dmwuVar.a(bZ);
        dmxgVar.e(i, (dmwx) dmwuVar.bK());
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        if (list.isEmpty()) {
            return true;
        }
        return dbsd.a(list.get(0).b().d, ((alzc) alzrVar).a.d);
    }
}
