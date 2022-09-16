package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azns  reason: default package */
/* loaded from: classes2.dex */
public final class azns extends ayor {
    public static final azns b = new azns();

    @Override // defpackage.ayor
    public final ayoq a() {
        return new aznr();
    }

    @Override // defpackage.ayor
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            azqc.o(runnable);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            azqc.d(e);
        }
        return ayqj.INSTANCE;
    }

    @Override // defpackage.ayor
    public final aypg f(Runnable runnable) {
        azqc.o(runnable);
        runnable.run();
        return ayqj.INSTANCE;
    }
}
