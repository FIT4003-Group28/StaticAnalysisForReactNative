package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sol  reason: default package */
/* loaded from: classes4.dex */
public abstract class sol extends anka implements ankx {
    protected abstract ankx a();

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final ankv schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return a().b(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final ankv schedule(Callable callable, long j, TimeUnit timeUnit) {
        return a().c(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final ankv scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return a().d(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final ankv scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return a().e(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.anka
    protected /* bridge */ /* synthetic */ ankw f() {
        throw null;
    }
}
