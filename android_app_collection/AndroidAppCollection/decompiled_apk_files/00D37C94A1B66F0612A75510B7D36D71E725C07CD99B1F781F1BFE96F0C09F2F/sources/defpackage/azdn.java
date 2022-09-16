package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* renamed from: azdn  reason: default package */
/* loaded from: classes2.dex */
final class azdn extends AtomicReference implements Iterator, j$.util.Iterator, ayom, aypg {
    private static final long serialVersionUID = 6695226475494099826L;
    final azml a;
    final Lock b;
    final Condition c;
    volatile boolean d;
    volatile Throwable e;

    public azdn(int i) {
        this.a = new azml(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.e = th;
        this.d = true;
        f();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.k(obj);
        f();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    final void f() {
        this.b.lock();
        try {
            this.c.signalAll();
        } finally {
            this.b.unlock();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        while (!e()) {
            boolean z = this.d;
            boolean j = this.a.j();
            if (z) {
                Throwable th = this.e;
                if (th != null) {
                    throw azom.b(th);
                }
                return !j;
            } else if (!j) {
                return true;
            } else {
                try {
                    azxy.d();
                    this.b.lock();
                    while (!this.d && this.a.j() && !e()) {
                        this.c.await();
                    }
                    this.b.unlock();
                } catch (InterruptedException e) {
                    ayqi.c(this);
                    f();
                    throw azom.b(e);
                }
            }
        }
        Throwable th2 = this.e;
        if (th2 == null) {
            return false;
        }
        throw azom.b(th2);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (hasNext()) {
            return this.a.sl();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
        f();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.d = true;
        f();
    }
}
