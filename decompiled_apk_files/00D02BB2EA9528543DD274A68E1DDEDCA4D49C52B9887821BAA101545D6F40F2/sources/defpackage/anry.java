package defpackage;

import android.app.AlertDialog;
import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anry  reason: default package */
/* loaded from: classes2.dex */
public class anry extends anrr {
    public static final dcqe a = dcqe.c("anry");
    public final angp o;
    public final cjqy p;
    private final anqx q;
    private final apkf r;
    private final anrz s;
    private final anpw t;
    private final dxio<begg> u;
    private final aofe v;
    private final dcdc<dprk> w;
    private final boolean x;
    @dzsi
    private dvas y;
    @dzsi
    private ilo z;

    public anry(dvay dvayVar, aoge aogeVar, boolean z, boolean z2, gga ggaVar, cqat cqatVar, angp angpVar, anhg anhgVar, bbut bbutVar, anqx anqxVar, cjqy cjqyVar, apkf apkfVar, anru anruVar, anrz anrzVar, anpw anpwVar, aoiw aoiwVar, dxio<begg> dxioVar, aogw aogwVar, aokw aokwVar, aofe aofeVar, aojq aojqVar) {
        super(dvayVar, aogeVar, z, ggaVar, cqatVar, anhgVar, bbutVar, anruVar, aoiwVar, aogwVar, aokwVar, aojqVar);
        dbsk.a(dvayVar.b == 7);
        this.o = angpVar;
        this.q = anqxVar;
        this.p = cjqyVar;
        this.r = apkfVar;
        this.s = anrzVar;
        this.t = anpwVar;
        this.u = dxioVar;
        this.y = null;
        this.z = null;
        this.v = aofeVar;
        this.w = ah(dvayVar);
        this.x = z2;
    }

    public static void W(anpw anpwVar, dvyw dvywVar, dvay dvayVar, dbsg<dqfw> dbsgVar) {
        if (!ae(dvywVar, dvayVar)) {
            return;
        }
        if (!dbsgVar.a()) {
            bvoo.h("Day raw token not found for checkin in Timeline.", new Object[0]);
        }
        dqfw dqfwVar = dvayVar.t;
        if (dqfwVar == null) {
            dqfwVar = dqfw.a;
        }
        anpwVar.a(dvywVar, dbsgVar, dbsg.i(dqfwVar));
    }

    private static boolean ae(dvyw dvywVar, dvay dvayVar) {
        return !dvywVar.aE && dvayVar.r;
    }

    private static jic af() {
        return aple.d(null, ckqc.FULLY_QUALIFIED, cqrt.f(2131231574));
    }

