package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dbae  reason: default package */
/* loaded from: classes5.dex */
public final class dbae {
    public static <I, O> dehn<O> a(dehn<I> dehnVar, defg<? super I, ? extends O> defgVar, Executor executor) {
        return deew.g(dehnVar, dazv.h(defgVar), executor);
    }

    public static <I, O> dehn<O> b(dehn<I> dehnVar, dbrn<? super I, ? extends O> dbrnVar, Executor executor) {
        return deew.h(dehnVar, dazv.g(dbrnVar), executor);
    }

    public static <V> void c(dehn<V> dehnVar, degu<? super V> deguVar, Executor executor) {
        deha.q(dehnVar, dazv.c(deguVar), executor);
    }

    public static <V, X extends Throwable> dehn<V> d(dehn<? extends V> dehnVar, Class<X> cls, defg<? super X, ? extends V> defgVar, Executor executor) {
        return deee.h(dehnVar, cls, dazv.h(defgVar), executor);
    }

    public static <V> dehn<V> e(Callable<V> callable, Executor executor) {
        return deha.d(dazv.d(callable), executor);
    }

    @SafeVarargs
    public static <V> dbad<V> f(dehn<? extends V>... dehnVarArr) {
        return new dbad<>(deha.k(dehnVarArr));
    }
}
