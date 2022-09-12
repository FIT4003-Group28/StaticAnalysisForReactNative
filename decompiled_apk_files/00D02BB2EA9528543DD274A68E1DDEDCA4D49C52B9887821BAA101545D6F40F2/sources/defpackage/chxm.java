package defpackage;
/* compiled from: PG */
/* renamed from: chxm  reason: default package */
/* loaded from: classes4.dex */
public final class chxm extends dsqp<chxp, chxm> implements dssk {
    public chxm() {
        super(chxp.k);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxp chxpVar = (chxp) this.b;
        chxp chxpVar2 = chxp.k;
        dsrj<String> dsrjVar = chxpVar.c;
        if (!dsrjVar.a()) {
            chxpVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, chxpVar.c);
    }
}
