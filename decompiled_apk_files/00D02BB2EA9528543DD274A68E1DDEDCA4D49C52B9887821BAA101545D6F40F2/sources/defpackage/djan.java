package defpackage;
/* compiled from: PG */
/* renamed from: djan  reason: default package */
/* loaded from: classes6.dex */
public final class djan extends dsqp<djao, djan> implements dssk {
    public djan() {
        super(djao.i);
    }

    public final void a(Iterable<? extends dqcq> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        djao djaoVar = (djao) this.b;
        djao djaoVar2 = djao.i;
        dsrj<dqcq> dsrjVar = djaoVar.h;
        if (!dsrjVar.a()) {
            djaoVar.h = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, djaoVar.h);
    }
}
