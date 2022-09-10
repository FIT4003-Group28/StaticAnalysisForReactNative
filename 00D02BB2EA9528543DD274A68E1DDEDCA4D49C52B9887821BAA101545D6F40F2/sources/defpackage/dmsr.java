package defpackage;
/* compiled from: PG */
/* renamed from: dmsr  reason: default package */
/* loaded from: classes6.dex */
public final class dmsr extends dsqp<dmsu, dmsr> implements dssk {
    public dmsr() {
        super(dmsu.u);
    }

    public final void a(Iterable<? extends dmlo> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmsu dmsuVar = (dmsu) this.b;
        dsrg<Integer, dmlo> dsrgVar = dmsu.i;
        dmsuVar.b();
        for (dmlo dmloVar : iterable) {
            dmsuVar.h.h(dmloVar.j);
        }
    }

    public final void b(dmlo dmloVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmsu dmsuVar = (dmsu) this.b;
        dsrg<Integer, dmlo> dsrgVar = dmsu.i;
        dmloVar.getClass();
        dmsuVar.b();
        dmsuVar.h.h(dmloVar.j);
    }
}
