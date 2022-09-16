package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ankz  reason: default package */
/* loaded from: classes.dex */
public final class ankz implements Runnable {
    final /* synthetic */ ExecutorService a;
    final /* synthetic */ TimeUnit b;

    public ankz(ExecutorService executorService, TimeUnit timeUnit) {
        this.a = executorService;
        this.b = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.shutdown();
            this.a.awaitTermination(120L, this.b);
        } catch (InterruptedException unused) {
        }
    }
}
