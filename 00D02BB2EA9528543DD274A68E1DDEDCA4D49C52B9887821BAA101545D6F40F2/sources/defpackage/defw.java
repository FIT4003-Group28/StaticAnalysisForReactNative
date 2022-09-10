package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: defw  reason: default package */
/* loaded from: classes6.dex */
public final class defw<V> {
    public static final Logger a = Logger.getLogger(defw.class.getName());
    public final degp<V> c;
    private final AtomicReference<defv> d = new AtomicReference<>(defv.OPEN);
    public final defr b = new defr();

    private defw(defs<V> defsVar, Executor executor) {
        dbsk.s(defsVar);
        deiv f = deiv.f(new defk(this, defsVar));
        executor.execute(f);
        this.c = f;
    }

    public static <V> defw<V> a(defs<V> defsVar, Executor executor) {
        return new defw<>(defsVar, executor);
    }

    public static <V> defw<V> b(dehn<V> dehnVar) {
        return new defw<>(dehnVar);
    }

    public static void i(Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new defj(closeable));
            } catch (RejectedExecutionException e) {
                Logger logger = a;
                if (logger.isLoggable(Level.WARNING)) {
                    logger.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                i(closeable, dege.a);
            }
        }
    }

    private final boolean k(defv defvVar, defv defvVar2) {
        return this.d.compareAndSet(defvVar, defvVar2);
    }

    public final dehn<?> c() {
        return deha.o(deew.h(this.c, dbrs.b(null), dege.a));
    }

    public final <U> defw<U> d(deft<? super V, U> deftVar, Executor executor) {
        dbsk.s(deftVar);
        return g((degp) deew.g(this.c, new defl(this, deftVar), executor));
    }

    public final <U> defw<U> e(defq<? super V, U> defqVar, Executor executor) {
        dbsk.s(defqVar);
        return g((degp) deew.g(this.c, new defm(this, defqVar), executor));
    }

    public final degp<V> f() {
        if (k(defv.OPEN, defv.WILL_CLOSE)) {
            a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            this.c.Pk(new defp(this), dege.a);
        } else {
            int ordinal = this.d.get().ordinal();
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

    protected final void finalize() {
        if (this.d.get().equals(defv.OPEN)) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            f();
        }
    }

    public final <U> defw<U> g(degp<U> degpVar) {
        defw<U> defwVar = new defw<>(degpVar);
        h(defwVar.b);
        return defwVar;
    }

    public final void h(defr defrVar) {
        j(defv.OPEN, defv.SUBSUMED);
        defrVar.c(this.b, dege.a);
    }

    public final void j(defv defvVar, defv defvVar2) {
        dbsk.r(k(defvVar, defvVar2), "Expected state to be %s, but it was %s", defvVar, defvVar2);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("state", this.d.get());
        b.a(this.c);
        return b.toString();
    }

    private defw(dehn<V> dehnVar) {
        this.c = degp.q(dehnVar);
    }
}
