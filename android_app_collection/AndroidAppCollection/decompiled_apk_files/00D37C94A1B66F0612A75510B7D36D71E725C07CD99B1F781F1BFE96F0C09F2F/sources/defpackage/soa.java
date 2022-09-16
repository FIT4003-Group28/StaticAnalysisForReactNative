package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: soa  reason: default package */
/* loaded from: classes4.dex */
public final class soa extends anka implements ankx {
    public static final /* synthetic */ int b = 0;
    public final ankx a;
    private final ankw c;

    private soa(ankw ankwVar, ankx ankxVar) {
        this.c = ankwVar;
        this.a = ankxVar;
    }

    public static soa a(ankw ankwVar, ankx ankxVar) {
        return new soa(ankwVar, ankxVar);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final ankv schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        anku c = anku.c(runnable);
        return new snz(c, this.a.b(new sns(this, c, 1), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final ankv schedule(Callable callable, long j, TimeUnit timeUnit) {
        anku b2 = anku.b(callable);
        return new snz(b2, this.a.b(new sns(this, b2), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final ankv scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final Executor g = anlz.g(this);
        final SettableFuture f = SettableFuture.f();
        return new snz(f, this.a.d(new Runnable() { // from class: snv
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor = g;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = f;
                executor.execute(new Runnable() { // from class: snu
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable3 = runnable2;
                        SettableFuture settableFuture2 = settableFuture;
                        int i = soa.b;
                        try {
                            runnable3.run();
                        } catch (Throwable th) {
                            settableFuture2.e(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final ankv scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        SettableFuture f = SettableFuture.f();
        snz snzVar = new snz(f, null);
        snzVar.a = this.a.b(new snx(this, runnable, f, snzVar, j2, timeUnit), j, timeUnit);
        return snzVar;
    }

    @Override // defpackage.anka
    public final ankw f() {
        return this.c;
    }

    @Override // defpackage.anjw, defpackage.amtj
    public final /* bridge */ /* synthetic */ Object g() {
        return this.c;
    }

    @Override // defpackage.anka, defpackage.anjw
    public final /* bridge */ /* synthetic */ ExecutorService h() {
        return this.c;
    }
}
