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
/* renamed from: dees  reason: default package */
/* loaded from: classes.dex */
public abstract class dees<V> extends deiy implements dehn<V> {
    private static final Logger a;
    private static final Object b;
    public static final boolean j;
    public static final deef k;
    public volatile deej listeners;
    public volatile Object value;
    public volatile deer waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        deef deemVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        j = z;
        a = Logger.getLogger(dees.class.getName());
        try {
            deemVar = new deeq();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th = null;
                th2 = th3;
                deemVar = new deek(AtomicReferenceFieldUpdater.newUpdater(deer.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(deer.class, deer.class, "next"), AtomicReferenceFieldUpdater.newUpdater(dees.class, deer.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(dees.class, deej.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(dees.class, Object.class, "value"));
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                deemVar = new deem();
            }
        }
        k = deemVar;
        if (th != null) {
            Logger logger = a;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        b = new Object();
    }

    private final void d(deer deerVar) {
        deerVar.thread = null;
        while (true) {
            deer deerVar2 = this.waiters;
            if (deerVar2 != deer.a) {
                deer deerVar3 = null;
                while (deerVar2 != null) {
                    deer deerVar4 = deerVar2.next;
                    if (deerVar2.thread != null) {
                        deerVar3 = deerVar2;
                    } else if (deerVar3 != null) {
                        deerVar3.next = deerVar4;
                        if (deerVar3.thread == null) {
                            break;
                        }
                    } else if (!k.c(this, deerVar2, deerVar4)) {
                        break;
                    }
                    deerVar2 = deerVar4;
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
        String sb2;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof deel) {
            sb.append(", setFuture=[");
            q(sb, ((deel) obj).b);
            sb.append("]");
        } else {
            try {
                sb2 = dbsj.f(OP());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(valueOf);
                sb2 = sb3.toString();
            }
            if (sb2 != null) {
                sb.append(", info=[");
                sb.append(sb2);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            h(sb);
        }
    }

    private final void h(StringBuilder sb) {
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            if (f == null) {
                sb.append("null");
            } else if (f == this) {
                sb.append("this future");
            } else {
                sb.append(f.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f)));
            }
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

    public static Object l(dehn<?> dehnVar) {
        Throwable n;
        if (dehnVar instanceof deen) {
            Object obj = ((dees) dehnVar).value;
            if (!(obj instanceof deeg)) {
                return obj;
            }
            deeg deegVar = (deeg) obj;
            if (!deegVar.c) {
                return obj;
            }
            Throwable th = deegVar.d;
            return th != null ? new deeg(false, th) : deeg.b;
        } else if (!(dehnVar instanceof deiy) || (n = ((deiy) dehnVar).n()) == null) {
            boolean isCancelled = dehnVar.isCancelled();
            if ((!j) & isCancelled) {
                return deeg.b;
            }
            try {
                Object f = f(dehnVar);
                if (!isCancelled) {
                    return f == null ? b : f;
                }
                String valueOf = String.valueOf(dehnVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new deeg(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(dehnVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                    sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb2.append(valueOf2);
                    return new deei(new IllegalArgumentException(sb2.toString(), e));
                }
                return new deeg(false, e);
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(dehnVar);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                    sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb3.append(valueOf3);
                    return new deeg(false, new IllegalArgumentException(sb3.toString(), e2));
                }
                return new deei(e2.getCause());
            } catch (Throwable th2) {
                return new deei(th2);
            }
        } else {
            return new deei(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [deef] */
    /* JADX WARN: Type inference failed for: r5v0, types: [dees<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dees] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [dees, dees<V>] */
    public static void m(dees<?> deesVar) {
        deej deejVar;
        deej deejVar2;
        deej deejVar3 = null;
        while (true) {
            deer deerVar = ((dees) deesVar).waiters;
            if (k.c((dees) deesVar, deerVar, deer.a)) {
                while (deerVar != null) {
                    Thread thread = deerVar.thread;
                    if (thread != null) {
                        deerVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    deerVar = deerVar.next;
                }
                ((dees) deesVar).OO();
                do {
                    deejVar = ((dees) deesVar).listeners;
                } while (!k.d((dees) deesVar, deejVar, deej.a));
                while (true) {
                    deejVar2 = deejVar3;
                    deejVar3 = deejVar;
                    if (deejVar3 == null) {
                        break;
                    }
                    deejVar = deejVar3.next;
                    deejVar3.next = deejVar2;
                }
                while (deejVar2 != null) {
                    deejVar3 = deejVar2.next;
                    Runnable runnable = deejVar2.b;
                    if (runnable instanceof deel) {
                        deel deelVar = (deel) runnable;
                        deesVar = deelVar.a;
                        if (deesVar.value == deelVar) {
                            if (k.e(deesVar, deelVar, l(deelVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        r(runnable, deejVar2.c);
                    }
                    deejVar2 = deejVar3;
                }
                return;
            }
        }
    }

    private final void q(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V s(Object obj) {
        if (obj instanceof deeg) {
            Throwable th = ((deeg) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof deei) {
            throw new ExecutionException(((deei) obj).b);
        } else {
            if (obj != b) {
                return obj;
            }
            return null;
        }
    }

    protected void OO() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String OP() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    @Override // defpackage.dehn
    public void Pk(Runnable runnable, Executor executor) {
        deej deejVar;
        dbsk.t(runnable, "Runnable was null.");
        dbsk.t(executor, "Executor was null.");
        if (!isDone() && (deejVar = this.listeners) != deej.a) {
            deej deejVar2 = new deej(runnable, executor);
            do {
                deejVar2.next = deejVar;
                if (k.d(this, deejVar, deejVar2)) {
                    return;
                }
                deejVar = this.listeners;
            } while (deejVar != deej.a);
            r(runnable, executor);
        }
        r(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof defpackage.deel
            r3 = r3 | r4
            if (r3 == 0) goto L61
            boolean r3 = defpackage.dees.j
            if (r3 == 0) goto L1f
            deeg r3 = new deeg
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            deeg r3 = defpackage.deeg.a
            goto L26
        L24:
            deeg r3 = defpackage.deeg.b
        L26:
            r5 = 0
            r4 = r7
        L28:
            deef r6 = defpackage.dees.k
            boolean r6 = r6.e(r4, r0, r3)
            if (r6 == 0) goto L5a
            if (r8 == 0) goto L35
            r4.e()
        L35:
            m(r4)
            boolean r4 = r0 instanceof defpackage.deel
            if (r4 == 0) goto L58
            deel r0 = (defpackage.deel) r0
            dehn<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof defpackage.deen
            if (r4 == 0) goto L55
            r4 = r0
            dees r4 = (defpackage.dees) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            boolean r6 = r0 instanceof defpackage.deel
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = 1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            r1 = 1
            goto L61
        L5a:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof defpackage.deel
            if (r6 != 0) goto L28
            r1 = r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dees.cancel(boolean):boolean");
    }

    protected void e() {
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof deel))) {
                return (V) s(obj2);
            }
            deer deerVar = this.waiters;
            if (deerVar != deer.a) {
                deer deerVar2 = new deer();
                do {
                    deerVar2.a(deerVar);
                    if (k.c(this, deerVar, deerVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                d(deerVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof deel))));
                        return (V) s(obj);
                    }
                    deerVar = this.waiters;
                } while (deerVar != deer.a);
                return (V) s(this.value);
            }
            return (V) s(this.value);
        }
        throw new InterruptedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean i() {
        Object obj = this.value;
        return (obj instanceof deeg) && ((deeg) obj).c;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof deeg;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof deel)) & (obj != null);
    }

    public boolean j(V v) {
        if (v == null) {
            v = (V) b;
        }
        if (k.e(this, null, v)) {
            m(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        dbsk.s(th);
        if (k.e(this, null, new deei(th))) {
            m(this);
            return true;
        }
        return false;
    }

    @Override // defpackage.deiy
    public final Throwable n() {
        if (this instanceof deen) {
            Object obj = this.value;
            if (!(obj instanceof deei)) {
                return null;
            }
            return ((deei) obj).b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(i());
        }
    }

    public void p(dehn<? extends V> dehnVar) {
        deei deeiVar;
        dbsk.s(dehnVar);
        Object obj = this.value;
        if (obj == null) {
            if (dehnVar.isDone()) {
                if (!k.e(this, null, l(dehnVar))) {
                    return;
                }
                m(this);
                return;
            }
            deel deelVar = new deel(this, dehnVar);
            if (k.e(this, null, deelVar)) {
                try {
                    dehnVar.Pk(deelVar, dege.a);
                    return;
                } catch (Throwable th) {
                    try {
                        deeiVar = new deei(th);
                    } catch (Throwable unused) {
                        deeiVar = deei.a;
                    }
                    k.e(this, deelVar, deeiVar);
                    return;
                }
            }
            obj = this.value;
        }
        if (obj instanceof deeg) {
            dehnVar.cancel(((deeg) obj).c);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            g(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof deel))) {
                return (V) s(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                deer deerVar = this.waiters;
                if (deerVar != deer.a) {
                    deer deerVar2 = new deer();
                    do {
                        deerVar2.a(deerVar);
                        if (k.c(this, deerVar, deerVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    d(deerVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if ((obj2 != null) && (!(obj2 instanceof deel))) {
                                    return (V) s(obj2);
                                }
                                nanos = nanoTime - System.nanoTime();
                            } while (nanos >= 1000);
                            d(deerVar2);
                        } else {
                            deerVar = this.waiters;
                        }
                    } while (deerVar != deer.a);
                    return (V) s(this.value);
                }
                return (V) s(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (!((obj3 != null) & (!(obj3 instanceof deel)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return (V) s(obj3);
                }
            }
            String deesVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(deesVar).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(deesVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
