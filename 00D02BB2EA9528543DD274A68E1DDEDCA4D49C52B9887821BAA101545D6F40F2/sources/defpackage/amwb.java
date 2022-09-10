package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: amwb  reason: default package */
/* loaded from: classes2.dex */
public abstract class amwb implements Serializable {
    public static amwb D(dwnl dwnlVar) {
        amwa J = J();
        J.c(dwnlVar.b);
        J.b(dwnlVar.m);
        amvy amvyVar = (amvy) J;
        amvyVar.a = dwnlVar.m;
        amvyVar.b = dwnlVar.h;
        amvyVar.c = dwnlVar.i;
        amvyVar.d = dwnlVar.n;
        amvyVar.e = dwnlVar.l;
        J.d((dwnlVar.a & 16) != 0);
        J.f(true);
        dpad dpadVar = dwnlVar.o;
        if (dpadVar == null) {
            dpadVar = dpad.e;
        }
        J.m(dpadVar);
        dgas dgasVar = dwnlVar.t;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        J.l(dgasVar);
        dgas dgasVar2 = dwnlVar.u;
        if (dgasVar2 == null) {
            dgasVar2 = dgas.e;
        }
        J.n(dgasVar2);
        dgas dgasVar3 = dwnlVar.v;
        if (dgasVar3 == null) {
            dgasVar3 = dgas.e;
        }
        if (dgasVar3 != null) {
            amvyVar.n = bvrt.b(dgasVar3);
        }
        amvyVar.l = dwnlVar.j;
        int i = dwnlVar.a;
        if ((2097152 & i) != 0 || (i & 4194304) != 0) {
            J.e(true);
            amvyVar.k = Long.valueOf(dwnlVar.x);
            amvyVar.j = Long.valueOf(dwnlVar.w);
        }
        if ((dwnlVar.a & 16384) != 0) {
            dnpp bZ = dnpq.g.bZ();
            dgbo dgboVar = dwnlVar.p;
            if (dgboVar == null) {
                dgboVar = dgbo.e;
            }
            String str = dgboVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnpq dnpqVar = (dnpq) bZ.b;
            str.getClass();
            dnpqVar.a |= 2;
            dnpqVar.c = str;
            dgbo dgboVar2 = dwnlVar.p;
            if (dgboVar2 == null) {
                dgboVar2 = dgbo.e;
            }
            String str2 = dgboVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnpq dnpqVar2 = (dnpq) bZ.b;
            str2.getClass();
            dnpqVar2.a = 1 | dnpqVar2.a;
            dnpqVar2.b = str2;
            J.o(bZ.bK());
        }
        dbyy dbyyVar = amwc.c.b;
        Object b = dwnk.b(dwnlVar.c);
        if (b == null) {
            b = dwnk.INCIDENT_OTHER;
        }
        doyd doydVar = (doyd) dbyyVar.get(b);
        if (doydVar != null) {
            amvyVar.f = doydVar;
        }
        float f = dwnlVar.s;
        if (f > 0.0f) {
            J.g(f);
        }
        return J.a();
    }

    public static long E(String str) {
        try {
            return decu.d(str);
        } catch (NumberFormatException unused) {
            return 1L;
        }
    }

