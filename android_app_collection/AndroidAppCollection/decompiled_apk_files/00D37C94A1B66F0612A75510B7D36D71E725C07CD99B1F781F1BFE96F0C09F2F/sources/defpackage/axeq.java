package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: axeq  reason: default package */
/* loaded from: classes2.dex */
public final class axeq {
    private static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        Handler handler = a;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }
}
