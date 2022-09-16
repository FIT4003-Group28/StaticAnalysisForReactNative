package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dbac  reason: default package */
/* loaded from: classes5.dex */
public final class dbac<V> extends degs<V> {
    private dbac(dehn<V> dehnVar) {
        super(dehnVar);
    }

    public static <V> dbac<V> b(dehn<V> dehnVar) {
        if (dehnVar instanceof dbac) {
            return (dbac) dehnVar;
        }
        return new dbac<>(dehnVar);
    }

    public final <X extends Throwable> dbac<V> c(Class<X> cls, dbrn<? super X, ? extends V> dbrnVar, Executor executor) {
        return new dbac<>(deee.g(this.b, cls, dazv.g(dbrnVar), executor));
    }

    public final <X extends Throwable> dbac<V> d(Class<X> cls, defg<? super X, ? extends V> defgVar, Executor executor) {
        return new dbac<>(dbae.d(this.b, cls, defgVar, executor));
    }

    public final <T> dbac<T> e(defg<? super V, T> defgVar, Executor executor) {
        return new dbac<>(dbae.a(this.b, defgVar, executor));
    }

    public final <T> dbac<T> f(dbrn<? super V, T> dbrnVar, Executor executor) {
        return new dbac<>(dbae.b(this.b, dbrnVar, executor));
    }
}
