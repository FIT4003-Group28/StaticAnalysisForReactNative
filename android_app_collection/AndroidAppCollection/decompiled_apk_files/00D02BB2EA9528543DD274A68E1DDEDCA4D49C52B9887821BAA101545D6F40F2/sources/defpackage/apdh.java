package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: apdh  reason: default package */
/* loaded from: classes2.dex */
public final class apdh extends ges implements apdi {
    private static final dcqe au = dcqe.c("apdh");
    private static final dcaz<aoyi, aoxr> av;
    public bwqv a;
    private aphh aA;
    private apkj aB;
    public gga ad;
    public aphg ae;
    public jkf af;
    public gek ag;
    public apcl ah;
    public aoxq ai;
    cqkf<jam> aj;
    cqkf<apeb> ak;
    public boolean al = true;
    cqkf<apfy> am;
    aper an;
    boolean ao;
    public bwrs<HashSet<akqi>> ap;
    bwrs<aoyg> aq;
    dcdc<aoxp> ar;
    final apgt as;
    apgu at;
    @dzsi
    private Parcelable aw;
    private final dbuv<aoyj, bwrs<aoyg>> ax;
    private final bwrr<aoyg> ay;
    private boolean az;
    public cqkj b;
    public cqhu c;
    public aoxv d;
    public apes e;
    public aowy f;
    public apgv g;

    static {
        dcdn l = dcdn.l(aoyi.BY_LAST_VISIT_TIME_DESCENDING, aoxr.LAST_VISIT_TIME, aoyi.BY_NUM_VISITS_DESCENDING, aoxr.NUM_VISITS);
        dbsk.a(!l.isEmpty());
        Class declaringClass = ((Enum) l.keySet().iterator().next()).getDeclaringClass();
        dbsk.a(!l.isEmpty());
        dcaz<aoyi, aoxr> k = dcaz.k(declaringClass, ((Enum) l.values().iterator().next()).getDeclaringClass());
        k.putAll(l);
        av = k;
    }

