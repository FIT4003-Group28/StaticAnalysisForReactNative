package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqbe  reason: default package */
/* loaded from: classes4.dex */
final class bqbe {
    public final cflq a;

    public bqbe(cflq cflqVar) {
        this.a = cflqVar;
    }

    public static boolean a(alxh alxhVar, akra akraVar) {
        return alxhVar.b(akraVar, akraVar.r() * 3.0d) != null;
    }

    public static bqhp c(List<Long> list, @dzsi cflw cflwVar) {
        bqhn bZ = bqhp.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhp bqhpVar = (bqhp) bZ.b;
        bqhpVar.d = 1;
        bqhpVar.a |= 2;
        bqhp bqhpVar2 = (bqhp) bZ.b;
        bqhpVar2.b();
        dsod.bv(list, bqhpVar2.b);
        if (cflwVar != null) {
            String b = cflwVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqhp bqhpVar3 = (bqhp) bZ.b;
            b.getClass();
            bqhpVar3.a |= 1;
            bqhpVar3.c = b;
        } else {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqhp bqhpVar4 = (bqhp) bZ.b;
            bqhpVar4.a |= 1;
            bqhpVar4.c = "";
        }
        return bZ.bK();
    }

    public final dcep<cflw> b(long j) {
        dbsg<cflx> b = this.a.b(j);
        if (!b.a()) {
            return dcmr.a;
        }
        return b.b().d();
    }
}
