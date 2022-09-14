package defpackage;

import java.util.concurrent.Executor;
/* renamed from: btzk  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btzk implements Executor {
    static final Executor a = new btzk();

    private btzk() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