    public apdh() {
        dbuo<Object, Object> a = dbuo.a();
        a.j(5L);
        a.h(10L, TimeUnit.MINUTES);
        this.ax = a.d(dbus.d(new dbrn(this) { // from class: apdc
            private final apdh a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.d.a((aoyj) obj);
            }
        }));
        this.ay = new bwrr(this) { // from class: apdd
            private final apdh a;

            {
                this.a = this;
            }

            @Override // defpackage.bwrr
            public final void PV(Object obj) {
                apdh apdhVar = this.a;
                aoyg aoygVar = (aoyg) obj;
                aoyg c = apdhVar.aq.c();
                dbsk.s(c);
                if (c.b() == aoyf.ERROR) {
                    apdhVar.ah.b(apdhVar.aq, apdhVar.ad);
                    return;
                }
                apdhVar.ah.a(apdhVar.aq);
                apdhVar.q(apdhVar.af.l().L(), apdhVar.al);
                aoyg c2 = apdhVar.aq.c();
                dbsk.s(c2);
                if (c2.d().isEmpty()) {
                    return;
                }
                apdhVar.al = false;
            }
        };
        this.as = new apdg(this);
    }

    private final apgu aS(aoyj aoyjVar) {
        dbsg<aoxp> b = aoyjVar.b();
        dbsg<ilo> c = aoyjVar.c();
        apgv apgvVar = this.g;
        apgt apgtVar = this.as;
        aoxr aR = aR();
        boolean z = this.az;
        dcdc<aoxp> dcdcVar = this.ar;
        gga a = apgvVar.a.a();
        apgv.a(a, 1);
        apgh a2 = apgvVar.b.a();
        apgv.a(a2, 2);
        apgx a3 = apgvVar.c.a();
        apgv.a(a3, 3);
        cqhn a4 = apgvVar.d.a();
        apgv.a(a4, 4);
        aoxq a5 = apgvVar.e.a();
        apgv.a(a5, 5);
        apgv.a(apgtVar, 6);
        apgv.a(b, 7);
        apgv.a(c, 8);
        apgv.a(aR, 10);
        apgv.a(dcdcVar, 12);
        return new apgu(a, a2, a3, a4, a5, apgtVar, b, c, true, aR, z, dcdcVar);
    }

    private final void aT(aowm aowmVar, String str, @dzsi String str2, @dzsi aphe apheVar, jjn jjnVar) {
        this.aj.e(aphf.a(aowmVar, this.ad, str, str2, apheVar));
        this.ae.a(this, this.aj, this.am, null, jjk.a(this.aA, this.aB), aozr.l(this.am, this.c), jjnVar);
        this.f.c(dcdc.e(), this.f.p);
    }

    private final dcdc<aoxt> aU(dcdc<aoxt> dcdcVar) {
        dccx F = dcdc.F();
        HashSet<akqi> c = this.ap.c();
        dbsk.s(c);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aoxt aoxtVar = dcdcVar.get(i);
            if (!c.contains(aoxtVar.a().ai())) {
                F.g(aoxtVar);
            }
        }
        return F.f();
    }

    public static apdh g(bwqv bwqvVar, bwrs<aoyg> bwrsVar) {
        apdh apdhVar = new apdh();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "current_visited_places_list_ref", bwrsVar);
        bwqvVar.c(bundle, "removed_places_set_ref", bwrs.a(new HashSet()));
        bundle.putBoolean("change_zoom_level_on_start", true);
        bundle.putBoolean("show_sorting_method", false);
        bundle.putSerializable("place_categories_ordered_list", dcdc.e());
        bundle.putParcelable("recycler_view_scroll_state", null);
        apdhVar.B(bundle);
        return apdhVar;
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof aoxr) {
            aoxr aoxrVar = (aoxr) obj;
            this.az = true;
            if (aoxrVar == aR()) {
                return;
            }
            i(w(aoxrVar));
        }
    }

    public final void aJ(boolean z) {
        aoxr aR = aR();
        aowy aowyVar = this.f;
        aoyg c = this.aq.c();
        dbsk.s(c);
        aowyVar.j(aU(c.d()), aR == aoxr.NUM_VISITS ? 4 : 3, this.f.p);
        if (z) {
            aoyg c2 = this.aq.c();
            dbsk.s(c2);
            dcdc<aoxt> aU = aU(c2.c());
            if (aU.isEmpty()) {
                return;
            }
            this.f.e(aowo.RECENT, aU);
        }
    }

    public final aoxr aR() {
        dcaz<aoyi, aoxr> dcazVar = av;
        aoyg c = this.aq.c();
        dbsk.s(c);
        return (aoxr) dcazVar.get(c.a().a());
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ak = this.b.c(new apdv(), viewGroup);
        this.aj = this.b.c(new aozp(), viewGroup);
        this.am = this.b.c(new apfn(), viewGroup);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        bwqv.t(this.aq, this.ay);
        super.am();
    }

    public final void i(aoyj aoyjVar) {
        bwqv.t(this.aq, this.ay);
        this.al = true;
        try {
            bwrs<aoyg> f = this.ax.f(aoyjVar);
            this.aq = f;
            this.a.f(f, this.ay, false);
            q(this.af.l().L(), true);
        } catch (ExecutionException e) {
            throw new RuntimeException("Exception during obtaining a list", e);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dcdc<aoxp> r;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle == null) {
            bvoo.h("No state available in onCreate", new Object[0]);
        } else {
            this.ao = bundle.getBoolean("change_zoom_level_on_start");
            this.az = bundle.getBoolean("show_sorting_method");
            this.aw = bundle.getParcelable("recycler_view_scroll_state");
        }
        this.aq = this.ah.g(bundle);
        this.ap = this.ah.f(bundle);
        dbuv<aoyj, bwrs<aoyg>> dbuvVar = this.ax;
        aoyg c = this.aq.c();
        dbsk.s(c);
        dbuvVar.d(c.a(), this.aq);
        this.a.f(this.aq, this.ay, false);
        this.aA = new aphh(this.ad);
        this.aB = new apkj();
        List list = (List) bundle.getSerializable("place_categories_ordered_list");
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.ai.a());
            aoyg c2 = this.aq.c();
            dbsk.s(c2);
            dbsg<aoxp> b = c2.a().b();
            if (b.a()) {
                arrayList.remove(b.b());
                arrayList.add(0, b.b());
            }
            r = dcdc.r(arrayList);
        } else {
            r = dcdc.r(list);
        }
        this.ar = r;
    }

    public final void q(jjn jjnVar, boolean z) {
        if (this.aD) {
            aoyg c = this.aq.c();
            dbsk.s(c);
            if (c.b() == aoyf.PARTIALLY_LOADED || c.b() == aoyf.FULLY_LOADED) {
                aoyg c2 = this.aq.c();
                dbsk.s(c2);
                dcdc<aoxt> c3 = c2.c();
                int size = c3.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    HashSet<akqi> c4 = this.ap.c();
                    dbsk.s(c4);
                    if (!c4.contains(c3.get(i2).a().ai())) {
                        i++;
                    }
                }
                if (i == 0) {
                    aoyg c5 = this.aq.c();
                    dbsk.s(c5);
                    if (c5.a().b().a()) {
                        aT(aowm.NO_VISITED_PLACES, this.ad.getString(R.string.NO_PLACE_VISITS_OF_THIS_TYPE), this.ad.getString(R.string.MAPS_ACTIVITY_VIEW_ALL_VISITED_PLACES_BUTTON), new aphe(this) { // from class: apde
                            private final apdh a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.aphe
                            public final void a() {
                                apdh apdhVar = this.a;
                                apdhVar.at.f(dbpy.a);
                                apdhVar.i(apdhVar.w(apdhVar.aR()));
                            }
                        }, jjnVar);
                        return;
                    } else {
                        aT(aowm.NO_VISITED_PLACES, this.ad.getString(R.string.NO_PLACE_VISITS), null, null, jjnVar);
                        return;
                    }
                }
            }
            apes apesVar = this.e;
            bwrs<aoyg> bwrsVar = this.aq;
            bwrs<HashSet<akqi>> bwrsVar2 = this.ap;
            aoxr aR = aR();
            apen a = apesVar.a.a();
            apes.a(a, 1);
            apep a2 = apesVar.b.a();
            apes.a(a2, 2);
            apcf a3 = apesVar.c.a();
            apes.a(a3, 3);
            apes.a(bwrsVar, 4);
            apes.a(bwrsVar2, 5);
            apes.a(this, 6);
            apes.a(aR, 7);
            aper aperVar = new aper(a, a2, a3, bwrsVar, bwrsVar2, this, aR);
            this.an = aperVar;
            this.ak.e(aperVar);
            aoyg c6 = this.aq.c();
            dbsk.s(c6);
            apgu aS = aS(c6.a());
            this.at = aS;
            this.am.e(aS);
            aJ(false);
            this.ae.a(this, this.ak, this.am, new apdf(this, z), jjk.a(this.aA, this.aB), aozr.l(this.am, this.c), jjnVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        GmmRecyclerView gmmRecyclerView;
        super.s();
        this.f.a();
        aoyg c = this.aq.c();
        dbsk.s(c);
        apgu aS = aS(c.a());
        this.at = aS;
        this.am.e(aS);
        if (this.aw != null && (gmmRecyclerView = (GmmRecyclerView) cqhu.a(this.ak.c(), apkj.a)) != null) {
            abs absVar = gmmRecyclerView.l;
            dbsk.s(absVar);
            Parcelable parcelable = this.aw;
            dbsk.s(parcelable);
            absVar.C(parcelable);
        }
        q(this.ag.a(jjn.EXPANDED), this.ao);
        this.ao = false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.a.c(bundle, "current_visited_places_list_ref", this.aq);
        this.a.c(bundle, "removed_places_set_ref", this.ap);
        bundle.putBoolean("change_zoom_level_on_start", this.ao);
        bundle.putBoolean("show_sorting_method", this.az);
        bundle.putSerializable("place_categories_ordered_list", this.ar);
        bundle.putParcelable("recycler_view_scroll_state", this.aw);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        Parcelable parcelable;
        this.f.b();
        GmmRecyclerView gmmRecyclerView = (GmmRecyclerView) cqhu.a(this.ak.c(), apkj.a);
        if (gmmRecyclerView != null) {
            abs absVar = gmmRecyclerView.l;
            dbsk.s(absVar);
            parcelable = absVar.B();
        } else {
            parcelable = null;
        }
        this.aw = parcelable;
        this.ag.c = this.af.l().L();
        super.u();
    }

    public final aoyj w(aoxr aoxrVar) {
        dbsg<aoxp> e = this.at.e();
        aoyg c = this.aq.c();
        dbsk.s(c);
        aoyh d = c.a().d();
        aoyi aoyiVar = (aoyi) av.b.get(aoxrVar);
        dbsk.s(aoyiVar);
        d.c(aoyiVar);
        d.b(e);
        return d.a();
    }
}
