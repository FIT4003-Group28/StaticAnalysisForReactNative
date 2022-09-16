package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cbr  reason: default package */
/* loaded from: classes2.dex */
public final class cbr {
    private static final ccv a = ccv.a("k", "x", "y");

    public static cac a(ccw ccwVar, bwx bwxVar) {
        ArrayList arrayList = new ArrayList();
        if (ccwVar.r() == 1) {
            ccwVar.i();
            while (ccwVar.p()) {
                arrayList.add(new bzf(bwxVar, cce.a(ccwVar, bwxVar, cdh.a(), cbx.d, ccwVar.r() == 3, false)));
            }
            ccwVar.k();
            ccf.b(arrayList);
        } else {
            arrayList.add(new cdi(ccd.c(ccwVar, cdh.a())));
        }
        return new cac(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cak b(ccw ccwVar, bwx bwxVar) {
        ccwVar.j();
        cac cacVar = null;
        bzz bzzVar = null;
        bzz bzzVar2 = null;
        boolean z = false;
        while (ccwVar.r() != 4) {
            int c = ccwVar.c(a);
            if (c == 0) {
                cacVar = a(ccwVar, bwxVar);
            } else if (c != 1) {
                if (c == 2) {
                    if (ccwVar.r() == 6) {
                        ccwVar.o();
                        z = true;
                    } else {
                        bzzVar2 = lg.j(ccwVar, bwxVar);
                    }
                } else {
                    ccwVar.n();
                    ccwVar.o();
                }
            } else if (ccwVar.r() == 6) {
                ccwVar.o();
                z = true;
            } else {
                bzzVar = lg.j(ccwVar, bwxVar);
            }
        }
        ccwVar.l();
        if (z) {
            bwxVar.d("Lottie doesn't support expressions.");
        }
        return cacVar != null ? cacVar : new cag(bzzVar, bzzVar2);
    }
}
