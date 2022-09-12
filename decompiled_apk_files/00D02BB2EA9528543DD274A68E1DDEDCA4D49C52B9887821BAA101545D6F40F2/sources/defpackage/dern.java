package defpackage;

import java.util.concurrent.Executor;
/* renamed from: dern  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class dern implements Executor {
    static final Executor a = new dern();

    private dern() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
