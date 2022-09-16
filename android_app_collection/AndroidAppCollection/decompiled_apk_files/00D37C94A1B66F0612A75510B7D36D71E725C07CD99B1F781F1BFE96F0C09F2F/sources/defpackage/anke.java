package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: anke  reason: default package */
/* loaded from: classes.dex */
public final class anke implements Runnable {
    final Future a;
    final ankb b;

    public anke(Future future, ankb ankbVar) {
        this.a = future;
        this.b = ankbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable k;
        Future future = this.a;
        if (!(future instanceof anls) || (k = ((anls) future).k()) == null) {
            try {
                this.b.b(anlz.y(this.a));
                return;
            } catch (Error e) {
                e = e;
                this.b.a(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.b.a(e);
                return;
            } catch (ExecutionException e3) {
                this.b.a(e3.getCause());
                return;
            }
        }
        this.b.a(k);
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.a(this.b);
        return c.toString();
    }
}
