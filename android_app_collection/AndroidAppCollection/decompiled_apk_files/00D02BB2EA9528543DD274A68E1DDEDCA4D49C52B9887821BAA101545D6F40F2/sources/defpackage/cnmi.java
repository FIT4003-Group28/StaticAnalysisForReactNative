package defpackage;

import java.util.concurrent.Executor;
/* renamed from: cnmi  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cnmi implements Executor {
    static final Executor a = new cnmi();

    private cnmi() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
