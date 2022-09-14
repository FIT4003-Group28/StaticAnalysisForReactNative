package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: arw  reason: default package */
/* loaded from: classes2.dex */
final class arw {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Runnable b;
    public long c;
    public long d;
    public boolean e;

    public arw(Runnable runnable) {
        this.b = runnable;
    }
}
