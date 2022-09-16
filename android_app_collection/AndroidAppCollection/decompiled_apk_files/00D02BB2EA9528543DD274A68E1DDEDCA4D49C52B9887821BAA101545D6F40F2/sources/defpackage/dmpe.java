package defpackage;
/* compiled from: PG */
/* renamed from: dmpe  reason: default package */
/* loaded from: classes6.dex */
public final class dmpe extends dsqr<dmph, dmpe> implements dsqt {
    public dmpe() {
        super(dmph.f);
    }

    public final void a(Iterable<? extends dmpd> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmph dmphVar = (dmph) this.b;
        dmph dmphVar2 = dmph.f;
        dmphVar.b();
        dsod.bv(iterable, dmphVar.b);
    }

    public final void b(dmpc dmpcVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmph dmphVar = (dmph) this.b;
        dmpd dmpdVar = (dmpd) dmpcVar.bK();
        dmph dmphVar2 = dmph.f;
        dmpdVar.getClass();
        dmphVar.b();
        dmphVar.b.add(dmpdVar);
    }

    public final void c(dmpd dmpdVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmph dmphVar = (dmph) this.b;
        dmph dmphVar2 = dmph.f;
        dmpdVar.getClass();
        dmphVar.b();
        dmphVar.b.add(dmpdVar);
    }
}
