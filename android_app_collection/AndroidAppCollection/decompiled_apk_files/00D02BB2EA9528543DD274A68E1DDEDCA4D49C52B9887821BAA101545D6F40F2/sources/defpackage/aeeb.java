package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aeeb  reason: default package */
/* loaded from: classes.dex */
public class aeeb implements aedx {
    public final dkuo a;
    public final cjqy b;
    public final cjqq c;
    public cqtc d;
    public final bzmc e;
    public dktk f;
    private List<aeea> g;
    private final aedt h;
    private final aedu i;
    private final aeds j;
    private final boolean k;

    public aeeb(Activity activity, cqhn cqhnVar, acyr acyrVar, iwl iwlVar, cjqy cjqyVar, cjqq cjqqVar, acyp acypVar, qbv qbvVar, bzmc bzmcVar, dktk dktkVar, Set<dktk> set, aedt aedtVar, aedu aeduVar, aeds aedsVar) {
        this.b = cjqyVar;
        this.c = cjqqVar;
        this.e = bzmcVar;
        this.h = aedtVar;
        this.i = aeduVar;
        this.j = aedsVar;
        this.f = dktkVar;
        boolean e = qbvVar.e();
        this.k = e;
        dkuo b = dkuo.b(acyrVar.a().f);
        this.a = b == null ? dkuo.UNKNOWN_BUTTON_STYLE : b;
        dklz e2 = acypVar.e();
        dccx F = dcdc.F();
        if (set.contains(dktk.EXPLORE)) {
            dklo dkloVar = e2.e;
            int a = dkln.a((dkloVar == null ? dklo.b : dkloVar).a);
            F.g(new aeea(this, activity, dktk.EXPLORE, iup.e(R.raw.ic_mod_tab_explore), iup.e(R.raw.ic_mod_tab_explore_selected), (a != 0 && a == 3) ? R.string.MAP_TAB_BUTTON : R.string.EXPLORE_TAB_BUTTON, dtxr.ax, dtxr.aw, R.id.explore_tab_strip_button));
        }
        if (set.contains(dktk.INFORMAL_TRANSIT)) {
            F.g(new aeea(this, activity, dktk.INFORMAL_TRANSIT, i(), i(), true != e ? R.string.INFORMAL_TRANSIT_TAB_BUTTON : R.string.TRANSPORTATION_TAB_BUTTON, dtxr.ag, dtxr.af, R.id.informal_transit_tab_strip_button));
        }
        if (set.contains(dktk.COMMUTE)) {
            F.g(new aeea(this, activity, dktk.COMMUTE, iup.e(R.raw.ic_mod_tab_commute), iup.e(R.raw.ic_mod_tab_commute_selected), R.string.COMMUTE_TAB_BUTTON, dtxr.I, dtxr.H, R.id.commute_tab_strip_button));
        }
        if (set.contains(dktk.TRANSPORTATION)) {
            F.g(new aeea(this, activity, dktk.TRANSPORTATION, cqrt.f(2131232589), cqrt.f(2131232589), R.string.TRANSPORTATION_TAB_BUTTON, dtxr.aY, dtxr.aX, R.id.transportation_tab_strip_button));
        }
        if (set.contains(dktk.SAVED_LISTS)) {
            dkls dklsVar = e2.b;
            int a2 = dklr.a((dklsVar == null ? dkls.b : dklsVar).a);
            F.g(new aeea(this, activity, dktk.SAVED_LISTS, iup.e(R.raw.ic_mod_tab_saved), iup.e(R.raw.ic_mod_tab_saved_selected), (a2 != 0 && a2 == 3) ? R.string.PLACES_TAB_BUTTON : R.string.SAVED_TAB_BUTTON, dtxr.aI, dtxr.aH, R.id.saved_tab_strip_button));
        }
        if (set.contains(dktk.CONTRIBUTE)) {
            dklk dklkVar = e2.c;
            int a3 = dklj.a((dklkVar == null ? dklk.c : dklkVar).b);
            F.g(new aeea(this, activity, dktk.CONTRIBUTE, iup.e(R.raw.ic_add_circle_outline), iup.e(R.raw.ic_add_circle), (a3 != 0 && a3 == 3) ? R.string.POST_TAB_BUTTON : R.string.CONTRIBUTE_TAB_BUTTON, dtxr.K, dtxr.J, R.id.contribute_tab_strip_button));
        }
        if (set.contains(dktk.FEED)) {
            F.g(new aeea(this, activity, dktk.FEED, iup.e(R.raw.ic_mod_tab_local_stream), iup.e(R.raw.ic_mod_tab_local_stream_selected), R.string.LOCALSTREAM_PAGE_TITLE_FOR_YOU, dtxr.Y, dtxr.X, R.id.feed_tab_strip_button));
        }
        if (set.contains(dktk.UPDATES)) {
            dkly dklyVar = e2.d;
            int a4 = dklx.a((dklyVar == null ? dkly.d : dklyVar).b);
            int i = R.string.UPDATES_TAB_BUTTON;
            if (a4 != 0 && a4 == 3) {
                i = R.string.LATEST_TAB_BUTTON;
            }
            F.g(new aeea(this, activity, dktk.UPDATES, iup.e(R.raw.ic_mod_tab_updates), iup.e(R.raw.ic_mod_tab_updates_selected), i, dtxr.bm, dtxr.bl, R.id.updates_tab_strip_button));
        }
        dcdc f = F.f();
        this.g = f;
        int size = f.size();
        cqtv f2 = cqsg.f(cqsz.c(), Float.valueOf(Math.min(0.3f, (1.0f / size) - (size > 3 ? 0.01f : 0.02f))));
        this.d = btpf.c(activity).e ? cqsg.j(f2, cqrp.d(150.0d)) : f2;
    }

    @dzsi
    private final aeea h(dktk dktkVar) {
        for (aeea aeeaVar : this.g) {
            if (aeeaVar.b.equals(dktkVar)) {
                return aeeaVar;
            }
        }
        return null;
    }

    private final cqtd i() {
        if (this.k) {
            return cqrt.f(2131232589);
        }
        return cqrt.f(2131231735);
    }

    @Override // defpackage.aedx
    public List<? extends aedw> a() {
        return this.g;
    }

    public void b(dktk dktkVar) {
        this.f = dktkVar;
        cqkx.p(this);
    }

    public void c(dktk dktkVar, cjqm cjqmVar) {
        for (aeea aeeaVar : this.g) {
            if (aeeaVar.b == dktkVar) {
                dktk dktkVar2 = this.f;
                if (dktkVar2 != dktkVar) {
                    this.i.a(dktkVar2);
                    this.f = dktkVar;
                    this.h.a(dktkVar, false, cjqmVar);
                } else {
                    this.j.a(dktkVar);
                }
                cqkx.p(this);
                return;
            }
        }
    }

    public void d(dktk dktkVar, boolean z) {
        aeea h = h(dktkVar);
        if (h == null || h.e == z) {
            return;
        }
        h.n(z);
        cqkx.p(h);
    }

    public void e(dktk dktkVar, boolean z) {
        aeea h = h(dktkVar);
        if (h == null || h.g == z) {
            return;
        }
        h.o(z);
        cqkx.p(h);
    }

    public void f(dktk dktkVar, ddho ddhoVar, ddho ddhoVar2) {
        aeea h = h(dktkVar);
        if (h != null) {
            if (h.c.equals(ddhoVar) && h.d.equals(ddhoVar2)) {
                return;
            }
            h.p(ddhoVar, ddhoVar2);
            cqkx.p(h);
        }
    }

    public dktk g() {
        return this.f;
    }
}
