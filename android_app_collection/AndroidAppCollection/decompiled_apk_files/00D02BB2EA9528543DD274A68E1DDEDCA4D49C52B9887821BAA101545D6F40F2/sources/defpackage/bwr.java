package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bwr  reason: default package */
/* loaded from: classes.dex */
public final class bwr<R> implements bvv, cjv {
    private static final bwo o = new bwo();
    public final bwu c;
    public final bws d;
    public btw e;
    public boolean f;
    public bxd<?> g;
    public boolean h;
    bwx i;
    public boolean j;
    bwv<?> k;
    public volatile boolean l;
    public boolean m;
    int n;
    private final my<bwr<?>> p;
    private final bza q;
    private final bza r;
    private final bza s;
    private boolean u;
    private bvz<R> v;
    final bwq a = new bwq(new ArrayList(2));
    public final cjz b = cjz.c();
    private final AtomicInteger t = new AtomicInteger();

    public bwr(bza bzaVar, bza bzaVar2, bza bzaVar3, bws bwsVar, bwu bwuVar, my<bwr<?>> myVar) {
        this.q = bzaVar;
        this.r = bzaVar2;
        this.s = bzaVar3;
        this.d = bwsVar;
        this.c = bwuVar;
        this.p = myVar;
    }

    private final bza j() {
        return this.u ? this.s : this.r;
    }

    private final boolean k() {
        return this.j || this.h || this.l;
    }

    @Override // defpackage.cjv
    public final cjz Nk() {
        return this.b;
    }

    @Override // defpackage.bvv
    public final void a(bvz<?> bvzVar) {
        j().execute(bvzVar);
    }

    public final synchronized void c(bvz<R> bvzVar) {
        bza bzaVar;
        this.v = bvzVar;
        int f = bvzVar.f(1);
        if (f != 2 && f != 3) {
            bzaVar = j();
            bzaVar.execute(bvzVar);
        }
        bzaVar = this.q;
        bzaVar.execute(bvzVar);
    }

    public final synchronized void d(chx chxVar, Executor executor) {
        this.b.a();
        this.a.a.add(new bwp(chxVar, executor));
        if (this.h) {
            f(1);
            executor.execute(new bwn(this, chxVar));
        } else if (this.j) {
            f(1);
            executor.execute(new bwm(this, chxVar));
        } else {
            cjn.a(!this.l, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public final synchronized void e(chx chxVar) {
        this.b.a();
        this.a.a.remove(bwq.e(chxVar));
        if (this.a.b()) {
            if (!k()) {
                this.l = true;
                bvz<R> bvzVar = this.v;
                bvzVar.o = true;
                bvt bvtVar = bvzVar.n;
                if (bvtVar != null) {
                    bvtVar.b();
                }
                this.d.b(this, this.e);
            }
            if ((this.h || this.j) && this.t.get() == 0) {
                h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(int i) {
        bwv<?> bwvVar;
        cjn.a(k(), "Not yet complete!");
        if (this.t.getAndAdd(i) != 0 || (bwvVar = this.k) == null) {
            return;
        }
        bwvVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        bwv<?> bwvVar;
        synchronized (this) {
            this.b.a();
            cjn.a(k(), "Not yet complete!");
            int decrementAndGet = this.t.decrementAndGet();
            cjn.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                bwvVar = this.k;
                h();
            } else {
                bwvVar = null;
            }
        }
        if (bwvVar != null) {
            bwvVar.f();
        }
    }

    public final synchronized void h() {
        if (this.e == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.e = null;
        this.k = null;
        this.g = null;
        this.j = false;
        this.l = false;
        this.h = false;
        this.m = false;
        bvz<R> bvzVar = this.v;
        if (bvzVar.c.d()) {
            bvzVar.a();
        }
        this.v = null;
        this.i = null;
        this.n = 0;
        this.p.b(this);
    }

    public final synchronized void i(btw btwVar, boolean z, boolean z2) {
        this.e = btwVar;
        this.f = z;
        this.u = z2;
    }
}
