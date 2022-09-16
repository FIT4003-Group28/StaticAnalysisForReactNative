package defpackage;
/* compiled from: PG */
/* renamed from: dcuj  reason: default package */
/* loaded from: classes.dex */
public final class dcuj {
    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void b(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean c(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
