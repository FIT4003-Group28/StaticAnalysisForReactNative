package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: bcs  reason: default package */
/* loaded from: classes3.dex */
public final class bcs {
    public final Handler a = aks.a(Looper.getMainLooper());

    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}
