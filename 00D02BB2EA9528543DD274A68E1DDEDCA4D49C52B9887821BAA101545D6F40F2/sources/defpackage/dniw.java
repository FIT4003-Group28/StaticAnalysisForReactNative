package defpackage;
/* compiled from: PG */
/* renamed from: dniw  reason: default package */
/* loaded from: classes6.dex */
public final class dniw extends dsqp<dniz, dniw> implements dssk {
    public dniw() {
        super(dniz.f);
    }

    public final void a(Iterable<? extends dnet> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dniz dnizVar = (dniz) this.b;
        dniz dnizVar2 = dniz.f;
        dnizVar.c();
        dsod.bv(iterable, dnizVar.d);
    }

    public final void b(dner dnerVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dniz dnizVar = (dniz) this.b;
        dnet bK = dnerVar.bK();
        dniz dnizVar2 = dniz.f;
        bK.getClass();
        dnizVar.c();
        dnizVar.d.add(bK);
    }

    public final void c(dnet dnetVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dniz dnizVar = (dniz) this.b;
        dniz dnizVar2 = dniz.f;
        dnetVar.getClass();
        dnizVar.c();
        dnizVar.d.add(dnetVar);
    }
}
