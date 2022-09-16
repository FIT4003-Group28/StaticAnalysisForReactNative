package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccl  reason: default package */
/* loaded from: classes2.dex */
public final class ccl {
    private static final ccv a = ccv.a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cav a(ccw ccwVar, bwx bwxVar) {
        String str = null;
        bzz bzzVar = null;
        bzz bzzVar2 = null;
        caj cajVar = null;
        boolean z = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                str = ccwVar.h();
            } else if (c == 1) {
                bzzVar = lg.k(ccwVar, bwxVar, false);
            } else if (c == 2) {
                bzzVar2 = lg.k(ccwVar, bwxVar, false);
            } else if (c == 3) {
                cajVar = cbt.a(ccwVar, bwxVar);
            } else if (c == 4) {
                z = ccwVar.q();
            } else {
                ccwVar.o();
            }
        }
        return new cav(str, bzzVar, bzzVar2, cajVar, z);
    }
}
