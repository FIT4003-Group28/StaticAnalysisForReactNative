package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccp  reason: default package */
/* loaded from: classes2.dex */
public final class ccp {
    static final ccv a = ccv.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static caz a(ccw ccwVar, bwx bwxVar) {
        int i = 0;
        String str = null;
        caf cafVar = null;
        boolean z = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                str = ccwVar.h();
            } else if (c == 1) {
                i = ccwVar.b();
            } else if (c == 2) {
                cafVar = lg.o(ccwVar, bwxVar);
            } else if (c == 3) {
                z = ccwVar.q();
            } else {
                ccwVar.o();
            }
        }
        return new caz(str, i, cafVar, z);
    }
}
