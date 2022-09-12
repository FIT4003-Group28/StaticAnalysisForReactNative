package defpackage;
/* compiled from: PG */
/* renamed from: dbjb  reason: default package */
/* loaded from: classes5.dex */
public final class dbjb {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static <T> void c(T t) {
        t.getClass();
    }

    public static <T> void d(T t, Object obj) {
        if (t != null) {
            return;
        }
        throw new NullPointerException((String) obj);
    }
}
