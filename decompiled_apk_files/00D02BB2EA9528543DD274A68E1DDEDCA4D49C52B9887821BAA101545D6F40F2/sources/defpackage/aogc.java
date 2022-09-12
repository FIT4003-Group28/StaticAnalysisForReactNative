package defpackage;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aogc  reason: default package */
/* loaded from: classes2.dex */
public final class aogc {
    private static final dcqe a = dcqe.c("aogc");
    private static final eaou b = eaou.v(13);
    private static final eaou c = eaou.v(-12);

    public static eaol a(dwyn dwynVar) {
        dbsg dbsgVar;
        if ((dwynVar.a & 2) != 0) {
            dbsgVar = dbsg.i(eaou.k((int) TimeUnit.MINUTES.toMillis(dwynVar.c)));
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            bvoo.h("Timezone is missing from DateTimeProto.", new Object[0]);
            dbsgVar = dbsg.i(eaou.b);
        }
        return new eaol(TimeUnit.SECONDS.toMillis(dwynVar.b), (eaou) dbsgVar.b());
    }

    public static eaph b(dwyn dwynVar) {
        return a(dwynVar).o();
    }

    public static eaph c(dngs dngsVar) {
        return new eaph(dngsVar.b, dngsVar.c + 1, dngsVar.d, dngsVar.e, dngsVar.f, dngsVar.g);
    }

    public static dngs d(eaph eaphVar) {
        dngr bZ = dngs.h.bZ();
        int m = eaphVar.m();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar = (dngs) bZ.b;
        dngsVar.a |= 1;
        dngsVar.b = m;
        int n = eaphVar.n() - 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar2 = (dngs) bZ.b;
        dngsVar2.a |= 2;
        dngsVar2.c = n;
        int o = eaphVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar3 = (dngs) bZ.b;
        dngsVar3.a |= 4;
        dngsVar3.d = o;
        int q = eaphVar.q();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar4 = (dngs) bZ.b;
        dngsVar4.a |= 8;
        dngsVar4.e = q;
        int r = eaphVar.r();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar5 = (dngs) bZ.b;
        dngsVar5.a |= 16;
        dngsVar5.f = r;
        int s = eaphVar.s();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar6 = (dngs) bZ.b;
        dngsVar6.a |= 32;
        dngsVar6.g = s;
        return bZ.bK();
    }

    public static dpop e(dwyn dwynVar, dwyn dwynVar2) {
        dpoo bZ = dpop.d.bZ();
        long millis = TimeUnit.SECONDS.toMillis(dwynVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpop dpopVar = (dpop) bZ.b;
        dpopVar.a |= 1;
        dpopVar.b = millis;
        long millis2 = TimeUnit.SECONDS.toMillis(dwynVar2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpop dpopVar2 = (dpop) bZ.b;
        dpopVar2.a |= 2;
        dpopVar2.c = millis2;
        return bZ.bK();
    }

    public static long f(dngs dngsVar) {
        dsqp dsqpVar = (dsqp) dngsVar.cu(5);
        dsqpVar.bC(dngsVar);
        dngr dngrVar = (dngr) dsqpVar;
        if (dngrVar.c) {
            dngrVar.bF();
            dngrVar.c = false;
        }
        dngs dngsVar2 = (dngs) dngrVar.b;
        dngs dngsVar3 = dngs.h;
        int i = dngsVar2.a | 8;
        dngsVar2.a = i;
        dngsVar2.e = 0;
        int i2 = i | 16;
        dngsVar2.a = i2;
        dngsVar2.f = 0;
        dngsVar2.a = i2 | 32;
        dngsVar2.g = 0;
        return g(c(dngrVar.bK()));
    }

    public static long g(eaph eaphVar) {
        return eaphVar.a(b).a;
    }

    public static long h(dngs dngsVar) {
        dsqp dsqpVar = (dsqp) dngsVar.cu(5);
        dsqpVar.bC(dngsVar);
        dngr dngrVar = (dngr) dsqpVar;
        if (dngrVar.c) {
            dngrVar.bF();
            dngrVar.c = false;
        }
        dngs dngsVar2 = (dngs) dngrVar.b;
        dngs dngsVar3 = dngs.h;
        int i = dngsVar2.a | 8;
        dngsVar2.a = i;
        dngsVar2.e = 23;
        int i2 = i | 16;
        dngsVar2.a = i2;
        dngsVar2.f = 59;
        dngsVar2.a = i2 | 32;
        dngsVar2.g = 59;
        return i(c(dngrVar.bK()));
    }

    public static long i(eaph eaphVar) {
        return eaphVar.a(c).a;
    }

    public static eapg j(cqat cqatVar) {
        return k(cqatVar.b());
    }

    public static eapg k(long j) {
        return new eapg(j, m(j));
    }

    public static eaou l(cqat cqatVar) {
        return m(cqatVar.b());
    }

    public static eaou m(long j) {
        TimeZone timeZone = TimeZone.getDefault();
        try {
            return eaou.l(timeZone);
        } catch (IllegalArgumentException unused) {
            return eaou.k(timeZone.getOffset(j));
        }
    }

    public static dbsg<eaou> n(String str) {
        try {
            return dbsg.i(eaou.j(str));
        } catch (IllegalArgumentException unused) {
            return dbpy.a;
        }
    }

    public static eapg o(dngs dngsVar) {
        return c(dngsVar).b();
    }
}
