package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cck  reason: default package */
/* loaded from: classes2.dex */
public final class cck {
    private static final ccv a = ccv.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cau a(ccw ccwVar, bwx bwxVar) {
        String str = null;
        cak cakVar = null;
        cad cadVar = null;
        bzz bzzVar = null;
        boolean z = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                str = ccwVar.h();
            } else if (c == 1) {
                cakVar = cbr.b(ccwVar, bwxVar);
            } else if (c == 2) {
                cadVar = lg.n(ccwVar, bwxVar);
            } else if (c == 3) {
                bzzVar = lg.j(ccwVar, bwxVar);
            } else if (c == 4) {
                z = ccwVar.q();
            } else {
                ccwVar.o();
            }
        }
        return new cau(str, cakVar, cadVar, bzzVar, z);
    }
}
