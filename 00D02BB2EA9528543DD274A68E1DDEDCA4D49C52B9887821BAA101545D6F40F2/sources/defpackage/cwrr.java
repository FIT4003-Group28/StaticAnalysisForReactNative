package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cwrr  reason: default package */
/* loaded from: classes5.dex */
public final class cwrr implements Executor {
    public final dehq a;
    private final ConcurrentLinkedQueue<Runnable> b = new ConcurrentLinkedQueue<>();
    private volatile boolean c = false;
    private final AtomicBoolean d = new AtomicBoolean();

    public cwrr(dehq dehqVar, cwrb cwrbVar) {
        this.a = dehqVar;
        cwtk cwtkVar = new cwtk(cwrbVar);
        cwrbVar.a(cwtkVar);
        cwtkVar.execute(new Runnable(this) { // from class: cwro
            private final cwrr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cwrr cwrrVar = this.a;
                cwtl.a(cwrrVar.a.e(new Callable(cwrrVar) { // from class: cwrq
                    private final cwrr a;

                    {
                        this.a = cwrrVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.a.a();
                        return null;
                    }
                }, 3000L, TimeUnit.MILLISECONDS));
            }
        });
    }

    private final void b() {
        while (true) {
            Runnable poll = this.b.poll();
            if (poll != null) {
                this.a.execute(poll);
            } else {
                return;
            }
        }
    }

    public final void a() {
        this.c = true;
        b();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            b();
        } else if (this.d.getAndSet(true)) {
        } else {
            cwtl.a(this.a.e(new Callable(this) { // from class: cwrp
                private final cwrr a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.a();
                    return null;
                }
            }, 7000L, TimeUnit.MILLISECONDS));
        }
    }
}
