package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: bwk  reason: default package */
/* loaded from: classes2.dex */
public final class bwk implements ankt {
    static final bwb b;
    public static final Object c;
    volatile Object d;
    volatile bwf e;
    volatile bwj f;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger g = Logger.getLogger(bwk.class.getName());

    static {
        bwb bwiVar;
        try {
            bwiVar = new bwg(AtomicReferenceFieldUpdater.newUpdater(bwj.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(bwj.class, bwj.class, "c"), AtomicReferenceFieldUpdater.newUpdater(bwk.class, bwj.class, "f"), AtomicReferenceFieldUpdater.newUpdater(bwk.class, bwf.class, "e"), AtomicReferenceFieldUpdater.newUpdater(bwk.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            bwiVar = new bwi();
        }
        b = bwiVar;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        c = new Object();
    }

    protected bwk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(ankt anktVar) {
        if (anktVar instanceof bwk) {
            Object obj = ((bwk) anktVar).d;
            if (!(obj instanceof bwc)) {
                return obj;
            }
            bwc bwcVar = (bwc) obj;
            if (!bwcVar.c) {
                return obj;
            }
            Throwable th = bwcVar.d;
            return th != null ? new bwc(false, th) : bwc.b;
        }
        boolean isCancelled = anktVar.isCancelled();
        if ((!a) & isCancelled) {
            return bwc.b;
        }
        try {
            Object i = i(anktVar);
            return i == null ? c : i;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new bwe(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + anktVar, e));
            }
            return new bwc(false, e);
        } catch (ExecutionException e2) {
            return new bwe(e2.getCause());
        } catch (Throwable th2) {
            return new bwe(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(bwk bwkVar) {
        bwf bwfVar;
        bwf bwfVar2;
        bwf bwfVar3 = null;
        while (true) {
            bwj bwjVar = bwkVar.f;
            if (b.e(bwkVar, bwjVar, bwj.a)) {
                while (bwjVar != null) {
                    Thread thread = bwjVar.b;
                    if (thread != null) {
                        bwjVar.b = null;
                        LockSupport.unpark(thread);
                    }
                    bwjVar = bwjVar.c;
                }
                do {
                    bwfVar = bwkVar.e;
                } while (!b.c(bwkVar, bwfVar, bwf.a));
                while (true) {
                    bwfVar2 = bwfVar3;
                    bwfVar3 = bwfVar;
                    if (bwfVar3 == null) {
                        break;
                    }
                    bwfVar = bwfVar3.d;
                    bwfVar3.d = bwfVar2;
                }
                while (bwfVar2 != null) {
                    bwfVar3 = bwfVar2.d;
                    Runnable runnable = bwfVar2.b;
                    if (runnable instanceof bwh) {
                        bwh bwhVar = (bwh) runnable;
                        bwkVar = bwhVar.a;
                        if (bwkVar.d == bwhVar) {
                            if (b.d(bwkVar, bwhVar, b(bwhVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        l(runnable, bwfVar2.c);
                    }
                    bwfVar2 = bwfVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Object obj) {
        obj.getClass();
    }

    public static bwk h() {
        return new bwk();
    }

    private static Object i(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final String j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void k(StringBuilder sb) {
        try {
            Object i = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(j(i));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = g;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private final void m(bwj bwjVar) {
        bwjVar.b = null;
        while (true) {
            bwj bwjVar2 = this.f;
            if (bwjVar2 != bwj.a) {
                bwj bwjVar3 = null;
                while (bwjVar2 != null) {
                    bwj bwjVar4 = bwjVar2.c;
                    if (bwjVar2.b != null) {
                        bwjVar3 = bwjVar2;
                    } else if (bwjVar3 != null) {
                        bwjVar3.c = bwjVar4;
                        if (bwjVar3.b == null) {
                            break;
                        }
                    } else if (!b.e(this, bwjVar2, bwjVar4)) {
                        break;
                    }
                    bwjVar2 = bwjVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object n(Object obj) {
        if (obj instanceof bwc) {
            Throwable th = ((bwc) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof bwe) {
            throw new ExecutionException(((bwe) obj).b);
        } else {
            if (obj != c) {
                return obj;
            }
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        bwc bwcVar;
        Object obj = this.d;
        if ((obj == null) || (obj instanceof bwh)) {
            if (a) {
                bwcVar = new bwc(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                bwcVar = bwc.a;
            } else {
                bwcVar = bwc.b;
            }
            boolean z2 = false;
            bwk bwkVar = this;
            while (true) {
                if (b.d(bwkVar, obj, bwcVar)) {
                    c(bwkVar);
                    if (!(obj instanceof bwh)) {
                        break;
                    }
                    ankt anktVar = ((bwh) obj).b;
                    if (anktVar instanceof bwk) {
                        bwkVar = (bwk) anktVar;
                        obj = bwkVar.d;
                        if (!(obj == null) && !(obj instanceof bwh)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        anktVar.cancel(z);
                        break;
                    }
                } else {
                    obj = bwkVar.d;
                    if (!(obj instanceof bwh)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void e(Object obj) {
        if (obj == null) {
            obj = c;
        }
        if (b.d(this, null, obj)) {
            c(this);
        }
    }

    public final void f(Throwable th) {
        if (b.d(this, null, new bwe(th))) {
            c(this);
        }
    }

    public final void g(ankt anktVar) {
        bwe bweVar;
        d(anktVar);
        Object obj = this.d;
        if (obj == null) {
            if (anktVar.isDone()) {
                if (!b.d(this, null, b(anktVar))) {
                    return;
                }
                c(this);
                return;
            }
            bwh bwhVar = new bwh(this, anktVar);
            if (b.d(this, null, bwhVar)) {
                try {
                    anktVar.qY(bwhVar, bwl.a);
                    return;
                } catch (Throwable th) {
                    try {
                        bweVar = new bwe(th);
                    } catch (Throwable unused) {
                        bweVar = bwe.a;
                    }
                    b.d(this, bwhVar, bweVar);
                    return;
                }
            }
            obj = this.d;
        }
        if (obj instanceof bwc) {
            anktVar.cancel(((bwc) obj).c);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) && (!(obj2 instanceof bwh))) {
                return n(obj2);
            }
            bwj bwjVar = this.f;
            if (bwjVar != bwj.a) {
                bwj bwjVar2 = new bwj();
                do {
                    bwjVar2.a(bwjVar);
                    if (b.e(this, bwjVar, bwjVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                m(bwjVar2);
                                throw new InterruptedException();
                            }
                            obj = this.d;
                        } while (!((obj != null) & (!(obj instanceof bwh))));
                        return n(obj);
                    }
                    bwjVar = this.f;
                } while (bwjVar != bwj.a);
                return n(this.d);
            }
            return n(this.d);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof bwc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.d;
        return (!(obj instanceof bwh)) & (obj != null);
    }

    @Override // defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        bwf bwfVar = this.e;
        if (bwfVar != bwf.a) {
            bwf bwfVar2 = new bwf(runnable, executor);
            do {
                bwfVar2.d = bwfVar;
                if (b.c(this, bwfVar, bwfVar2)) {
                    return;
                }
                bwfVar = this.e;
            } while (bwfVar != bwf.a);
            l(runnable, executor);
        }
        l(runnable, executor);
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (!isDone()) {
            try {
                if (this.d instanceof bwh) {
                    str = "setFuture=[" + j(((bwh) obj).b) + "]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str == null || str.isEmpty()) {
                if (isDone()) {
                    k(sb);
                } else {
                    sb.append("PENDING");
                }
            } else {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            }
        } else {
            k(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.d;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof bwh))) {
                return n(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                bwj bwjVar = this.f;
                if (bwjVar != bwj.a) {
                    bwj bwjVar2 = new bwj();
                    do {
                        bwjVar2.a(bwjVar);
                        if (b.e(this, bwjVar, bwjVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    m(bwjVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.d;
                                if (!((obj2 != null) & (!(obj2 instanceof bwh)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return n(obj2);
                                }
                            } while (nanos >= 1000);
                            m(bwjVar2);
                        } else {
                            bwjVar = this.f;
                        }
                    } while (bwjVar != bwj.a);
                    return n(this.d);
                }
                return n(this.d);
            }
            while (nanos > 0) {
                Object obj3 = this.d;
                if (!((obj3 != null) & (!(obj3 instanceof bwh)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return n(obj3);
                }
            }
            String bwkVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + bwkVar);
        }
        throw new InterruptedException();
    }
}
