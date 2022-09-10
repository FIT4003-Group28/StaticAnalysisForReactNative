package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aqwf  reason: default package */
/* loaded from: classes2.dex */
public final class aqwf extends aqwn {
    @dzsi
    public transient aprv a;
    @dzsi
    public transient akfa b;
    @dzsi
    public transient dxio<cjot> c;
    private final String d;
    private final apzb e;

    public aqwf(String str, apzb apzbVar) {
        this.d = str;
        this.e = apzbVar;
    }

    @Override // defpackage.aqwn
    public final void b(gga ggaVar, int i) {
        btlu j;
        Set<String> d;
        ((aqwg) btsq.b(aqwg.class, ggaVar)).xb(this);
        akfa akfaVar = this.b;
        if (akfaVar == null || this.a == null || (j = akfaVar.j()) == null || (d = this.a.d(j)) == null || d.size() <= 1) {
            dxio<cjot> dxioVar = this.c;
            if (dxioVar == null) {
                return;
            }
            int i2 = this.e.q;
            cjot a = dxioVar.a();
            apzu bZ = apzv.c.bZ();
            apzq bZ2 = apzt.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            apzt apztVar = (apzt) bZ2.b;
            apztVar.b = 2;
            int i3 = apztVar.a | 1;
            apztVar.a = i3;
            apztVar.a = 2 | i3;
            apztVar.c = i2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            apzv apzvVar = (apzv) bZ.b;
            apzt bK = bZ2.bK();
            bK.getClass();
            apzvVar.b = bK;
            apzvVar.a = 1 | apzvVar.a;
            a.b(bZ.bK());
            return;
        }
        apzd f = apze.f();
        f.c(true);
        f.d(this.d);
        f.b(this.e);
        new aqwe(f.a()).b(ggaVar, i);
    }
}
