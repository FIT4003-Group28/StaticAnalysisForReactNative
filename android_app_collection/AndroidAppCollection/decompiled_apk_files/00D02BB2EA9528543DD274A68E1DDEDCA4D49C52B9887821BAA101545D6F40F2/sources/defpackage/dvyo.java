package defpackage;
/* compiled from: PG */
/* renamed from: dvyo  reason: default package */
/* loaded from: classes6.dex */
public final class dvyo extends dsqp<dvyp, dvyo> implements dssk {
    public dvyo() {
        super(dvyp.e);
    }

    public final void a(Iterable<? extends dgkg> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvyp dvypVar = (dvyp) this.b;
        dvyp dvypVar2 = dvyp.e;
        dsrj<dgkg> dsrjVar = dvypVar.b;
        if (!dsrjVar.a()) {
            dvypVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dvypVar.b);
    }
}
