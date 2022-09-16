package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yiz  reason: default package */
/* loaded from: classes4.dex */
public final class yiz extends yjj {
    private final Executor b;

    private yiz(Executor executor, yiw yiwVar) {
        super(yiwVar);
        executor.getClass();
        this.b = executor;
    }

    public static yiz c(Executor executor, yiw yiwVar) {
        return new yiz(executor, yiwVar);
    }

    @Override // defpackage.yjj
    protected final void d(Runnable runnable) {
        this.b.execute(runnable);
    }
}
