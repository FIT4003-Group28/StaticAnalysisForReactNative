package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccr  reason: default package */
/* loaded from: classes2.dex */
public final class ccr {
    private static final ccv a = ccv.a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cbb a(ccw ccwVar, bwx bwxVar) {
        bzz bzzVar = null;
        bzz bzzVar2 = null;
        bzz bzzVar3 = null;
        int i = 0;
        boolean z = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                bzzVar = lg.k(ccwVar, bwxVar, false);
            } else if (c == 1) {
                bzzVar2 = lg.k(ccwVar, bwxVar, false);
            } else if (c == 2) {
                bzzVar3 = lg.k(ccwVar, bwxVar, false);
            } else if (c == 3) {
                ccwVar.h();
            } else if (c == 4) {
                int b = ccwVar.b();
                if (b == 1) {
                    i = 1;
                } else if (b != 2) {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Unknown trim path type ");
                    sb.append(b);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    i = 2;
                }
            } else if (c == 5) {
                z = ccwVar.q();
            } else {
                ccwVar.o();
            }
        }
        return new cbb(i, bzzVar, bzzVar2, bzzVar3, z);
    }
}
