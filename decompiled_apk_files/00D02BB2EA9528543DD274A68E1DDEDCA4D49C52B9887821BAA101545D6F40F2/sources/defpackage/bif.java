package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bif  reason: default package */
/* loaded from: classes3.dex */
public final class bif {
    public final bhi a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new bie(this);

    public bif(Executor executor) {
        this.a = new bhi(executor);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
