package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvql  reason: default package */
/* loaded from: classes.dex */
final class bvql implements Executor {
    public final Handler a;

    public bvql(Looper looper) {
        this.a = new Handler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        throw new IllegalStateException("Looper is exiting");
    }
}
