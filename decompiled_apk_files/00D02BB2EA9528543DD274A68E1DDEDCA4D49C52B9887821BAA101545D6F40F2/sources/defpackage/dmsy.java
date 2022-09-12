package defpackage;
/* compiled from: PG */
/* renamed from: dmsy  reason: default package */
/* loaded from: classes.dex */
public final class dmsy {
    public static int a(int i) {
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

    public static String b(int i) {
        return Integer.toString(i - 1);
    }
}
