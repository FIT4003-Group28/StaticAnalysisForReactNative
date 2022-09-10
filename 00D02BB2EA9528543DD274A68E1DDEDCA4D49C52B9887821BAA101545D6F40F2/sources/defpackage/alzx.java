package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alzx  reason: default package */
/* loaded from: classes2.dex */
public final class alzx implements alzp {
    private final String a;

    public alzx(dkiy dkiyVar, duxu duxuVar) {
        String str = true != dkiyVar.bl ? "!1b0" : "!1b1";
        String str2 = true != duxuVar.b ? "!2b0" : "!2b1";
        this.a = str2.length() != 0 ? str.concat(str2) : new String(str);
    }

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        int i = 0;
        while (true) {
            if (i >= ((dmxh) dmxgVar.b).c.size()) {
                i = -1;
                break;
            }
            int a = dmww.a(dmxgVar.a(i).b);
            if (a != 0 && a == 3 && dmxgVar.a(i).c.equals("svv")) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        dmwx a2 = dmxgVar.a(i);
        for (dmwt dmwtVar : a2.e) {
            if (dmwtVar.b.equals("svl")) {
                return;
            }
        }
        dsqp dsqpVar = (dsqp) a2.cu(5);
        dsqpVar.bC(a2);
        dmwu dmwuVar = (dmwu) dsqpVar;
        dmws bZ = dmwt.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmwt dmwtVar2 = (dmwt) bZ.b;
        int i2 = dmwtVar2.a | 1;
        dmwtVar2.a = i2;
        dmwtVar2.b = "svl";
        String str = this.a;
        str.getClass();
        dmwtVar2.a = i2 | 2;
        dmwtVar2.c = str;
        dmwuVar.a(bZ);
        dmxgVar.e(i, (dmwx) dmwuVar.bK());
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }
}
