package defpackage;
/* compiled from: PG */
/* renamed from: cyju  reason: default package */
/* loaded from: classes5.dex */
public final class cyju extends dsqp<cyjv, cyju> implements dssk {
    public cyju() {
        super(cyjv.b);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cyjv cyjvVar = (cyjv) this.b;
        cyjv cyjvVar2 = cyjv.b;
        dsrj<String> dsrjVar = cyjvVar.a;
        if (!dsrjVar.a()) {
            cyjvVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, cyjvVar.a);
    }
}
