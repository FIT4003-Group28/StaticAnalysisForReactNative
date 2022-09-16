package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: azpa  reason: default package */
/* loaded from: classes2.dex */
public final class azpa extends azpb {
    static final azoz[] b = new azoz[0];
    static final azoz[] c = new azoz[0];
    final AtomicReference d;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    public final AtomicReference h;
    final AtomicReference i;
    long j;

    public azpa() {
        this.h = new AtomicReference();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference(b);
        this.i = new AtomicReference();
    }

    public static azpa ar() {
        return new azpa();
    }

    public static azpa as(Object obj) {
        ayrd.b(obj, "defaultValue is null");
        return new azpa(obj);
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        azoz[] azozVarArr;
        azoz[] azozVarArr2;
        azoh azohVar;
        azoz azozVar = new azoz(bameVar, this);
        bameVar.f(azozVar);
        do {
            azozVarArr = (azoz[]) this.d.get();
            if (azozVarArr != c) {
                int length = azozVarArr.length;
                azozVarArr2 = new azoz[length + 1];
                System.arraycopy(azozVarArr, 0, azozVarArr2, 0, length);
                azozVarArr2[length] = azozVar;
            } else {
                Throwable th = (Throwable) this.i.get();
                if (th == azom.a) {
                    bameVar.sm();
                    return;
                } else {
                    bameVar.b(th);
                    return;
                }
            }
        } while (!this.d.compareAndSet(azozVarArr, azozVarArr2));
        if (azozVar.g) {
            au(azozVar);
        } else if (azozVar.g) {
        } else {
            synchronized (azozVar) {
                if (azozVar.g) {
                    return;
                }
                if (azozVar.c) {
                    return;
                }
                azpa azpaVar = azozVar.b;
                Lock lock = azpaVar.f;
                lock.lock();
                azozVar.h = azpaVar.j;
                Object obj = azpaVar.h.get();
                lock.unlock();
                azozVar.d = obj != null;
                azozVar.c = true;
                if (obj == null || azozVar.a(obj)) {
                    return;
                }
                while (!azozVar.g) {
                    synchronized (azozVar) {
                        azohVar = azozVar.e;
                        if (azohVar == null) {
                            azozVar.d = false;
                            return;
                        }
                        azozVar.e = null;
                    }
                    azohVar.b(azozVar);
                }
            }
        }
    }

    public final Object at() {
        Object obj = this.h.get();
        if (azoq.g(obj) || azoq.h(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void au(azoz azozVar) {
        azoz[] azozVarArr;
        azoz[] azozVarArr2;
        do {
            azozVarArr = (azoz[]) this.d.get();
            int length = azozVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azozVarArr[i] == azozVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azozVarArr2 = b;
            } else {
                azoz[] azozVarArr3 = new azoz[length - 1];
                System.arraycopy(azozVarArr, 0, azozVarArr3, 0, i);
                System.arraycopy(azozVarArr, i + 1, azozVarArr3, i, (length - i) - 1);
                azozVarArr2 = azozVarArr3;
            }
        } while (!this.d.compareAndSet(azozVarArr, azozVarArr2));
    }

    final void av(Object obj) {
        Lock lock = this.g;
        lock.lock();
        this.j++;
        this.h.lazySet(obj);
        lock.unlock();
    }

    final azoz[] aw(Object obj) {
        azoz[] azozVarArr = (azoz[]) this.d.get();
        azoz[] azozVarArr2 = c;
        if (azozVarArr != azozVarArr2 && (azozVarArr = (azoz[]) this.d.getAndSet(azozVarArr2)) != azozVarArr2) {
            av(obj);
        }
        return azozVarArr;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.i.compareAndSet(null, th)) {
            azqc.d(th);
            return;
        }
        Object b2 = azoq.b(th);
        for (azoz azozVar : aw(b2)) {
            azozVar.b(b2, this.j);
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        ayrd.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i.get() != null) {
            return;
        }
        azoq azoqVar = azoq.a;
        av(obj);
        for (azoz azozVar : (azoz[]) this.d.get()) {
            azozVar.b(obj, this.j);
        }
    }

    @Override // defpackage.bame
    public final void f(bamf bamfVar) {
        if (this.i.get() != null) {
            bamfVar.si();
        } else {
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.i.compareAndSet(null, azom.a)) {
            return;
        }
        azoq azoqVar = azoq.a;
        for (azoz azozVar : aw(azoqVar)) {
            azozVar.b(azoqVar, this.j);
        }
    }

    public azpa(Object obj) {
        this();
        AtomicReference atomicReference = this.h;
        ayrd.b(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
    }
}
