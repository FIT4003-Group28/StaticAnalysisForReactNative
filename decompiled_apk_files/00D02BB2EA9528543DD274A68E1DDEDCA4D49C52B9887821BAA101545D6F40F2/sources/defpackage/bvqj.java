package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvqj  reason: default package */
/* loaded from: classes.dex */
public final class bvqj {
    public static <T> degu<T> a(bvqg<T> bvqgVar) {
        return new bvqh(bvqgVar);
    }

    public static <T> degu<T> b(bvqg<T> bvqgVar) {
        return new bvqi(bvqgVar);
    }

    public static <T> void c(dehn<T> dehnVar, bvqg<? super T> bvqgVar, Executor executor) {
        deha.q(dehnVar, new bvqh(bvqgVar), executor);
    }

    public static <T> cryz<T> d(dehn<T> dehnVar, bvqg<? super T> bvqgVar, Executor executor) {
        cryz<T> cryzVar = new cryz<>(new bvqh(bvqgVar));
        deha.q(dehnVar, cryzVar, executor);
        return cryzVar;
    }

    public static <T> void e(dehn<T> dehnVar, bvqg<? super T> bvqgVar, Executor executor) {
        deha.q(dehnVar, new bvqf(bvqgVar), executor);
    }
}
