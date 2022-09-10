package defpackage;
/* compiled from: PG */
/* renamed from: dqju  reason: default package */
/* loaded from: classes6.dex */
public final class dqju extends dsqp<dqjw, dqju> implements dssk {
    public dqju() {
        super(dqjw.i);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dqjw dqjwVar = (dqjw) this.b;
        dqjw dqjwVar2 = dqjw.i;
        dsrj<String> dsrjVar = dqjwVar.e;
        if (!dsrjVar.a()) {
            dqjwVar.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dqjwVar.e);
    }
}
