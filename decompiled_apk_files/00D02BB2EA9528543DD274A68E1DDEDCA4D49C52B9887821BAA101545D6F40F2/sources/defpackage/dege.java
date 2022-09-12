package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dege  reason: default package */
/* loaded from: classes.dex */
public final class dege extends Enum<dege> implements Executor {
    public static final dege a;
    private static final /* synthetic */ dege[] b;

    static {
        dege degeVar = new dege();
        a = degeVar;
        b = new dege[]{degeVar};
    }

    private dege() {
    }

    public static dege[] values() {
        return (dege[]) b.clone();
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
