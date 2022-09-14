package defpackage;
/* compiled from: PG */
/* renamed from: dopr  reason: default package */
/* loaded from: classes6.dex */
public final class dopr {
    public static /* synthetic */ int a(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static String c(int i) {
        return Integer.toString(i - 1);
    }
}
