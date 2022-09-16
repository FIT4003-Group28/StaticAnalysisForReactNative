package defpackage;
/* compiled from: PG */
/* renamed from: dmcb  reason: default package */
/* loaded from: classes6.dex */
public final class dmcb extends dsqp<dmcc, dmcb> implements dssk {
    public dmcb() {
        super(dmcc.i);
    }

    public final void a(Iterable<? extends drew> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmcc dmccVar = (dmcc) this.b;
        dmcc dmccVar2 = dmcc.i;
        dsrj<drew> dsrjVar = dmccVar.g;
        if (!dsrjVar.a()) {
            dmccVar.g = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dmccVar.g);
    }
}
