package defpackage;

import java.util.concurrent.TimeUnit;
/* renamed from: cypg  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cypg {
    public static void a(cyph cyphVar, int i, dbtp dbtpVar, cyor cyorVar) {
        eawo bZ = eawp.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawp eawpVar = (eawp) bZ.b;
        eawpVar.b = i - 1;
        eawpVar.a |= 1;
        long d = dbtpVar.d(TimeUnit.MICROSECONDS);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawp eawpVar2 = (eawp) bZ.b;
        eawpVar2.a |= 2;
        eawpVar2.c = d;
        eawp bK = bZ.bK();
        cypi cypiVar = (cypi) cyphVar;
        eawh h = cypiVar.h(3, cyorVar);
        if (h.c) {
            h.bF();
            h.c = false;
        }
        eawy eawyVar = (eawy) h.b;
        eawy eawyVar2 = eawy.n;
        bK.getClass();
        eawyVar.g = bK;
        eawyVar.a |= 64;
        cypiVar.g(h.bK());
    }

    public static void b(cyph cyphVar, int i, long j, long j2, cyor cyorVar) {
        eawq bZ = eawr.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawr eawrVar = (eawr) bZ.b;
        eawrVar.b = i - 1;
        int i2 = eawrVar.a | 1;
        eawrVar.a = i2;
        int i3 = i2 | 2;
        eawrVar.a = i3;
        eawrVar.c = j;
        eawrVar.a = i3 | 4;
        eawrVar.d = j2;
        eawr bK = bZ.bK();
        cypi cypiVar = (cypi) cyphVar;
        eawh h = cypiVar.h(9, cyorVar);
        if (h.c) {
            h.bF();
            h.c = false;
        }
        eawy eawyVar = (eawy) h.b;
        eawy eawyVar2 = eawy.n;
        bK.getClass();
        eawyVar.m = bK;
        eawyVar.a |= 4096;
        cypiVar.g(h.bK());
    }

    public static void c(cyph cyphVar, int i, int i2, cyor cyorVar) {
        eawm bZ = eawn.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawn eawnVar = (eawn) bZ.b;
        eawnVar.b = i - 1;
        int i3 = eawnVar.a | 64;
        eawnVar.a = i3;
        int i4 = i2 - 1;
        if (i2 != 0) {
            eawnVar.c = i4;
            eawnVar.a = i3 | 128;
            eawn bK = bZ.bK();
            cypi cypiVar = (cypi) cyphVar;
            eawh h = cypiVar.h(4, cyorVar);
            if (h.c) {
                h.bF();
                h.c = false;
            }
            eawy eawyVar = (eawy) h.b;
            eawy eawyVar2 = eawy.n;
            bK.getClass();
            eawyVar.h = bK;
            eawyVar.a |= 128;
            cypiVar.g(h.bK());
            return;
        }
        throw null;
    }

    public static void d(cyph cyphVar, int i, long j, cyor cyorVar) {
        eawu bZ = eawv.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawv eawvVar = (eawv) bZ.b;
        eawvVar.b = i - 1;
        int i2 = eawvVar.a | 1;
        eawvVar.a = i2;
        eawvVar.a = i2 | 4;
        eawvVar.c = j;
        eawv bK = bZ.bK();
        cypi cypiVar = (cypi) cyphVar;
        eawh h = cypiVar.h(5, cyorVar);
        if (h.c) {
            h.bF();
            h.c = false;
        }
        eawy eawyVar = (eawy) h.b;
        eawy eawyVar2 = eawy.n;
        bK.getClass();
        eawyVar.i = bK;
        eawyVar.a |= 256;
        cypiVar.g(h.bK());
    }

    public static void e(cyph cyphVar, int i, int i2, long j, dbtp dbtpVar, cyor cyorVar) {
        eaww bZ = eawx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawx eawxVar = (eawx) bZ.b;
        eawxVar.b = i - 1;
        int i3 = eawxVar.a | 1;
        eawxVar.a = i3;
        int i4 = i2 - 1;
        if (i2 != 0) {
            eawxVar.c = i4;
            int i5 = i3 | 2;
            eawxVar.a = i5;
            eawxVar.a = i5 | 32;
            eawxVar.e = j;
            if (dbtpVar != null) {
                long d = dbtpVar.d(TimeUnit.MICROSECONDS);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eawx eawxVar2 = (eawx) bZ.b;
                eawxVar2.a |= 4;
                eawxVar2.d = d;
            }
            eawx bK = bZ.bK();
            cypi cypiVar = (cypi) cyphVar;
            eawh h = cypiVar.h(6, cyorVar);
            if (h.c) {
                h.bF();
                h.c = false;
            }
            eawy eawyVar = (eawy) h.b;
            eawy eawyVar2 = eawy.n;
            bK.getClass();
            eawyVar.j = bK;
            eawyVar.a |= 512;
            cypiVar.g(h.bK());
            return;
        }
        throw null;
    }

    public static dbtp f(cyph cyphVar, int i, int i2, Integer num, cyor cyorVar) {
        eawc bZ = eawd.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawd eawdVar = (eawd) bZ.b;
        eawdVar.b = i - 1;
        int i3 = eawdVar.a | 1;
        eawdVar.a = i3;
        eawdVar.a = i3 | 2;
        eawdVar.c = i2;
        if (num != null) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eawd eawdVar2 = (eawd) bZ.b;
            eawdVar2.a |= 8;
            eawdVar2.d = intValue;
        }
        eawd bK = bZ.bK();
        cypi cypiVar = (cypi) cyphVar;
        eawh h = cypiVar.h(7, cyorVar);
        if (h.c) {
            h.bF();
            h.c = false;
        }
        eawy eawyVar = (eawy) h.b;
        eawy eawyVar2 = eawy.n;
        bK.getClass();
        eawyVar.k = bK;
        eawyVar.a |= 1024;
        cypiVar.g(h.bK());
        return cyphVar.b();
    }

    public static void g(cyph cyphVar, int i, int i2, cypf cypfVar, Integer num, cyor cyorVar) {
        eawe bZ = eawf.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawf eawfVar = (eawf) bZ.b;
        eawfVar.b = i - 1;
        int i3 = eawfVar.a | 1;
        eawfVar.a = i3;
        eawfVar.c = i2 - 1;
        eawfVar.a = i3 | 2;
        int c = cypfVar.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawf eawfVar2 = (eawf) bZ.b;
        eawfVar2.a |= 128;
        eawfVar2.i = c;
        int e = cypfVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eawf eawfVar3 = (eawf) bZ.b;
        int i4 = e - 1;
        if (e != 0) {
            eawfVar3.f = i4;
            eawfVar3.a |= 16;
            int f = cypfVar.f();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eawf eawfVar4 = (eawf) bZ.b;
            int i5 = f - 1;
            if (f == 0) {
                throw null;
            }
            eawfVar4.g = i5;
            eawfVar4.a |= 32;
            int g = cypfVar.g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eawf eawfVar5 = (eawf) bZ.b;
            int i6 = g - 1;
            if (g != 0) {
                eawfVar5.h = i6;
                eawfVar5.a |= 64;
                if (cypfVar.a() != null) {
                    long d = cypfVar.a().d(TimeUnit.MICROSECONDS);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eawf eawfVar6 = (eawf) bZ.b;
                    eawfVar6.a |= 4;
                    eawfVar6.d = d;
                }
                if (cypfVar.b() != null) {
                    int intValue = cypfVar.b().intValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eawf eawfVar7 = (eawf) bZ.b;
                    eawfVar7.a |= 8;
                    eawfVar7.e = intValue;
                }
                if (num != null) {
                    int intValue2 = num.intValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eawf eawfVar8 = (eawf) bZ.b;
                    eawfVar8.a |= 4096;
                    eawfVar8.k = intValue2;
                }
                if (cypfVar.d() != null && cypfVar.d().a != -1) {
                    eaws bZ2 = eawt.d.bZ();
                    long a = cypfVar.d().a();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    eawt eawtVar = (eawt) bZ2.b;
                    eawtVar.a |= 4;
                    eawtVar.b = a;
                    long b = cypfVar.d().b();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    eawt eawtVar2 = (eawt) bZ2.b;
                    eawtVar2.a |= 8;
                    eawtVar2.c = b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eawf eawfVar9 = (eawf) bZ.b;
                    eawt bK = bZ2.bK();
                    bK.getClass();
                    eawfVar9.j = bK;
                    eawfVar9.a |= 512;
                }
                eawf bK2 = bZ.bK();
                cypi cypiVar = (cypi) cyphVar;
                eawh h = cypiVar.h(8, cyorVar);
                if (h.c) {
                    h.bF();
                    h.c = false;
                }
                eawy eawyVar = (eawy) h.b;
                eawy eawyVar2 = eawy.n;
                bK2.getClass();
                eawyVar.l = bK2;
                eawyVar.a |= 2048;
                cypiVar.g(h.bK());
                return;
            }
            throw null;
        }
        throw null;
    }
}
