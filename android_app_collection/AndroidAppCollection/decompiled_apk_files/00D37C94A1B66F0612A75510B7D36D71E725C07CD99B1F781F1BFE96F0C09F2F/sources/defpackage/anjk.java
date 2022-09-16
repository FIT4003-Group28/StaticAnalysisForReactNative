package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: anjk  reason: default package */
/* loaded from: classes.dex */
public final class anjk extends Enum implements Executor {
    public static final anjk a;
    private static final /* synthetic */ anjk[] b;

    static {
        anjk anjkVar = new anjk();
        a = anjkVar;
        b = new anjk[]{anjkVar};
    }

    private anjk() {
    }

    public static anjk[] values() {
        return (anjk[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
