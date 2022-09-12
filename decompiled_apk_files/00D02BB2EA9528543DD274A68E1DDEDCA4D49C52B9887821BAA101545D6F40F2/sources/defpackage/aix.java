package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aix  reason: default package */
/* loaded from: classes2.dex */
public abstract class aix<V> implements dehn<V> {
    static final aio b;
    private static final Object d;
    volatile ais listeners;
    volatile Object value;
    volatile aiw waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(aix.class.getName());

    static {
        aio aivVar;
        try {
            aivVar = new ait(AtomicReferenceFieldUpdater.newUpdater(aiw.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(aiw.class, aiw.class, "next"), AtomicReferenceFieldUpdater.newUpdater(aix.class, aiw.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(aix.class, ais.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(aix.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            aivVar = new aiv();
        }
        b = aivVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    static Object c(dehn<?> dehnVar) {
        if (dehnVar instanceof aix) {
            Object obj = ((aix) dehnVar).value;
            if (!(obj instanceof aip)) {
                return obj;
            }
            aip aipVar = (aip) obj;
            if (!aipVar.c) {
                return obj;
            }
            Throwable th = aipVar.d;
            return th != null ? new aip(false, th) : aip.b;
        }
        boolean isCancelled = dehnVar.isCancelled();
        if ((!a) & isCancelled) {
            return aip.b;
        }
        try {
            Object d2 = d(dehnVar);
            return d2 == null ? d : d2;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new air(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dehnVar, e));
            }
            return new aip(false, e);
        } catch (ExecutionException e2) {
            return new air(e2.getCause());
        } catch (Throwable th2) {
            return new air(th2);
        }
    }

    static <V> V d(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [aio] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aix<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aix] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [aix, aix<V>] */
    public static void e(aix<?> aixVar) {
        ais aisVar;
        ais aisVar2;
        ais aisVar3 = null;
        while (true) {
            aiw aiwVar = ((aix) aixVar).waiters;
            if (b.c((aix) aixVar, aiwVar, aiw.a)) {
                while (aiwVar != null) {
                    Thread thread = aiwVar.thread;
                    if (thread != null) {
                        aiwVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    aiwVar = aiwVar.next;
                }
                do {
                    aisVar = ((aix) aixVar).listeners;
                } while (!b.d((aix) aixVar, aisVar, ais.a));
                while (true) {
                    aisVar2 = aisVar3;
                    aisVar3 = aisVar;
                    if (aisVar3 == null) {
                        break;
                    }
                    aisVar = aisVar3.next;
                    aisVar3.next = aisVar2;
                }
                while (aisVar2 != null) {
                    aisVar3 = aisVar2.next;
                    Runnable runnable = aisVar2.b;
                    if (runnable instanceof aiu) {
                        aiu aiuVar = (aiu) runnable;
                        aixVar = aiuVar.a;
                        if (aixVar.value == aiuVar) {
                            if (b.e(aixVar, aiuVar, c(aiuVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        k(runnable, aisVar2.c);
                    }
                    aisVar2 = aisVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void g(T t) {
        t.getClass();
    }

    private final void h(aiw aiwVar) {
        aiwVar.thread = null;
        while (true) {
            aiw aiwVar2 = this.waiters;
            if (aiwVar2 != aiw.a) {
                aiw aiwVar3 = null;
                while (aiwVar2 != null) {
                    aiw aiwVar4 = aiwVar2.next;
                    if (aiwVar2.thread != null) {
                        aiwVar3 = aiwVar2;
                    } else if (aiwVar3 != null) {
                        aiwVar3.next = aiwVar4;
                        if (aiwVar3.thread == null) {
                            break;
                        }
                    } else if (!b.c(this, aiwVar2, aiwVar4)) {
                        break;
                    }
                    aiwVar2 = aiwVar4;
                }
                return;
            }
            return;
        }
    }

    private final void i(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(j(d2));
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

    private final String j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V l(Object obj) {
        if (obj instanceof aip) {
            Throwable th = ((aip) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof air) {
            throw new ExecutionException(((air) obj).b);
        } else {
            if (obj != d) {
                return obj;
            }
            return null;
        }
    }

    @Override // defpackage.dehn
    public final void Pk(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        ais aisVar = this.listeners;
        if (aisVar != ais.a) {
            ais aisVar2 = new ais(runnable, executor);
            do {
                aisVar2.next = aisVar;
                if (b.d(this, aisVar, aisVar2)) {
                    return;
                }
                aisVar = this.listeners;
            } while (aisVar != ais.a);
            k(runnable, executor);
        }
        k(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(V v) {
        if (v == null) {
            v = (V) d;
        }
        if (b.e(this, null, v)) {
            e(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        aip aipVar;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof aiu)) {
            if (a) {
                aipVar = new aip(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                aipVar = aip.a;
            } else {
                aipVar = aip.b;
            }
            boolean z2 = false;
            aix<V> aixVar = this;
            while (true) {
                if (b.e(aixVar, obj, aipVar)) {
                    e(aixVar);
                    if (!(obj instanceof aiu)) {
                        break;
                    }
                    dehn<? extends V> dehnVar = ((aiu) obj).b;
                    if (dehnVar instanceof aix) {
                        aixVar = (aix) dehnVar;
                        obj = aixVar.value;
                        if (!(obj == null) && !(obj instanceof aiu)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        dehnVar.cancel(z);
                        break;
                    }
                } else {
                    obj = aixVar.value;
                    if (!(obj instanceof aiu)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    protected String f() {
        Object obj = this.value;
        if (obj instanceof aiu) {
            return "setFuture=[" + j(((aiu) obj).b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof aiu))) {
                return (V) l(obj2);
            }
            aiw aiwVar = this.waiters;
            if (aiwVar != aiw.a) {
                aiw aiwVar2 = new aiw();
                do {
                    aiwVar2.a(aiwVar);
                    if (b.c(this, aiwVar, aiwVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                h(aiwVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof aiu))));
                        return (V) l(obj);
                    }
                    aiwVar = this.waiters;
                } while (aiwVar != aiw.a);
                return (V) l(this.value);
            }
            return (V) l(this.value);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof aip;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof aiu)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                str = f();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str == null || str.isEmpty()) {
                if (isDone()) {
                    i(sb);
                } else {
                    sb.append("PENDING");
                }
            } else {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof aiu))) {
                return (V) l(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                aiw aiwVar = this.waiters;
                if (aiwVar != aiw.a) {
                    aiw aiwVar2 = new aiw();
                    do {
                        aiwVar2.a(aiwVar);
                        if (b.c(this, aiwVar, aiwVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    h(aiwVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if ((obj2 != null) && (!(obj2 instanceof aiu))) {
                                    return (V) l(obj2);
                                }
                                nanos = nanoTime - System.nanoTime();
                            } while (nanos >= 1000);
                            h(aiwVar2);
                        } else {
                            aiwVar = this.waiters;
                        }
                    } while (aiwVar != aiw.a);
                    return (V) l(this.value);
                }
                return (V) l(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (!((obj3 != null) & (!(obj3 instanceof aiu)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return (V) l(obj3);
                }
            }
            String aixVar = toString();
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
            throw new TimeoutException(str + " for " + aixVar);
        }
        throw new InterruptedException();
    }
}
