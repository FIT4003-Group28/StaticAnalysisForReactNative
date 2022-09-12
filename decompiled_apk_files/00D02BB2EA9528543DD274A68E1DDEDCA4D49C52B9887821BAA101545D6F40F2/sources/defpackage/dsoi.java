package defpackage;
/* compiled from: PG */
/* renamed from: dsoi  reason: default package */
/* loaded from: classes.dex */
final class dsoi {
    public static final Class<?> a = b("libcore.io.Memory");
    private static final boolean b;

    static {
        b = b("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return a != null && !b;
    }

    private static <T> Class<T> b(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
