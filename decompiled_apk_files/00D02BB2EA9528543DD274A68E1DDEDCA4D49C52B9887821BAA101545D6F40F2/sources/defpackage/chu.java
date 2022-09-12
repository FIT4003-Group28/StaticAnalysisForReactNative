package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: chu  reason: default package */
/* loaded from: classes.dex */
public final class chu<R> implements chr, chv {
    private static final cht a = new cht();
    private final int b;
    private final int c;
    private R d;
    private chs e;
    private boolean f;
    private boolean g;
    private boolean h;
    private bwx i;

    public chu(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private final synchronized R l(Long l) {
        if (!isDone() && !cjp.g()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (!this.f) {
            if (!this.h) {
                if (this.g) {
                    return this.d;
                }
                if (l == null) {
                    wait(0L);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.h) {
                        if (!this.f) {
                            if (!this.g) {
                                throw new TimeoutException();
                            }
                            return this.d;
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.i);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.i);
        }
        throw new CancellationException();
    }

    @Override // defpackage.chv
    public final synchronized boolean Nl(bwx bwxVar) {
        this.h = true;
        this.i = bwxVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.chv
    public final synchronized boolean Nm(R r, int i) {
        this.g = true;
        this.d = r;
        notifyAll();
        return false;
    }

    @Override // defpackage.cij
    public final synchronized void a(Drawable drawable) {
    }

    @Override // defpackage.cij
    public final synchronized void b(R r, cit<? super R> citVar) {
    }

    @Override // defpackage.cij
    public final void c(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f = true;
            notifyAll();
            chs chsVar = null;
            if (z) {
                chs chsVar2 = this.e;
                this.e = null;
                chsVar = chsVar2;
            }
            if (chsVar != null) {
                chsVar.b();
            }
            return true;
        }
    }

    @Override // defpackage.cgp
    public final void d() {
    }

    @Override // defpackage.cgp
    public final void e() {
    }

    @Override // defpackage.cgp
    public final void f() {
    }

    @Override // defpackage.cij
    public final void g(cii ciiVar) {
        ciiVar.j(this.b, this.c);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            return l(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.cij
    public final void h(cii ciiVar) {
    }

    @Override // defpackage.cij
    public final synchronized void i(chs chsVar) {
        this.e = chsVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.f && !this.g) {
            if (!this.h) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // defpackage.cij
    public final synchronized chs j() {
        return this.e;
    }

    @Override // defpackage.cij
    public final void k(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return l(Long.valueOf(timeUnit.toMillis(j)));
    }
}
