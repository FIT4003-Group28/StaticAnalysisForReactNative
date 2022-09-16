package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwn  reason: default package */
/* loaded from: classes2.dex */
public final class bwn {
    public final bvm a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new bwm(this);

    public bwn(Executor executor) {
        this.a = new bvm(executor);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