    public static amwb F(dozz dozzVar) {
        long j;
        dnpq dnpqVar;
        if ((dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).k.size() > 0) {
            j = E((dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).k.get(0));
        } else {
            j = 1;
        }
        amwa J = J();
        J.c(j);
        J.b(alca.p(dozzVar));
        amvy amvyVar = (amvy) J;
        amvyVar.a = alca.q(dozzVar);
        amvyVar.b = alca.r(dozzVar);
        amvyVar.e = alca.m(dozzVar).a;
        doyd b = doyd.b(dozzVar.t);
        if (b == null) {
            b = doyd.INCIDENT_OTHER;
        }
        amvyVar.f = b;
        int i = 1;
        J.d(true);
        dowb dowbVar = (dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).f;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        if (dowbVar != null) {
            amvyVar.o = bvrt.b(dowbVar);
        }
        dpad dpadVar = dozzVar.x;
        if (dpadVar == null) {
            dpadVar = dpad.e;
        }
        J.m(dpadVar);
        dgas dgasVar = (dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).g;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        J.l(dgasVar);
        dgas dgasVar2 = (dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).i;
        if (dgasVar2 == null) {
            dgasVar2 = dgas.e;
        }
        J.n(dgasVar2);
        dgas dgasVar3 = (dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).d;
        if (dgasVar3 == null) {
            dgasVar3 = dgas.e;
        }
        if (dgasVar3 != null) {
            amvyVar.m = bvrt.b(dgasVar3);
        }
        if ((dozzVar.a & 128) != 0) {
            dnpqVar = dozzVar.j;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
        } else {
            dnpqVar = null;
        }
        J.o(dnpqVar);
        amvyVar.g = (dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).b;
        amvyVar.h = (dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).c;
        doyd doydVar = doyd.INCIDENT_SPEED_LIMIT;
        doyd b2 = doyd.b(dozzVar.t);
        if (b2 == null) {
            b2 = doyd.INCIDENT_OTHER;
        }
        J.f(!doydVar.equals(b2));
        dozs dozsVar = dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q;
        if ((dozsVar.a & 1024) != 0) {
            dozn doznVar = dozsVar.m;
            if (doznVar == null) {
                doznVar = dozn.f;
            }
            if ((doznVar.a & 8) != 0) {
                amvyVar.i = doznVar.e;
            }
            J.e(true);
            amvyVar.j = Long.valueOf(doznVar.b);
            amvyVar.k = Long.valueOf(doznVar.c);
        }
        if ((dozsVar.a & 2048) != 0) {
            dotj dotjVar = dozsVar.n;
            if (dotjVar == null) {
                dotjVar = dotj.c;
            }
            if (dotjVar != null) {
                amvyVar.p = bvrt.b(dotjVar);
            }
        }
        if ((dozsVar.a & 4096) != 0) {
            int a = dozi.a(dozsVar.o);
            if (a != 0) {
                i = a;
            }
            amvyVar.r = i;
        }
        if (dozsVar.p.size() > 0) {
            amvyVar.q = (dcdc) bvrt.c(dcdc.r(dozsVar.p), new dccx());
        }
        if ((dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).h > 0.0f) {
            J.g((dozzVar.b == 22 ? (dozs) dozzVar.c : dozs.q).h);
        }
        return J.a();
    }

    public static amwa J() {
        amvy amvyVar = new amvy();
        amvyVar.e(false);
        amvyVar.f(true);
        amvyVar.g(-1.0f);
        return amvyVar;
    }

    @dzsi
    public abstract dcdc<bvrt<dqts>> A();

    public abstract amwa B();

    @dzsi
    public abstract int C();

    @dzsi
    public final dowb G() {
        return (dowb) bvrt.f(w(), (dssr) dowb.d.cu(7), dowb.d);
    }

    @dzsi
    public final dpad H() {
        return (dpad) bvrt.f(x(), (dssr) dpad.e.cu(7), dpad.e);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dccr, java.util.List<dqts>] */
    public final List<dqts> I() {
        return bvrt.d(A(), new dccx(), (dssr) dqts.c.cu(7), dqts.c);
    }

    public abstract long a();

    public abstract String b();

    @dzsi
    public abstract String c();

    @dzsi
    public abstract String d();

    @dzsi
    public abstract String e();

    @dzsi
    public abstract String f();

    @dzsi
    public abstract String g();

    @dzsi
    public abstract doyd h();

    public abstract boolean i();

    @dzsi
    public abstract String j();

    @dzsi
    public abstract String k();

    public abstract boolean l();

    @dzsi
    public abstract String m();

    @dzsi
    public abstract Long n();

    @dzsi
    public abstract Long o();

    @dzsi
    public abstract String p();

    @dzsi
    public abstract bvrt<dgas> q();

    @dzsi
    public abstract bvrt<dgas> r();

    @dzsi
    public abstract bvrt<dgas> s();

    @dzsi
    public abstract bvrt<dgas> t();

    public abstract float u();

    public abstract boolean v();

    @dzsi
    public abstract bvrt<dowb> w();

    @dzsi
    public abstract bvrt<dpad> x();

    @dzsi
    public abstract bvrt<dotj> y();

    @dzsi
    public abstract bvrt<dnpq> z();
}
