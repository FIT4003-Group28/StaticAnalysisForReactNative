package defpackage;
/* compiled from: PG */
/* renamed from: dnox  reason: default package */
/* loaded from: classes6.dex */
public final class dnox extends dsqp<dnpo, dnox> implements dssk {
    public dnox() {
        super(dnpo.t);
    }

    public final void a(dndy dndyVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnpo dnpoVar = (dnpo) this.b;
        dndz bK = dndyVar.bK();
        dsrg<Integer, dnow> dsrgVar = dnpo.e;
        bK.getClass();
        dnpoVar.b();
        dnpoVar.o.add(bK);
    }

    public final void b(dnow dnowVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnpo dnpoVar = (dnpo) this.b;
        dsrg<Integer, dnow> dsrgVar = dnpo.e;
        dnowVar.getClass();
        dsrf dsrfVar = dnpoVar.d;
        if (!dsrfVar.a()) {
            dnpoVar.d = dsqw.cg(dsrfVar);
        }
        dnpoVar.d.h(dnowVar.N);
    }

    public final void c(dnph dnphVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnpo dnpoVar = (dnpo) this.b;
        dsrg<Integer, dnow> dsrgVar = dnpo.e;
        dnphVar.getClass();
        dsrf dsrfVar = dnpoVar.f;
        if (!dsrfVar.a()) {
            dnpoVar.f = dsqw.cg(dsrfVar);
        }
        dnpoVar.f.h(dnphVar.r);
    }
}
