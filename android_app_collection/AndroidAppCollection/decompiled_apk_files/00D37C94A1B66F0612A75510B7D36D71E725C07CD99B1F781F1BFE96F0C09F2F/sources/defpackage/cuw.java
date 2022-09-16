package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cuw  reason: default package */
/* loaded from: classes3.dex */
public final class cuw implements Executor {
    private final /* synthetic */ int a;

    public cuw() {
    }

    public cuw(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            runnable.run();
        } else if (i == 1) {
            cvd.j(runnable);
        } else {
            runnable.run();
        }
    }
}
