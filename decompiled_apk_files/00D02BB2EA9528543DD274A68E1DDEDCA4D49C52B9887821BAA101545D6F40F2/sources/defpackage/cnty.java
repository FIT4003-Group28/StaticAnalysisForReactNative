package defpackage;
/* compiled from: PG */
/* renamed from: cnty  reason: default package */
/* loaded from: classes5.dex */
public final class cnty {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
