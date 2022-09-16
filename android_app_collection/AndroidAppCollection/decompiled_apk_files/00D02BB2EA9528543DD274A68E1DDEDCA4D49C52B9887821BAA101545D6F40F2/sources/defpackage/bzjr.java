package defpackage;
/* compiled from: PG */
/* renamed from: bzjr  reason: default package */
/* loaded from: classes4.dex */
public final class bzjr extends dsqp<bzju, bzjr> implements dssk {
    public bzjr() {
        super(bzju.e);
    }

    public final void a(Iterable<? extends dpce> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bzju bzjuVar = (bzju) this.b;
        bzju bzjuVar2 = bzju.e;
        dsrj<dpce> dsrjVar = bzjuVar.b;
        if (!dsrjVar.a()) {
            bzjuVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, bzjuVar.b);
    }
}
