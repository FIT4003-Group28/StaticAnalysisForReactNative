package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alzy  reason: default package */
/* loaded from: classes.dex */
public final class alzy implements alzp {
    public int a = -1;

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        int i = this.a;
        if (i < 0 || i > TimeUnit.DAYS.toSeconds(7L)) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= ((dmxh) dmxgVar.b).c.size()) {
                i2 = -1;
                break;
            }
            int a = dmww.a(dmxgVar.a(i2).b);
            if (a != 0 && a == 3 && dmxgVar.a(i2).c.equals("traffic")) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return;
        }
        dmwx a2 = dmxgVar.a(i2);
        dsqp dsqpVar = (dsqp) a2.cu(5);
        dsqpVar.bC(a2);
        dmwu dmwuVar = (dmwu) dsqpVar;
        dmws bZ = dmwt.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmwt dmwtVar = (dmwt) bZ.b;
        dmwtVar.a |= 1;
        dmwtVar.b = "seconds_into_week";
        String valueOf = String.valueOf(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmwt dmwtVar2 = (dmwt) bZ.b;
        valueOf.getClass();
        dmwtVar2.a |= 2;
        dmwtVar2.c = valueOf;
        dmwuVar.a(bZ);
        dmxgVar.e(i2, (dmwx) dmwuVar.bK());
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }
}
