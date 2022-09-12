package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfez  reason: default package */
/* loaded from: classes6.dex */
public final class dfez<T> {
    private final Executor b;
    private final boolean c;
    @dzsi
    private T e;
    private final Object a = new Object();
    private final Set<dfeq<T>> d = new HashSet();

    public dfez(Executor executor, boolean z) {
        this.b = dehx.b(executor);
        this.c = z;
    }

    public final void a(final dfeq<T> dfeqVar) {
        final T t;
        synchronized (this.a) {
            boolean add = this.d.add(dfeqVar);
            if (!this.c || !add || (t = this.e) == null) {
                return;
            }
            this.b.execute(new Runnable(this, dfeqVar, t) { // from class: dfex
                private final dfez a;
                private final dfeq b;
                private final Object c;

                {
                    this.a = this;
                    this.b = dfeqVar;
                    this.c = t;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(this.b, this.c);
                }
            });
        }
    }

    public final void b(dfeq<T> dfeqVar) {
        synchronized (this.a) {
            this.d.remove(dfeqVar);
        }
    }

    public final void c(final T t) {
        synchronized (this.a) {
            for (final dfeq<T> dfeqVar : this.d) {
                this.b.execute(new Runnable(this, dfeqVar, t) { // from class: dfey
                    private final dfez a;
                    private final dfeq b;
                    private final Object c;

                    {
                        this.a = this;
                        this.b = dfeqVar;
                        this.c = t;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d(this.b, this.c);
                    }
                });
            }
            this.e = t;
        }
    }

    public final void d(dfeq<T> dfeqVar, T t) {
        synchronized (this.a) {
            if (!this.d.contains(dfeqVar)) {
                return;
            }
            dfeqVar.n(t);
        }
    }
}
