package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crzy  reason: default package */
/* loaded from: classes5.dex */
public final class crzy<V, B> implements crzm<V> {
    private final crzm<B> a;
    private final dbrn<B, V> b;
    private final Map<crzp<V>, crzp<B>> c = new HashMap();
    private final WeakHashMap<crzp<V>, crzp<B>> d = new WeakHashMap<>();

    public crzy(crzm<B> crzmVar, dbrn<B, V> dbrnVar) {
        this.a = crzmVar;
        this.b = dbrnVar;
    }

    private final crzp<B> g(final crzp<V> crzpVar) {
        crzp<B> crzpVar2 = new crzp(this, crzpVar) { // from class: crzw
            private final crzy a;
            private final crzp b;

            {
                this.a = this;
                this.b = crzpVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.b.On(this.a);
            }
        };
        synchronized (this) {
            this.c.put(crzpVar, crzpVar2);
        }
        return crzpVar2;
    }

    private final crzp<B> h(crzp<V> crzpVar) {
        final WeakReference weakReference = new WeakReference(crzpVar);
        crzp<B> crzpVar2 = new crzp(this, weakReference) { // from class: crzx
            private final crzy a;
            private final WeakReference b;

            {
                this.a = this;
                this.b = weakReference;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                crzy crzyVar = this.a;
                crzp crzpVar3 = (crzp) this.b.get();
                if (crzpVar3 != null) {
                    crzpVar3.On(crzyVar);
                }
            }
        };
        synchronized (this) {
            this.d.put(crzpVar, crzpVar2);
        }
        return crzpVar2;
    }

    @Override // defpackage.crzm
    public final void a(crzp<V> crzpVar, Executor executor) {
        this.a.a(g(crzpVar), executor);
    }

    @Override // defpackage.crzm
    public final void b(crzp<V> crzpVar, Executor executor) {
        this.a.b(h(crzpVar), executor);
    }

    @Override // defpackage.crzm
    public final void c(crzp<V> crzpVar) {
        crzp<B> remove;
        synchronized (this) {
            remove = this.c.remove(crzpVar);
        }
        if (remove != null) {
            this.a.c(remove);
        }
    }

    @Override // defpackage.crzm
    public final void d(crzp<V> crzpVar, Executor executor) {
        this.a.d(g(crzpVar), executor);
    }

    @Override // defpackage.crzm
    public final void e(crzp<V> crzpVar, Executor executor) {
        this.a.e(h(crzpVar), executor);
    }

    @Override // defpackage.crzm
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.crzm
    public final dehn<V> j() {
        return deew.h(this.a.j(), this.b, dege.a);
    }

    @Override // defpackage.crzm
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.crzm
    @dzsi
    public final V l() {
        return this.b.a(this.a.l());
    }
}
