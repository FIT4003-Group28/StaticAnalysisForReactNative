package defpackage;
/* compiled from: PG */
/* renamed from: dbuh  reason: default package */
/* loaded from: classes5.dex */
public final class dbuh {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new dbui();
    }

    public static void b(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new dbui(dbtx.b(str, obj));
    }

    public static <T> void c(T t, String str, Object... objArr) {
        if (t != null) {
            return;
        }
        throw new dbui(dbtx.b(str, objArr));
    }

    public static <T> void d(T t) {
        c(t, "expected a non-null reference", new Object[0]);
    }
}
