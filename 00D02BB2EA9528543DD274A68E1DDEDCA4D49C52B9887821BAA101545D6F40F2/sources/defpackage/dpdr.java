package defpackage;
/* compiled from: PG */
/* renamed from: dpdr  reason: default package */
/* loaded from: classes6.dex */
public final class dpdr extends dsqp<dpdy, dpdr> implements dssk {
    public dpdr() {
        super(dpdy.n);
    }

    public final dpdq a(int i) {
        return ((dpdy) this.b).d.get(i);
    }

    public final void b(dpcp dpcpVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpdy dpdyVar = (dpdy) this.b;
        dpdq bK = dpcpVar.bK();
        dpdy dpdyVar2 = dpdy.n;
        bK.getClass();
        dpdyVar.b();
        dpdyVar.d.add(bK);
    }
}
