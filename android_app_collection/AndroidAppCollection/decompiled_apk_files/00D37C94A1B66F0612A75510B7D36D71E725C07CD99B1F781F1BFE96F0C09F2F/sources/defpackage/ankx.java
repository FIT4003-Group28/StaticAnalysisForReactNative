package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ankx  reason: default package */
/* loaded from: classes.dex */
public interface ankx extends ScheduledExecutorService, ankw {
    ankv b(Runnable runnable, long j, TimeUnit timeUnit);

    ankv c(Callable callable, long j, TimeUnit timeUnit);

    ankv d(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    ankv e(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
