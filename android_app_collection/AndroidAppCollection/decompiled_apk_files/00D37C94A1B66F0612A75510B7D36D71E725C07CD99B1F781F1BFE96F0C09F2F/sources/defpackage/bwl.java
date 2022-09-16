package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bwl  reason: default package */
/* loaded from: classes2.dex */
final class bwl extends Enum implements Executor {
    public static final bwl a;
    private static final /* synthetic */ bwl[] b;

    static {
        bwl bwlVar = new bwl();
        a = bwlVar;
        b = new bwl[]{bwlVar};
    }

    private bwl() {
    }

    public static bwl[] values() {
        return (bwl[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
