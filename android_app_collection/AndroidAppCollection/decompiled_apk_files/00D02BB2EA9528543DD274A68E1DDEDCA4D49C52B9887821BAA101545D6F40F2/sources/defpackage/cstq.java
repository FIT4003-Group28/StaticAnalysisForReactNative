package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: cstq  reason: default package */
/* loaded from: classes5.dex */
public final class cstq {
    public static void a() {
        b(Looper.getMainLooper() != Looper.myLooper(), "checkWorkerThread failed");
    }

    public static void b(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }
}
