package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rkq  reason: default package */
/* loaded from: classes7.dex */
public class rkq implements rjz {
    private final Activity a;
    @dzsi
    private final qyp b;
    @dzsi
    private final rkw c;
    @dzsi
    private final rkk d;
    private final Executor e;
    @dzsi
    private final Runnable f;

    public rkq(Activity activity, qyq qyqVar, rkx rkxVar, rkl rklVar, cqhn cqhnVar, Executor executor, @dzsi quz quzVar, @dzsi Runnable runnable, qvb qvbVar, boolean z, boolean z2, boolean z3) {
        qyp qypVar;
        rkw rkwVar;
        rkk rkkVar;
        this.a = activity;
        this.e = executor;
        this.f = runnable;
        if (z) {
            Runnable runnable2 = new Runnable(this) { // from class: rkm
                private final rkq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            };
            Application a = qyqVar.a.a();
            qyq.a(a, 1);
            qyh a2 = qyqVar.b.a();
            qyq.a(a2, 2);
            bsvm a3 = qyqVar.c.a();
            qyq.a(a3, 3);
            dxio a4 = ((dxjh) qyqVar.d).a();
            qyq.a(a4, 4);
            axws a5 = qyqVar.e.a();
            qyq.a(a5, 5);
            dxio a6 = ((dxjh) qyqVar.f).a();
            qyq.a(a6, 6);
            dxio a7 = ((dxjh) qyqVar.g).a();
            qyq.a(a7, 7);
            Executor a8 = qyqVar.h.a();
            qyq.a(a8, 8);
            qyg a9 = qyqVar.i.a();
            qyq.a(a9, 9);
            btvo a10 = qyqVar.j.a();
            qyq.a(a10, 10);
            dxio a11 = ((dxjh) qyqVar.k).a();
            qyq.a(a11, 11);
            qyq.a(quzVar, 12);
            qyq.a(runnable2, 13);
            qypVar = new qyp(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, quzVar, runnable2);
        } else {
            qypVar = null;
        }
        this.b = qypVar;
        if (qypVar != null) {
            qypVar.l(qvbVar);
        }
        if (z2) {
            Runnable runnable3 = new Runnable(this) { // from class: rkn
                private final rkq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            };
            Activity activity2 = (Activity) ((dxjd) rkxVar.a).a;
            rkx.a(activity2, 1);
            Executor a12 = rkxVar.b.a();
            rkx.a(a12, 2);
            btvo a13 = rkxVar.c.a();
            rkx.a(a13, 3);
            dxio a14 = ((dxjh) rkxVar.d).a();
            rkx.a(a14, 4);
            dxio a15 = ((dxjh) rkxVar.e).a();
            rkx.a(a15, 5);
            rkwVar = new rkw(activity2, a12, a13, a14, a15, quzVar, runnable3);
        } else {
            rkwVar = null;
        }
        this.c = rkwVar;
        if (z3) {
            Runnable runnable4 = new Runnable(this) { // from class: rko
                private final rkq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            };
            Activity activity3 = (Activity) ((dxjd) rklVar.a).a;
            rkl.a(activity3, 1);
            rkg a16 = rklVar.b.a();
            rkl.a(a16, 2);
            dxio a17 = ((dxjh) rklVar.c).a();
            rkl.a(a17, 3);
            dxio a18 = ((dxjh) rklVar.d).a();
            rkl.a(a18, 4);
            dxio a19 = ((dxjh) rklVar.e).a();
            rkl.a(a19, 5);
            rkl.a(qvbVar, 7);
            rkkVar = new rkk(activity3, a16, a17, a18, a19, runnable4, qvbVar);
        } else {
            rkkVar = null;
        }
        this.d = rkkVar;
    }

    @Override // defpackage.rjz
    public Boolean a() {
        qye b = b();
        rkb c = c();
        rjy d = d();
        boolean z = false;
        if (b == null && c == null && d == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.rjz
    @dzsi
    public qye b() {
        qyp qypVar = this.b;
        if (qypVar == null || qypVar.n()) {
            return null;
        }
        return this.b;
    }

    @Override // defpackage.rjz
    @dzsi
    public rkb c() {
        rkw rkwVar;
        if (b() == null && (rkwVar = this.c) != null && !rkwVar.e() && !btpf.c(this.a).f) {
            return this.c;
        }
        return null;
    }

    @Override // defpackage.rjz
    @dzsi
    public rjy d() {
        rkk rkkVar;
        if (b() != null || c() != null || (rkkVar = this.d) == null || rkkVar.h() || btpf.c(this.a).f) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.rjz
    public Boolean e() {
        return false;
    }

    public final void f() {
        cqkx.p(this);
        this.f.run();
    }

    public void g(int i) {
        this.e.execute(new Runnable(this) { // from class: rkp
            private final rkq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        });
    }
}
