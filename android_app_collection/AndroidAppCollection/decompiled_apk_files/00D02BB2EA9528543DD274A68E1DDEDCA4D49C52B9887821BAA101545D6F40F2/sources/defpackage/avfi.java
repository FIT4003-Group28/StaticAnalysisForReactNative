package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: avfi  reason: default package */
/* loaded from: classes2.dex */
public final class avfi<T> extends btrh<T> {
    private final int d;

    public avfi(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            avfg avfgVar = (avfg) this.a;
            cray b = ((crmj) obj).b.b();
            if (b == null) {
                return;
            }
            List<akra> y = b.a.y();
            if (y.isEmpty()) {
                return;
            }
            List<akqq> k = dchl.k(y, avff.a);
            avij avijVar = avfgVar.b;
            dloy bZ = dlpa.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlpa dlpaVar = (dlpa) bZ.b;
            dlpaVar.b = 1;
            dlpaVar.a = 1 | dlpaVar.a;
            avijVar.u(k, bZ.bK());
            return;
        }
        avfg avfgVar2 = (avfg) this.a;
        ilo iloVar = ((bwka) obj).a;
        if (iloVar == null || iloVar.aj() == null) {
            return;
        }
        akqq aj = iloVar.aj();
        avij avijVar2 = avfgVar2.b;
        dcdc f = dcdc.f(aj);
        dloy bZ2 = dlpa.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlpa dlpaVar2 = (dlpa) bZ2.b;
        dlpaVar2.b = 2;
        dlpaVar2.a = 1 | dlpaVar2.a;
        avijVar2.u(f, bZ2.bK());
    }
}
