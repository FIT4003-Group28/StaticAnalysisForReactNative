package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uen  reason: default package */
/* loaded from: classes7.dex */
public final class uen implements ufc {
    @dzsi
    public cryz<tgl> d;
    private final tgm g;
    private final ufg h;
    private final uep i;
    private final udl j;
    private final Executor k;
    @dzsi
    private uew m;
    @dzsi
    private cryz<udj> o;
    private dbsg<tgl> n = dbpy.a;
    public dbsg<ufa> c = dbpy.a;
    private boolean l = false;
    public dbsg<Integer> e = dbpy.a;
    public dcdc<amvh> a = dcdc.e();
    public dcdc<amvh> b = dcdc.e();
    private final crzo<ufb> f = new crzo<>(ufb.g(dcdc.e(), true, true, false, dbpy.a, dbpy.a));

    public uen(tgm tgmVar, ufg ufgVar, Executor executor, uep uepVar, udl udlVar) {
        this.g = tgmVar;
        this.h = ufgVar;
        this.k = executor;
        this.i = uepVar;
        this.j = udlVar;
    }

    private final dcdc<amvh> A() {
        dcdc<amvh> j = q().j();
        dbsk.s(j);
        return j;
    }

    private final void v() {
        if (!l().booleanValue() || z().size() < A().size()) {
            return;
        }
        dccx F = dcdc.F();
        F.i(A());
        F.g(amvh.a);
        q().i(F.f(), false);
    }

