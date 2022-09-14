package defpackage;

import java.util.concurrent.Executor;
/* renamed from: derh  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class derh implements Executor {
    static final Executor a = new derh();

    private derh() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
