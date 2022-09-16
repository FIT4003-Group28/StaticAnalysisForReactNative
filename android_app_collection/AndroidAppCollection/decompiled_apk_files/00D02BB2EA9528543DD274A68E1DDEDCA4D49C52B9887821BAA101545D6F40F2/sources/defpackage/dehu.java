package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dehu  reason: default package */
/* loaded from: classes.dex */
public final class dehu<V> extends degs<V> implements ScheduledFuture, dehn {
    private final ScheduledFuture<?> a;

    public dehu(dehn<V> dehnVar, ScheduledFuture<?> scheduledFuture) {
        super(dehnVar);
        this.a = scheduledFuture;
    }

    @Override // defpackage.degr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.a.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
