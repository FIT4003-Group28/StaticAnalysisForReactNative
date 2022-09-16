package defpackage;
/* compiled from: PG */
/* renamed from: cbz  reason: default package */
/* loaded from: classes2.dex */
final class cbz {
    private static final ccv a = ccv.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bzs a(ccw ccwVar) {
        ccwVar.j();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                str = ccwVar.h();
            } else if (c == 1) {
                str2 = ccwVar.h();
            } else if (c == 2) {
                str3 = ccwVar.h();
            } else if (c == 3) {
                ccwVar.a();
            } else {
                ccwVar.n();
                ccwVar.o();
            }
        }
        ccwVar.l();
        return new bzs(str, str2, str3);
    }
}
