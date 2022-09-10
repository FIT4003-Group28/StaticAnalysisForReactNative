package defpackage;

import android.util.Base64;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwuy  reason: default package */
/* loaded from: classes4.dex */
public final class bwuy {
    private static final dfwx c;
    private static final String d;
    public final buti a;
    public final Executor b;

    static {
        dfww bZ = dfwx.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwx dfwxVar = (dfwx) bZ.b;
        dfwxVar.a |= 1;
        dfwxVar.b = true;
        dfwx dfwxVar2 = (dfwx) bZ.b;
        dfwxVar2.a |= 2;
        dfwxVar2.c = true;
        dfwx bK = bZ.bK();
        c = bK;
        d = Base64.encodeToString(bK.bS(), 9);
    }

    public bwuy(buti butiVar, Executor executor) {
        this.a = butiVar;
        this.b = executor;
    }

    public static dwfv b(String str, boolean z) {
        dwfs bZ = dwfv.m.bZ();
        dwev bZ2 = dwew.e.bZ();
        drcf bZ3 = drcg.e.bZ();
        dgge dggeVar = dgge.IMAGE_ALLEYCAT;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drcg drcgVar = (drcg) bZ3.b;
        drcgVar.b = dggeVar.l;
        drcgVar.a |= 1;
        dggc dggcVar = dggc.PANO;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drcg drcgVar2 = (drcg) bZ3.b;
        drcgVar2.d = dggcVar.f;
        int i = drcgVar2.a | 4;
        drcgVar2.a = i;
        drcgVar2.a = i | 2;
        drcgVar2.c = true;
        bZ2.a(bZ3);
        drcf bZ4 = drcg.e.bZ();
        dgge dggeVar2 = dgge.IMAGE_FIFE;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drcg drcgVar3 = (drcg) bZ4.b;
        drcgVar3.b = dggeVar2.l;
        drcgVar3.a |= 1;
        dggc dggcVar2 = dggc.PANO;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drcg drcgVar4 = (drcg) bZ4.b;
        drcgVar4.d = dggcVar2.f;
        int i2 = drcgVar4.a | 4;
        drcgVar4.a = i2;
        drcgVar4.a = i2 | 2;
        drcgVar4.c = true;
        bZ2.a(bZ4);
        drcf bZ5 = drcg.e.bZ();
        dgge dggeVar3 = dgge.MEDIA_GUESSABLE_FIFE;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drcg drcgVar5 = (drcg) bZ5.b;
        drcgVar5.b = dggeVar3.l;
        drcgVar5.a |= 1;
        dggc dggcVar3 = dggc.PANO;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drcg drcgVar6 = (drcg) bZ5.b;
        drcgVar6.d = dggcVar3.f;
        int i3 = drcgVar6.a | 4;
        drcgVar6.a = i3;
        drcgVar6.a = i3 | 2;
        drcgVar6.c = true;
        bZ2.a(bZ5);
        if (z) {
            drcf bZ6 = drcg.e.bZ();
            dgge dggeVar4 = dgge.IMAGE_ALLEYCAT;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drcg drcgVar7 = (drcg) bZ6.b;
            drcgVar7.b = dggeVar4.l;
            drcgVar7.a |= 1;
            dggc dggcVar4 = dggc.PHOTO;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drcg drcgVar8 = (drcg) bZ6.b;
            drcgVar8.d = dggcVar4.f;
            int i4 = drcgVar8.a | 4;
            drcgVar8.a = i4;
            drcgVar8.a = i4 | 2;
            drcgVar8.c = false;
            bZ2.a(bZ6);
            drcf bZ7 = drcg.e.bZ();
            dgge dggeVar5 = dgge.IMAGE_FIFE;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            drcg drcgVar9 = (drcg) bZ7.b;
            drcgVar9.b = dggeVar5.l;
            drcgVar9.a |= 1;
            dggc dggcVar5 = dggc.PHOTO;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            drcg drcgVar10 = (drcg) bZ7.b;
            drcgVar10.d = dggcVar5.f;
            int i5 = drcgVar10.a | 4;
            drcgVar10.a = i5;
            drcgVar10.a = i5 | 2;
            drcgVar10.c = false;
            bZ2.a(bZ7);
            drcf bZ8 = drcg.e.bZ();
            dgge dggeVar6 = dgge.MEDIA_GUESSABLE_FIFE;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            drcg drcgVar11 = (drcg) bZ8.b;
            drcgVar11.b = dggeVar6.l;
            drcgVar11.a |= 1;
            dggc dggcVar6 = dggc.PHOTO;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            drcg drcgVar12 = (drcg) bZ8.b;
            drcgVar12.d = dggcVar6.f;
            int i6 = drcgVar12.a | 4;
            drcgVar12.a = i6;
            drcgVar12.a = i6 | 2;
            drcgVar12.c = false;
            bZ2.a(bZ8);
        }
        dwew bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ.b;
        bK.getClass();
        dwfvVar.b = bK;
        dwfvVar.a |= 1;
        dwfv.c(dwfvVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar2 = (dwfv) bZ.b;
        dwfvVar2.l = 2;
        dwfvVar2.a |= 2048;
        if (str != null) {
            dwfw bZ9 = dwfx.d.bZ();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dwfx dwfxVar = (dwfx) bZ9.b;
            str.getClass();
            dwfxVar.a |= 4;
            dwfxVar.c = str;
            dwfx bK2 = bZ9.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwfv dwfvVar3 = (dwfv) bZ.b;
            bK2.getClass();
            dwfvVar3.h = bK2;
            dwfvVar3.a |= 128;
        }
        return bZ.bK();
    }

    private static dwge d(dhjz dhjzVar, String str, boolean z) {
        dwfy bZ = dwge.m.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar = (dwge) bZ.b;
        dwgeVar.b = 3;
        int i = dwgeVar.a | 1;
        dwgeVar.a = i;
        dhjzVar.getClass();
        dwgeVar.e = dhjzVar;
        int i2 = i | 32;
        dwgeVar.a = i2;
        dwgeVar.a = i2 | 64;
        dwgeVar.g = 25.0d;
        dwfv b = b(str, z);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar2 = (dwge) bZ.b;
        b.getClass();
        dwgeVar2.h = b;
        dwgeVar2.a |= 128;
        return bZ.bK();
    }

    public final void a(akra akraVar, String str, boolean z, boolean z2, btzi<dwge, dwgl> btziVar) {
        dhjy bZ = dhjz.e.bZ();
        double k = akraVar.k();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        dhjzVar.a |= 2;
        dhjzVar.c = k;
        double o = akraVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = o;
        dhjz bK = bZ.bK();
        if (str == null) {
            str = z2 ? d : null;
        }
        this.a.b(d(bK, str, z), btziVar, this.b);
    }

    public final void c(akqq akqqVar, boolean z, btzi<dwge, dwgl> btziVar) {
        dhjy bZ = dhjz.e.bZ();
        double d2 = akqqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        int i = dhjzVar.a | 2;
        dhjzVar.a = i;
        dhjzVar.c = d2;
        double d3 = akqqVar.b;
        dhjzVar.a = i | 1;
        dhjzVar.b = d3;
        this.a.b(d(bZ.bK(), null, z), btziVar, this.b);
    }
}
