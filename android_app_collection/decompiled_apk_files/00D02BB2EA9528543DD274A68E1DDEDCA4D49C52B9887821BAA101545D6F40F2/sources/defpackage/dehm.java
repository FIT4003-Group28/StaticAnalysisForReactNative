package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* compiled from: PG */
/* renamed from: dehm  reason: default package */
/* loaded from: classes.dex */
abstract class dehm<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable a = new dehl();
    private static final Runnable b = new dehl();
    private static final Runnable c = new dehl();

    public abstract String a();

    public abstract T c();

    public abstract boolean d();

    public abstract void f(T t, Throwable th);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        Runnable runnable = get();
        if (!(runnable instanceof Thread) || !compareAndSet(runnable, b)) {
            return;
        }
        try {
            Thread thread = (Thread) runnable;
            thread.interrupt();
            if (getAndSet(a) != c) {
                return;
            }
            LockSupport.unpark(thread);
        } catch (Throwable th) {
            if (getAndSet(a) == c) {
                LockSupport.unpark((Thread) runnable);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        T c2;
        Thread currentThread = Thread.currentThread();
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !d();
        if (z) {
            try {
                c2 = c();
            } catch (Throwable th) {
                if (!compareAndSet(currentThread, a)) {
                    Runnable runnable = get();
                    boolean z2 = false;
                    int i = 0;
                    while (true) {
                        Runnable runnable2 = b;
                        if (runnable != runnable2 && runnable != c) {
                            break;
                        }
                        i++;
                        if (i > 1000) {
                            Runnable runnable3 = c;
                            if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                z2 = Thread.interrupted() || z2;
                                LockSupport.park(this);
                            }
                        } else {
                            Thread.yield();
                        }
                        runnable = get();
                    }
                    if (z2) {
                        currentThread.interrupt();
                    }
                }
                f(null, th);
                return;
            }
        } else {
            c2 = null;
        }
        if (!compareAndSet(currentThread, a)) {
            Runnable runnable4 = get();
            boolean z3 = false;
            int i2 = 0;
            while (true) {
                Runnable runnable5 = b;
                if (runnable4 != runnable5 && runnable4 != c) {
                    break;
                }
                i2++;
                if (i2 > 1000) {
                    Runnable runnable6 = c;
                    if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                        z3 = Thread.interrupted() || z3;
                        LockSupport.park(this);
                    }
                } else {
                    Thread.yield();
                }
                runnable4 = get();
            }
            if (z3) {
                currentThread.interrupt();
            }
        }
        if (!z) {
            return;
        }
        f(c2, null);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable == b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String a2 = a();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(a2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(a2);
        return sb2.toString();
    }
}
