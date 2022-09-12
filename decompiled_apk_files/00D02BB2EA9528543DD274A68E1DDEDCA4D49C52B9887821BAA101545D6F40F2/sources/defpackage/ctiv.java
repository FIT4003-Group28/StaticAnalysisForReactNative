package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ctiv  reason: default package */
/* loaded from: classes5.dex */
public final class ctiv {
    public static void a(ctir ctirVar, final Runnable runnable) {
        b(ctirVar, new Callable(runnable) { // from class: ctiu
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.run();
                return null;
            }
        });
    }

    public static <T> T b(ctir ctirVar, Callable<T> callable) {
        cstq.a();
        ctirVar.e();
        try {
            try {
                T call = callable.call();
                ctirVar.h();
                return call;
            } catch (Exception e) {
                throw new ctis(e);
            }
        } finally {
            ctirVar.f();
        }
    }
}
