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
/* renamed from: ago  reason: default package */
/* loaded from: classes.dex */
public abstract class ago implements ankt {
    static final agf b;
    private static final Object d;
    volatile agj listeners;
    volatile Object value;
    volatile agn waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(ago.class.getName());

    static {
        agf agmVar;
        try {
            agmVar = new agk(AtomicReferenceFieldUpdater.newUpdater(agn.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(agn.class, agn.class, "next"), AtomicReferenceFieldUpdater.newUpdater(ago.class, agn.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(ago.class, agj.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(ago.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            agmVar = new agm();
        }
        b = agmVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    static Object b(ankt anktVar) {
        if (anktVar instanceof ago) {
            Object obj = ((ago) anktVar).value;
            if (!(obj instanceof agg)) {
                return obj;
            }
            agg aggVar = (agg) obj;
            if (!aggVar.c) {
                return obj;
            }
            Throwable th = aggVar.d;
            return th != null ? new agg(false, th) : agg.b;
        }
        boolean isCancelled = anktVar.isCancelled();
        if ((!a) & isCancelled) {
            return agg.b;
        }
        try {
            Object c2 = c(anktVar);
            return c2 == null ? d : c2;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new agi(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + anktVar, e));
            }
            return new agg(false, e);
        } catch (ExecutionException e2) {
            return new agi(e2.getCause());
        } catch (Throwable th2) {
            return new agi(th2);
        }
    }

    static Object c(Future future) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ago agoVar) {
        agj agjVar;
        agj agjVar2;
        agj agjVar3 = null;
        while (true) {
            agn agnVar = agoVar.waiters;
            if (b.e(agoVar, agnVar, agn.a)) {
                while (agnVar != null) {
                    Thread thread = agnVar.thread;
                    if (thread != null) {
                        agnVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    agnVar = agnVar.next;
                }
                do {
                    agjVar = agoVar.listeners;
                } while (!b.c(agoVar, agjVar, agj.a));
                while (true) {
                    agjVar2 = agjVar3;
                    agjVar3 = agjVar;
                    if (agjVar3 == null) {
                        break;
                    }
                    agjVar = agjVar3.next;
                    agjVar3.next = agjVar2;
                }
                while (agjVar2 != null) {
                    agjVar3 = agjVar2.next;
                    Runnable runnable = agjVar2.b;
                    if (runnable instanceof agl) {
                        agl aglVar = (agl) runnable;
                        agoVar = aglVar.a;
                        if (agoVar.value == aglVar) {
                            if (b.d(agoVar, aglVar, b(aglVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j(runnable, agjVar2.c);
                    }
                    agjVar2 = agjVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj) {
        obj.getClass();
    }

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void i(StringBuilder sb) {
        try {
            Object c2 = c(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(c2));
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

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private final void k(agn agnVar) {
        agnVar.thread = null;
        while (true) {
            agn agnVar2 = this.waiters;
            if (agnVar2 != agn.a) {
                agn agnVar3 = null;
                while (agnVar2 != null) {
                    agn agnVar4 = agnVar2.next;
                    if (agnVar2.thread != null) {
                        agnVar3 = agnVar2;
                    } else if (agnVar3 != null) {
                        agnVar3.next = agnVar4;
                        if (agnVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, agnVar2, agnVar4)) {
                        break;
                    }
                    agnVar2 = agnVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object l(Object obj) {
        if (obj instanceof agg) {
            Throwable th = ((agg) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof agi) {
            throw new ExecutionException(((agi) obj).b);
        } else {
            if (obj != d) {
                return obj;
            }
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        agg aggVar;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof agl)) {
            if (a) {
                aggVar = new agg(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                aggVar = agg.a;
            } else {
                aggVar = agg.b;
            }
            boolean z2 = false;
            ago agoVar = this;
            while (true) {
                if (b.d(agoVar, obj, aggVar)) {
                    e(agoVar);
                    if (!(obj instanceof agl)) {
                        break;
                    }
                    ankt anktVar = ((agl) obj).b;
                    if (anktVar instanceof ago) {
                        agoVar = (ago) anktVar;
                        obj = agoVar.value;
                        if (!(obj == null) && !(obj instanceof agl)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        anktVar.cancel(z);
                        break;
                    }
                } else {
                    obj = agoVar.value;
                    if (!(obj instanceof agl)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    protected String d() {
        Object obj = this.value;
        if (obj instanceof agl) {
            return "setFuture=[" + h(((agl) obj).b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (b.d(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof agl))) {
                return l(obj2);
            }
            agn agnVar = this.waiters;
            if (agnVar != agn.a) {
                agn agnVar2 = new agn();
                do {
                    agnVar2.a(agnVar);
                    if (b.e(this, agnVar, agnVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                k(agnVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof agl))));
                        return l(obj);
                    }
                    agnVar = this.waiters;
                } while (agnVar != agn.a);
                return l(this.value);
            }
            return l(this.value);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof agg;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof agl)) & (obj != null);
    }

    @Override // defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        agj agjVar = this.listeners;
        if (agjVar != agj.a) {
            agj agjVar2 = new agj(runnable, executor);
            do {
                agjVar2.next = agjVar;
                if (b.c(this, agjVar, agjVar2)) {
                    return;
                }
                agjVar = this.listeners;
            } while (agjVar != agj.a);
            j(runnable, executor);
        }
        j(runnable, executor);
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
                str = d();
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
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof agl))) {
                return l(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                agn agnVar = this.waiters;
                if (agnVar != agn.a) {
                    agn agnVar2 = new agn();
                    do {
                        agnVar2.a(agnVar);
                        if (b.e(this, agnVar, agnVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    k(agnVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof agl)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return l(obj2);
                                }
                            } while (nanos >= 1000);
                            k(agnVar2);
                        } else {
                            agnVar = this.waiters;
                        }
                    } while (agnVar != agn.a);
                    return l(this.value);
                }
                return l(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (!((obj3 != null) & (!(obj3 instanceof agl)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return l(obj3);
                }
            }
            String agoVar = toString();
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
            throw new TimeoutException(str + " for " + agoVar);
        }
        throw new InterruptedException();
    }
}
