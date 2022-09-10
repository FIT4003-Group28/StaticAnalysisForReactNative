package defpackage;

import android.app.Activity;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chny  reason: default package */
/* loaded from: classes4.dex */
public final class chny implements crzp<chtu> {
    public final crzo<chty> a;
    public final crzo<chvi> b;
    chnx c;
    eaol d;
    final ArrayDeque<chnx> e;
    private final bvrb f;
    private final Activity g;
    private final cpv h;
    private chtu i;

    public chny(bvrb bvrbVar, Activity activity, cpv cpvVar, Executor executor, crzm<chtu> crzmVar) {
        this.f = bvrbVar;
        this.g = activity;
        this.h = cpvVar;
        choa choaVar = new choa();
        choaVar.a = 0L;
        chvf bZ = chvi.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chvi chviVar = (chvi) bZ.b;
        chviVar.b = 0;
        chviVar.a |= 1;
        choaVar.c(bZ.bK());
        chtv bZ2 = chty.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        chty chtyVar = (chty) bZ2.b;
        chtyVar.b = 0;
        chtyVar.a |= 1;
        choaVar.b(bZ2.bK());
        this.c = choaVar.a();
        this.d = eaol.a();
        this.e = dclw.a();
        this.a = new crzo<>(chty.e);
        this.b = new crzo<>(chvi.f);
        chtu l = crzmVar.l();
        dbsk.s(l);
        this.i = l;
        crzmVar.b(this, executor);
    }

    @Override // defpackage.crzp
    public final void On(crzm<chtu> crzmVar) {
        chtu l = crzmVar.l();
        dbsk.s(l);
        this.i = l;
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, String str2) {
        chtv bZ = chty.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chty chtyVar = (chty) bZ.b;
        str.getClass();
        int i = chtyVar.a | 2;
        chtyVar.a = i;
        chtyVar.c = str;
        str2.getClass();
        chtyVar.a = i | 4;
        chtyVar.d = str2;
        chty bK = bZ.bK();
        chnx d = d();
        chnw d2 = chnx.d(d);
        ((choa) d2).a = 300L;
        dsqp dsqpVar = (dsqp) bK.cu(5);
        dsqpVar.bC(bK);
        chtv chtvVar = (chtv) dsqpVar;
        if (chtvVar.c) {
            chtvVar.bF();
            chtvVar.c = false;
        }
        chty chtyVar2 = (chty) chtvVar.b;
        chtyVar2.b = 2;
        chtyVar2.a |= 1;
        d2.b(chtvVar.bK());
        chnx a = d2.a();
        chnw d3 = chnx.d(d);
        ((choa) d3).a = Long.valueOf(eaow.e(true != this.h.d(this.g) ? 3000L : 30000L).b);
        dsqp dsqpVar2 = (dsqp) bK.cu(5);
        dsqpVar2.bC(bK);
        chtv chtvVar2 = (chtv) dsqpVar2;
        if (chtvVar2.c) {
            chtvVar2.bF();
            chtvVar2.c = false;
        }
        chty chtyVar3 = (chty) chtvVar2.b;
        chtyVar3.b = 1;
        chtyVar3.a |= 1;
        d3.b(chtvVar2.bK());
        chnx a2 = d3.a();
        chnw d4 = chnx.d(d);
        ((choa) d4).a = 200L;
        dsqp dsqpVar3 = (dsqp) bK.cu(5);
        dsqpVar3.bC(bK);
        chtv chtvVar3 = (chtv) dsqpVar3;
        if (chtvVar3.c) {
            chtvVar3.bF();
            chtvVar3.c = false;
        }
        chty chtyVar4 = (chty) chtvVar3.b;
        chtyVar4.b = 3;
        chtyVar4.a |= 1;
        d4.b(chtvVar3.bK());
        chnx a3 = d4.a();
        chnw d5 = chnx.d(d);
        ((choa) d5).a = 0L;
        chtv bZ2 = chty.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        chty chtyVar5 = (chty) bZ2.b;
        chtyVar5.b = 0;
        chtyVar5.a |= 1;
        d5.b(bZ2.bK());
        this.e.addAll(dcdc.i(a, a2, a3, d5.a()));
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ArrayDeque<chnx> arrayDeque = this.e;
        chnw d = chnx.d(d());
        ((choa) d).a = 0L;
        chvf bZ = chvi.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chvi chviVar = (chvi) bZ.b;
        chviVar.b = 2;
        int i = chviVar.a | 1;
        chviVar.a = i;
        int i2 = this.i.b;
        chviVar.a = 2 | i;
        chviVar.c = i2;
        d.c(bZ.bK());
        arrayDeque.add(d.a());
        e();
    }

    public final chnx d() {
        return (chnx) dbsg.j(this.e.peekLast()).c(this.c);
    }

    public final void e() {
        if (!this.d.I(eaor.a())) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        int i;
        chnx d = d();
        int a = chvh.a(d.c().b);
        if (a == 0 || a == 1 || (i = this.i.b) == d.c().c) {
            return;
        }
        if (i > d.c().c) {
            chnx d2 = d();
            int i2 = d2.c().c;
            int i3 = this.i.b;
            chnw d3 = chnx.d(d2);
            ((choa) d3).a = 1000L;
            chvf bZ = chvi.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chvi chviVar = (chvi) bZ.b;
            chviVar.b = 1;
            int i4 = chviVar.a | 1;
            chviVar.a = i4;
            int i5 = i4 | 2;
            chviVar.a = i5;
            chviVar.c = i2;
            chviVar.a = i5 | 4;
            chviVar.d = i3;
            d3.c(bZ.bK());
            chnx a2 = d3.a();
            chnw d4 = chnx.d(a2);
            ((choa) d4).a = 0L;
            chvf bZ2 = chvi.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chvi chviVar2 = (chvi) bZ2.b;
            chviVar2.b = 2;
            int i6 = 1 | chviVar2.a;
            chviVar2.a = i6;
            chviVar2.a = i6 | 2;
            chviVar2.c = i3;
            d4.c(bZ2.bK());
            this.e.addAll(dcdc.g(a2, d4.a()));
            e();
            return;
        }
        c();
    }

    public final void g() {
        if (this.e.isEmpty()) {
            return;
        }
        this.c = this.e.pop();
        this.d = eaol.a().j(eaow.e(this.c.a().longValue()));
        this.f.a(new Runnable(this) { // from class: chnv
            private final chny a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        }, bvrj.UI_THREAD, this.c.a().longValue());
        this.a.b(this.c.b());
        this.b.b(this.c.c());
    }
}
