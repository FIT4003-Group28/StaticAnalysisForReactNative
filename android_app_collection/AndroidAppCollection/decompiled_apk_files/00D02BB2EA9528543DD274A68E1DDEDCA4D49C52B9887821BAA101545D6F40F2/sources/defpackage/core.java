package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: core  reason: default package */
/* loaded from: classes5.dex */
public final class core {
    public static Looper a(Looper looper) {
        return looper != null ? looper : b();
    }

    public static Looper b() {
        cnwc.c(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
