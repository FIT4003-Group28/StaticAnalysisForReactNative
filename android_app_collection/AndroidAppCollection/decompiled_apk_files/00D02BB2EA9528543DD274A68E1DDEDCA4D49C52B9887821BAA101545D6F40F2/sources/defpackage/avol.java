package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: avol  reason: default package */
/* loaded from: classes3.dex */
public final class avol {
    public static final dcqe a = dcqe.c("avol");
    public final long b;
    public final avoj c;
    public final avop d;
    private final avpo e;
    private final avpn f;
    private final Context g;
    public final avrx instance;

    public avol(avoj avojVar, avop avopVar, avpo avpoVar, avpn avpnVar, Context context, avsa avsaVar) {
        this.c = avojVar;
        this.d = avopVar;
        this.b = avsaVar.g().longValue();
        this.e = avpoVar;
        this.f = avpnVar;
        this.g = context;
        this.instance = avsaVar;
    }

    public static dlrq b() {
        dlrp bZ = dlrq.q.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlrq dlrqVar = (dlrq) bZ.b;
        dlrqVar.a |= 128;
        dlrqVar.l = true;
        dlpo bZ2 = dlpt.l.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlpt dlptVar = (dlpt) bZ2.b;
        dlptVar.b = 2;
        dlptVar.a = 1 | dlptVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlrq dlrqVar2 = (dlrq) bZ.b;
        dlpt bK = bZ2.bK();
        bK.getClass();
        dsrj<dlpt> dsrjVar = dlrqVar2.h;
        if (!dsrjVar.a()) {
            dlrqVar2.h = dsqw.cl(dsrjVar);
        }
        dlrqVar2.h.add(bK);
        return bZ.bK();
    }

    public final void a(String str, Exception exc) {
        if (exc instanceof anam) {
            int i = ((anam) exc).b;
            long d = bvog.d(this.g);
            this.d.c((d == 0 || d >= 52428800) ? i : 1000000000 + i);
            if (i == 65549) {
                long e = bvog.e(this.f.c());
                avop avopVar = this.d;
                double d2 = d;
                Double.isNaN(d2);
                ((ckcp) avopVar.a.a(ckia.v)).a(Math.round(d2 / 1048576.0d));
                double d3 = e;
                Double.isNaN(d3);
                ((ckcp) avopVar.a.a(ckia.w)).a(Math.round(d3 / 1048576.0d));
            }
        } else {
            this.d.b();
        }
        bvoo.h("Unexpected exception from the native infrastructure in %s: %s", str, exc);
        this.e.b(Boolean.TRUE);
    }

    public final dlrq c(dloj dlojVar) {
        try {
            return (dlrq) dsqw.cq(dlrq.q, this.c.f(this.b, dlojVar.bS()));
        } catch (Exception e) {
            a("abandonUnstartedUpdate", e);
            return b();
        }
    }

    public final void d() {
        try {
            this.c.n(this.b);
        } catch (Exception e) {
            a("logUpdateSuspended", e);
        }
    }

    @Deprecated
    public final void e(dspd dspdVar, dlte dlteVar) {
        try {
            this.c.r(this.b, dspdVar.G(), dlteVar.bS());
        } catch (Exception e) {
            a("setRegionMetadata", e);
        }
    }

    public final dlrj f(dlsw dlswVar) {
        dlrj dlrjVar;
        try {
            byte[] J = this.c.J(this.b, dlswVar.bS());
            if (J != null) {
                dlrjVar = (dlrj) dsqw.cq(dlrj.e, J);
            } else {
                bvoo.h("Unexpected null InfrastructureState", new Object[0]);
                this.d.d();
                dlrjVar = dlrj.e;
            }
            return dlrjVar;
        } catch (Exception e) {
            a("getInfrastructureStateForOwner", e);
            return dlrj.e;
        }
    }

    public final void g(dspd dspdVar) {
        try {
            this.c.t(this.b, dspdVar.G());
        } catch (Exception e) {
            a("markRegionForUpdate", e);
        }
    }

    public final void h(dlsw dlswVar, dlrn dlrnVar, dlpa dlpaVar) {
        try {
            this.c.E(this.b, dlswVar.bS(), dlrnVar.bS(), dlpaVar.bS());
        } catch (Exception e) {
            a("markRegionsWithLocationsUsed", e);
        }
    }

    public final long i() {
        try {
            return this.c.G(this.b);
        } catch (Exception e) {
            a("generateOperationId", e);
            return 0L;
        }
    }

    public final avze j() {
        return this.instance.a();
    }

    public final boolean k() {
        return Boolean.TRUE.equals(this.e.a().l());
    }
}
