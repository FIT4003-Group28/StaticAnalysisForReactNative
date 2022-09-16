package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pyy  reason: default package */
/* loaded from: classes7.dex */
public final class pyy {
    public static pyx a(dpgh dpghVar) {
        pyw bZ = pyx.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        pyx pyxVar = (pyx) bZ.b;
        dpghVar.getClass();
        pyxVar.b = dpghVar;
        pyxVar.a = 1;
        return bZ.bK();
    }

    public static pyx b(dqtp dqtpVar) {
        pyw bZ = pyx.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        pyx pyxVar = (pyx) bZ.b;
        dqtpVar.getClass();
        pyxVar.b = dqtpVar;
        pyxVar.a = 2;
        return bZ.bK();
    }

    public static dcdc<pyx> c(List<dpgh> list) {
        dccx F = dcdc.F();
        for (dpgh dpghVar : list) {
            F.g(a(dpghVar));
        }
        return F.f();
    }

    public static List<pyx> d(amve amveVar) {
        dsrj<dqtp> dsrjVar = amveVar.a.h;
        List<dpgh> w = vyb.w(amveVar);
        if (!dsrjVar.isEmpty()) {
            dccx F = dcdc.F();
            for (dqtp dqtpVar : dsrjVar) {
                F.g(b(dqtpVar));
            }
            return dcdc.q(dcbg.d(F.f(), c(w)));
        }
        return c(w);
    }

    public static boolean e(amve amveVar) {
        dpgy dpgyVar = amveVar.b().g;
        if (dpgyVar == null) {
            dpgyVar = dpgy.c;
        }
        return dpgyVar.b.size() > 0 || amveVar.a.h.size() > 0;
    }
}
