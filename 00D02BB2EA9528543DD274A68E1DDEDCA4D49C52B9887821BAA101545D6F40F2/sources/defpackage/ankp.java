package defpackage;
/* compiled from: PG */
/* renamed from: ankp  reason: default package */
/* loaded from: classes2.dex */
public final class ankp implements anhm {
    public static final dcqe a = dcqe.c("ankp");
    public static final anru b = new anru();
    public final dnrw c;
    private final dbsg<dvay> d;
    private final dbsg<dvyw> e;

    public ankp(dnrw dnrwVar, dbsg<dvay> dbsgVar, dbsg<dvyw> dbsgVar2) {
        this.c = dnrwVar;
        this.d = dbsgVar;
        this.e = dbsgVar2;
    }

    public static ankp d(dnsc dnscVar, dnsc dnscVar2, dvay dvayVar, dbsg<dvyw> dbsgVar, dbsg<dnqm> dbsgVar2, dnsf dnsfVar) {
        dnrc g = g(dvayVar);
        dnri bZ = dnrj.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrj dnrjVar = (dnrj) bZ.b;
        dnscVar.getClass();
        dnrjVar.b = dnscVar;
        int i = dnrjVar.a | 1;
        dnrjVar.a = i;
        dnscVar2.getClass();
        dnrjVar.c = dnscVar2;
        dnrjVar.a = i | 2;
        dnrd bK = g.bK();
        bK.getClass();
        dnrjVar.d = bK;
        dnrjVar.a |= 4;
        if (dbsgVar2.a()) {
            dnqm b2 = dbsgVar2.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnrj dnrjVar2 = (dnrj) bZ.b;
            b2.getClass();
            dnrjVar2.e = b2;
            dnrjVar2.a |= 8;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrj dnrjVar3 = (dnrj) bZ.b;
        dnsfVar.getClass();
        dnrjVar3.f = dnsfVar;
        dnrjVar3.a |= 16;
        dnqr bZ2 = dnrw.c.bZ();
        dnrj bK2 = bZ.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ2.b;
        bK2.getClass();
        dnrwVar.b = bK2;
        dnrwVar.a = 3;
        return new ankp(bZ2.bK(), dbsg.i(dvayVar), dbsgVar);
    }

    public static dnsb e(dnic dnicVar, dniu dniuVar, dbsg<String> dbsgVar) {
        dnsb bZ = dnsc.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnsc dnscVar = (dnsc) bZ.b;
        dniuVar.getClass();
        dnscVar.c = dniuVar;
        dnscVar.b = 1;
        dnicVar.getClass();
        dnscVar.d = dnicVar;
        dnscVar.a |= 8;
        if (dbsgVar.a()) {
            String b2 = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnsc dnscVar2 = (dnsc) bZ.b;
            b2.getClass();
            dnscVar2.a |= 32;
            dnscVar2.e = b2;
        }
        return bZ;
    }

    public static dpop f(dvay dvayVar) {
        dwyn dwynVar = dvayVar.f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        dwyn dwynVar2 = dvayVar.g;
        if (dwynVar2 == null) {
            dwynVar2 = dwyn.d;
        }
        return aogc.e(dwynVar, dwynVar2);
    }

    public static dnrc g(dvay dvayVar) {
        return i(h(dvayVar).o(ankm.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcbg<dvyw> h(dvay dvayVar) {
        dcbg b2 = dcbg.b(dvayVar.o);
        b.getClass();
        return b2.s(new dbrn() { // from class: ankn
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return anru.d((dvay) obj);
            }
        });
    }

    public static dnrc i(Iterable<dvyw> iterable) {
        dnrc bZ = dnrd.b.bZ();
        dcbg b2 = dcbg.b(iterable);
        b.getClass();
        dcbg s = b2.s(new dbrn() { // from class: anko
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return anru.f((dvyw) obj);
            }
        });
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrd dnrdVar = (dnrd) bZ.b;
        dsrj<dniu> dsrjVar = dnrdVar.a;
        if (!dsrjVar.a()) {
            dnrdVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(s, dnrdVar.a);
        return bZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbsg<ankp> j(dvay dvayVar, dpop dpopVar, dqjl dqjlVar, int i, long j, dbsg<dnqm> dbsgVar, dnsf dnsfVar) {
        dvak dvakVar;
        dvax b2 = dvax.b(dvayVar.m);
        if (b2 == null) {
            b2 = dvax.UNKNOWN;
        }
        if (b2 != dvax.ACTIVITY) {
            Object[] objArr = new Object[1];
            dvax b3 = dvax.b(dvayVar.m);
            if (b3 == null) {
                b3 = dvax.UNKNOWN;
            }
            objArr[0] = b3;
            bvoo.h("Expected stop segment, got segment of type %s", objArr);
            return dbpy.a;
        }
        dpop f = f(dvayVar);
        if (dvayVar.b == 9) {
            dvakVar = (dvak) dvayVar.c;
        } else {
            dvakVar = dvak.e;
        }
        dqjl b4 = dqjl.b(dvakVar.b);
        if (b4 == null) {
            b4 = dqjl.UNKNOWN_ACTIVITY_TYPE;
        }
        return dbsg.i(d(m(f, b4, n(dvayVar), j, dbsg.i(dvayVar.s)), m(dpopVar, dqjlVar, i, j, dbpy.a), dvayVar, dbpy.a, dbsgVar, dnsfVar));
    }

    public static dnsb k(dngq dngqVar, dniu dniuVar, int i, long j, dbsg<String> dbsgVar) {
        return e(anru.g(dngqVar, dniuVar, i, j), dniuVar, dbsgVar);
    }

    public static dnsc l(dpop dpopVar, dvyw dvywVar, int i, long j, dbsg<String> dbsgVar) {
        return e(p(dpopVar, i, j), anru.f(dvywVar), dbsgVar).bK();
    }

    public static dnsc m(dpop dpopVar, dqjl dqjlVar, int i, long j, dbsg<String> dbsgVar) {
        dnsb bZ = dnsc.f.bZ();
        dnrz bZ2 = dnsa.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnsa dnsaVar = (dnsa) bZ2.b;
        dnsaVar.b = dqjlVar.L;
        dnsaVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnsc dnscVar = (dnsc) bZ.b;
        dnsa bK = bZ2.bK();
        bK.getClass();
        dnscVar.c = bK;
        dnscVar.b = 6;
        dnic p = p(dpopVar, i, j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnsc dnscVar2 = (dnsc) bZ.b;
        p.getClass();
        dnscVar2.d = p;
        dnscVar2.a |= 8;
        if (dbsgVar.a()) {
            String b2 = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnsc dnscVar3 = (dnsc) bZ.b;
            b2.getClass();
            dnscVar3.a |= 32;
            dnscVar3.e = b2;
        }
        return bZ.bK();
    }

    public static int n(dvay dvayVar) {
        return dvayVar.r ? 2 : 1;
    }

    public static ankp o(dbsg<dnhz> dbsgVar, dbsg<dnhz> dbsgVar2, dvyw dvywVar, dbsg<String> dbsgVar3, long j) {
        dnhz bK;
        dnqs bZ = dnqt.g.bZ();
        if (dbsgVar.a()) {
            dnhz b2 = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqt dnqtVar = (dnqt) bZ.b;
            b2.getClass();
            dnqtVar.b = b2;
            dnqtVar.a |= 1;
        }
        if (dbsgVar2.a()) {
            bK = dbsgVar2.b();
        } else {
            dnhy bZ2 = dnhz.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnhz dnhzVar = (dnhz) bZ2.b;
            dnhzVar.a |= 4;
            dnhzVar.d = j;
            bK = bZ2.bK();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqt dnqtVar2 = (dnqt) bZ.b;
        bK.getClass();
        dnqtVar2.c = bK;
        dnqtVar2.a |= 2;
        dniu f = anru.f(dvywVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqt dnqtVar3 = (dnqt) bZ.b;
        f.getClass();
        dnqtVar3.d = f;
        dnqtVar3.a |= 4;
        if (dbsgVar3.a()) {
            String b3 = dbsgVar3.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqt dnqtVar4 = (dnqt) bZ.b;
            b3.getClass();
            dnqtVar4.a |= 16;
            dnqtVar4.f = b3;
        }
        dnqr bZ3 = dnrw.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ3.b;
        dnqt bK2 = bZ.bK();
        bK2.getClass();
        dnrwVar.b = bK2;
        dnrwVar.a = 7;
        return new ankp(bZ3.bK(), dbpy.a, dbsg.i(dvywVar));
    }

    private static dnic p(dpop dpopVar, int i, long j) {
        dnhy bZ = dnhz.e.bZ();
        long j2 = dpopVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnhz dnhzVar = (dnhz) bZ.b;
        dnhzVar.a |= 4;
        dnhzVar.d = j2;
        dnhz bK = bZ.bK();
        dnhy bZ2 = dnhz.e.bZ();
        long j3 = dpopVar.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnhz dnhzVar2 = (dnhz) bZ2.b;
        dnhzVar2.a |= 4;
        dnhzVar2.d = j3;
        return anru.e(bK, bZ2.bK(), i, j);
    }

    @Override // defpackage.anhm
    public final dnrw a() {
        return this.c;
    }

    @Override // defpackage.anhm
    public final dbsg<dvay> b() {
        return this.d;
    }

    @Override // defpackage.anhm
    public final dbsg<dvyw> c() {
        return this.e;
    }
}
