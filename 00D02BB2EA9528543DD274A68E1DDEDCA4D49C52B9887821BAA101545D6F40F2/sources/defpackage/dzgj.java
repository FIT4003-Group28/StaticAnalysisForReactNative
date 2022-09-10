package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: dzgj  reason: default package */
/* loaded from: classes6.dex */
public final class dzgj<T> extends dzgr<T> {
    static final dzgi[] c = new dzgi[0];
    static final dzgi[] d = new dzgi[0];
    final AtomicReference<Object> a;
    final AtomicReference<dzgi<T>[]> b;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    final AtomicReference<Throwable> h;
    long i;

    dzgj() {
        new ReentrantReadWriteLock();
        throw null;
    }

    public static <T> dzgj<T> a(T t) {
        return new dzgj<>(t);
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (this.h.get() != null) {
            dzakVar.SQ();
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        dzbm.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() != null) {
            return;
        }
        dzfr dzfrVar = dzfr.a;
        j(t);
        for (dzgi<T> dzgiVar : this.b.get()) {
            dzgiVar.b(t, this.i);
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        dzbm.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.h.compareAndSet(null, th)) {
            dzfy.a(th);
            return;
        }
        Object a = dzfr.a(th);
        for (dzgi<T> dzgiVar : i(a)) {
            dzgiVar.b(a, this.i);
        }
    }

    @Override // defpackage.dyzw
    public final void e() {
        if (!this.h.compareAndSet(null, dzfo.a)) {
            return;
        }
        dzfr dzfrVar = dzfr.a;
        for (dzgi<T> dzgiVar : i(dzfrVar)) {
            dzgiVar.b(dzfrVar, this.i);
        }
    }

    @Override // defpackage.dyzu
    protected final void g(dyzw<? super T> dyzwVar) {
        dzgi<T>[] dzgiVarArr;
        dzgi<T>[] dzgiVarArr2;
        dzfl<Object> dzflVar;
        dzgi<T> dzgiVar = new dzgi<>(dyzwVar, this);
        dyzwVar.b(dzgiVar);
        do {
            dzgiVarArr = this.b.get();
            if (dzgiVarArr != d) {
                int length = dzgiVarArr.length;
                dzgiVarArr2 = new dzgi[length + 1];
                System.arraycopy(dzgiVarArr, 0, dzgiVarArr2, 0, length);
                dzgiVarArr2[length] = dzgiVar;
            } else {
                Throwable th = this.h.get();
                if (th == dzfo.a) {
                    dyzwVar.e();
                    return;
                } else {
                    dyzwVar.d(th);
                    return;
                }
            }
        } while (!this.b.compareAndSet(dzgiVarArr, dzgiVarArr2));
        if (dzgiVar.g) {
            h(dzgiVar);
        } else if (dzgiVar.g) {
        } else {
            synchronized (dzgiVar) {
                if (dzgiVar.g) {
                    return;
                }
                if (dzgiVar.c) {
                    return;
                }
                dzgj<T> dzgjVar = dzgiVar.b;
                Lock lock = dzgjVar.f;
                lock.lock();
                dzgiVar.h = dzgjVar.i;
                Object obj = dzgjVar.a.get();
                lock.unlock();
                dzgiVar.d = obj != null;
                dzgiVar.c = true;
                if (obj == null || dzgiVar.a(obj)) {
                    return;
                }
                while (!dzgiVar.g) {
                    synchronized (dzgiVar) {
                        dzflVar = dzgiVar.e;
                        if (dzflVar == null) {
                            dzgiVar.d = false;
                            return;
                        }
                        dzgiVar.e = null;
                    }
                    dzflVar.c(dzgiVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(dzgi<T> dzgiVar) {
        dzgi<T>[] dzgiVarArr;
        dzgi[] dzgiVarArr2;
        do {
            dzgiVarArr = this.b.get();
            int length = dzgiVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (dzgiVarArr[i] == dzgiVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                dzgiVarArr2 = c;
            } else {
                dzgi[] dzgiVarArr3 = new dzgi[length - 1];
                System.arraycopy(dzgiVarArr, 0, dzgiVarArr3, 0, i);
                System.arraycopy(dzgiVarArr, i + 1, dzgiVarArr3, i, (length - i) - 1);
                dzgiVarArr2 = dzgiVarArr3;
            }
        } while (!this.b.compareAndSet(dzgiVarArr, dzgiVarArr2));
    }

    final dzgi<T>[] i(Object obj) {
        AtomicReference<dzgi<T>[]> atomicReference = this.b;
        dzgi<T>[] dzgiVarArr = d;
        dzgi<T>[] andSet = atomicReference.getAndSet(dzgiVarArr);
        if (andSet != dzgiVarArr) {
            j(obj);
        }
        return andSet;
    }

    final void j(Object obj) {
        this.g.lock();
        this.i++;
        this.a.lazySet(obj);
        this.g.unlock();
    }

    public dzgj(T t) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference<>(c);
        AtomicReference<Object> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        this.h = new AtomicReference<>();
        dzbm.a(t, "defaultValue is null");
        atomicReference.lazySet(t);
    }
}
