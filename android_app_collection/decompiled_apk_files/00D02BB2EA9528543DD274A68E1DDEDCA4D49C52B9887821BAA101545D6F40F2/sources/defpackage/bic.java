package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bic  reason: default package */
/* loaded from: classes3.dex */
final class bic extends Enum<bic> implements Executor {
    public static final bic a;
    private static final /* synthetic */ bic[] b;

    static {
        bic bicVar = new bic();
        a = bicVar;
        b = new bic[]{bicVar};
    }

    private bic() {
    }

    public static bic[] values() {
        return (bic[]) b.clone();
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
