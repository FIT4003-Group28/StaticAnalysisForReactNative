package defpackage;
/* compiled from: PG */
/* renamed from: cugj  reason: default package */
/* loaded from: classes5.dex */
public final class cugj {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CHIPS_ONLY" : "RICH_TEXT" : "CUSTOM" : "TEXT" : "UNSUPPORTED";
    }

    public static int[] b() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int c(int i) {
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 1 : 5;
        }
        return 2;
    }
}
