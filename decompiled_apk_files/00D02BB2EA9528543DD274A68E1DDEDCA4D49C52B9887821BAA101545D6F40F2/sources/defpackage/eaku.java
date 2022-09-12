package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: eaku  reason: default package */
/* loaded from: classes6.dex */
final class eaku implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ eala b;

    public eaku(eala ealaVar, Executor executor) {
        this.b = ealaVar;
        this.a = executor;
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