    private final dnsf ag() {
        dvat dvatVar;
        dnse bZ = dnsf.c.bZ();
        int i = 2;
        if (e()) {
            i = 5;
        } else {
            dvay dvayVar = this.g;
            if (dvayVar.b == 7) {
                dvatVar = (dvat) dvayVar.c;
            } else {
                dvatVar = dvat.g;
            }
            int a2 = dqkl.a(dvatVar.f);
            if (a2 != 0 && a2 != 1) {
                dvay dvayVar2 = this.g;
                i = dqkl.a((dvayVar2.b == 7 ? (dvat) dvayVar2.c : dvat.g).f);
                if (i == 0) {
                    i = 1;
                }
            }
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnsf dnsfVar = (dnsf) bZ.b;
        dnsfVar.b = Integer.valueOf(i - 1);
        dnsfVar.a = 1;
        return bZ.bK();
    }

    private static dcdc<dprk> ah(dvay dvayVar) {
        dccx F = dcdc.F();
        for (dqjp dqjpVar : dvayVar.l) {
            if ((dqjpVar.a & 1) != 0) {
                dprk dprkVar = dqjpVar.b;
                if (dprkVar == null) {
                    dprkVar = dprk.d;
                }
                F.g(dprkVar);
            }
        }
        for (dvay dvayVar2 : dvayVar.o) {
            F.i(ah(dvayVar2));
        }
        return F.f();
    }

    public final void X(dvyw dvywVar, dnqm dnqmVar) {
        this.o.c(this.g, dvywVar, dnqmVar, ag());
        W(this.t, dvywVar, this.g, this.i.h());
    }

    public final void Y() {
        anrw anrwVar = new anrw(this);
        new AlertDialog.Builder(this.c).setTitle(R.string.MAPS_ACTIVITY_REMOVE_STOP_FROM_DAY_TITLE).setMessage(R.string.MAPS_ACTIVITY_REMOVE_STOP_FROM_DAY_BODY).setPositiveButton(R.string.REMOVE, anrwVar).setNegativeButton(R.string.CANCEL_BUTTON, anrwVar).show();
    }

    public final void Z() {
        ilo p = p();
        if (!akqi.d(p.ai()) && p.bi()) {
            ily g = p.g();
            g.j(akqi.a);
            p = g.d();
        }
        begj begjVar = new begj();
        begjVar.b(p);
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        this.u.a().o(begjVar, false, null);
    }

    @Override // defpackage.anrr
    public final void a() {
        this.c.D(aodr.g(aoeb.c(T()), I(), new anrx(this.g, ag(), this.i.c)));
    }

    public final dbsg<dvyw> aa() {
        dvat dvatVar;
        dvay dvayVar = this.g;
        if (dvayVar.b == 7) {
            dvatVar = (dvat) dvayVar.c;
        } else {
            dvatVar = dvat.g;
        }
        for (dvas dvasVar : dvatVar.b) {
            dvyw dvywVar = dvasVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            if (dvywVar.aE) {
                dvyw dvywVar2 = dvasVar.b;
                if (dvywVar2 == null) {
                    dvywVar2 = dvyw.bv;
                }
                return dbsg.i(dvywVar2);
            }
        }
        return dbpy.a;
    }

    public final anry ab(dvay dvayVar) {
        return this.s.a(dvayVar, this.i, this.j, this.x);
    }

    public final boolean ac() {
        dvat dvatVar;
        dvay dvayVar = this.g;
        if (dvayVar.b == 7) {
            dvatVar = (dvat) dvayVar.c;
        } else {
            dvatVar = dvat.g;
        }
        int a2 = dqjr.a(dvatVar.e);
        return a2 != 0 && a2 == 3;
    }

    public final akqq ad() {
        dvyw dvywVar = o().b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        dhjz dhjzVar = dvywVar.e;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        if ((o().a & 4) != 0) {
            dpum dpumVar = o().d;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            return akqq.f(dpumVar);
        }
        return akqq.j(dhjzVar);
    }

    @Override // defpackage.anrr
    public final boolean c() {
        dvat dvatVar;
        if (!d()) {
            dvay dvayVar = this.g;
            if (dvayVar.b == 7) {
                dvatVar = (dvat) dvayVar.c;
            } else {
                dvatVar = dvat.g;
            }
            int a2 = dqkl.a(dvatVar.f);
            if (a2 != 0 && a2 == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.anrr
    public final boolean d() {
        return ae(p().h(), this.g) && !N();
    }

    @Override // defpackage.anrr
    public final boolean e() {
        dvat dvatVar;
        if (!d()) {
            dvay dvayVar = this.g;
            if (dvayVar.b == 7) {
                dvatVar = (dvat) dvayVar.c;
            } else {
                dvatVar = dvat.g;
            }
            int a2 = dqkl.a(dvatVar.f);
            if (a2 != 0 && a2 == 5 && aa().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.anrr
    public final String f() {
        dvat dvatVar;
        if (e()) {
            dvay dvayVar = this.g;
            if (dvayVar.b == 7) {
                dvatVar = (dvat) dvayVar.c;
            } else {
                dvatVar = dvat.g;
            }
            for (dvas dvasVar : dvatVar.b) {
                dvyw dvywVar = dvasVar.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                if (dvywVar.aE) {
                    dvyw dvywVar2 = dvasVar.b;
                    if (dvywVar2 == null) {
                        dvywVar2 = dvyw.bv;
                    }
                    return dvywVar2.i;
                }
            }
            bvoo.h("Did not find any neighborhood candidate.", new Object[0]);
            return "";
        }
        apkf apkfVar = this.r;
        dvyw dvywVar3 = o().b;
        if (dvywVar3 == null) {
            dvywVar3 = dvyw.bv;
        }
        String b = apkfVar.b(dvywVar3, o().c);
        return b != null ? b : this.g.h;
    }

    @Override // defpackage.anrr
    public final String g() {
        if (e()) {
            return "";
        }
        dvyw dvywVar = o().b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        return dvywVar.p;
    }

    @Override // defpackage.anrr
    public final cqsn h() {
        boolean d = d();
        int i = R.string.MAPS_ACTIVITY_ARE_YOU_HERE;
        if (d) {
            return cqrt.l(R.string.MAPS_ACTIVITY_ARE_YOU_HERE);
        }
        if (!c()) {
            return cqrt.l(true != H() ? R.string.MAPS_ACTIVITY_YOU_WERE_AT : R.string.MAPS_ACTIVITY_YOU_ARE_HERE);
        }
        if (true != H()) {
            i = R.string.MAPS_ACTIVITY_WERE_YOU_HERE;
        }
        return cqrt.l(i);
    }

    @Override // defpackage.anrr
    public final cqsn i() {
        return cqrt.l(R.string.MAPS_ACTIVITY_MISSING_VISIT_IN);
    }

    @Override // defpackage.anrr
    public final cqsn j() {
        if (e()) {
            return cqrt.l(R.string.MAPS_ACTIVITY_CONFIRM_PLACE_VISITED);
        }
        return cqrt.l(true != H() ? R.string.MAPS_ACTIVITY_WERE_YOU_HERE : R.string.MAPS_ACTIVITY_ARE_YOU_HERE);
    }

    @Override // defpackage.anrr
    protected final jic k() {
        if (e()) {
            return af();
        }
        return this.e.b(o().e);
    }

    @Override // defpackage.anrr
    protected final jic l() {
        if (e()) {
            return af();
        }
        return this.e.b(o().f);
    }

    @Override // defpackage.anrr
    protected final aogm m() {
        aogh a2 = anpx.a(this.i, this.q);
        a2.h(ad());
        a2.i(Float.valueOf(14.0f));
        a2.d(dbsg.i(ad()));
        if (F().booleanValue()) {
            a2.b(dcbg.b(G()).s(new dbrn(this) { // from class: anrv
                private final anry a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.ab((dvay) obj).ad();
                }
            }).z());
        }
        return a2.a();
    }

    public final dvas o() {
        dvat dvatVar;
        dvas dvasVar;
        dvat dvatVar2;
        if (this.y == null) {
            dvay dvayVar = this.g;
            if (dvayVar.b == 7) {
                dvatVar = (dvat) dvayVar.c;
            } else {
                dvatVar = dvat.g;
            }
            if (dvatVar.b.size() > 0) {
                dvay dvayVar2 = this.g;
                if (dvayVar2.b == 7) {
                    dvatVar2 = (dvat) dvayVar2.c;
                } else {
                    dvatVar2 = dvat.g;
                }
                dvasVar = dvatVar2.b.get(0);
            } else {
                bvoo.h("getMainCandidate called even though the segment does not contain any candidates", new Object[0]);
                dvasVar = dvas.g;
            }
            this.y = dvasVar;
        }
        dvas dvasVar2 = this.y;
        dbsk.s(dvasVar2);
        return dvasVar2;
    }

    public final ilo p() {
        if (this.z == null) {
            ily.a(this.c);
            ily ilyVar = new ily();
            dvyw dvywVar = o().b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilyVar.E(dvywVar);
            this.z = ilyVar.d();
        }
        ilo iloVar = this.z;
        dbsk.s(iloVar);
        return iloVar;
    }

    @Override // defpackage.anrr
    protected final anrp q() {
        int V = V();
        int i = V - 1;
        if (V != 0) {
            if (i == 0) {
                return anrp.a(R.string.MAPS_ACTIVITY_START_AND_END_TIME, O(), P());
            }
            if (i == 1) {
                return anrp.a(R.string.MAPS_ACTIVITY_LEFT_AT, P());
            }
            if (i != 2) {
                if (i == 3) {
                    return anrp.a(R.string.MAPS_ACTIVITY_ALL_DAY, new Object[0]);
                }
                if (i != 4) {
                    if (i == 5) {
                        return anrp.a(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_NOW, new Object[0]);
                    }
                    String a2 = anrq.a(V());
                    StringBuilder sb = new StringBuilder(a2.length() + 17);
                    sb.append("unsupported type ");
                    sb.append(a2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return anrp.a(R.string.MAPS_ACTIVITY_ARRIVED_AT, O());
        }
        throw null;
    }

    public final void r() {
        dvat dvatVar;
        dvat dvatVar2;
        this.o.n(this.g, U(), ag());
        dvay dvayVar = this.g;
        if (dvayVar.b == 7) {
            dvatVar = (dvat) dvayVar.c;
        } else {
            dvatVar = dvat.g;
        }
        if (dvatVar.b.size() == 0) {
            return;
        }
        anpw anpwVar = this.t;
        dvay dvayVar2 = this.g;
        if (dvayVar2.b == 7) {
            dvatVar2 = (dvat) dvayVar2.c;
        } else {
            dvatVar2 = dvat.g;
        }
        dvyw dvywVar = dvatVar2.b.get(0).b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        W(anpwVar, dvywVar, this.g, this.i.h());
    }

    @Override // defpackage.anrr
    public final boolean s() {
        return !this.w.isEmpty();
    }

    @Override // defpackage.anrr
    public final aofb t() {
        aofe aofeVar = this.v;
        dcdc<dprk> dcdcVar = this.w;
        akqi ai = p().ai();
        aofe.a(dcdcVar, 1);
        aofe.a(ai, 2);
        aofg a2 = aofeVar.a.a();
        aofe.a(a2, 3);
        Application a3 = aofeVar.b.a();
        aofe.a(a3, 4);
        aofk a4 = aofeVar.c.a();
        aofe.a(a4, 5);
        return new aofd(dcdcVar, ai, a2, a3, a4);
    }

    @Override // defpackage.anrr
    protected final anro n() {
        if (!this.x) {
            return anro.e(iva.c(R.color.qu_blue_grey_400, R.color.mod_grey850), ibm.b(), iva.c(R.color.maps_activity_timeline_segment_card_secondary_text, R.color.maps_activity_timeline_segment_card_secondary_text_night), ibm.b());
        }
        return this.e.a();
    }
}
