package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cknx  reason: default package */
/* loaded from: classes.dex */
public abstract class cknx implements Serializable {
    public static dwfs d(boolean z, boolean z2, boolean z3) {
        return e(z, z2, z3, dcdc.e());
    }

    public static dwfs e(boolean z, boolean z2, boolean z3, List<drbz> list) {
        dwfs bZ = dwfv.m.bZ();
        f(bZ, z2);
        if (!list.isEmpty()) {
            dwfp bZ2 = dwfr.h.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwfr dwfrVar = (dwfr) bZ2.b;
            dwfrVar.c();
            for (drbz drbzVar : list) {
                dwfrVar.c.h(drbzVar.q);
            }
            bZ.a(bZ2.bK());
        }
        dwev bZ3 = dwew.e.bZ();
        m(bZ3);
        i(bZ3);
        k(bZ3, z, z2);
        if (z3) {
            g(bZ3);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ.b;
        dwew bK = bZ3.bK();
        bK.getClass();
        dwfvVar.b = bK;
        dwfvVar.a |= 1;
        dwft bZ4 = dwfu.a.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwfu.c((dwfu) bZ4.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar2 = (dwfv) bZ.b;
        dwfu bK2 = bZ4.bK();
        bK2.getClass();
        dwfvVar2.j = bK2;
        dwfvVar2.a |= 512;
        return bZ;
    }

    public static void f(dwfs dwfsVar, boolean z) {
        if (z) {
            q(dwfsVar, 5);
        } else {
            q(dwfsVar, 4);
        }
        dwdu bZ = dwdv.a.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwdv.c((dwdv) bZ.b);
        if (dwfsVar.c) {
            dwfsVar.bF();
            dwfsVar.c = false;
        }
        dwfv dwfvVar = (dwfv) dwfsVar.b;
        dwdv bK = bZ.bK();
        dwfv dwfvVar2 = dwfv.m;
        bK.getClass();
        dwfvVar.e = bK;
        dwfvVar.a |= 16;
    }

    public static void g(dwev dwevVar) {
        l(dwevVar, dgge.MEDIA_GUESSABLE_FIFE, dggc.VIDEO, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void h(dwfy dwfyVar, akqi akqiVar) {
        dnip bZ = dniu.i.bZ();
        String o = akqiVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dniu dniuVar = (dniu) bZ.b;
        o.getClass();
        dniuVar.a |= 1;
        dniuVar.b = o;
        if (dwfyVar.c) {
            dwfyVar.bF();
            dwfyVar.c = false;
        }
        dwge dwgeVar = (dwge) dwfyVar.b;
        dniu bK = bZ.bK();
        dwge dwgeVar2 = dwge.m;
        bK.getClass();
        dwgeVar.c = bK;
        dwgeVar.a |= 8;
    }

    public static void i(dwev dwevVar) {
        l(dwevVar, dgge.MEDIA_GUESSABLE_FIFE, dggc.PHOTO, false);
        l(dwevVar, dgge.IMAGE_FIFE, dggc.PHOTO, false);
        l(dwevVar, dgge.IMAGE_CONTENT_FIFE, dggc.PHOTO, false);
        l(dwevVar, dgge.IMAGE_PANORAMIO, dggc.PHOTO, false);
        l(dwevVar, dgge.IMAGE_ALLEYCAT, dggc.PHOTO, false);
        l(dwevVar, dgge.IMAGE_INTERNET, dggc.PHOTO, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void j(dwfs dwfsVar, int i, @dzsi String str) {
        dwfw bZ = dwfx.d.bZ();
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwfx dwfxVar = (dwfx) bZ.b;
            str.getClass();
            dwfxVar.a |= 4;
            dwfxVar.c = str;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfx dwfxVar2 = (dwfx) bZ.b;
        dwfxVar2.a |= 2;
        dwfxVar2.b = i;
        dwfx.c(dwfxVar2);
        if (dwfsVar.c) {
            dwfsVar.bF();
            dwfsVar.c = false;
        }
        dwfv dwfvVar = (dwfv) dwfsVar.b;
        dwfx bK = bZ.bK();
        dwfv dwfvVar2 = dwfv.m;
        bK.getClass();
        dwfvVar.h = bK;
        dwfvVar.a |= 128;
    }

    public static void k(dwev dwevVar, boolean z, boolean z2) {
        if (!z) {
            if (!z2) {
                return;
            }
            z2 = true;
        }
        l(dwevVar, dgge.IMAGE_ALLEYCAT, dggc.PANO, true);
        if (z2) {
            l(dwevVar, dgge.IMAGE_FIFE, dggc.PANO, true);
            l(dwevVar, dgge.MEDIA_GUESSABLE_FIFE, dggc.PANO, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void l(dwev dwevVar, dgge dggeVar, dggc dggcVar, boolean z) {
        drcf bZ = drcg.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drcg drcgVar = (drcg) bZ.b;
        drcgVar.b = dggeVar.l;
        int i = drcgVar.a | 1;
        drcgVar.a = i;
        drcgVar.d = dggcVar.f;
        int i2 = i | 4;
        drcgVar.a = i2;
        drcgVar.a = i2 | 2;
        drcgVar.c = z;
        drcg bK = bZ.bK();
        if (dwevVar.c) {
            dwevVar.bF();
            dwevVar.c = false;
        }
        dwew dwewVar = (dwew) dwevVar.b;
        dwew dwewVar2 = dwew.e;
        bK.getClass();
        dwewVar.c();
        dwewVar.b.add(bK);
    }

    public static void m(dwev dwevVar) {
        if (dwevVar.c) {
            dwevVar.bF();
            dwevVar.c = false;
        }
        dwew dwewVar = (dwew) dwevVar.b;
        dwew dwewVar2 = dwew.e;
        int i = dwewVar.a | 1;
        dwewVar.a = i;
        dwewVar.c = true;
        dwewVar.a = i | 2;
        dwewVar.d = true;
    }

    public static void n(dwfs dwfsVar, int i, int i2) {
        dhkc bZ = dhkd.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        int i3 = dhkdVar.a | 2;
        dhkdVar.a = i3;
        dhkdVar.c = i2;
        dhkdVar.a = i3 | 1;
        dhkdVar.b = i;
        dhkd bK = bZ.bK();
        if (dwfsVar.c) {
            dwfsVar.bF();
            dwfsVar.c = false;
        }
        dwfv dwfvVar = (dwfv) dwfsVar.b;
        dwfv dwfvVar2 = dwfv.m;
        bK.getClass();
        dwfvVar.k = bK;
        dwfvVar.a |= 1024;
    }

    public static dwfs o(boolean z) {
        return e(z, false, false, dcdc.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void p(dwfs dwfsVar, dweb dwebVar, int i, int i2) {
        dwei bZ = dwej.b.bZ();
        dweg bZ2 = dweh.d.bZ();
        dwee bZ3 = dwef.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwef dwefVar = (dwef) bZ3.b;
        dwefVar.b = dwebVar.i;
        dwefVar.a |= 1;
        bZ2.b(bZ3.bK());
        dhkc bZ4 = dhkd.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ4.b;
        int i3 = dhkdVar.a | 2;
        dhkdVar.a = i3;
        dhkdVar.c = i2;
        dhkdVar.a = i3 | 1;
        dhkdVar.b = i;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dweh dwehVar = (dweh) bZ2.b;
        dhkd bK = bZ4.bK();
        bK.getClass();
        dwehVar.c = bK;
        dwehVar.a |= 1;
        bZ.b(bZ2.bK());
        if (dwfsVar.c) {
            dwfsVar.bF();
            dwfsVar.c = false;
        }
        dwfv dwfvVar = (dwfv) dwfsVar.b;
        dwej bK2 = bZ.bK();
        dwfv dwfvVar2 = dwfv.m;
        bK2.getClass();
        dwfvVar.f = bK2;
        dwfvVar.a |= 32;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void q(dwfs dwfsVar, int i) {
        dwfp bZ = dwfr.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfr dwfrVar = (dwfr) bZ.b;
        dwfrVar.b = i - 1;
        dwfrVar.a |= 1;
        dwfsVar.a(bZ.bK());
    }

    public abstract dwge a(akqi akqiVar, int i, String str, int i2, int i3);

    public abstract int b(@dzsi ilo iloVar);
}
