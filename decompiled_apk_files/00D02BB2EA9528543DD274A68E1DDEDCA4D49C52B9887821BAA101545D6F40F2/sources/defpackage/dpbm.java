package defpackage;
/* compiled from: PG */
/* renamed from: dpbm  reason: default package */
/* loaded from: classes6.dex */
public final class dpbm extends dsqp<dpbp, dpbm> implements dssk {
    public dpbm() {
        super(dpbp.i);
    }

    public final dpdy a(int i) {
        return ((dpbp) this.b).c.get(i);
    }

    public final void b(dpdr dpdrVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpbp dpbpVar = (dpbp) this.b;
        dpdy bK = dpdrVar.bK();
        dpbp dpbpVar2 = dpbp.i;
        bK.getClass();
        dpbpVar.b();
        dpbpVar.c.add(bK);
    }

    public final void c(int i, dpdr dpdrVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpbp dpbpVar = (dpbp) this.b;
        dpdy bK = dpdrVar.bK();
        dpbp dpbpVar2 = dpbp.i;
        bK.getClass();
        dpbpVar.b();
        dpbpVar.c.set(i, bK);
    }

    public final void d(int i, dpdy dpdyVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpbp dpbpVar = (dpbp) this.b;
        dpbp dpbpVar2 = dpbp.i;
        dpdyVar.getClass();
        dpbpVar.b();
        dpbpVar.c.set(i, dpdyVar);
    }
}
