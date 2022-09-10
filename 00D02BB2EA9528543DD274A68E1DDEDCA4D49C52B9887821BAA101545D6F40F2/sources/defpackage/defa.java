package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: defa  reason: default package */
/* loaded from: classes.dex */
public abstract class defa<InputT, OutputT> extends defe<OutputT> {
    private static final Logger c = Logger.getLogger(defa.class.getName());
    public dccr<? extends dehn<? extends InputT>> a;
    private final boolean d;
    private final boolean e;

    public defa(dccr<? extends dehn<? extends InputT>> dccrVar, boolean z, boolean z2) {
        super(dccrVar.size());
        dbsk.s(dccrVar);
        this.a = dccrVar;
        this.d = z;
        this.e = z2;
    }

    private final void t(Throwable th) {
        dbsk.s(th);
        if (this.d && !k(th)) {
            Set<Throwable> set = this.seenExceptions;
            if (set == null) {
                Set<Throwable> g = dcnm.g();
                f(g);
                defe.b.b(this, g);
                set = this.seenExceptions;
            }
            if (v(set, th)) {
                u(th);
                return;
            }
        }
        if (th instanceof Error) {
            u(th);
        }
    }

    private static void u(Throwable th) {
        c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean v(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.dees
    protected final void OO() {
        dccr<? extends dehn<? extends InputT>> dccrVar = this.a;
        q(deez.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (dccrVar != null)) {
            boolean i = i();
            dcpd<? extends dehn<? extends InputT>> it = dccrVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        dccr<? extends dehn<? extends InputT>> dccrVar = this.a;
        if (dccrVar != null) {
            String valueOf = String.valueOf(dccrVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.OP();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.a.isEmpty()) {
            s();
        } else if (this.d) {
            dcpd<? extends dehn<? extends InputT>> it = this.a.iterator();
            int i = 0;
            while (it.hasNext()) {
                dehn<? extends InputT> next = it.next();
                next.Pk(new deex(this, next, i), dege.a);
                i++;
            }
        } else {
            deey deeyVar = new deey(this, this.e ? this.a : null);
            dcpd<? extends dehn<? extends InputT>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().Pk(deeyVar, dege.a);
            }
        }
    }

    @Override // defpackage.defe
    public final void f(Set<Throwable> set) {
        dbsk.s(set);
        if (!isCancelled()) {
            v(set, n());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i, Future<? extends InputT> future) {
        try {
            r(i, (int) deha.r(future));
        } catch (ExecutionException e) {
            t(e.getCause());
        } catch (Throwable th) {
            t(th);
        }
    }

    public final void h(dccr<? extends Future<? extends InputT>> dccrVar) {
        int a = defe.b.a(this);
        int i = 0;
        dbsk.m(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (dccrVar != null) {
                dcpd<? extends Future<? extends InputT>> it = dccrVar.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> next = it.next();
                    if (!next.isCancelled()) {
                        g(i, next);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            s();
            q(deez.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    public void q(deez deezVar) {
        dbsk.s(deezVar);
        this.a = null;
    }

    public abstract void r(int i, InputT inputt);

    public abstract void s();
}
