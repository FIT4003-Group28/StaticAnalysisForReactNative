package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aehr  reason: default package */
/* loaded from: classes2.dex */
public class aehr {
    private final btvo a;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(1, "MANUALLY_SELECTED");
        dcdgVar.f(2, "USER_HISTORY");
        dcdgVar.b();
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(0, "DEFAULT");
        dcdgVar2.f(1, "USER_REQUESTED");
        dcdgVar2.f(2, "USER_HISTORY");
        dcdgVar2.f(3, "UNSPECIFIED");
        dcdgVar2.f(4, "DEFAULT_PREFILLED");
        dcdgVar2.f(5, "USER_REQUESTED_DEFAULT_DATE");
        dcdgVar2.f(6, "USER_HISTORY_TRIPS");
        dcdgVar2.f(7, "USER_HISTORY_FLIGHTS");
        dcdgVar2.b();
    }

    public aehr(btvo btvoVar) {
        this.a = btvoVar;
    }

    public static dnnn a() {
        dnnh bZ = dnnn.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnnn dnnnVar = (dnnn) bZ.b;
        dnnnVar.e = 0;
        dnnnVar.a |= 8;
        return bZ.bK();
    }

    public static boolean b(@dzsi dnng dnngVar) {
        if (dnngVar == null || (dnngVar.a & 32) == 0) {
            return false;
        }
        dnnn dnnnVar = dnngVar.b;
        if (dnnnVar == null) {
            dnnnVar = dnnn.l;
        }
        return c(dnnnVar);
    }

    public static boolean c(@dzsi dnnn dnnnVar) {
        return (dnnnVar == null || (dnnnVar.a & 2) == 0 || dnnnVar.b.isEmpty()) ? false : true;
    }

    public static aehu d(dnnn dnnnVar) {
        eapg h = aehu.h(dnnnVar.b);
        return new aehu(h, h.p(dnnnVar.c));
    }

    public static String e(Activity activity, dnnn dnnnVar) {
        return d(dnnnVar).b(activity);
    }

    private static dpoj j(eapg eapgVar) {
        dpoi bZ = dpoj.e.bZ();
        int r = eapgVar.r();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpoj dpojVar = (dpoj) bZ.b;
        dpojVar.a |= 1;
        dpojVar.b = r;
        int s = eapgVar.s();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpoj dpojVar2 = (dpoj) bZ.b;
        dpojVar2.a |= 2;
        dpojVar2.c = s;
        int t = eapgVar.t();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpoj dpojVar3 = (dpoj) bZ.b;
        dpojVar3.a |= 4;
        dpojVar3.d = t;
        return bZ.bK();
    }

    public final dnnn f(eapg eapgVar, eapg eapgVar2) {
        return g(dnnn.l, eapgVar, eapgVar2);
    }

    public final dnnn g(dnnn dnnnVar, eapg eapgVar, eapg eapgVar2) {
        dsqp dsqpVar = (dsqp) dnnnVar.cu(5);
        dsqpVar.bC(dnnnVar);
        dnnh dnnhVar = (dnnh) dsqpVar;
        if (i()) {
            dqwz bZ = dqxa.f.bZ();
            dpoj j = j(eapgVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqxa dqxaVar = (dqxa) bZ.b;
            j.getClass();
            dqxaVar.d = j;
            dqxaVar.a |= 1;
            dpoj j2 = j(eapgVar2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqxa dqxaVar2 = (dqxa) bZ.b;
            j2.getClass();
            dqxaVar2.e = j2;
            dqxaVar2.a |= 2;
            dqxaVar2.b = 5;
            dqxaVar2.c = true;
            dqxa bK = bZ.bK();
            if (dnnhVar.c) {
                dnnhVar.bF();
                dnnhVar.c = false;
            }
            dnnn dnnnVar2 = (dnnn) dnnhVar.b;
            dnnn dnnnVar3 = dnnn.l;
            bK.getClass();
            dnnnVar2.d = bK;
            dnnnVar2.a |= 4;
        }
        int max = Math.max(1, eaov.c(eapgVar, eapgVar2).p);
        String h = aehu.a.h(eapgVar);
        if (dnnhVar.c) {
            dnnhVar.bF();
            dnnhVar.c = false;
        }
        dnnn dnnnVar4 = (dnnn) dnnhVar.b;
        dnnn dnnnVar5 = dnnn.l;
        h.getClass();
        int i = dnnnVar4.a | 1;
        dnnnVar4.a = i;
        dnnnVar4.b = h;
        dnnnVar4.a = i | 2;
        dnnnVar4.c = max;
        return dnnhVar.bK();
    }

    public final dnnn h(dnnn dnnnVar) {
        dnnj bZ = dnnk.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnnk dnnkVar = (dnnk) bZ.b;
        dnnkVar.a |= 64;
        dnnkVar.d = true;
        dnnk dnnkVar2 = (dnnk) bZ.b;
        dnnkVar2.a |= 1;
        dnnkVar2.b = true;
        dnnk dnnkVar3 = (dnnk) bZ.b;
        dnnkVar3.a |= 2;
        dnnkVar3.c = true;
        dnnk dnnkVar4 = (dnnk) bZ.b;
        dnnkVar4.a |= 256;
        dnnkVar4.f = true;
        dnnk dnnkVar5 = (dnnk) bZ.b;
        dnnkVar5.a |= 128;
        dnnkVar5.e = true;
        dsqp dsqpVar = (dsqp) dnnnVar.cu(5);
        dsqpVar.bC(dnnnVar);
        dnnh dnnhVar = (dnnh) dsqpVar;
        drdh bZ2 = drdi.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdi.f((drdi) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdi.i((drdi) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdi.c((drdi) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdi.d((drdi) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdi.b((drdi) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdi.h((drdi) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdi.g((drdi) bZ2.b);
        if (dnnhVar.c) {
            dnnhVar.bF();
            dnnhVar.c = false;
        }
        dnnn dnnnVar2 = (dnnn) dnnhVar.b;
        drdi bK = bZ2.bK();
        dnnn dnnnVar3 = dnnn.l;
        bK.getClass();
        dnnnVar2.i = bK;
        dnnnVar2.a |= 2048;
        if (dnnhVar.c) {
            dnnhVar.bF();
            dnnhVar.c = false;
        }
        dnnn dnnnVar4 = (dnnn) dnnhVar.b;
        dnnk bK2 = bZ.bK();
        bK2.getClass();
        dnnnVar4.k = bK2;
        dnnnVar4.a |= 32768;
        return dnnhVar.bK();
    }

    public final boolean i() {
        return this.a.getHotelBookingModuleParameters().j();
    }
}
