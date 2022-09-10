package defpackage;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dazv  reason: default package */
/* loaded from: classes.dex */
public final class dazv {
    public static final /* synthetic */ int a = 0;

    static {
        new Random().nextInt();
        new HashMap();
    }

    public static Runnable a(dazn daznVar, Runnable runnable) {
        return new dazp(daznVar, runnable);
    }

    public static Runnable b(Runnable runnable) {
        return a(dbaa.f(), runnable);
    }

    public static <T> degu<T> c(degu<T> deguVar) {
        return new dazq(dbaa.f(), deguVar);
    }

    public static <V> Callable<V> d(Callable<V> callable) {
        return new dazr(dbaa.f(), callable);
    }

    public static <T> defs<T> e(final defs<T> defsVar) {
        final dazn f = dbaa.f();
        return new defs(f, defsVar) { // from class: dazo
            private final dazn a;
            private final defs b;

            {
                this.a = f;
                this.b = defsVar;
            }

            @Override // defpackage.defs
            public final Object a(defu defuVar) {
                dazn daznVar = this.a;
                defs defsVar2 = this.b;
                int i = dazv.a;
                dazn g = dbaa.g(daznVar);
                try {
                    return defsVar2.a(defuVar);
                } finally {
                    dbaa.g(g);
                }
            }
        };
    }

    public static <V> deff<V> f(deff<V> deffVar) {
        dbsk.s(deffVar);
        return new dazs(dbaa.f(), deffVar);
    }

    public static <I, O> dbrn<I, O> g(dbrn<I, O> dbrnVar) {
        return new dazt(dbaa.f(), dbrnVar);
    }

    public static <I, O> defg<I, O> h(defg<I, O> defgVar) {
        return new dazu(dbaa.f(), defgVar);
    }
}
