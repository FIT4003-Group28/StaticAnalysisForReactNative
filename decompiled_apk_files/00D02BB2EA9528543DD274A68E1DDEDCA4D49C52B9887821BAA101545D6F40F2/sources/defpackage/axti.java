package defpackage;

import java.util.concurrent.Executor;
/* renamed from: axti  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class axti implements Executor {
    static final Executor a = new axti();

    private axti() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
