package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: diz  reason: default package */
/* loaded from: classes3.dex */
public final class diz {
    private static final AtomicInteger c = new AtomicInteger(1);
    public final int a;
    public dlj b;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private final dby k;
    private boolean l;
    private boolean m;
    private int n;
    private ComponentTree o;
    private ddm p;
    private int q;
    private int r;
    private final dka s;
    private dkj t;

    public diz(diy diyVar) {
        new AtomicInteger(0);
        this.l = true;
        this.m = false;
        this.q = -1;
        this.r = -1;
        this.b = diyVar.a;
        this.k = diyVar.b;
        this.s = diyVar.i;
        this.d = diyVar.d;
        this.a = c.getAndIncrement();
        this.g = diyVar.c;
        this.h = diyVar.h;
        this.i = diyVar.e;
        this.e = diyVar.f;
        this.f = diyVar.g;
    }

    public static diy c() {
        return new diy();
    }

    private final void u(cyv cyvVar) {
        if (this.o == null) {
            czf c2 = ComponentTree.c(cyvVar, this.b.b());
            Object e = this.b.e("is_reconciliation_enabled");
            Object e2 = this.b.e("layout_diffing_enabled");
            if (e != null) {
                c2.k = ((Boolean) e).booleanValue();
            } else {
                c2.k = this.e;
            }
            if (e2 != null) {
                c2.f = ((Boolean) e2).booleanValue();
            } else {
                c2.f = this.f;
            }
            c2.g = this.k;
            c2.h = this.p;
            dka dkaVar = this.s;
            c2.j = dkaVar == null ? null : new dki(dkaVar.a, this);
            c2.i = this.m;
            c2.d = this.g;
            c2.b = this.h;
            c2.e = this.i;
            c2.l = this.d;
            this.b.l();
            this.b.m();
            ComponentTree a = c2.a();
            this.o = a;
            dkj dkjVar = this.t;
            if (dkjVar == null) {
                return;
            }
            a.A = dkjVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a() {
        return this.n;
    }

    public final synchronized ComponentTree b() {
        return this.o;
    }

    public final synchronized dlj d() {
        return this.b;
    }

    public final synchronized void e() {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            this.p = componentTree.d();
        }
        ComponentTree componentTree2 = this.o;
        if (componentTree2 != null) {
            this.m = componentTree2.p;
        }
        k();
    }

    public final synchronized void f(czj czjVar) {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            synchronized (componentTree) {
                List list = componentTree.e;
                if (list != null) {
                    list.remove(czjVar);
                }
            }
        }
    }

    public final void g(cyv cyvVar, int i, int i2) {
        h(cyvVar, i, i2, null);
    }

    public final void h(cyv cyvVar, int i, int i2, czj czjVar) {
        synchronized (this) {
            if (this.b.k()) {
                return;
            }
            this.q = i;
            this.r = i2;
            u(cyvVar);
            ComponentTree componentTree = this.o;
            cyr b = this.b.b();
            dlj dljVar = this.b;
            aflw aflwVar = dljVar instanceof dmh ? ((dmh) dljVar).a : null;
            if (czjVar != null) {
                componentTree.g(czjVar);
            }
            if (b == null) {
                throw new IllegalArgumentException("Root component can't be null");
            }
            componentTree.x(b, i, i2, true, null, 1, aflwVar);
            synchronized (this) {
                if (this.o == componentTree && b == this.b.b()) {
                    this.j = true;
                }
            }
        }
    }

    public final void i(cyv cyvVar, int i, int i2, ddj ddjVar) {
        synchronized (this) {
            if (this.b.k()) {
                return;
            }
            this.q = i;
            this.r = i2;
            u(cyvVar);
            ComponentTree componentTree = this.o;
            cyr b = this.b.b();
            dlj dljVar = this.b;
            aflw aflwVar = dljVar instanceof dmh ? ((dmh) dljVar).a : null;
            if (b == null) {
                throw new IllegalArgumentException("Root component can't be null");
            }
            componentTree.x(b, i, i2, false, ddjVar, 0, aflwVar);
            synchronized (this) {
                if (componentTree == this.o && b == this.b.b()) {
                    this.j = true;
                    if (ddjVar != null) {
                        this.n = ddjVar.b;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j() {
        this.j = false;
    }

    public final synchronized void k() {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            componentTree.o();
            this.o = null;
            this.b.f();
        }
        this.j = false;
    }

    public final synchronized void l(boolean z) {
        this.l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void m(int i) {
        this.n = i;
    }

    public final synchronized void n(dlj dljVar) {
        j();
        this.b = dljVar;
    }

    public final synchronized boolean o() {
        boolean z = false;
        if (!this.b.k()) {
            ComponentTree componentTree = this.o;
            if (componentTree != null) {
                if (!componentTree.r(this.q, this.r)) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    public final synchronized boolean p() {
        return this.l;
    }

    public final synchronized boolean q() {
        return this.j;
    }

    public final synchronized boolean r(int i, int i2) {
        boolean z;
        if (q() && this.q == i) {
            if (this.r == i2) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s(dkj dkjVar) {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            componentTree.A = dkjVar;
        } else {
            this.t = dkjVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t(int i, int i2, int i3) {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            componentTree.v(i, i2, i3);
        }
    }
}
