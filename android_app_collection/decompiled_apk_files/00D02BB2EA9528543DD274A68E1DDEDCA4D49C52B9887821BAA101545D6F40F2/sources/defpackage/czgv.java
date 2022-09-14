package defpackage;
/* compiled from: PG */
/* renamed from: czgv  reason: default package */
/* loaded from: classes5.dex */
public final class czgv extends dsqp<czgw, czgv> implements dssk {
    public czgv() {
        super(czgw.d);
    }

    public final void a(Iterable<? extends czha> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        czgw czgwVar = (czgw) this.b;
        czgw czgwVar2 = czgw.d;
        dsrj<czha> dsrjVar = czgwVar.b;
        if (!dsrjVar.a()) {
            czgwVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, czgwVar.b);
    }
}
