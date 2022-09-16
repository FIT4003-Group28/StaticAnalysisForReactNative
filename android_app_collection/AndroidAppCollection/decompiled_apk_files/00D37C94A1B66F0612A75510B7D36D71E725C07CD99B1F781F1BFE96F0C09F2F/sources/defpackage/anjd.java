package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: anjd  reason: default package */
/* loaded from: classes.dex */
public final class anjd {
    public static final Logger a = Logger.getLogger(anjd.class.getName());
    public final anko c;
    private final AtomicReference d = new AtomicReference(anjc.OPEN);
    public final anja b = new anja();

    public anjd(vnz vnzVar, Executor executor) {
        anlq g = anlq.g(new aniv(this, vnzVar));
        executor.execute(g);
        this.c = g;
    }

    @Deprecated
    public static anjd a(ankt anktVar, Executor executor) {
        executor.getClass();
        anjd anjdVar = new anjd(anlz.r(anktVar));
        anlz.A(anktVar, new aniu(anjdVar, executor), anjk.a);
        return anjdVar;
    }

    public static anjd b(ankt anktVar) {
        return new anjd(anktVar);
    }

    public static void f(Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new anit(closeable));
            } catch (RejectedExecutionException e) {
                Logger logger = a;
                if (logger.isLoggable(Level.WARNING)) {
                    logger.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                f(closeable, anjk.a);
            }
        }
    }

    private final boolean i(anjc anjcVar, anjc anjcVar2) {
        return this.d.compareAndSet(anjcVar, anjcVar2);
    }

    public final anjd c(aniz anizVar, Executor executor) {
        anizVar.getClass();
        return g((anko) anii.i(this.c, new anix(this, anizVar), executor));
    }

    public final void d(anja anjaVar) {
        e(anjc.OPEN, anjc.SUBSUMED);
        anjaVar.a(this.b, anjk.a);
    }

    public final void e(anjc anjcVar, anjc anjcVar2) {
        aqxo.E(i(anjcVar, anjcVar2), "Expected state to be %s, but it was %s", anjcVar, anjcVar2);
    }

    protected final void finalize() {
        if (((anjc) this.d.get()).equals(anjc.OPEN)) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            h();
        }
    }

    public final anjd g(anko ankoVar) {
        anjd anjdVar = new anjd(ankoVar);
        d(anjdVar.b);
        return anjdVar;
    }

    public final anko h() {
        if (i(anjc.OPEN, anjc.WILL_CLOSE)) {
            a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            this.c.qY(new aniy(this), anjk.a);
        } else {
            int ordinal = ((anjc) this.d.get()).ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.c;
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("state", this.d.get());
        c.a(this.c);
        return c.toString();
    }

    private anjd(ankt anktVar) {
        this.c = anko.q(anktVar);
    }
}
