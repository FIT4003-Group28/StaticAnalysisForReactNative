package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cfi  reason: default package */
/* loaded from: classes2.dex */
public final class cfi implements Future, cfa, cez {
    private boolean a = false;
    private Object b;
    private cff c;

    private cfi() {
    }

    public static cfi a() {
        return new cfi();
    }

    private final synchronized Object d(Long l) {
        cff cffVar = this.c;
        if (cffVar == null) {
            if (this.a) {
                return this.b;
            }
            if (l == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            cff cffVar2 = this.c;
            if (cffVar2 == null) {
                if (!this.a) {
                    throw new TimeoutException();
                }
                return this.b;
            }
            throw new ExecutionException(cffVar2);
        }
        throw new ExecutionException(cffVar);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return d(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.a) {
            if (this.c == null) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // defpackage.cez
    public final synchronized void kV(cff cffVar) {
        this.c = cffVar;
        notifyAll();
    }

    @Override // defpackage.cfa
    public final synchronized void lG(Object obj) {
        this.a = true;
        this.b = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return d(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
