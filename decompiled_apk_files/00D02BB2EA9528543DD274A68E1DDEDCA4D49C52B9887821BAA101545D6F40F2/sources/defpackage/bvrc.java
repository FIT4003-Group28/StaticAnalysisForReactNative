package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvrc  reason: default package */
/* loaded from: classes4.dex */
final class bvrc implements Executor {
    private final Executor a;
    private final cqat b;

    public bvrc(Executor executor, cqat cqatVar) {
        this.a = executor;
        this.b = cqatVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable instanceof Delayed) {
            this.a.execute(runnable);
        } else {
            this.a.execute(new bvqy(runnable, this.b, 0L));
        }
    }
}
