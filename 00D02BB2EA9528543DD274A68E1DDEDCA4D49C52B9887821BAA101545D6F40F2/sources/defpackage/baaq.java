package defpackage;
/* compiled from: PG */
/* renamed from: baaq  reason: default package */
/* loaded from: classes3.dex */
public final class baaq extends bttk<dvvi, dvvm> {
    public static final /* synthetic */ int c = 0;
    public final dvvi a;
    public final baap b;
    @dzsi
    private dvvl d;
    @dzsi
    private String e;
    @dzsi
    private dniu f;
    @dzsi
    private Long g;

    private baaq(dvvi dvviVar, baap baapVar) {
        dunt duntVar = dunt.UNKNOWN_REQUEST_ID;
        bvrj bvrjVar = bvrj.CURRENT;
        dbsk.s(dvviVar);
        this.a = dvviVar;
        dbsk.s(baapVar);
        this.b = baapVar;
    }

    public static baaq b(dndr dndrVar, String str, @dzsi String str2, @dzsi String str3, @dzsi ddho ddhoVar, @dzsi String str4, baap baapVar) {
        e(dndrVar, baapVar);
        dbsk.l(dndrVar != dndr.NICKNAME);
        dbsk.s(str);
        dvvb bZ = dvvc.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvc dvvcVar = (dvvc) bZ.b;
        dvvcVar.b = dndrVar.h;
        int i = dvvcVar.a | 1;
        dvvcVar.a = i;
        dvvcVar.a = i | 2;
        dvvcVar.c = 0L;
        dvvd bZ2 = dvve.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvve dvveVar = (dvve) bZ2.b;
        str.getClass();
        dvveVar.a |= 1;
        dvveVar.d = str;
        if (!dbsj.d(str2)) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvve dvveVar2 = (dvve) bZ2.b;
            str2.getClass();
            dvveVar2.b = 2;
            dvveVar2.c = str2;
        }
        dvvh bZ3 = dvvi.k.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvvi dvviVar = (dvvi) bZ3.b;
        dvviVar.b = 0;
        dvviVar.a = 1 | dvviVar.a;
        dvvc bK = bZ.bK();
        bK.getClass();
        dvviVar.c = bK;
        dvviVar.a |= 2;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvvi dvviVar2 = (dvvi) bZ3.b;
        dvve bK2 = bZ2.bK();
        bK2.getClass();
        dvviVar2.d = bK2;
        dvviVar2.a |= 4;
        if (ddhoVar != null) {
            int b = ddhoVar.b();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvvi dvviVar3 = (dvvi) bZ3.b;
            dvviVar3.a |= 512;
            dvviVar3.j = b;
        }
        if (str4 != null) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvvi dvviVar4 = (dvvi) bZ3.b;
            str4.getClass();
            dvviVar4.a |= 16;
            dvviVar4.f = str4;
        }
        return d(bZ3, str3, baapVar);
    }

    public static baaq c(dndr dndrVar, Long l, @dzsi String str, baap baapVar) {
        e(dndrVar, baapVar);
        dvvh bZ = dvvi.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvi dvviVar = (dvvi) bZ.b;
        dvviVar.b = 1;
        dvviVar.a |= 1;
        dvvb bZ2 = dvvc.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvvc dvvcVar = (dvvc) bZ2.b;
        dvvcVar.b = dndrVar.h;
        dvvcVar.a |= 1;
        long longValue = l.longValue();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvvc dvvcVar2 = (dvvc) bZ2.b;
        dvvcVar2.a |= 2;
        dvvcVar2.c = longValue;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvi dvviVar2 = (dvvi) bZ.b;
        dvvc bK = bZ2.bK();
        bK.getClass();
        dvviVar2.c = bK;
        dvviVar2.a |= 2;
        return d(bZ, str, baapVar);
    }

    public static baaq d(dvvh dvvhVar, @dzsi String str, baap baapVar) {
        if (!dbsj.d(str)) {
            if (dvvhVar.c) {
                dvvhVar.bF();
                dvvhVar.c = false;
            }
            dvvi dvviVar = (dvvi) dvvhVar.b;
            dvvi dvviVar2 = dvvi.k;
            str.getClass();
            dvviVar.a |= 8;
            dvviVar.e = str;
        }
        return new baaq(dvvhVar.bK(), baapVar);
    }

    public static void e(dndr dndrVar, baap baapVar) {
        boolean z = true;
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK && dndrVar != dndr.NICKNAME) {
            z = false;
        }
        dbsk.a(z);
        dbsk.s(baapVar);
    }

    @Override // defpackage.bttu
    public final void a(@dzsi bttq bttqVar) {
        String str;
        boolean z = bttqVar == null && this.d == dvvl.SUCCESS;
        baap baapVar = this.b;
        Long l = bttqVar == null ? this.g : null;
        dvvi dvviVar = this.a;
        decq a = (dvviVar.a & 64) != 0 ? decq.a(dvviVar.h) : null;
        String str2 = bttqVar == null ? this.e : null;
        dniu dniuVar = bttqVar == null ? this.f : null;
        if (bttqVar == null) {
            dvvi dvviVar2 = this.a;
            if ((dvviVar2.a & 32) != 0) {
                str = dvviVar2.g;
                baapVar.a(z, l, a, str2, dniuVar, str);
            }
        }
        str = null;
        baapVar.a(z, l, a, str2, dniuVar, str);
    }

    @dzsi
    public final bttq f(dvvm dvvmVar) {
        dniu dniuVar;
        dvvl b = dvvl.b(dvvmVar.b);
        if (b == null) {
            b = dvvl.UNKNOWN;
        }
        this.d = b;
        this.e = dvvmVar.d;
        this.g = (dvvmVar.a & 2) != 0 ? Long.valueOf(dvvmVar.c) : null;
        if ((dvvmVar.a & 16) != 0) {
            dniuVar = dvvmVar.e;
            if (dniuVar == null) {
                dniuVar = dniu.i;
            }
        } else {
            dniuVar = null;
        }
        this.f = dniuVar;
        dvvl dvvlVar = this.d;
        dbsk.s(dvvlVar);
        int ordinal = dvvlVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 5) {
                return bttq.INVALID_GAIA_AUTH_TOKEN;
            }
            return bttq.SINGLE_REQUEST_FATAL_ERROR;
        }
        return null;
    }
}
