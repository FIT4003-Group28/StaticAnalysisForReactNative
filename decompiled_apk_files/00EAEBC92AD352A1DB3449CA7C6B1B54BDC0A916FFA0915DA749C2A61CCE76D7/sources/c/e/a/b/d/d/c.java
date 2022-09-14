package c.e.a.b.d.d;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
final class c implements b {
    private c() {
    }

    @Override // c.e.a.b.d.d.b
    public final ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
