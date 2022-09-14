package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: alow  reason: default package */
/* loaded from: classes.dex */
public class alow implements alsn {
    private final int a;
    private final List<Runnable> b;
    @dzsi
    protected final alxp c;
    protected final alrk d;
    protected final long e;
    protected final int f;
    boolean g;
    private final AtomicReference<dcep<amgj>> h;
    private boolean i;

    public alow(alrk alrkVar, long j) {
        this.g = false;
        this.b = dchl.a();
        this.h = new AtomicReference<>(dcmr.a);
        this.d = alrkVar;
        this.e = j;
        this.f = -1;
        this.c = null;
        this.a = m();
    }

    private final int m() {
        return Arrays.hashCode(new Object[]{this.d.c, Integer.valueOf(this.f), Long.valueOf(this.e)});
    }

    private final boolean n(@dzsi Runnable runnable) {
        synchronized (this) {
            if (this.g) {
                return true;
            }
            if (i() == null) {
                return o(runnable);
            }
            if (!this.i) {
                return o(runnable);
            }
            synchronized (this) {
                this.g = true;
            }
            return true;
        }
    }

    private final synchronized boolean o(@dzsi Runnable runnable) {
        if (this.g) {
            return true;
        }
        if (runnable != null) {
            this.b.add(runnable);
        }
        return false;
    }

    private static void p(alxl alxlVar, dcen<amgj> dcenVar) {
        if (!alxlVar.h.d()) {
            dcenVar.b(alxlVar.h);
        }
        if (!alxlVar.i.d()) {
            dcenVar.b(alxlVar.i);
        }
        if (!alxlVar.j.d()) {
            dcenVar.b(alxlVar.j);
        }
    }

    @Override // defpackage.akuh
    public int a() {
        return this.f;
    }

    @Override // defpackage.akuh
    @dzsi
    public final dmpz b() {
        return null;
    }

    @Override // defpackage.akuh
    public final void c(Runnable runnable) {
        if (n(runnable)) {
            runnable.run();
        }
    }

    @Override // defpackage.akuh
    public dmqx d() {
        return dmqx.e;
    }

