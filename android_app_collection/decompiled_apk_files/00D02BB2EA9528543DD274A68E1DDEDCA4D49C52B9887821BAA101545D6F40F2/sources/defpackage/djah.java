package defpackage;
/* compiled from: PG */
/* renamed from: djah  reason: default package */
/* loaded from: classes6.dex */
public final class djah extends dsqp<djai, djah> implements dssk {
    public djah() {
        super(djai.g);
    }

    public final void a(Iterable<? extends dqcq> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        djai djaiVar = (djai) this.b;
        djai djaiVar2 = djai.g;
        dsrj<dqcq> dsrjVar = djaiVar.e;
        if (!dsrjVar.a()) {
            djaiVar.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, djaiVar.e);
    }
}
