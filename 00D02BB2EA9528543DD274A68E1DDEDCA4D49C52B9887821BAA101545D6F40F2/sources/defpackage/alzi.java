package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alzi  reason: default package */
/* loaded from: classes2.dex */
public final class alzi implements alzp {
    private final alyl a;

    public alzi(alyl alylVar) {
        this.a = alylVar;
    }

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        dxdm c = this.a.c();
        if (c != null) {
            int i = 0;
            while (true) {
                if (i >= ((dmxh) dmxgVar.b).c.size()) {
                    i = -1;
                    break;
                }
                int a = dmww.a(dmxgVar.a(i).b);
                if (a != 0 && a == 3 && dmxgVar.a(i).c.isEmpty()) {
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
            String str = c.b;
            if (dmwuVar.c) {
                dmwuVar.bF();
                dmwuVar.c = false;
            }
            dmwx dmwxVar = (dmwx) dmwuVar.b;
            dmwx dmwxVar2 = dmwx.g;
            str.getClass();
            dmwxVar.a |= 2;
            dmwxVar.c = str;
            for (dxdo dxdoVar : c.c) {
                dmws bZ = dmwt.d.bZ();
                String str2 = dxdoVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmwt dmwtVar = (dmwt) bZ.b;
                str2.getClass();
                int i2 = dmwtVar.a | 1;
                dmwtVar.a = i2;
                dmwtVar.b = str2;
                String str3 = dxdoVar.c;
                str3.getClass();
                dmwtVar.a = i2 | 2;
                dmwtVar.c = str3;
                dmwuVar.a(bZ);
            }
            dmws bZ2 = dmwt.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmwt dmwtVar2 = (dmwt) bZ2.b;
            int i3 = dmwtVar2.a | 1;
            dmwtVar2.a = i3;
            dmwtVar2.b = "mymapslayerid";
            String str4 = c.d;
            str4.getClass();
            dmwtVar2.a = i3 | 2;
            dmwtVar2.c = str4;
            dmwuVar.a(bZ2);
            dmxgVar.d(i, dmwuVar);
        }
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }
}
