package defpackage;
/* compiled from: PG */
/* renamed from: bzji  reason: default package */
/* loaded from: classes4.dex */
public final class bzji extends dsqp<bzjj, bzji> implements dssk {
    public bzji() {
        super(bzjj.i);
    }

    public final void a(Iterable<? extends bzia> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bzjj bzjjVar = (bzjj) this.b;
        bzjj bzjjVar2 = bzjj.i;
        dsrj<bzia> dsrjVar = bzjjVar.d;
        if (!dsrjVar.a()) {
            bzjjVar.d = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, bzjjVar.d);
    }
}
