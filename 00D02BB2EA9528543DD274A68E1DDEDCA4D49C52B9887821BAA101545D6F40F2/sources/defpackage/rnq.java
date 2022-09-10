package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: rnq  reason: default package */
/* loaded from: classes7.dex */
public final class rnq extends itb implements ros {
    public static final dcdc<ror> a;
    private static final dcqe e = dcqe.c("rnq");
    private static final dcdc<ror> f;
    private static final dcdc<ror> g;
    private static final dcdc<ror> h;
    private static final rzo i;
    private static final rzo j;
    public final sic b;
    public final baju c;
    public final bvrb d;
    private final gga k;
    private final dxio<akfa> o;
    private final akfc p;
    private final btvo q;
    private final gfq r;
    private final dxio<rni> s;
    private final shl t;

    static {
        dcdc<ror> m = dcdc.m(ror.SCHEDULE, ror.TRANSIT_ROUTE_TO_WORK, ror.TRANSIT_ROUTE_BUILDER_TO_WORK, ror.TRANSIT_ROUTE_TO_HOME, ror.TRANSIT_ROUTE_BUILDER_TO_HOME, ror.MULTIMODAL_ROUTE_TO_WORK, ror.MULTIMODAL_ROUTE_TO_HOME, ror.RECEIPT);
        f = m;
        dccx F = dcdc.F();
        F.g(ror.HOME);
        F.g(ror.WORK);
        F.g(ror.TRAVEL_MODE);
        F.i(m);
        dcdc<ror> f2 = F.f();
        a = f2;
        g = D(f2, rzo.b(ror.TRAVEL_MODE));
        dccx F2 = dcdc.F();
        F2.g(ror.TRAVEL_MODE);
        F2.g(ror.HOME);
        F2.g(ror.WORK);
        F2.i(m);
        h = F2.f();
        i = rzo.d();
        j = rzo.b(ror.TRANSIT_ROUTE_BUILDER_TO_WORK, ror.TRANSIT_ROUTE_BUILDER_TO_HOME);
    }

    public rnq(gga ggaVar, dxio<akfa> dxioVar, akfc akfcVar, btvo btvoVar, sic sicVar, gfq gfqVar, dxio<rni> dxioVar2, shl shlVar, baju bajuVar, bvrb bvrbVar) {
        this.k = ggaVar;
        this.o = dxioVar;
        this.p = akfcVar;
        this.q = btvoVar;
        this.b = sicVar;
        this.r = gfqVar;
        this.s = dxioVar2;
        this.t = shlVar;
        this.c = bajuVar;
        this.d = bvrbVar;
    }

    public static dcdc<ror> D(List<ror> list, rzo rzoVar) {
        return dcdc.q(dcft.i(list, rzoVar));
    }

    private final void F(final List<ror> list, final boolean z, final boolean z2, final boolean z3) {
        G(new Runnable(this, z3, list, z, z2) { // from class: rnl
            private final rnq a;
            private final boolean b;
            private final List c;
            private final boolean d;
            private final boolean e;

            {
                this.a = this;
                this.b = z3;
                this.c = list;
                this.d = z;
                this.e = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final rnq rnqVar = this.a;
                final boolean z4 = this.b;
                final List list2 = this.c;
                final boolean z5 = this.d;
                final boolean z6 = this.e;
                rnqVar.b.c(new sib(rnqVar, z4, list2, z5, z6) { // from class: rnn
                    private final rnq a;
                    private final boolean b;
                    private final List c;
                    private final boolean d;
                    private final boolean e;

                    {
                        this.a = rnqVar;
                        this.b = z4;
                        this.c = list2;
                        this.d = z5;
                        this.e = z6;
                    }

                    @Override // defpackage.sib
                    public final void a(qjn qjnVar) {
                        rnq rnqVar2 = this.a;
                        boolean z7 = this.b;
                        List<ror> list3 = this.c;
                        boolean z8 = this.d;
                        boolean z9 = this.e;
                        if (!z7 || (qjnVar.a() == null && qjnVar.b() == null)) {
                            if (qjnVar.a() == null || qjnVar.b() == null) {
                                if (qjnVar.a() == null) {
                                    rnqVar2.E(list3, z8, z9);
                                    return;
                                } else {
                                    rnqVar2.E(rnq.D(list3, rzo.b(ror.HOME)), z8, z9);
                                    return;
                                }
                            }
                            rnqVar2.E(rnq.D(list3, rzo.b(ror.HOME, ror.WORK)), z8, z9);
                        }
                    }
                });
            }
        });
    }

    private final void G(Runnable runnable) {
        if (C()) {
            runnable.run();
        } else {
            H(this.k.getString(R.string.COMMUTE_HUB_SIGN_IN_TITLE), runnable);
        }
    }

    private final void H(String str, Runnable runnable) {
        this.p.k(new rnp(this, runnable), str);
    }

    public final void B() {
        if (!t()) {
            return;
        }
        rnv.a();
        this.k.D(new rnw());
    }

    public final boolean C() {
        return this.o.a().j().l();
    }

