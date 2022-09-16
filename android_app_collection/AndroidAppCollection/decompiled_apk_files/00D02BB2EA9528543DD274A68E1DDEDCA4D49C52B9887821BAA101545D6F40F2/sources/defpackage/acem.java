package defpackage;
/* compiled from: PG */
/* renamed from: acem  reason: default package */
/* loaded from: classes2.dex */
public final class acem {
    private static final dhkd a;

    static {
        dhkc bZ = dhkd.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        int i = dhkdVar.a | 1;
        dhkdVar.a = i;
        dhkdVar.b = 512;
        dhkdVar.a = i | 2;
        dhkdVar.c = 512;
        a = bZ.bK();
    }

    public static dkem a(dhjx dhjxVar, dqlu dqluVar, dqmi dqmiVar) {
        dkej g = g(dhjxVar, dbsg.i(20), dbsg.i(dqluVar), dqmiVar);
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dkem dkemVar = (dkem) g.b;
        dkem dkemVar2 = dkem.i;
        dkemVar.d = 2;
        dkemVar.a |= 8;
        dwfv d = d(20);
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dkem dkemVar3 = (dkem) g.b;
        d.getClass();
        dkemVar3.c = d;
        dkemVar3.a |= 4;
        return g.bK();
    }

    public static dkem b(dhjx dhjxVar, dqmi dqmiVar) {
        dkej g = g(dhjxVar, dbpy.a, dbpy.a, dqmiVar);
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dkem dkemVar = (dkem) g.b;
        dkem dkemVar2 = dkem.i;
        dkemVar.d = 3;
        dkemVar.a |= 8;
        dqmd bZ = dqme.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqme dqmeVar = (dqme) bZ.b;
        dqmeVar.a |= 1;
        dqmeVar.b = true;
        dqme dqmeVar2 = (dqme) bZ.b;
        dqmeVar2.a |= 2;
        dqmeVar2.c = true;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dkem dkemVar3 = (dkem) g.b;
        dqme bK = bZ.bK();
        bK.getClass();
        dkemVar3.h = bK;
        dkemVar3.a |= 128;
        return g.bK();
    }

    public static dkem c(dhjx dhjxVar, @dzsi String str, dqmi dqmiVar, dqlu dqluVar) {
        dkej g = g(dhjxVar, dbsg.i(20), dbsg.i(dqluVar), dqmiVar);
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dkem dkemVar = (dkem) g.b;
        dkem dkemVar2 = dkem.i;
        dkemVar.d = 1;
        dkemVar.a |= 8;
        dwfv e = e(dbsg.i(20), str, true, true);
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dkem dkemVar3 = (dkem) g.b;
        e.getClass();
        dkemVar3.c = e;
        dkemVar3.a |= 4;
        return g.bK();
    }

    public static dwfv d(int i) {
        return e(dbsg.i(Integer.valueOf(i)), null, false, false);
    }

    private static dwfv e(dbsg<Integer> dbsgVar, @dzsi String str, boolean z, boolean z2) {
        dwfs bZ = dwfv.m.bZ();
        dwfp bZ2 = dwfr.h.bZ();
        bZ2.a(drbz.DESCRIPTION);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ.b;
        dwfr bK = bZ2.bK();
        bK.getClass();
        dwfvVar.c = bK;
        dwfvVar.a |= 2;
        dhkd dhkdVar = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar2 = (dwfv) bZ.b;
        dhkdVar.getClass();
        dwfvVar2.k = dhkdVar;
        dwfvVar2.a |= 1024;
        dwfw bZ3 = dwfx.d.bZ();
        if (dbsgVar.a()) {
            int intValue = dbsgVar.b().intValue();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwfx dwfxVar = (dwfx) bZ3.b;
            dwfxVar.a |= 2;
            dwfxVar.b = intValue;
        }
        if (str != null) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwfx dwfxVar2 = (dwfx) bZ3.b;
            str.getClass();
            dwfxVar2.a |= 4;
            dwfxVar2.c = str;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar3 = (dwfv) bZ.b;
        dwfx bK2 = bZ3.bK();
        bK2.getClass();
        dwfvVar3.h = bK2;
        dwfvVar3.a |= 128;
        dwev bZ4 = dwew.e.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwew dwewVar = (dwew) bZ4.b;
        int i = dwewVar.a | 2;
        dwewVar.a = i;
        dwewVar.d = false;
        dwewVar.a = i | 1;
        dwewVar.c = false;
        f(bZ4, dggc.PHOTO, false);
        if (z) {
            f(bZ4, dggc.VIDEO, false);
        }
        if (z2) {
            f(bZ4, dggc.PANO, true);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar4 = (dwfv) bZ.b;
        dwew bK3 = bZ4.bK();
        bK3.getClass();
        dwfvVar4.b = bK3;
        dwfvVar4.a |= 1;
        return bZ.bK();
    }

    private static void f(dwev dwevVar, dggc dggcVar, Boolean bool) {
        drcf bZ = drcg.e.bZ();
        dgge dggeVar = dgge.MEDIA_GUESSABLE_FIFE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drcg drcgVar = (drcg) bZ.b;
        drcgVar.b = dggeVar.l;
        drcgVar.a |= 1;
        boolean booleanValue = bool.booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drcg drcgVar2 = (drcg) bZ.b;
        int i = drcgVar2.a | 2;
        drcgVar2.a = i;
        drcgVar2.c = booleanValue;
        drcgVar2.d = dggcVar.f;
        drcgVar2.a = i | 4;
        dwevVar.a(bZ);
    }

    private static dkej g(dhjx dhjxVar, dbsg<Integer> dbsgVar, dbsg<dqlu> dbsgVar2, dqmi dqmiVar) {
        dkej bZ = dkem.i.bZ();
        dkek bZ2 = dkel.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkel dkelVar = (dkel) bZ2.b;
        dhjxVar.getClass();
        dkelVar.b = dhjxVar;
        dkelVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkem dkemVar = (dkem) bZ.b;
        dkel bK = bZ2.bK();
        bK.getClass();
        dkemVar.b = bK;
        dkemVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkem dkemVar2 = (dkem) bZ.b;
        dkemVar2.f = dqmiVar.d;
        dkemVar2.a |= 64;
        dwfv e = e(dbsgVar, null, false, false);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkem dkemVar3 = (dkem) bZ.b;
        e.getClass();
        dkemVar3.c = e;
        dkemVar3.a |= 4;
        dcdc k = dcdc.k(h(4), h(7), h(6), h(2), h(5), h(8));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkem dkemVar4 = (dkem) bZ.b;
        dsrj<dqmc> dsrjVar = dkemVar4.g;
        if (!dsrjVar.a()) {
            dkemVar4.g = dsqw.cl(dsrjVar);
        }
        dsod.bv(k, dkemVar4.g);
        if (dbsgVar2.a()) {
            dqlu b = dbsgVar2.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkem dkemVar5 = (dkem) bZ.b;
            b.getClass();
            dkemVar5.e = b;
            dkemVar5.a |= 32;
        }
        return bZ;
    }

    private static dqmc h(int i) {
        dqma bZ = dqmc.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqmc dqmcVar = (dqmc) bZ.b;
        dqmcVar.b = i - 1;
        dqmcVar.a |= 1;
        return bZ.bK();
    }
}
