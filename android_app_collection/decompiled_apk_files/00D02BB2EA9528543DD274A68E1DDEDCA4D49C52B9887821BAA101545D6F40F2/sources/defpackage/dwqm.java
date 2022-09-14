package defpackage;
/* compiled from: PG */
/* renamed from: dwqm  reason: default package */
/* loaded from: classes6.dex */
public final class dwqm extends dsqp<dwqp, dwqm> implements dssk {
    public dwqm() {
        super(dwqp.d);
    }

    public final void a(Iterable<? extends dwqt> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwqp dwqpVar = (dwqp) this.b;
        dwqp dwqpVar2 = dwqp.d;
        dsrj<dwqt> dsrjVar = dwqpVar.c;
        if (!dsrjVar.a()) {
            dwqpVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dwqpVar.c);
    }
}
