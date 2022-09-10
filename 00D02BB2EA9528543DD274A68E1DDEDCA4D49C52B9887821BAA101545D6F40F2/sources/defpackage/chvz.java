package defpackage;
/* compiled from: PG */
/* renamed from: chvz  reason: default package */
/* loaded from: classes4.dex */
public final class chvz extends dsqp<chxl, chvz> implements dssk {
    public chvz() {
        super(chxl.x);
    }

    public final void a(Iterable<? extends chwj> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxl chxlVar = (chxl) this.b;
        chxl chxlVar2 = chxl.x;
        dsrj<chwj> dsrjVar = chxlVar.r;
        if (!dsrjVar.a()) {
            chxlVar.r = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, chxlVar.r);
    }

    public final void b(Iterable<? extends chxk> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxl chxlVar = (chxl) this.b;
        chxl chxlVar2 = chxl.x;
        chxlVar.c();
        dsod.bv(iterable, chxlVar.u);
    }

    public final void c(chxi chxiVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxl chxlVar = (chxl) this.b;
        chxk bK = chxiVar.bK();
        chxl chxlVar2 = chxl.x;
        bK.getClass();
        chxlVar.c();
        chxlVar.u.add(bK);
    }

    public final void d(chxk chxkVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxl chxlVar = (chxl) this.b;
        chxl chxlVar2 = chxl.x;
        chxkVar.getClass();
        chxlVar.c();
        chxlVar.u.add(chxkVar);
    }

    public final void e(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxl chxlVar = (chxl) this.b;
        chxl chxlVar2 = chxl.x;
        chxlVar.c();
        chxlVar.u.remove(i);
    }

    public final void f(int i, chxk chxkVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxl chxlVar = (chxl) this.b;
        chxl chxlVar2 = chxl.x;
        chxkVar.getClass();
        chxlVar.c();
        chxlVar.u.set(i, chxkVar);
    }
}
