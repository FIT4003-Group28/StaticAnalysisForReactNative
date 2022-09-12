package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: deew  reason: default package */
/* loaded from: classes.dex */
public abstract class deew<I, O, F, T> extends dego<O> implements Runnable {
    dehn<? extends I> a;
    F b;

    public deew(dehn<? extends I> dehnVar, F f) {
        dbsk.s(dehnVar);
        this.a = dehnVar;
        dbsk.s(f);
        this.b = f;
    }

    public static <I, O> dehn<O> g(dehn<I> dehnVar, defg<? super I, ? extends O> defgVar, Executor executor) {
        dbsk.s(executor);
        deeu deeuVar = new deeu(dehnVar, defgVar);
        dehnVar.Pk(deeuVar, dehx.e(executor, deeuVar));
        return deeuVar;
    }

    public static <I, O> dehn<O> h(dehn<I> dehnVar, dbrn<? super I, ? extends O> dbrnVar, Executor executor) {
        dbsk.s(dbrnVar);
        deev deevVar = new deev(dehnVar, dbrnVar);
        dehnVar.Pk(deevVar, dehx.e(executor, deevVar));
        return deevVar;
    }

    @Override // defpackage.dees
    protected final void OO() {
        o(this.a);
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        String str;
        dehn<? extends I> dehnVar = this.a;
        F f = this.b;
        String OP = super.OP();
        if (dehnVar != null) {
            String valueOf = String.valueOf(dehnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f == null) {
            if (OP == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            return OP.length() != 0 ? valueOf2.concat(OP) : new String(valueOf2);
        }
        String valueOf3 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf3).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract void d(T t);

    public abstract T f(F f, I i);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        dehn<? extends I> dehnVar = this.a;
        F f = this.b;
        boolean z = true;
        boolean isCancelled = isCancelled() | (dehnVar == null);
        if (f != null) {
            z = false;
        }
        if (isCancelled || z) {
            return;
        }
        this.a = null;
        if (dehnVar.isCancelled()) {
            p(dehnVar);
            return;
        }
        try {
            try {
                Object f2 = f(f, deha.r(dehnVar));
                this.b = null;
                d((deew<I, O, F, T>) f2);
            } catch (Throwable th) {
                try {
                    k(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            k(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            k(e2);
        } catch (ExecutionException e3) {
            k(e3.getCause());
        }
    }
}
