package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: anky  reason: default package */
/* loaded from: classes.dex */
public final class anky implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ anie b;

    public anky(Executor executor, anie anieVar) {
        this.a = executor;
        this.b = anieVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.e(e);
        }
    }
}
