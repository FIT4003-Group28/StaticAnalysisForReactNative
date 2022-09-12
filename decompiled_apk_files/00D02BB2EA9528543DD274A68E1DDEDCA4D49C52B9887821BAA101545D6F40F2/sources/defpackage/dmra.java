package defpackage;
/* compiled from: PG */
/* renamed from: dmra  reason: default package */
/* loaded from: classes.dex */
public final class dmra extends dsqp<dmrb, dmra> implements dssk {
    public dmra() {
        super(dmrb.n);
    }

    public final void a(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmrb dmrbVar = (dmrb) this.b;
        dmrb dmrbVar2 = dmrb.n;
        dsrf dsrfVar = dmrbVar.h;
        if (!dsrfVar.a()) {
            dmrbVar.h = dsqw.cg(dsrfVar);
        }
        dmrbVar.h.h(i);
    }
}
