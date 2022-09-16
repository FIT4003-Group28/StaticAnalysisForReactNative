package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cbu  reason: default package */
/* loaded from: classes2.dex */
public final class cbu {
    private static final ccv a = ccv.a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cam a(ccw ccwVar, bwx bwxVar, int i) {
        boolean z = i == 3;
        String str = null;
        cak cakVar = null;
        cad cadVar = null;
        boolean z2 = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                str = ccwVar.h();
            } else if (c == 1) {
                cakVar = cbr.b(ccwVar, bwxVar);
            } else if (c == 2) {
                cadVar = lg.n(ccwVar, bwxVar);
            } else if (c == 3) {
                z2 = ccwVar.q();
            } else if (c == 4) {
                z = ccwVar.b() == 3;
            } else {
                ccwVar.n();
                ccwVar.o();
            }
        }
        return new cam(str, cakVar, cadVar, z, z2);
    }
}
