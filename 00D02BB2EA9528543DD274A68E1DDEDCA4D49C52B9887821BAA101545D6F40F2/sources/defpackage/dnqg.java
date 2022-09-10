package defpackage;
/* compiled from: PG */
/* renamed from: dnqg  reason: default package */
/* loaded from: classes.dex */
public final class dnqg extends dsqp<dnqh, dnqg> implements dssk {
    public dnqg() {
        super(dnqh.p);
    }

    public final void a(Iterable<? extends ddhk> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnqh dnqhVar = (dnqh) this.b;
        dnqh dnqhVar2 = dnqh.p;
        dsrj<ddhk> dsrjVar = dnqhVar.i;
        if (!dsrjVar.a()) {
            dnqhVar.i = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dnqhVar.i);
    }
}
