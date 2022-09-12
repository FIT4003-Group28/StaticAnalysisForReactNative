package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: czhx  reason: default package */
/* loaded from: classes.dex */
public final class czhx {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("SnapshotListener should not be null.");
    }

    public static <T> void d(T t) {
        t.getClass();
    }
}
