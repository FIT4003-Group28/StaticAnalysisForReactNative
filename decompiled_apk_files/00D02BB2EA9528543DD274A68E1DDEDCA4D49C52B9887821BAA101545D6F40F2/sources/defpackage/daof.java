package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: daof  reason: default package */
/* loaded from: classes5.dex */
public final class daof {
    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void b(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(str.concat(" must be called from the UI thread."));
    }

    public static <T> void c(T t, String str) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(str);
    }
}
