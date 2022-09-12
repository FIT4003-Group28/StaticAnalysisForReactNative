package defpackage;
/* compiled from: PG */
/* renamed from: dtjq  reason: default package */
/* loaded from: classes6.dex */
public final class dtjq extends dsqp<dtjt, dtjq> implements dssk {
    public dtjq() {
        super(dtjt.e);
    }

    public final void a(Iterable<? extends dtrk> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dtjt dtjtVar = (dtjt) this.b;
        dtjt dtjtVar2 = dtjt.e;
        dtjtVar.c();
        dsod.bv(iterable, dtjtVar.c);
    }

    public final void b(dtrk dtrkVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dtjt dtjtVar = (dtjt) this.b;
        dtjt dtjtVar2 = dtjt.e;
        dtrkVar.getClass();
        dtjtVar.c();
        dtjtVar.c.add(dtrkVar);
    }
}
