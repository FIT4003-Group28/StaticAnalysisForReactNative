package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: usz  reason: default package */
/* loaded from: classes4.dex */
public final class usz implements Executor {
    public static final amzy a = amzy.l("com/google/android/libraries/performance/primes/DeferrableExecutor");
    public final ankx b;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean e = new AtomicBoolean();

    public usz(ankx ankxVar, uui uuiVar) {
        this.b = ankxVar;
        uth uthVar = new uth(uuiVar);
        uuiVar.a(uthVar);
        uthVar.execute(new Runnable() { // from class: usx
            @Override // java.lang.Runnable
            public final void run() {
                usz uszVar = usz.this;
                uszVar.b.c(new usy(uszVar), 3000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    private final void b() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                this.b.execute(runnable);
            } else {
                return;
            }
        }
    }

    public final void a() {
        this.d = true;
        b();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.b.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            b();
        } else if (this.e.getAndSet(true)) {
        } else {
            this.b.c(new usy(this, 1), 7000L, TimeUnit.MILLISECONDS);
        }
    }
}
