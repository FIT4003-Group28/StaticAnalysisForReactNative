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
/* renamed from: anie  reason: default package */
/* loaded from: classes.dex */
public abstract class anie extends anls implements ankt {
    private static final Logger a;
    private static final Object b;
    public static final boolean g;
    public static final anhr h;
    public volatile anhv listeners;
    public volatile Object value;
    public volatile anid waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        anhr anhyVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        g = z;
        a = Logger.getLogger(anie.class.getName());
        try {
            anhyVar = new anic();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th = null;
                th2 = th3;
                anhyVar = new anhw(AtomicReferenceFieldUpdater.newUpdater(anid.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(anid.class, anid.class, "next"), AtomicReferenceFieldUpdater.newUpdater(anie.class, anid.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(anie.class, anhv.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(anie.class, Object.class, "value"));
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                anhyVar = new anhy();
            }
        }
        h = anhyVar;
        if (th != null) {
            Logger logger = a;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        b = new Object();
    }

    private static Object f(Future future) {
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

    private final void g(StringBuilder sb) {
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

    private final void h(StringBuilder sb) {
        String sb2;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof anhx) {
            sb.append(", setFuture=[");
            i(sb, ((anhx) obj).b);
            sb.append("]");
        } else {
            try {
                sb2 = amps.b(c());
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
            g(sb);
        }
    }

    private final void i(StringBuilder sb, Object obj) {
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

    public static Object j(ankt anktVar) {
        Throwable k;
        if (anktVar instanceof anhz) {
            Object obj = ((anie) anktVar).value;
            if (obj instanceof anhs) {
                anhs anhsVar = (anhs) obj;
                if (anhsVar.c) {
                    Throwable th = anhsVar.d;
                    obj = th != null ? new anhs(false, th) : anhs.b;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(anktVar instanceof anls) || (k = ((anls) anktVar).k()) == null) {
            boolean isCancelled = anktVar.isCancelled();
            if ((!g) & isCancelled) {
                anhs anhsVar2 = anhs.b;
                anhsVar2.getClass();
                return anhsVar2;
            }
            try {
                Object f = f(anktVar);
                if (!isCancelled) {
                    return f == null ? b : f;
                }
                String valueOf = String.valueOf(anktVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new anhs(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(anktVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                    sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb2.append(valueOf2);
                    return new anhu(new IllegalArgumentException(sb2.toString(), e));
                }
                return new anhs(false, e);
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(anktVar);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                    sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb3.append(valueOf3);
                    return new anhs(false, new IllegalArgumentException(sb3.toString(), e2));
                }
                return new anhu(e2.getCause());
            } catch (Throwable th2) {
                return new anhu(th2);
            }
        } else {
            return new anhu(k);
        }
    }

    public static void l(anie anieVar) {
        anhv anhvVar;
        anhv anhvVar2;
        anhv anhvVar3 = null;
        while (true) {
            anid anidVar = anieVar.waiters;
            if (h.e(anieVar, anidVar, anid.a)) {
                while (anidVar != null) {
                    Thread thread = anidVar.thread;
                    if (thread != null) {
                        anidVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    anidVar = anidVar.next;
                }
                anieVar.qu();
                do {
                    anhvVar = anieVar.listeners;
                } while (!h.c(anieVar, anhvVar, anhv.a));
                while (true) {
                    anhvVar2 = anhvVar3;
                    anhvVar3 = anhvVar;
                    if (anhvVar3 == null) {
                        break;
                    }
                    anhvVar = anhvVar3.next;
                    anhvVar3.next = anhvVar2;
                }
                while (anhvVar2 != null) {
                    anhvVar3 = anhvVar2.next;
                    Runnable runnable = anhvVar2.b;
                    runnable.getClass();
                    if (runnable instanceof anhx) {
                        anhx anhxVar = (anhx) runnable;
                        anieVar = anhxVar.a;
                        if (anieVar.value == anhxVar) {
                            if (h.d(anieVar, anhxVar, j(anhxVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = anhvVar2.c;
                        executor.getClass();
                        q(runnable, executor);
                    }
                    anhvVar2 = anhvVar3;
                }
                return;
            }
        }
    }

    private static void q(Runnable runnable, Executor executor) {
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

    private final void r(anid anidVar) {
        anidVar.thread = null;
        while (true) {
            anid anidVar2 = this.waiters;
            if (anidVar2 != anid.a) {
                anid anidVar3 = null;
                while (anidVar2 != null) {
                    anid anidVar4 = anidVar2.next;
                    if (anidVar2.thread != null) {
                        anidVar3 = anidVar2;
                    } else if (anidVar3 != null) {
                        anidVar3.next = anidVar4;
                        if (anidVar3.thread == null) {
                            break;
                        }
                    } else if (!h.e(this, anidVar2, anidVar4)) {
                        break;
                    }
                    anidVar2 = anidVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object s(Object obj) {
        if (obj instanceof anhs) {
            Throwable th = ((anhs) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof anhu) {
            throw new ExecutionException(((anhu) obj).b);
        } else {
            if (obj != b) {
                return obj;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String c() {
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

    public boolean cancel(boolean z) {
        anhs anhsVar;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof anhx)) {
            if (g) {
                anhsVar = new anhs(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    anhsVar = anhs.a;
                } else {
                    anhsVar = anhs.b;
                }
                anhsVar.getClass();
            }
            boolean z2 = false;
            anie anieVar = this;
            while (true) {
                if (h.d(anieVar, obj, anhsVar)) {
                    if (z) {
                        anieVar.m();
                    }
                    l(anieVar);
                    if (!(obj instanceof anhx)) {
                        break;
                    }
                    ankt anktVar = ((anhx) obj).b;
                    if (anktVar instanceof anhz) {
                        anieVar = (anie) anktVar;
                        obj = anieVar.value;
                        if (!(obj == null) && !(obj instanceof anhx)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        anktVar.cancel(z);
                        break;
                    }
                } else {
                    obj = anieVar.value;
                    if (!(obj instanceof anhx)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(Throwable th) {
        th.getClass();
        if (h.d(this, null, new anhu(th))) {
            l(this);
            return true;
        }
        return false;
    }

    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof anhx))) {
                return s(obj2);
            }
            anid anidVar = this.waiters;
            if (anidVar != anid.a) {
                anid anidVar2 = new anid();
                do {
                    anidVar2.a(anidVar);
                    if (h.e(this, anidVar, anidVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                r(anidVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof anhx))));
                        return s(obj);
                    }
                    anidVar = this.waiters;
                } while (anidVar != anid.a);
                Object obj3 = this.value;
                obj3.getClass();
                return s(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return s(obj32);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof anhs;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof anhx)) & (obj != null);
    }

    @Override // defpackage.anls
    public final Throwable k() {
        if (this instanceof anhz) {
            Object obj = this.value;
            if (!(obj instanceof anhu)) {
                return null;
            }
            return ((anhu) obj).b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean lV(ankt anktVar) {
        anhu anhuVar;
        anktVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (anktVar.isDone()) {
                if (!h.d(this, null, j(anktVar))) {
                    return false;
                }
                l(this);
                return true;
            }
            anhx anhxVar = new anhx(this, anktVar);
            if (h.d(this, null, anhxVar)) {
                try {
                    anktVar.qY(anhxVar, anjk.a);
                } catch (Throwable th) {
                    try {
                        anhuVar = new anhu(th);
                    } catch (Throwable unused) {
                        anhuVar = anhu.a;
                    }
                    h.d(this, anhxVar, anhuVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof anhs) {
            anktVar.cancel(((anhs) obj).c);
        }
        return false;
    }

    protected void m() {
    }

    public final void n(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(p());
        }
    }

    public final boolean o(Object obj) {
        if (obj == null) {
            obj = b;
        }
        if (h.d(this, null, obj)) {
            l(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p() {
        Object obj = this.value;
        return (obj instanceof anhs) && ((anhs) obj).c;
    }

    public void qY(Runnable runnable, Executor executor) {
        anhv anhvVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (anhvVar = this.listeners) != anhv.a) {
            anhv anhvVar2 = new anhv(runnable, executor);
            do {
                anhvVar2.next = anhvVar;
                if (h.c(this, anhvVar, anhvVar2)) {
                    return;
                }
                anhvVar = this.listeners;
            } while (anhvVar != anhv.a);
            q(runnable, executor);
        }
        q(runnable, executor);
    }

    protected void qu() {
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
            g(sb);
        } else {
            h(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof anhx))) {
                return s(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                anid anidVar = this.waiters;
                if (anidVar != anid.a) {
                    anid anidVar2 = new anid();
                    do {
                        anidVar2.a(anidVar);
                        if (h.e(this, anidVar, anidVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    r(anidVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof anhx)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return s(obj2);
                                }
                            } while (nanos >= 1000);
                            r(anidVar2);
                        } else {
                            anidVar = this.waiters;
                        }
                    } while (anidVar != anid.a);
                    Object obj3 = this.value;
                    obj3.getClass();
                    return s(obj3);
                }
                Object obj32 = this.value;
                obj32.getClass();
                return s(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if (!((obj4 != null) & (!(obj4 instanceof anhx)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return s(obj4);
                }
            }
            String anieVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
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
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(anieVar).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(anieVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
