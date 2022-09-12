package defpackage;

import java.util.concurrent.Executor;
/* renamed from: btzm  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btzm implements Executor {
    static final Executor a = new btzm();

    private btzm() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
