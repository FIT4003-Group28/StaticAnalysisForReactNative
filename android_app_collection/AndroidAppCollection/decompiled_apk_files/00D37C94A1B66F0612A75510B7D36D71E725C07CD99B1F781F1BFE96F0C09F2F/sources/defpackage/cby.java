package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cby  reason: default package */
/* loaded from: classes2.dex */
public final class cby {
    private static final ccv a = ccv.a("ch", "size", "w", "style", "fFamily", "data");
    private static final ccv b = ccv.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bzt a(ccw ccwVar, bwx bwxVar) {
        ArrayList arrayList = new ArrayList();
        ccwVar.j();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (ccwVar.p()) {
            int c2 = ccwVar.c(a);
            if (c2 == 0) {
                c = ccwVar.h().charAt(0);
            } else if (c2 == 1) {
                ccwVar.a();
            } else if (c2 == 2) {
                d = ccwVar.a();
            } else if (c2 == 3) {
                str = ccwVar.h();
            } else if (c2 == 4) {
                str2 = ccwVar.h();
            } else if (c2 == 5) {
                ccwVar.j();
                while (ccwVar.p()) {
                    if (ccwVar.c(b) == 0) {
                        ccwVar.i();
                        while (ccwVar.p()) {
                            arrayList.add((cay) cbv.a(ccwVar, bwxVar));
                        }
                        ccwVar.k();
                    } else {
                        ccwVar.n();
                        ccwVar.o();
                    }
                }
                ccwVar.l();
            } else {
                ccwVar.n();
                ccwVar.o();
            }
        }
        ccwVar.l();
        return new bzt(arrayList, c, d, str, str2);
    }
}
