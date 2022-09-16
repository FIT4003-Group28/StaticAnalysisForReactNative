package defpackage;

import java.util.concurrent.Executor;
/* renamed from: derq  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class derq implements Executor {
    public static final Executor a = new derq();

    private derq() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
