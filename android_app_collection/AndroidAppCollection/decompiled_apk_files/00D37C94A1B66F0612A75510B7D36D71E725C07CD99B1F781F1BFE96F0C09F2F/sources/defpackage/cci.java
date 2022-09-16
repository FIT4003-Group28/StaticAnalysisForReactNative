package defpackage;
/* compiled from: PG */
/* renamed from: cci  reason: default package */
/* loaded from: classes2.dex */
final class cci {
    private static final ccv a = ccv.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cas a(ccw ccwVar) {
        int i = 0;
        boolean z = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                ccwVar.h();
            } else if (c == 1) {
                int b = ccwVar.b();
                if (b != 1) {
                    if (b == 2) {
                        i = 2;
                    } else if (b == 3) {
                        i = 3;
                    } else if (b == 4) {
                        i = 4;
                    } else if (b == 5) {
                        i = 5;
                    }
                }
                i = 1;
            } else if (c == 2) {
                z = ccwVar.q();
            } else {
                ccwVar.n();
                ccwVar.o();
            }
        }
        return new cas(i, z);
    }
}
