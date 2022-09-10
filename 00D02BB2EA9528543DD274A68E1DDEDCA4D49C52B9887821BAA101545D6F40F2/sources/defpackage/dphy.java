package defpackage;
/* compiled from: PG */
/* renamed from: dphy  reason: default package */
/* loaded from: classes6.dex */
public final class dphy extends dsqp<dpid, dphy> implements dssk {
    public dphy() {
        super(dpid.h);
    }

    public final void a(Iterable<? extends dpic> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpid dpidVar = (dpid) this.b;
        dpid dpidVar2 = dpid.h;
        dsrj<dpic> dsrjVar = dpidVar.e;
        if (!dsrjVar.a()) {
            dpidVar.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dpidVar.e);
    }

    public final void b(Iterable<? extends dpic> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpid dpidVar = (dpid) this.b;
        dpid dpidVar2 = dpid.h;
        dsrj<dpic> dsrjVar = dpidVar.f;
        if (!dsrjVar.a()) {
            dpidVar.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dpidVar.f);
    }
}
