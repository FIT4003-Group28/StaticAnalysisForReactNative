package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: allx  reason: default package */
/* loaded from: classes2.dex */
public final class allx {
    private final akpq a;
    private final List<allw<?>> b = new ArrayList();

    public allx(akpq akpqVar) {
        this.a = akpqVar;
    }

    public final synchronized void a(@dzsi final Runnable runnable) {
        for (allw<?> allwVar : this.b) {
            T t = allwVar.a;
            T t2 = allwVar.b;
            if (t != t2) {
                if (t2 != 0 && t2 != allwVar.c) {
                    t2.j();
                }
                allwVar.b = allwVar.a;
            }
        }
        Runnable runnable2 = new Runnable(this, runnable) { // from class: allv
            private final allx a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(this.b);
            }
        };
        if (bnuq.b()) {
            runnable2.run();
            return;
        }
        this.a.e(runnable2);
        this.a.d();
    }

    public final synchronized void b(@dzsi Runnable runnable) {
        for (allw<?> allwVar : this.b) {
            T t = allwVar.c;
            if (t != allwVar.b) {
                if (t != 0) {
                    t.j();
                }
                allwVar.c = allwVar.b;
                T t2 = allwVar.c;
                if (t2 != 0) {
                    t2.h();
                }
            }
        }
        if (runnable != null) {
            this.a.e(runnable);
            this.a.d();
        }
    }

    public final <T extends aktj<T, ?>> allw c() {
        allw<?> allwVar = new allw<>(this);
        synchronized (this) {
            this.b.add(allwVar);
        }
        return allwVar;
    }
}
