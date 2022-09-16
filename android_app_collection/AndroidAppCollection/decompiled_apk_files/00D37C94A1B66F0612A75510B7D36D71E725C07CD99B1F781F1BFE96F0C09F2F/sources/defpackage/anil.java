package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anil  reason: default package */
/* loaded from: classes.dex */
public abstract class anil extends anip {
    private static final Logger c = Logger.getLogger(anil.class.getName());
    public amub a;
    private final boolean d;
    private final boolean e;

    public anil(amub amubVar, boolean z, boolean z2) {
        super(amubVar.size());
        amubVar.getClass();
        this.a = amubVar;
        this.d = z;
        this.e = z2;
    }

    private final void t(Throwable th) {
        th.getClass();
        if (this.d && !e(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set i = amyv.i();
                f(i);
                anip.b.b(this, i);
                set = this.seenExceptions;
                set.getClass();
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

    private static boolean v(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        amub amubVar = this.a;
        if (amubVar != null) {
            String valueOf = String.valueOf(amubVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.c();
    }

    @Override // defpackage.anip
    public final void f(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable k = k();
            k.getClass();
            v(set, k);
        }
    }

    public abstract void g(int i, Object obj);

    public final void h(int i, Future future) {
        try {
            g(i, anlz.y(future));
        } catch (ExecutionException e) {
            t(e.getCause());
        } catch (Throwable th) {
            t(th);
        }
    }

    public final void i(amub amubVar) {
        int a = anip.b.a(this);
        int i = 0;
        aqxo.z(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (amubVar != null) {
                amzs it = amubVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        h(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            q();
            s(2);
        }
    }

    public abstract void q();

    @Override // defpackage.anie
    protected final void qu() {
        amub amubVar = this.a;
        boolean z = true;
        s(1);
        boolean isCancelled = isCancelled();
        if (amubVar == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean p = p();
            amzs it = amubVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        amub amubVar = this.a;
        amubVar.getClass();
        if (amubVar.isEmpty()) {
            q();
        } else if (this.d) {
            amzs it = this.a.iterator();
            int i = 0;
            while (it.hasNext()) {
                ankt anktVar = (ankt) it.next();
                anktVar.qY(new anij(this, anktVar, i), anjk.a);
                i++;
            }
        } else {
            anik anikVar = new anik(this, this.e ? this.a : null);
            amzs it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((ankt) it2.next()).qY(anikVar, anjk.a);
            }
        }
    }

    public void s(int i) {
        this.a = null;
    }
}
