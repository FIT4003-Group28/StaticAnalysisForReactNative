package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: cbpy  reason: default package */
/* loaded from: classes4.dex */
public final class cbpy {
    private static final dcco<Integer, dpol> a;

    static {
        dccm b = dcco.b();
        b.d(2, dpol.MONDAY);
        b.d(3, dpol.TUESDAY);
        b.d(4, dpol.WEDNESDAY);
        b.d(5, dpol.THURSDAY);
        b.d(6, dpol.FRIDAY);
        b.d(7, dpol.SATURDAY);
        b.d(1, dpol.SUNDAY);
        a = b.b();
    }

    public static eaph a(dpvi dpviVar) {
        return new eaph(dpviVar.b, dpviVar.c, dpviVar.d, dpviVar.e, dpviVar.f);
    }

    public static dpvi b(dpvi dpviVar, int i) {
        eaph l = a(dpviVar).l(i);
        dsqp dsqpVar = (dsqp) dpviVar.cu(5);
        dsqpVar.bC(dpviVar);
        dpvh dpvhVar = (dpvh) dsqpVar;
        int m = l.m();
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar2 = (dpvi) dpvhVar.b;
        dpvi dpviVar3 = dpvi.g;
        dpviVar2.a |= 1;
        dpviVar2.b = m;
        int n = l.n();
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar4 = (dpvi) dpvhVar.b;
        dpviVar4.a |= 2;
        dpviVar4.c = n;
        int o = l.o();
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar5 = (dpvi) dpvhVar.b;
        dpviVar5.a |= 4;
        dpviVar5.d = o;
        return dpvhVar.bK();
    }

    public static dpvi c(dpvi dpviVar, int i) {
        eaph a2 = a(dpviVar);
        if (i != 0) {
            a2 = a2.d(a2.b.B().e(a2.a, i));
        }
        dsqp dsqpVar = (dsqp) dpviVar.cu(5);
        dsqpVar.bC(dpviVar);
        dpvh dpvhVar = (dpvh) dsqpVar;
        int m = a2.m();
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar2 = (dpvi) dpvhVar.b;
        dpvi dpviVar3 = dpvi.g;
        dpviVar2.a |= 1;
        dpviVar2.b = m;
        int n = a2.n();
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar4 = (dpvi) dpvhVar.b;
        dpviVar4.a |= 2;
        dpviVar4.c = n;
        int o = a2.o();
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar5 = (dpvi) dpvhVar.b;
        dpviVar5.a |= 4;
        dpviVar5.d = o;
        return dpvhVar.bK();
    }

    @dzsi
    public static dpol d(Integer num) {
        return a.get(num);
    }

    @dzsi
    public static Integer e(dpol dpolVar) {
        return (Integer) ((dcmh) a).e.get(dpolVar);
    }

    public static dcdc<dpol> f() {
        Calendar calendar = Calendar.getInstance();
        dccx dccxVar = new dccx();
        calendar.set(7, calendar.getFirstDayOfWeek());
        for (int i = 0; i < 7; i++) {
            dpol d = d(Integer.valueOf(calendar.get(7)));
            if (d != null) {
                dccxVar.g(d);
            }
            calendar.add(5, 1);
        }
        return dccxVar.f();
    }

    public static eaph g(dpnu dpnuVar) {
        dpoj dpojVar = dpnuVar.b;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        dqjj dqjjVar = dpnuVar.c;
        if (dqjjVar == null) {
            dqjjVar = dqjj.e;
        }
        return new eaph(dpojVar.b, dpojVar.c, dpojVar.d, dqjjVar.b, dqjjVar.c);
    }

    public static dpvi h(eaph eaphVar) {
        dpvh bZ = dpvi.g.bZ();
        int m = eaphVar.m();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar = (dpvi) bZ.b;
        dpviVar.a |= 1;
        dpviVar.b = m;
        int n = eaphVar.n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar2 = (dpvi) bZ.b;
        dpviVar2.a |= 2;
        dpviVar2.c = n;
        int o = eaphVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar3 = (dpvi) bZ.b;
        dpviVar3.a |= 4;
        dpviVar3.d = o;
        int q = eaphVar.q();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar4 = (dpvi) bZ.b;
        dpviVar4.a |= 8;
        dpviVar4.e = q;
        int r = eaphVar.r();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar5 = (dpvi) bZ.b;
        dpviVar5.a |= 16;
        dpviVar5.f = r;
        return bZ.bK();
    }

    public static dpnu i(dpvi dpviVar) {
        dpnt bZ = dpnu.d.bZ();
        dpoi bZ2 = dpoj.e.bZ();
        int i = dpviVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpoj dpojVar = (dpoj) bZ2.b;
        int i2 = dpojVar.a | 1;
        dpojVar.a = i2;
        dpojVar.b = i;
        int i3 = dpviVar.c;
        int i4 = i2 | 2;
        dpojVar.a = i4;
        dpojVar.c = i3;
        int i5 = dpviVar.d;
        dpojVar.a = i4 | 4;
        dpojVar.d = i5;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpnu dpnuVar = (dpnu) bZ.b;
        dpoj bK = bZ2.bK();
        bK.getClass();
        dpnuVar.b = bK;
        dpnuVar.a |= 1;
        dqji bZ3 = dqjj.e.bZ();
        int i6 = dpviVar.e;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqjj dqjjVar = (dqjj) bZ3.b;
        int i7 = dqjjVar.a | 1;
        dqjjVar.a = i7;
        dqjjVar.b = i6;
        int i8 = dpviVar.f;
        dqjjVar.a = i7 | 2;
        dqjjVar.c = i8;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpnu dpnuVar2 = (dpnu) bZ.b;
        dqjj bK2 = bZ3.bK();
        bK2.getClass();
        dpnuVar2.c = bK2;
        dpnuVar2.a |= 2;
        return bZ.bK();
    }
}
