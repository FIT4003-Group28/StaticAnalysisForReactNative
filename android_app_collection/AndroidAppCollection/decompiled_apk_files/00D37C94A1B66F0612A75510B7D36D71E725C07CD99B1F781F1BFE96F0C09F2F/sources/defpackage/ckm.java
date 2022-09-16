package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ckm  reason: default package */
/* loaded from: classes2.dex */
public final class ckm implements cjt, cvi {
    public chy c;
    public boolean d;
    public cku e;
    public boolean f;
    ckq g;
    public boolean h;
    cko i;
    public volatile boolean j;
    int k;
    public final cki l;
    public final cki m;
    private final jk n;
    private final cmm o;
    private final cmm p;
    private final cmm q;
    private boolean s;
    private cjw t;
    final ckl a = new ckl(new ArrayList(2));
    public final cvl b = cvl.a();
    private final AtomicInteger r = new AtomicInteger();

    public ckm(cmm cmmVar, cmm cmmVar2, cmm cmmVar3, cki ckiVar, cki ckiVar2, jk jkVar) {
        this.o = cmmVar;
        this.p = cmmVar2;
        this.q = cmmVar3;
        this.m = ckiVar;
        this.l = ckiVar2;
        this.n = jkVar;
    }

    private final cmm i() {
        return this.s ? this.q : this.p;
    }

    private final boolean j() {
        return this.h || this.f || this.j;
    }

    public final synchronized void b(ctn ctnVar, Executor executor) {
        this.b.b();
        this.a.a.add(new ckk(ctnVar, executor));
        if (this.f) {
            d(1);
            executor.execute(new ckj(this, ctnVar));
        } else if (this.h) {
            d(1);
            executor.execute(new ckj(this, ctnVar, 1));
        } else {
            hy.O(!this.j, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        cko ckoVar;
        synchronized (this) {
            this.b.b();
            hy.O(j(), "Not yet complete!");
            int decrementAndGet = this.r.decrementAndGet();
            hy.O(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                ckoVar = this.i;
                e();
            } else {
                ckoVar = null;
            }
        }
        if (ckoVar != null) {
            ckoVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(int i) {
        cko ckoVar;
        hy.O(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (ckoVar = this.i) == null) {
            return;
        }
        ckoVar.d();
    }

    public final synchronized void e() {
        if (this.c == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.c = null;
        this.i = null;
        this.e = null;
        this.h = false;
        this.j = false;
        this.f = false;
        cjw cjwVar = this.t;
        if (cjwVar.c.d()) {
            cjwVar.b();
        }
        this.t = null;
        this.g = null;
        this.k = 0;
        this.n.b(this);
    }

    public final synchronized void f(ctn ctnVar) {
        this.b.b();
        this.a.a.remove(ckl.b(ctnVar));
        if (this.a.e()) {
            if (!j()) {
                this.j = true;
                cjw cjwVar = this.t;
                cjwVar.o = true;
                cjr cjrVar = cjwVar.n;
                if (cjrVar != null) {
                    cjrVar.a();
                }
                this.m.a(this, this.c);
            }
            if ((this.f || this.h) && this.r.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void g(cjw cjwVar) {
        cmm cmmVar;
        this.t = cjwVar;
        int f = cjwVar.f(1);
        if (f != 2 && f != 3) {
            cmmVar = i();
            cmmVar.execute(cjwVar);
        }
        cmmVar = this.o;
        cmmVar.execute(cjwVar);
    }

    public final synchronized void h(chy chyVar, boolean z, boolean z2) {
        this.c = chyVar;
        this.d = z;
        this.s = z2;
    }

    @Override // defpackage.cjt
    public final void jW(cjw cjwVar) {
        i().execute(cjwVar);
    }

    @Override // defpackage.cvi
    public final cvl jX() {
        return this.b;
    }
}
