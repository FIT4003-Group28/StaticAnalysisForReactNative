package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alzz  reason: default package */
/* loaded from: classes2.dex */
public final class alzz implements alzp {
    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        if (((dmxh) dmxgVar.b).b.size() > 0) {
            drsu drsuVar = ((dmxh) dmxgVar.b).b.get(0).b;
            if (drsuVar == null) {
                drsuVar = drsu.e;
            }
            if (drsuVar.b < 14) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= ((dmxh) dmxgVar.b).c.size()) {
                    i = -1;
                    break;
                }
                int a = dmww.a(dmxgVar.a(i).b);
                if (a != 0 && a == 3 && dmxgVar.a(i).c.equals("transit")) {
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
            dmwtVar.b = "sp";
            dmwtVar.a = i2 | 2;
            dmwtVar.c = "2";
            dmwuVar.a(bZ);
            dmxgVar.e(i, (dmwx) dmwuVar.bK());
        }
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        if (list.isEmpty()) {
            return true;
        }
        int i = list.get(0).b().a;
        int i2 = ((alzc) alzrVar).a.a;
        if (i < 14 && i2 < 14) {
            return true;
        }
        return i >= 14 && i2 >= 14;
    }
}