    public final void E(List<ror> list, boolean z, boolean z2) {
        if (!this.q.getCommuteSetupParameters().k) {
            list = D(list, j);
        }
        if (!sif.b(this.q)) {
            list = D(list, i);
        }
        if (!this.k.aZ || !t() || list.isEmpty()) {
            return;
        }
        String h2 = this.r.h(0);
        dbsk.b(!list.isEmpty(), "screens must not be empty");
        this.s.a().c(rzp.j(dcdc.e(), list.get(0), list.subList(1, list.size()), h2, false, z, z2));
    }

    @Override // defpackage.ros
    public final void e() {
        if (!this.k.aZ) {
            return;
        }
        G(new Runnable(this) { // from class: rnj
            private final rnq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.B();
            }
        });
    }

    @Override // defpackage.ros
    public final void f() {
        if (!this.k.aZ) {
            return;
        }
        Runnable runnable = new Runnable(this) { // from class: rnk
            private final rnq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.B();
            }
        };
        if (C()) {
            if (this.o.a().s().size() > 1) {
                H(this.k.getString(R.string.COMMUTE_HUB_SELECT_ACCOUNT_TITLE), runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        H(this.k.getString(R.string.COMMUTE_HUB_SIGN_IN_TITLE), runnable);
    }

    @Override // defpackage.ros
    public final void i() {
        j(false);
    }

    @Override // defpackage.ros
    public final void j(boolean z) {
        dktt dkttVar = this.q.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        F(a, z, dkttVar.w, false);
    }

    @Override // defpackage.ros
    public final void k() {
        F(g, false, false, false);
    }

    @Override // defpackage.ros
    public final void l() {
        F(h, false, false, false);
    }

    @Override // defpackage.ros
    public final void m() {
        dktt dkttVar = this.q.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        F(a, false, dkttVar.w, true);
    }

    @Override // defpackage.ros
    public final void n(final ror rorVar) {
        if (!this.k.aZ) {
            return;
        }
        G(new Runnable(this, rorVar) { // from class: rnm
            private final rnq a;
            private final ror b;

            {
                this.a = this;
                this.b = rorVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int indexOf;
                rnq rnqVar = this.a;
                ror rorVar2 = this.b;
                if (rnqVar.t() && (indexOf = rnq.a.indexOf(rorVar2)) >= 0) {
                    rnqVar.E(rnq.a.subList(indexOf, rnq.a.size()), false, false);
                }
            }
        });
    }

    @Override // defpackage.ros
    public final void o(dndr dndrVar) {
        dcdc j2;
        if (dndrVar == dndr.HOME) {
            j2 = dcdc.j(ror.TRANSIT_ROUTE_TO_HOME, ror.TRANSIT_ROUTE_BUILDER_TO_HOME, ror.TRANSIT_ROUTE_TO_WORK, ror.TRANSIT_ROUTE_BUILDER_TO_WORK, ror.RECEIPT);
        } else if (dndrVar != dndr.WORK) {
            return;
        } else {
            j2 = dcdc.j(ror.TRANSIT_ROUTE_TO_WORK, ror.TRANSIT_ROUTE_BUILDER_TO_WORK, ror.TRANSIT_ROUTE_TO_HOME, ror.TRANSIT_ROUTE_BUILDER_TO_HOME, ror.RECEIPT);
        }
        E(j2, false, false);
    }

    @Override // defpackage.ros
    public final void p(akqq akqqVar, @dzsi dopk dopkVar, boolean z, int i2, gfw gfwVar) {
        if (sif.c(this.q) && this.k.aZ) {
            rof rofVar = new rof();
            Bundle bundle = new Bundle();
            if (akqqVar != null) {
                bundle.putDouble("searchLocation.lat", akqqVar.a);
                bundle.putDouble("searchLocation.lng", akqqVar.b);
            }
            if (dopkVar != null) {
                bvrs.k(bundle, "preselectedStation", dopkVar);
            }
            bundle.putBoolean("isStartStation", z);
            bundle.putInt("legIndex", i2);
            rofVar.B(bundle);
            rofVar.Nz(gfwVar);
            this.k.C(rofVar, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
        }
    }

    @Override // defpackage.ros
    public final void q(dcdc<amvh> dcdcVar, amte amteVar, int i2, int i3, gfw gfwVar) {
        if (sif.c(this.q) && this.k.aZ) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("waypoints", new ArrayList(dcdcVar));
            bundle.putInt("selectedDirectionsStorageItemIndex", i2);
            bundle.putSerializable("directionsStorageItem", amteVar);
            bundle.putInt("legIndex", i3);
            roj rojVar = new roj();
            rojVar.B(bundle);
            rojVar.Nz(gfwVar);
            this.k.C(rojVar, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
        }
    }

    @Override // defpackage.ros
    public final void r() {
        gga ggaVar = this.k;
        if (!ggaVar.aZ) {
            return;
        }
        fd K = ggaVar.K();
        if (K instanceof gfw) {
            ((gfw) K).aZ(new rml());
        } else {
            bvoo.h("Fragment is not eligible to receive ClearCommuteSettingsResult", new Object[0]);
        }
    }

    @Override // defpackage.ros
    public final void s(List<ror> list, boolean z, boolean z2) {
        E(list, z, false);
    }

    public final boolean t() {
        return !this.q.getCommuteSetupParameters().a && this.t.a();
    }
}
