package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dehp  reason: default package */
/* loaded from: classes.dex */
public interface dehp extends ExecutorService {
    dehn<?> a(Runnable runnable);

    <T> dehn<T> b(Runnable runnable, T t);

    <T> dehn<T> c(Callable<T> callable);

    @Override // defpackage.dehp
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection);

    @Override // defpackage.dehp
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit);
}
