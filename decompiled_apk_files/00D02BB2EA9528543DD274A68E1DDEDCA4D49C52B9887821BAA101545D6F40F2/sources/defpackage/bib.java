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
/* renamed from: bib  reason: default package */
/* loaded from: classes3.dex */
public class bib<V> implements dehn<V> {
    static final bhs b;
    public static final Object c;
    volatile Object d;
    volatile bhw e;
    volatile bia f;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger g = Logger.getLogger(bib.class.getName());

    static {
        bhs bhzVar;
        try {
            bhzVar = new bhx(AtomicReferenceFieldUpdater.newUpdater(bia.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(bia.class, bia.class, "c"), AtomicReferenceFieldUpdater.newUpdater(bib.class, bia.class, "f"), AtomicReferenceFieldUpdater.newUpdater(bib.class, bhw.class, "e"), AtomicReferenceFieldUpdater.newUpdater(bib.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            bhzVar = new bhz();
        }
        b = bhzVar;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        c = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(dehn<?> dehnVar) {
        if (dehnVar instanceof bib) {
            Object obj = ((bib) dehnVar).d;
            if (!(obj instanceof bht)) {
                return obj;
            }
            bht bhtVar = (bht) obj;
            if (!bhtVar.c) {
                return obj;
            }
            Throwable th = bhtVar.d;
            return th != null ? new bht(false, th) : bht.b;
        }
        boolean isCancelled = dehnVar.isCancelled();
        if ((!a) & isCancelled) {
            return bht.b;
        }
        try {
            Object f = f(dehnVar);
            return f == null ? c : f;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new bhv(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dehnVar, e));
            }
            return new bht(false, e);
        } catch (ExecutionException e2) {
            return new bhv(e2.getCause());
        } catch (Throwable th2) {
            return new bhv(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [bhs] */
    /* JADX WARN: Type inference failed for: r5v0, types: [bib<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bib] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [bib<V>, bib] */
    public static void c(bib<?> bibVar) {
        bhw bhwVar;
        bhw bhwVar2;
        bhw bhwVar3 = null;
        while (true) {
            bia biaVar = ((bib) bibVar).f;
            if (b.c((bib) bibVar, biaVar, bia.a)) {
                while (biaVar != null) {
                    Thread thread = biaVar.b;
                    if (thread != null) {
                        biaVar.b = null;
                        LockSupport.unpark(thread);
                    }
                    biaVar = biaVar.c;
                }
                do {
                    bhwVar = ((bib) bibVar).e;
                } while (!b.d((bib) bibVar, bhwVar, bhw.a));
                while (true) {
                    bhwVar2 = bhwVar3;
                    bhwVar3 = bhwVar;
                    if (bhwVar3 == null) {
                        break;
                    }
                    bhwVar = bhwVar3.d;
                    bhwVar3.d = bhwVar2;
                }
                while (bhwVar2 != null) {
                    bhwVar3 = bhwVar2.d;
                    Runnable runnable = bhwVar2.b;
                    if (runnable instanceof bhy) {
                        bhy bhyVar = (bhy) runnable;
                        bibVar = bhyVar.a;
                        if (bibVar.d == bhyVar) {
                            if (b.e(bibVar, bhyVar, b(bhyVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i(runnable, bhwVar2.c);
                    }
                    bhwVar2 = bhwVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void d(T t) {
        t.getClass();
    }

    private final void e(bia biaVar) {
        biaVar.b = null;
        while (true) {
            bia biaVar2 = this.f;
            if (biaVar2 != bia.a) {
                bia biaVar3 = null;
                while (biaVar2 != null) {
                    bia biaVar4 = biaVar2.c;
                    if (biaVar2.b != null) {
                        biaVar3 = biaVar2;
                    } else if (biaVar3 != null) {
                        biaVar3.c = biaVar4;
                        if (biaVar3.b == null) {
                            break;
                        }
                    } else if (!b.c(this, biaVar2, biaVar4)) {
                        break;
                    }
                    biaVar2 = biaVar4;
                }
                return;
            }
            return;
        }
    }

    private static <V> V f(Future<V> future) {
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

    private final void g(StringBuilder sb) {
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(f));
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

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = g;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V j(Object obj) {
        if (obj instanceof bht) {
            Throwable th = ((bht) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof bhv) {
            throw new ExecutionException(((bhv) obj).b);
        } else {
            if (obj != c) {
                return obj;
            }
            return null;
        }
    }

    @Override // defpackage.dehn
    public final void Pk(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        bhw bhwVar = this.e;
        if (bhwVar != bhw.a) {
            bhw bhwVar2 = new bhw(runnable, executor);
            do {
                bhwVar2.d = bhwVar;
                if (b.d(this, bhwVar, bhwVar2)) {
                    return;
                }
                bhwVar = this.e;
            } while (bhwVar != bhw.a);
            i(runnable, executor);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        bht bhtVar;
        Object obj = this.d;
        if ((obj == null) || (obj instanceof bhy)) {
            if (a) {
                bhtVar = new bht(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                bhtVar = bht.a;
            } else {
                bhtVar = bht.b;
            }
            boolean z2 = false;
            bib<V> bibVar = this;
            while (true) {
                if (b.e(bibVar, obj, bhtVar)) {
                    c(bibVar);
                    if (!(obj instanceof bhy)) {
                        break;
                    }
                    dehn<? extends V> dehnVar = ((bhy) obj).b;
                    if (dehnVar instanceof bib) {
                        bibVar = (bib) dehnVar;
                        obj = bibVar.d;
                        if (!(obj == null) && !(obj instanceof bhy)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        dehnVar.cancel(z);
                        break;
                    }
                } else {
                    obj = bibVar.d;
                    if (!(obj instanceof bhy)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) && (!(obj2 instanceof bhy))) {
                return (V) j(obj2);
            }
            bia biaVar = this.f;
            if (biaVar != bia.a) {
                bia biaVar2 = new bia();
                do {
                    biaVar2.a(biaVar);
                    if (b.c(this, biaVar, biaVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                e(biaVar2);
                                throw new InterruptedException();
                            }
                            obj = this.d;
                        } while (!((obj != null) & (!(obj instanceof bhy))));
                        return (V) j(obj);
                    }
                    biaVar = this.f;
                } while (biaVar != bia.a);
                return (V) j(this.d);
            }
            return (V) j(this.d);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof bht;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.d;
        return (!(obj instanceof bhy)) & (obj != null);
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
                if (this.d instanceof bhy) {
                    str = "setFuture=[" + h(((bhy) obj).b) + "]";
                } else if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str == null || str.isEmpty()) {
                if (isDone()) {
                    g(sb);
                } else {
                    sb.append("PENDING");
                }
            } else {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            }
        } else {
            g(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.d;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof bhy))) {
                return (V) j(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                bia biaVar = this.f;
                if (biaVar != bia.a) {
                    bia biaVar2 = new bia();
                    do {
                        biaVar2.a(biaVar);
                        if (b.c(this, biaVar, biaVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    e(biaVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.d;
                                if ((obj2 != null) && (!(obj2 instanceof bhy))) {
                                    return (V) j(obj2);
                                }
                                nanos = nanoTime - System.nanoTime();
                            } while (nanos >= 1000);
                            e(biaVar2);
                        } else {
                            biaVar = this.f;
                        }
                    } while (biaVar != bia.a);
                    return (V) j(this.d);
                }
                return (V) j(this.d);
            }
            while (nanos > 0) {
                Object obj3 = this.d;
                if (!((obj3 != null) & (!(obj3 instanceof bhy)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return (V) j(obj3);
                }
            }
            String bibVar = toString();
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
            throw new TimeoutException(str + " for " + bibVar);
        }
        throw new InterruptedException();
    }
}
