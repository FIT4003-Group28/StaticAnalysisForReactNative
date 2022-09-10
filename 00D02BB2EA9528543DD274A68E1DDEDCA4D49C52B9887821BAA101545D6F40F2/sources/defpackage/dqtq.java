package defpackage;
/* compiled from: PG */
/* renamed from: dqtq  reason: default package */
/* loaded from: classes6.dex */
public final class dqtq extends dsqp<dqtv, dqtq> implements dssk {
    public dqtq() {
        super(dqtv.d);
    }

    public final void a(Iterable<? extends dqts> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dqtv dqtvVar = (dqtv) this.b;
        dqtv dqtvVar2 = dqtv.d;
        dsrj<dqts> dsrjVar = dqtvVar.b;
        if (!dsrjVar.a()) {
            dqtvVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dqtvVar.b);
    }
}
