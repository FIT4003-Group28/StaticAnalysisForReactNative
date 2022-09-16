package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: degp  reason: default package */
/* loaded from: classes.dex */
public class degp<V> extends dehg<V> {
    public static <V> degp<V> q(dehn<V> dehnVar) {
        if (dehnVar instanceof degp) {
            return (degp) dehnVar;
        }
        return new degq(dehnVar);
    }

    public final degp<V> r(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (degp) deha.h(this, j, timeUnit, scheduledExecutorService);
    }
}
