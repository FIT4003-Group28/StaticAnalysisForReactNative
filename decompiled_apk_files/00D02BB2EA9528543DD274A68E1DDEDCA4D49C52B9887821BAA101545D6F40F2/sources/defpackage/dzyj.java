package defpackage;
/* compiled from: PG */
/* renamed from: dzyj  reason: default package */
/* loaded from: classes6.dex */
public final class dzyj extends dsqp<dzyk, dzyj> implements dssk {
    public dzyj() {
        super(dzyk.e);
    }

    public final void a(Iterable<? extends dzyq> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyk dzykVar = (dzyk) this.b;
        dzyk dzykVar2 = dzyk.e;
        dsrj<dzyq> dsrjVar = dzykVar.b;
        if (!dsrjVar.a()) {
            dzykVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dzykVar.b);
    }

    public final void b(Iterable<? extends dzyg> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyk dzykVar = (dzyk) this.b;
        dzyk dzykVar2 = dzyk.e;
        dsrj<dzyg> dsrjVar = dzykVar.c;
        if (!dsrjVar.a()) {
            dzykVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dzykVar.c);
    }
}