    @Override // defpackage.akuh
    public dmpc e() {
        if (this.e != -1) {
            dmpc dmpcVar = (dmpc) dmpd.h.bZ();
            long j = this.e;
            if (dmpcVar.c) {
                dmpcVar.bF();
                dmpcVar.c = false;
            }
            dmpd dmpdVar = (dmpd) dmpcVar.b;
            dmpdVar.a |= 4;
            dmpdVar.d = j;
            return dmpcVar;
        }
        dmpc dmpcVar2 = (dmpc) dmpd.h.bZ();
        int a = a();
        if (dmpcVar2.c) {
            dmpcVar2.bF();
            dmpcVar2.c = false;
        }
        dmpd dmpdVar2 = (dmpd) dmpcVar2.b;
        dmpdVar2.a |= 2;
        dmpdVar2.c = a;
        return dmpcVar2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof alow) {
            alow alowVar = (alow) obj;
            if (this.d.c.equals(alowVar.d.c) && this.e == alowVar.e && this.f == alowVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akuh
    public dmpe f() {
        if (this.e != -1) {
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            long j = this.e;
            if (dmpeVar.c) {
                dmpeVar.bF();
                dmpeVar.c = false;
            }
            dmph dmphVar = (dmph) dmpeVar.b;
            dmphVar.a |= 2;
            dmphVar.d = j;
            return dmpeVar;
        }
        dmpe dmpeVar2 = (dmpe) dmph.f.bZ();
        int a = a();
        if (dmpeVar2.c) {
            dmpeVar2.bF();
            dmpeVar2.c = false;
        }
        dmph dmphVar2 = (dmph) dmpeVar2.b;
        dmphVar2.a |= 1;
        dmphVar2.c = a;
        return dmpeVar2;
    }

    @Override // defpackage.akuh
    public dmpk g() {
        if (this.e != -1) {
            dmpk dmpkVar = (dmpk) dmpn.r.bZ();
            long j = this.e;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar = (dmpn) dmpkVar.b;
            dmpnVar.a |= 4096;
            dmpnVar.l = j;
            return dmpkVar;
        }
        dmpk dmpkVar2 = (dmpk) dmpn.r.bZ();
        int a = a();
        if (dmpkVar2.c) {
            dmpkVar2.bF();
            dmpkVar2.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar2.b;
        dmpnVar2.a |= 2048;
        dmpnVar2.k = a;
        return dmpkVar2;
    }

    public void h() {
    }

    public final int hashCode() {
        return this.a;
    }

    public alxp i() {
        synchronized (this) {
            long j = this.e;
            if (j != -1) {
                return this.d.i(j);
            }
            alxp alxpVar = this.c;
            if (alxpVar != null && alxpVar != alxp.e) {
                return alxpVar;
            }
            int i = this.f;
            if (i == -1) {
                return alxp.e;
            }
            return this.d.i(i);
        }
    }

    public final void j(boolean z) {
        this.i = z;
        synchronized (this) {
            if (!n(null)) {
                return;
            }
            this.g = true;
            dcdc r = dcdc.r(this.b);
            this.b.clear();
            int size = r.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) r.get(i)).run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcep<amgj> k() {
        alxo[] alxoVarArr;
        dcen N = dcep.N();
        alxp i = i();
        for (int i2 = 0; i2 < i.h(); i2++) {
            alxo alxoVar = i.b[akn.b(i2, 0, alxoVarArr.length - 1)];
            for (alxl alxlVar : alxoVar.o) {
                p(alxlVar, N);
            }
            for (alxl alxlVar2 : alxoVar.n) {
                p(alxlVar2, N);
            }
            if (!alxoVar.I.d()) {
                N.b(alxoVar.I);
            }
        }
        return N.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcep<amgj> l(dcep<amgj> dcepVar) {
        return this.h.getAndSet(dcepVar);
    }

    @Override // defpackage.alsn
    public final boolean q(akuh akuhVar, boolean z) {
        alxl[] alxlVarArr;
        for (int i = 0; i < 22; i++) {
            if (!(akuhVar instanceof alow)) {
                return false;
            }
            alxo c = i().c(i);
            alxo c2 = ((alow) akuhVar).i().c(i);
            if (c.E != c2.E || alww.h(c.G, 1) != alww.h(c2.G, 1)) {
                return false;
            }
            alxl[] alxlVarArr2 = z ? c.n : c.o;
            if (z) {
                alxlVarArr = c2.n;
            } else {
                alxlVarArr = c2.o;
            }
            if (alxlVarArr2.length != alxlVarArr.length) {
                return false;
            }
            for (int i2 = 0; i2 < alxlVarArr2.length; i2++) {
                alxl alxlVar = alxlVarArr2[i2];
                alxl alxlVar2 = alxlVarArr[i2];
                if (alxlVar.c != 0.0f && alxlVar2.c != 0.0f && (!alxlVar.h.equals(alxlVar2.h) || !alxlVar.i.equals(alxlVar2.i) || !alxlVar.j.equals(alxlVar2.j) || alxlVar.e != alxlVar2.e || alxlVar.f != alxlVar2.f)) {
                    return false;
                }
            }
        }
        return true;
    }

    public alow(alrk alrkVar, alxp alxpVar, int i) {
        this(alrkVar, alxpVar, i, dcmr.a);
    }

    public alow(alrk alrkVar, alxp alxpVar, int i, dcep<amgj> dcepVar) {
        this.g = false;
        this.b = dchl.a();
        AtomicReference<dcep<amgj>> atomicReference = new AtomicReference<>(dcmr.a);
        this.h = atomicReference;
        this.d = alrkVar;
        this.c = alxpVar;
        this.e = -1L;
        this.f = i;
        this.a = m();
        atomicReference.set(dcepVar);
    }
}
