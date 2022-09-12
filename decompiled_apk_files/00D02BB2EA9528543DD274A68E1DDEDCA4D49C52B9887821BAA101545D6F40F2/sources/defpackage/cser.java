package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: cser  reason: default package */
/* loaded from: classes5.dex */
public final class cser {
    public static void a(boolean z, String str) {
        if (!z) {
            new IllegalStateException(str);
        }
    }

    public static void b() {
        a(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    public static <T> void c(T t) {
        if (t == null) {
        }
    }
}
