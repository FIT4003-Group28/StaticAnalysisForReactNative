package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: djo  reason: default package */
/* loaded from: classes6.dex */
public final class djo {
    public boolean a;
    public boolean b;
    public final z<dad> c;
    public final deia d;
    @dzsi
    public akqq e;
    private final ScheduledExecutorService f;
    private final dol g;
    private final djn h;
    @dzsi
    private volatile ScheduledFuture<?> i;

    public djo(btrm btrmVar, cqat cqatVar, dehq dehqVar, dol dolVar) {
        deia a = deia.a(1.0d);
        deia a2 = deia.a(30.0d);
        deia a3 = deia.a(2.0d);
        this.a = false;
        this.b = false;
        this.c = new z<>();
        this.f = dehqVar;
        this.g = dolVar;
        this.d = a3;
        this.h = new djn(btrmVar, cqatVar, a, a2);
    }

    public final void a(@dzsi dad dadVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(true);
        this.c.g(dadVar);
        if (dadVar == null) {
            this.g.a(4, "No earth pose");
            return;
        }
        this.g.b(4, new dok() { // from class: djk
        });
        if (this.e == null) {
            this.e = dadVar.f();
        }
        this.g.b(9, new dok() { // from class: djl
        });
    }

    public final void b(final dflf dflfVar, boolean z) {
        if (dflfVar == null) {
            return;
        }
        this.c.c(this.h);
        if (!z) {
            return;
        }
        this.i = this.f.scheduleAtFixedRate(new Runnable(this, dflfVar) { // from class: djm
            private final djo a;
            private final dflf b;

            {
                this.a = this;
                this.b = dflfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                djo djoVar = this.a;
                dflf dflfVar2 = this.b;
                if (djoVar.a) {
                    return;
                }
                if (!djoVar.b && !djoVar.d.c()) {
                    return;
                }
                dflfVar2.d(null);
                dfle f = dflfVar2.f();
                if (f == null) {
                    return;
                }
                djoVar.a(djo.d(f));
            }
        }, 30L, 30L, TimeUnit.MILLISECONDS);
    }

    public final void c() {
        if (this.i != null) {
            this.i.cancel(true);
            this.i = null;
        }
        this.c.d(this.h);
    }

    @dzsi
    public static dad d(@dzsi dfle dfleVar) {
        if (dfleVar == null) {
            return null;
        }
        int j = dfleVar.j();
        int i = j - 1;
        if (j == 0) {
            throw null;
        }
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? i != 4 ? 1 : 6 : 5 : 4;
        }
        dfkx bZ = dfla.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfla dflaVar = (dfla) bZ.b;
        dflaVar.b = i2 - 1;
        dflaVar.a |= 1;
        double d = dfleVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfla dflaVar2 = (dfla) bZ.b;
        dflaVar2.a |= 4;
        dflaVar2.d = d;
        double i3 = dfleVar.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfla dflaVar3 = (dfla) bZ.b;
        dflaVar3.a |= 2;
        dflaVar3.c = i3;
        dfla bK = bZ.bK();
        dszd bZ2 = dsze.d.bZ();
        dsyz bZ3 = dsza.e.bZ();
        double a = dfleVar.a();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dsza dszaVar = (dsza) bZ3.b;
        dszaVar.a |= 1;
        dszaVar.b = a;
        double b = dfleVar.b();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dsza dszaVar2 = (dsza) bZ3.b;
        dszaVar2.a |= 2;
        dszaVar2.c = b;
        double c = dfleVar.c();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dsza dszaVar3 = (dsza) bZ3.b;
        dszaVar3.a |= 4;
        dszaVar3.d = c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsze dszeVar = (dsze) bZ2.b;
        dsza bK2 = bZ3.bK();
        bK2.getClass();
        dszeVar.b = bK2;
        dszeVar.a |= 1;
        dszb bZ4 = dszc.e.bZ();
        double f = dfleVar.f();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dszc dszcVar = (dszc) bZ4.b;
        dszcVar.a = 1 | dszcVar.a;
        dszcVar.b = f;
        double g = dfleVar.g();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dszc dszcVar2 = (dszc) bZ4.b;
        dszcVar2.a |= 2;
        dszcVar2.c = g;
        double h = dfleVar.h();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dszc dszcVar3 = (dszc) bZ4.b;
        dszcVar3.a = 4 | dszcVar3.a;
        dszcVar3.d = h;
        dszc bK3 = bZ4.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsze dszeVar2 = (dsze) bZ2.b;
        bK3.getClass();
        dszeVar2.c = bK3;
        dszeVar2.a |= 2;
        return dad.h(bZ2.bK(), bK, dfleVar.e());
    }
}
