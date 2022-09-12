package defpackage;
/* compiled from: PG */
/* renamed from: cgbx  reason: default package */
/* loaded from: classes4.dex */
public final class cgbx extends dsqp<cgby, cgbx> implements dssk {
    public cgbx() {
        super(cgby.b);
    }

    public final void a(Iterable<? extends drnp> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cgby cgbyVar = (cgby) this.b;
        cgby cgbyVar2 = cgby.b;
        cgbyVar.b();
        dsod.bv(iterable, cgbyVar.a);
    }

    public final void b(drnp drnpVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cgby cgbyVar = (cgby) this.b;
        cgby cgbyVar2 = cgby.b;
        drnpVar.getClass();
        cgbyVar.b();
        cgbyVar.a.add(drnpVar);
    }
}
