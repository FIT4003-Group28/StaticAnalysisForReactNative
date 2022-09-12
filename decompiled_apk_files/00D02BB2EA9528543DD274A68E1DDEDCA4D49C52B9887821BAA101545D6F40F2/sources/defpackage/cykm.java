package defpackage;
/* compiled from: PG */
/* renamed from: cykm  reason: default package */
/* loaded from: classes5.dex */
public final class cykm extends dsqp<cyko, cykm> implements dssk {
    public cykm() {
        super(cyko.c);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cyko cykoVar = (cyko) this.b;
        cyko cykoVar2 = cyko.c;
        dsrj<String> dsrjVar = cykoVar.b;
        if (!dsrjVar.a()) {
            cykoVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, cykoVar.b);
    }
}