    private final void w() {
        final dcdc<amvh> z = z();
        if (dchl.m(this.b, z)) {
            return;
        }
        y();
        Iterable i = dcft.i(z, new dbsl(this) { // from class: uei
            private final uen a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.a.contains((amvh) obj);
            }
        });
        z.getClass();
        dcdc<Integer> q = dcdc.q(dcft.o(i, new dbrn(z) { // from class: uej
            private final dcdc a;

            {
                this.a = z;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Integer.valueOf(this.a.indexOf((amvh) obj));
            }
        }));
        if (!dchl.m(z, this.a) || !this.n.a()) {
            this.b = z;
            if (!ufe.a(z)) {
                t(q, dbpy.a, dbpy.a);
                return;
            }
            dehn<tgl> a = this.g.a(z);
            this.d = new cryz<>(new uel(this, q, z));
            t(q, dbpy.a, dbpy.a);
            cryz<tgl> cryzVar = this.d;
            dbsk.s(cryzVar);
            deha.q(a, cryzVar, this.k);
            return;
        }
        r(this.n.b(), q, z);
    }

    private final boolean x() {
        cryz<tgl> cryzVar = this.d;
        if (cryzVar == null || cryzVar.d()) {
            cryz<udj> cryzVar2 = this.o;
            return cryzVar2 != null && !cryzVar2.d();
        }
        return true;
    }

    private final void y() {
        cryz<tgl> cryzVar = this.d;
        if (cryzVar != null) {
            cryzVar.c();
            this.d = null;
        }
        cryz<udj> cryzVar2 = this.o;
        if (cryzVar2 != null) {
            cryzVar2.c();
            this.o = null;
        }
    }

    private final dcdc<amvh> z() {
        return dcdc.q(dcft.i(A(), uek.a));
    }

    @Override // defpackage.ufc
    public final crzm<dcdc<amvh>> a() {
        return new crzy(q().c(), ueh.a);
    }

    @Override // defpackage.ufc
    public final crzm<ufb> b() {
        return this.f.a;
    }

    @Override // defpackage.ufc
    public final void c() {
        this.l = true;
        this.m = null;
        this.a = dcdc.e();
        w();
    }

    @Override // defpackage.ufc
    public final void d() {
        this.l = false;
        this.m = null;
        this.a = dcdc.e();
        y();
    }

    @Override // defpackage.ufc
    public final void e() {
        if (this.e.a()) {
            y();
            this.b = dcdc.e();
            this.c = dbsg.i(ufa.NO_WAYPOINT_FOUND);
            t(dcdc.f(this.e.b()), dbsg.i(ufa.NO_WAYPOINT_FOUND), dbpy.a);
            this.e = dbpy.a;
        }
    }

    @Override // defpackage.ufc
    public final void f(amvh amvhVar) {
        dbsg<Integer> h = q().h();
        if (h.a()) {
            q().d(amvhVar, null, h.b().intValue(), true);
        } else if (l().booleanValue()) {
            q().e(amvhVar, q().f(), true);
        }
        w();
    }

    @Override // defpackage.ufc
    public final void g(int i) {
        if (this.l && u(i)) {
            ArrayList arrayList = new ArrayList(A());
            arrayList.remove(i);
            q().i(dcdc.r(arrayList), false);
            w();
        }
    }

    @Override // defpackage.ufc
    public final void h(int i, int i2) {
        if (this.l && u(i) && u(i2)) {
            ArrayList arrayList = new ArrayList(A());
            arrayList.add(i2, (amvh) arrayList.remove(i));
            q().i(dcdc.r(arrayList), false);
            w();
        }
    }

    @Override // defpackage.ufc
    public final void i(wtf wtfVar) {
        dcdc<amvh> j = q().j();
        dbsg<Integer> a = wtfVar.a();
        if (!a.a()) {
            a = dbsg.i(Integer.valueOf(j.size() - 1));
        }
        q().d(wtfVar.b(), wtfVar.c(), a.b().intValue(), true);
        w();
    }

    @Override // defpackage.ufc
    public final void j(bnpg bnpgVar) {
        if (!bnpgVar.a().a()) {
            return;
        }
        q().d(bnpgVar.c(), bnpgVar.b(), bnpgVar.a().b().intValue(), true);
        w();
    }

    @Override // defpackage.ufc
    public final void k(amvh amvhVar, int i) {
        this.e = dbpy.a;
        q().d(amvhVar, null, i, false);
        w();
    }

    @Override // defpackage.ufc
    public final Boolean l() {
        return Boolean.valueOf(z().size() < 10);
    }

    @Override // defpackage.ufc
    public final Boolean m() {
        boolean z = false;
        if (ufe.a(z()) && !x() && !this.c.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ufc
    public final void n() {
        if (m().booleanValue()) {
            this.h.d(z());
        }
    }

    @Override // defpackage.ufc
    public final void o(Bundle bundle) {
        boolean z = bundle.getBoolean("MultiwaypointItineraryControllerImpl.isEditingSessionActive");
        this.l = z;
        if (z) {
            q().a(bundle);
            w();
        }
    }

    @Override // defpackage.ufc
    public final void p(Bundle bundle) {
        bundle.putBoolean("MultiwaypointItineraryControllerImpl.isEditingSessionActive", this.l);
        if (this.l) {
            q().b(bundle);
        }
    }

    final uew q() {
        if (this.m == null) {
            uff l = this.h.a().l();
            dbsk.s(l);
            this.m = uex.a(l.a());
            v();
        }
        uew uewVar = this.m;
        dbsk.s(uewVar);
        return uewVar;
    }

    public final void r(tgl tglVar, dcdc<Integer> dcdcVar, dcdc<amvh> dcdcVar2) {
        dbsg<ufa> dbsgVar = dbpy.a;
        if (tglVar.a().a().a() != tgk.COMPLETED) {
            dbsgVar = dbsg.i(ufa.DIRECTIONS_BACKEND_UNAVAILABLE);
        } else if (tglVar.d().a()) {
            dovb b = tglVar.d().b();
            if (b == dovb.WAYPOINT_FAILURE) {
                dbsgVar = dbsg.i(ufa.NO_WAYPOINT_FOUND);
            } else if (b == dovb.NO_ROUTES_FOUND) {
                dbsgVar = dbsg.i(ufa.UNKNOWN_ROUTE);
            }
        }
        if (tglVar.b().a()) {
            amsy amsyVar = tglVar.b().b().a;
            if (uep.d(amsyVar, q())) {
                this.i.c(amsyVar, q());
            }
        }
        if (!tglVar.b().a() || !this.j.b(tglVar.b().b())) {
            s(tglVar, dbsgVar, dcdcVar, dcdcVar2);
            return;
        }
        this.o = new cryz<>(new uem(this, tglVar, dcdcVar, dcdcVar2));
        dehn<udj> a = this.j.a(tglVar.b().b());
        cryz<udj> cryzVar = this.o;
        dbsk.s(cryzVar);
        deha.q(a, cryzVar, this.k);
    }

    public final void s(tgl tglVar, dbsg<ufa> dbsgVar, dcdc<Integer> dcdcVar, dcdc<amvh> dcdcVar2) {
        if (!tglVar.c().isEmpty()) {
            dcdcVar2 = tglVar.c();
            q().i(tglVar.c(), false);
        }
        if (tglVar.b().a()) {
            amsy amsyVar = tglVar.b().b().a;
            if (uep.d(amsyVar, q())) {
                this.i.c(amsyVar, q());
            }
        }
        if (!dbsgVar.a()) {
            v();
            this.n = dbsg.i(tglVar);
            this.a = dcdcVar2;
        }
        this.c = dbsgVar;
        this.d = null;
        this.o = null;
        this.b = dcdc.e();
        t(dcdcVar, dbsgVar, tglVar.b());
    }

    public final void t(dcdc<Integer> dcdcVar, dbsg<ufa> dbsgVar, dbsg<amte> dbsgVar2) {
        this.f.b(ufb.g(dcdcVar, m().booleanValue(), l().booleanValue(), x(), dbsgVar, dbsgVar2));
    }

    final boolean u(int i) {
        return i >= 0 && i <= A().size() + (-1);
    }
}
