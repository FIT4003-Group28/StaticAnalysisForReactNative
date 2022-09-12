package defpackage;
/* compiled from: PG */
/* renamed from: dmsk  reason: default package */
/* loaded from: classes.dex */
public final class dmsk extends dsqp<dmsl, dmsk> implements dssk {
    public dmsk() {
        super(dmsl.l);
    }

    public final void a(Iterable<? extends Integer> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmsl dmslVar = (dmsl) this.b;
        dmsl dmslVar2 = dmsl.l;
        dsrf dsrfVar = dmslVar.e;
        if (!dsrfVar.a()) {
            dmslVar.e = dsqw.cg(dsrfVar);
        }
        dsod.bv(iterable, dmslVar.e);
    }
}
