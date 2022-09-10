package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: csso  reason: default package */
/* loaded from: classes.dex */
public final class csso {
    private final cvhc a;

    public csso() {
        this(null);
    }

    public final synchronized void a(cssn cssnVar) {
        this.a.a(cssnVar);
    }

    public final synchronized void b(cssn cssnVar) {
        this.a.b(cssnVar);
    }

    public csso(@dzsi ThreadFactory threadFactory) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(threadFactory);
        new cvhb(newSingleThreadScheduledExecutor);
        this.a = new cvhc(newSingleThreadScheduledExecutor);
    }
}
