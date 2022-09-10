package defpackage;
/* compiled from: PG */
/* renamed from: dqfp  reason: default package */
/* loaded from: classes6.dex */
public final class dqfp extends dsqp<dqfq, dqfp> implements dssk {
    public dqfp() {
        super(dqfq.h);
    }

    public final void a(Iterable<? extends dqfo> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dqfq dqfqVar = (dqfq) this.b;
        dqfq dqfqVar2 = dqfq.h;
        dsrj<dqfo> dsrjVar = dqfqVar.f;
        if (!dsrjVar.a()) {
            dqfqVar.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dqfqVar.f);
    }
}
