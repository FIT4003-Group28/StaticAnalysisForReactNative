package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: amls  reason: default package */
/* loaded from: classes2.dex */
public final class amls extends amlq {
    private final ammr b;
    private final ammd c;
    private final akpq g;
    private final bnsn h;
    private final amlw a = new amlw();
    private final Runnable d = new Runnable(this) { // from class: amlr
        private final amls a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a();
        }
    };
    private boolean e = false;
    private final bntp f = bntp.POLYLINE;

    public amls(alwo[] alwoVarArr, amme ammeVar, bnsn bnsnVar, akpq akpqVar) {
        this.c = ammeVar;
        this.h = bnsnVar;
        this.g = akpqVar;
        this.b = new amms(ammeVar, alwoVarArr);
    }

    public final synchronized void a() {
        if (!this.e) {
            return;
        }
        bnrr bnrrVar = this.h.h;
        dbsk.s(bnrrVar);
        if (this.a.a((akzh) bnrrVar)) {
            this.b.a((akzh) bnrrVar, this.a);
            this.g.d();
        }
        this.c.g((akzh) bnrrVar, this.a.a);
        this.g.e(this.d);
    }

    public final synchronized void b() {
        this.c.a();
        this.e = false;
    }

    public final synchronized void c() {
        bnrr bnrrVar = this.h.h;
        dbsk.s(bnrrVar);
        this.c.d();
        this.c.g((akzh) bnrrVar, this.a.a);
        ammd ammdVar = this.c;
        amxe amxeVar = ((amme) ammdVar).h;
        if (amxeVar != null && ((amme) ammdVar).i != null) {
            ((amme) ammdVar).e.h(amxeVar);
            ((amme) ammdVar).e.i(((amme) ammdVar).i, ((amme) ammdVar).g);
            ((amme) ammdVar).x = true;
        }
        this.g.e(this.d);
        this.g.d();
    }

    public final synchronized void d() {
        this.c.i();
        this.g.d();
    }

    @Override // defpackage.amlq
    public final void f() {
        this.g.d();
    }

    @Override // defpackage.amlq
    public final void j() {
        b();
    }

    @Override // defpackage.amlq
    public final synchronized void l() {
        this.c.l();
        ammr ammrVar = this.b;
        ArrayList a = dchl.a();
        for (amlp amlpVar : ((amms) ammrVar).b) {
            a.add(amlpVar.a);
        }
        amme ammeVar = ((amms) ammrVar).a;
        dbsk.s(ammeVar.i);
        amxm amxmVar = new amxm(ammeVar.r, a);
        synchronized (ammeVar.j) {
            ammeVar.k = new amxp(true, false, amxmVar, algr.a, new Object[]{ammeVar.g}, ammeVar.s);
            if (ammeVar.l) {
                ammeVar.i.n = ammeVar.k;
            }
        }
        this.e = true;
        Object obj = this.h.h;
        if (obj != null) {
            if (!bnuq.b()) {
                obj = ((akzh) obj).b();
            }
            if (this.a.a((akzh) obj)) {
                this.b.a((akzh) obj, this.a);
            }
            this.c.g((akzh) obj, this.a.a);
        }
        this.g.e(this.d);
        this.g.d();
    }
}
