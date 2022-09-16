package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: azpm  reason: default package */
/* loaded from: classes2.dex */
public final class azpm extends azpx {
    static final azpl[] a = new azpl[0];
    static final azpl[] b = new azpl[0];
    public final AtomicReference c;
    final AtomicReference d;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    final AtomicReference h;
    long i;

    public azpm() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference(a);
        this.c = new AtomicReference();
        this.h = new AtomicReference();
    }

    public static azpm aI(Object obj) {
        return new azpm(obj);
    }

    public static azpm e() {
        return new azpm();
    }

    public final Object aJ() {
        Object obj = this.c.get();
        if (azoq.g(obj) || azoq.h(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aK(azpl azplVar) {
        azpl[] azplVarArr;
        azpl[] azplVarArr2;
        do {
            azplVarArr = (azpl[]) this.d.get();
            int length = azplVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azplVarArr[i] == azplVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azplVarArr2 = a;
            } else {
                azpl[] azplVarArr3 = new azpl[length - 1];
                System.arraycopy(azplVarArr, 0, azplVarArr3, 0, i);
                System.arraycopy(azplVarArr, i + 1, azplVarArr3, i, (length - i) - 1);
                azplVarArr2 = azplVarArr3;
            }
        } while (!this.d.compareAndSet(azplVarArr, azplVarArr2));
    }

    final void aL(Object obj) {
        this.g.lock();
        this.i++;
        this.c.lazySet(obj);
        this.g.unlock();
    }

    public final boolean aM() {
        Object obj = this.c.get();
        return obj != null && !azoq.g(obj) && !azoq.h(obj);
    }

    final azpl[] aN(Object obj) {
        AtomicReference atomicReference = this.d;
        azpl[] azplVarArr = b;
        azpl[] azplVarArr2 = (azpl[]) atomicReference.getAndSet(azplVarArr);
        if (azplVarArr2 != azplVarArr) {
            aL(obj);
        }
        return azplVarArr2;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.h.compareAndSet(null, th)) {
            azqc.d(th);
            return;
        }
        Object b2 = azoq.b(th);
        for (azpl azplVar : aN(b2)) {
            azplVar.c(b2, this.i);
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        ayrd.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() != null) {
            return;
        }
        azoq azoqVar = azoq.a;
        aL(obj);
        for (azpl azplVar : (azpl[]) this.d.get()) {
            azplVar.c(obj, this.i);
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azpl[] azplVarArr;
        azpl[] azplVarArr2;
        azoh azohVar;
        azpl azplVar = new azpl(ayomVar, this);
        ayomVar.sj(azplVar);
        do {
            azplVarArr = (azpl[]) this.d.get();
            if (azplVarArr != b) {
                int length = azplVarArr.length;
                azplVarArr2 = new azpl[length + 1];
                System.arraycopy(azplVarArr, 0, azplVarArr2, 0, length);
                azplVarArr2[length] = azplVar;
            } else {
                Throwable th = (Throwable) this.h.get();
                if (th == azom.a) {
                    ayomVar.sm();
                    return;
                } else {
                    ayomVar.b(th);
                    return;
                }
            }
        } while (!this.d.compareAndSet(azplVarArr, azplVarArr2));
        if (azplVar.g) {
            aK(azplVar);
        } else if (azplVar.g) {
        } else {
            synchronized (azplVar) {
                if (azplVar.g) {
                    return;
                }
                if (azplVar.c) {
                    return;
                }
                azpm azpmVar = azplVar.b;
                Lock lock = azpmVar.f;
                lock.lock();
                azplVar.h = azpmVar.i;
                Object obj = azpmVar.c.get();
                lock.unlock();
                azplVar.d = obj != null;
                azplVar.c = true;
                if (obj == null || azplVar.a(obj)) {
                    return;
                }
                while (!azplVar.g) {
                    synchronized (azplVar) {
                        azohVar = azplVar.e;
                        if (azohVar == null) {
                            azplVar.d = false;
                            return;
                        }
                        azplVar.e = null;
                    }
                    azohVar.b(azplVar);
                }
            }
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (this.h.get() != null) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (!this.h.compareAndSet(null, azom.a)) {
            return;
        }
        azoq azoqVar = azoq.a;
        for (azpl azplVar : aN(azoqVar)) {
            azplVar.c(azoqVar, this.i);
        }
    }

    public azpm(Object obj) {
        this();
        AtomicReference atomicReference = this.c;
        ayrd.b(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
    }
}
