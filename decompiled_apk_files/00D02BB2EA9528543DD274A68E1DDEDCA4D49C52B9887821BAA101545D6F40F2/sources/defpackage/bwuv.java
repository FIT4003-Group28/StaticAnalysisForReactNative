package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwuv  reason: default package */
/* loaded from: classes4.dex */
final class bwuv implements Executor {
    final /* synthetic */ bvrb a;

    public bwuv(bvrb bvrbVar) {
        this.a = bvrbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.b(runnable, bvrj.BACKGROUND_THREADPOOL);
    }
}
