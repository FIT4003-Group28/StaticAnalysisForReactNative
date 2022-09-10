package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ckob  reason: default package */
/* loaded from: classes4.dex */
public final class ckob {
    public static akqq a(dwfl dwflVar) {
        dhjx dhjxVar = dwflVar.m;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        dhjz dhjzVar = dhjxVar.b;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        int i = dhjzVar.a;
        return ((i & 2) == 0 || (i & 1) == 0) ? new akqq() : akqq.j(dhjzVar);
    }

    public static boolean b(dwfl dwflVar) {
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        dikg dikgVar = diisVar.g;
        if (dikgVar == null) {
            dikgVar = dikg.d;
        }
        return new dsrh(dikgVar.a, dikg.b).contains(dikd.CRAWLED);
    }

    public static dvyw d(dwfl dwflVar) {
        dvya bZ = dvyw.bv.bZ();
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dlwk dlwkVar = dizhVar.d;
        if (dlwkVar == null) {
            dlwkVar = dlwk.g;
        }
        String str = dlwkVar.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        str.getClass();
        dvywVar.a |= 16;
        dvywVar.i = str;
        dhjx dhjxVar = dwflVar.m;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if ((dhjxVar.a & 1) != 0) {
            dhjx dhjxVar2 = dwflVar.m;
            if (dhjxVar2 == null) {
                dhjxVar2 = dhjx.f;
            }
            dhjz dhjzVar = dhjxVar2.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar2 = (dvyw) bZ.b;
            dhjzVar.getClass();
            dvywVar2.e = dhjzVar;
            dvywVar2.a |= 1;
        }
        if ((dwflVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            dpsn dpsnVar = dwflVar.t;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            long j = dpsnVar.b;
            dpsn dpsnVar2 = dwflVar.t;
            if (dpsnVar2 == null) {
                dpsnVar2 = dpsn.d;
            }
            String o = new akqi(j, dpsnVar2.c).o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar3 = (dvyw) bZ.b;
            o.getClass();
            dvywVar3.a |= 4;
            dvywVar3.g = o;
        }
        return bZ.bK();
    }

    public static ilo c(dwfl dwflVar) {
        if ((dwflVar.a & ImageMetadata.LENS_APERTURE) == 0) {
            dhjx dhjxVar = dwflVar.m;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            if ((dhjxVar.a & 1) != 0) {
                ily ilyVar = new ily();
                dhjx dhjxVar2 = dwflVar.m;
                if (dhjxVar2 == null) {
                    dhjxVar2 = dhjx.f;
                }
                dhjz dhjzVar = dhjxVar2.b;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                ilyVar.q(akqq.j(dhjzVar));
                ilyVar.f = false;
                ilyVar.g = true;
                return ilyVar.d();
            }
        }
        ily ilyVar2 = new ily();
        ilyVar2.E(d(dwflVar));
        return ilyVar2.d();
    }
}
