package defpackage;
/* compiled from: PG */
/* renamed from: dnfa  reason: default package */
/* loaded from: classes6.dex */
public final class dnfa {
    public static int[] a() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }
}
