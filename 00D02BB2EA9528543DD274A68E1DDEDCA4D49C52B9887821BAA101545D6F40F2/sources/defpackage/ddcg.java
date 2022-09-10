package defpackage;
/* compiled from: PG */
/* renamed from: ddcg  reason: default package */
/* loaded from: classes5.dex */
public final class ddcg extends dsqp<ddcj, ddcg> implements dssk {
    public ddcg() {
        super(ddcj.g);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddcj ddcjVar = (ddcj) this.b;
        ddcj ddcjVar2 = ddcj.g;
        dsrj<String> dsrjVar = ddcjVar.f;
        if (!dsrjVar.a()) {
            ddcjVar.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, ddcjVar.f);
    }
}
