package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dehq  reason: default package */
/* loaded from: classes.dex */
public interface dehq extends ScheduledExecutorService, dehp {
    dehu d(Runnable runnable, long j, TimeUnit timeUnit);

    <V> dehu e(Callable<V> callable, long j, TimeUnit timeUnit);

    dehu f(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    dehu g(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
