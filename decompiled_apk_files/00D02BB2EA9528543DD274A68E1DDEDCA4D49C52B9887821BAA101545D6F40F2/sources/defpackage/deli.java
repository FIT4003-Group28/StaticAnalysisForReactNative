package defpackage;

import java.util.concurrent.Executor;
/* renamed from: deli  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class deli implements Executor {
    static final Executor a = new deli();

    private deli() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
