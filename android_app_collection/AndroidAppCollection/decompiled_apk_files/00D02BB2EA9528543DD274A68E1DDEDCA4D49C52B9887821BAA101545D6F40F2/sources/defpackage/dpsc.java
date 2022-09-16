package defpackage;
/* compiled from: PG */
/* renamed from: dpsc  reason: default package */
/* loaded from: classes6.dex */
public final class dpsc extends dsqp<dpsd, dpsc> implements dssk {
    public dpsc() {
        super(dpsd.f);
    }

    public final void a(Iterable<? extends dqmn> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpsd dpsdVar = (dpsd) this.b;
        dpsd dpsdVar2 = dpsd.f;
        dpsdVar.b();
        dsod.bv(iterable, dpsdVar.c);
    }

    public final void b(dpyf dpyfVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpsd dpsdVar = (dpsd) this.b;
        dpsd dpsdVar2 = dpsd.f;
        dpyfVar.getClass();
        dpsdVar.c();
        dpsdVar.d.add(dpyfVar);
    }

    public final void c(dqho dqhoVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpsd dpsdVar = (dpsd) this.b;
        dqhp bK = dqhoVar.bK();
        dpsd dpsdVar2 = dpsd.f;
        bK.getClass();
        dpsdVar.d();
        dpsdVar.e.add(bK);
    }

    public final void d(dqmn dqmnVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpsd dpsdVar = (dpsd) this.b;
        dpsd dpsdVar2 = dpsd.f;
        dqmnVar.getClass();
        dpsdVar.b();
        dpsdVar.c.add(dqmnVar);
    }
}
