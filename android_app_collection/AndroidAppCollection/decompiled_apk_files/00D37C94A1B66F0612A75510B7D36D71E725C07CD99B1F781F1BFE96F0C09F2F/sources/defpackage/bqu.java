package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: bqu  reason: default package */
/* loaded from: classes2.dex */
public final class bqu implements bqm {
    private final Handler a = aki.b(Looper.getMainLooper());

    @Override // defpackage.bqm
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.bqm
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
