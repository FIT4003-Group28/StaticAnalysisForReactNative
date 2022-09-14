package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b5<V> extends FutureTask<V> implements Comparable<b5<V>> {

    /* renamed from: b  reason: collision with root package name */
    private final long f7188b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f7189c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7190d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ a5 f7191e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(a5 a5Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f7191e = a5Var;
        com.google.android.gms.common.internal.s.a(str);
        atomicLong = a5.l;
        this.f7188b = atomicLong.getAndIncrement();
        this.f7190d = str;
        this.f7189c = false;
        if (this.f7188b == Long.MAX_VALUE) {
            a5Var.c().s().a("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(a5 a5Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f7191e = a5Var;
        com.google.android.gms.common.internal.s.a(str);
        atomicLong = a5.l;
        this.f7188b = atomicLong.getAndIncrement();
        this.f7190d = str;
        this.f7189c = z;
        if (this.f7188b == Long.MAX_VALUE) {
            a5Var.c().s().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        b5 b5Var = (b5) obj;
        boolean z = this.f7189c;
        if (z != b5Var.f7189c) {
            return z ? -1 : 1;
        }
        long j = this.f7188b;
        long j2 = b5Var.f7188b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f7191e.c().t().a("Two tasks share the same index. index", Long.valueOf(this.f7188b));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f7191e.c().s().a(this.f7190d, th);
        super.setException(th);
    }
}
