package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: dehr  reason: default package */
/* loaded from: classes6.dex */
final class dehr implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ dees b;

    public dehr(Executor executor, dees deesVar) {
        this.a = executor;
        this.b = deesVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.k(e);
        }
    }
}
