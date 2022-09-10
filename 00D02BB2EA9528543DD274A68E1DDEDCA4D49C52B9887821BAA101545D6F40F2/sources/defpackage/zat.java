package defpackage;
/* compiled from: PG */
/* renamed from: zat  reason: default package */
/* loaded from: classes7.dex */
public final class zat {
    public static dcdc<qdv> a(amve amveVar, boolean z, boolean z2) {
        if (amveVar.e() == 0) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        amtr d = amveVar.d(0);
        for (int i = 0; i < d.e(); i++) {
            amuq d2 = d.d(i);
            dqvj c = dqvj.c(d2.a().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (c == dqvj.TRANSIT) {
                F.g(qdv.f(d2.g(), z, z2));
                if (z2) {
                    dpgw dpgwVar = d2.g().d;
                    if (dpgwVar == null) {
                        dpgwVar = dpgw.r;
                    }
                    qbc qbcVar = (dpgwVar.a & 4096) != 0 ? new qbc(akqi.b(dpgwVar.n), dcdc.e(), 0, 1, true) : null;
                    if (qbcVar != null) {
                        F.g(qbcVar);
                    }
                }
            }
        }
        return F.f();
    }

    public static dcdc<qdv> b(amsy amsyVar, boolean z, boolean z2) {
        amve[] amveVarArr;
        dccx F = dcdc.F();
        for (amve amveVar : amsyVar.d) {
            amuq amuqVar = null;
            if (amveVar.e() != 0) {
                amtr d = amveVar.d(0);
                int i = 0;
                while (true) {
                    if (i >= d.e()) {
                        break;
                    }
                    amuq d2 = d.d(i);
                    dqvj c = dqvj.c(d2.a().b);
                    if (c == null) {
                        c = dqvj.DRIVE;
                    }
                    if (c == dqvj.TRANSIT) {
                        amuqVar = d2;
                        break;
                    }
                    i++;
                }
            }
            if (amuqVar != null) {
                F.g(qdv.f(amuqVar.g(), z, z2));
            }
        }
        return F.f();
    }
}
