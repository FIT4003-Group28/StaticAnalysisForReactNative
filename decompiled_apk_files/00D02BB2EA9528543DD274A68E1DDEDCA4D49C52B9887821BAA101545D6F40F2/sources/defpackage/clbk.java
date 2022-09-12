package defpackage;
/* compiled from: PG */
/* renamed from: clbk  reason: default package */
/* loaded from: classes5.dex */
public final class clbk {
    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void b(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> void c(T t, @dzsi String str) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(str);
    }
}
