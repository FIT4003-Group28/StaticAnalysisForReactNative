package defpackage;

import java.util.concurrent.Executor;
/* renamed from: deui  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class deui implements Executor {
    static final Executor a = new deui();

    private deui() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
