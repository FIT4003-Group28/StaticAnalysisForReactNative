package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: baao  reason: default package */
/* loaded from: classes3.dex */
public final class baao extends bttk<dvor, dvov> {
    public final dvor a;
    @dzsi
    public dvov b;
    @dzsi
    public int c;
    private final azlq d;

    public baao(dvor dvorVar, azlq azlqVar) {
        dunt duntVar = dunt.UNKNOWN_REQUEST_ID;
        bvrj bvrjVar = bvrj.CURRENT;
        this.a = dvorVar;
        this.d = azlqVar;
    }

    @Override // defpackage.bttu
    protected final void a(@dzsi bttq bttqVar) {
        if (bttqVar != null || this.b == null || this.c != dvou.a) {
            azlq azlqVar = this.d;
            int i = this.c;
            if (i == 0) {
                i = dvou.b;
            }
            azlqVar.a(i);
            return;
        }
        dvov dvovVar = this.b;
        dbsk.s(dvovVar);
        if ((dvovVar.a & 1) == 0) {
            this.d.a(dvou.b);
            return;
        }
        ArrayList a = dchl.a();
        for (int i2 = 0; i2 < dvovVar.c.size(); i2++) {
            a.add(dvovVar.c.get(i2).G());
        }
        ArrayList a2 = dchl.a();
        for (int i3 = 0; i3 < dvovVar.d.size(); i3++) {
            a2.add(dvovVar.d.get(i3));
        }
        azlq azlqVar2 = this.d;
        azlqVar2.c.K(a, a2, azlqVar2.a, azlqVar2.d, azlqVar2.b);
    }
}
