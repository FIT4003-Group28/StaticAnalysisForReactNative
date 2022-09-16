package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayrz  reason: default package */
/* loaded from: classes2.dex */
public final class ayrz extends CountDownLatch implements Future, ayot, aypg {
    Object a;
    Throwable b;
    final AtomicReference c;

    public ayrz() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        aypg aypgVar;
        do {
            aypgVar = (aypg) this.c.get();
            if (aypgVar == ayqi.a) {
                azqc.d(th);
                return;
            }
            this.b = th;
        } while (!this.c.compareAndSet(aypgVar, this));
        countDown();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        aypg aypgVar;
        do {
            aypgVar = (aypg) this.c.get();
            if (aypgVar == this || aypgVar == ayqi.a) {
                return false;
            }
        } while (!this.c.compareAndSet(aypgVar, ayqi.a));
        if (aypgVar != null) {
            aypgVar.qr();
        }
        countDown();
        return true;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        if (getCount() != 0) {
            azxy.d();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th != null) {
                throw new ExecutionException(th);
            }
            return this.a;
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ayqi.d((aypg) this.c.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // defpackage.aypg
    public final void qr() {
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        aypg aypgVar = (aypg) this.c.get();
        if (aypgVar == ayqi.a) {
            return;
        }
        this.a = obj;
        this.c.compareAndSet(aypgVar, this);
        countDown();
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this.c, aypgVar);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            azxy.d();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(azom.c(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th != null) {
                throw new ExecutionException(th);
            }
            return this.a;
        }
        throw new CancellationException();
    }
}
