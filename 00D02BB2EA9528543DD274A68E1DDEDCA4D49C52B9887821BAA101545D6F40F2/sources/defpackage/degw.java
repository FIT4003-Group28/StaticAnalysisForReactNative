package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: degw  reason: default package */
/* loaded from: classes.dex */
public final class degw<V> implements Runnable {
    final Future<V> a;
    final degu<? super V> b;

    public degw(Future<V> future, degu<? super V> deguVar) {
        this.a = future;
        this.b = deguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable n;
        Future<V> future = this.a;
        if (!(future instanceof deiy) || (n = ((deiy) future).n()) == null) {
            try {
                this.b.b(deha.r(this.a));
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
        this.b.a(n);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(this.b);
        return b.toString();
    }
}
