package defpackage;
/* compiled from: PG */
/* renamed from: cfgi  reason: default package */
/* loaded from: classes4.dex */
public final class cfgi extends dsqp<cfgj, cfgi> implements dssk {
    public cfgi() {
        super(cfgj.h);
    }

    public final cfgh a(int i) {
        return ((cfgj) this.b).g.get(i);
    }

    public final void b(Iterable<? extends cfgf> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cfgj cfgjVar = (cfgj) this.b;
        cfgj cfgjVar2 = cfgj.h;
        dsrj<cfgf> dsrjVar = cfgjVar.d;
        if (!dsrjVar.a()) {
            cfgjVar.d = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, cfgjVar.d);
    }
}
