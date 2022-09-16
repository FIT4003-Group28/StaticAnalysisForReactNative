package defpackage;
/* compiled from: PG */
/* renamed from: dpoq  reason: default package */
/* loaded from: classes6.dex */
public final class dpoq extends dsqp<dpot, dpoq> implements dssk {
    public dpoq() {
        super(dpot.m);
    }

    public final void a(Iterable<? extends dppl> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpot dpotVar = (dpot) this.b;
        dpot dpotVar2 = dpot.m;
        dpotVar.b();
        dsod.bv(iterable, dpotVar.h);
    }

    public final void b(int i, dppl dpplVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpot dpotVar = (dpot) this.b;
        dpot dpotVar2 = dpot.m;
        dpplVar.getClass();
        dpotVar.b();
        dpotVar.h.set(i, dpplVar);
    }
}
