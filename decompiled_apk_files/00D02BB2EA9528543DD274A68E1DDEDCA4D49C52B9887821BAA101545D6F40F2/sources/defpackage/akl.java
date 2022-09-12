package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: akl  reason: default package */
/* loaded from: classes2.dex */
public final class akl implements Executor {
    private final Handler a;

    public akl(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.a + " is shutting down");
    }
}
