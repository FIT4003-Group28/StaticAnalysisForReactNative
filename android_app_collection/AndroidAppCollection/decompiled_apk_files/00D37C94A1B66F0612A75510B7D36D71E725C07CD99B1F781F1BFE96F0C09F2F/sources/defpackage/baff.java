package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: baff  reason: default package */
/* loaded from: classes2.dex */
final class baff implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ bafk b;

    public baff(bafk bafkVar, Executor executor) {
        this.b = bafkVar;
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.f(e);
        }
    }
}
