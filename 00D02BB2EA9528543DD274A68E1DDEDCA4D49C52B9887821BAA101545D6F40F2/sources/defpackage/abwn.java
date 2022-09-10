package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: abwn  reason: default package */
/* loaded from: classes2.dex */
public final class abwn extends ges {
    private static final dcqe an = dcqe.c("abwn");
    public bvnx a;
    public akox ad;
    public abwq ae;
    public araj af;
    public abwr ag;
    public acex ah;
    public gek ai;
    public acwt aj;
    public abyh ak;
    public aces al;
    @dzsi
    public acew am;
    @dzsi
    private View aq;
    @dzsi
    private cqkf<aceo> ar;
    @dzsi
    private cqkf<acep> as;
    @dzsi
    private cqkf<aceq> at;
    public cqhn b;
    public dxio<ache> c;
    public jkj d;
    public cqkj e;
    public jkf f;
    public efg g;
    private final abwm ao = new abwm();
    private final jkh ap = new abwl(this);
    private SparseArray<Parcelable> au = new SparseArray<>();

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aceq> cqkfVar = this.at;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.at = null;
        }
        cqkf<acep> cqkfVar2 = this.as;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
            this.as = null;
        }
        cqkf<aceo> cqkfVar3 = this.ar;
        if (cqkfVar3 != null) {
            cqkfVar3.e(null);
            this.ar = null;
        }
        this.aq = null;
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        gga ggaVar = this.aE;
        if (ggaVar == null) {
            bvoo.h("onCreateView() called before the fragment is attached.", new Object[0]);
            return null;
        }
        if (bundle != null && bundle.getSparseParcelableArray("view-hierarchy-state") != null) {
            this.au = bundle.getSparseParcelableArray("view-hierarchy-state");
        }
        abyh abyhVar = this.ak;
        akox akoxVar = abyhVar.d;
        abyhVar.e.g(abyh.d(akoxVar, akoxVar.l().p()));
        cqkf<aceq> e = this.e.e(new acde());
        this.at = e;
        e.e(this.am);
        View c = this.at.c();
        this.aq = c;
        c.restoreHierarchyState(this.au);
        aces acesVar = this.al;
        aces.a(ggaVar, 1);
        jkf a = acesVar.a.a();
        aces.a(a, 2);
        acek a2 = acesVar.b.a();
        aces.a(a2, 3);
        acer acerVar = new acer(ggaVar, a, a2);
        this.ao.a(acerVar);
        cqkf<aceo> e2 = this.e.e(new acct());
        this.ar = e2;
        e2.e(acerVar);
        acev acevVar = new acev(this.b, this.c, ggaVar, this.f);
        this.ao.a(acevVar);
        cqkf<acep> e3 = this.e.e(new accx());
        this.as = e3;
        e3.e(acevVar);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        View view = this.aq;
        dbsk.s(view);
        view.restoreHierarchyState(this.au);
        this.aj.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        View view = this.aq;
        dbsk.s(view);
        view.saveHierarchyState(this.au);
        this.aj.a();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        acew acewVar = this.am;
        if (acewVar != null) {
            this.ae.b(acewVar);
        }
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        int i;
        gga ggaVar = this.aE;
        if (ggaVar == null || !this.aD) {
            return false;
        }
        jjn L = this.d.L();
        btpf c = btpf.c(ggaVar);
        if (!L.c(jjn.EXPANDED) || c.f) {
            ggaVar.g().f();
        } else {
            this.f.setExpandingState(jjn.EXPANDED, true);
            RecyclerView recyclerView = (RecyclerView) ggaVar.findViewById(R.id.visual_explore_gallery);
            if (recyclerView != null) {
                adz a = cqre.a(recyclerView);
                if (a instanceof acbx) {
                    ((acbx) a).c = 1;
                }
                aeh aehVar = (aeh) recyclerView.l;
                if (aehVar != null && (i = aehVar.a) > 0) {
                    int[] iArr = new int[i];
                    if (i < i) {
                        throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + aehVar.a + ", array size:" + i);
                    }
                    for (int i2 = 0; i2 < aehVar.a; i2++) {
                        aeg aegVar = aehVar.b[i2];
                        iArr[i2] = aegVar.f.e ? aegVar.s(aegVar.a.size() - 1, -1) : aegVar.s(0, aegVar.a.size());
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = iArr[i3];
                        if (i4 != -1 && i4 <= 20) {
                            recyclerView.n(0);
                            break;
                        }
                    }
                }
                recyclerView.l(20);
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new acby(recyclerView));
            }
        }
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        acex acexVar = this.ah;
        jkf jkfVar = this.f;
        acex.a(jkfVar, 1);
        acex.a(acexVar.a.a(), 2);
        abwo a = acexVar.b.a();
        acex.a(a, 3);
        abwq a2 = acexVar.c.a();
        acex.a(a2, 4);
        acbw a3 = acexVar.d.a();
        acex.a(a3, 5);
        Application a4 = acexVar.e.a();
        acex.a(a4, 6);
        abtz a5 = acexVar.f.a();
        acex.a(a5, 7);
        acew acewVar = new acew(jkfVar, a, a2, a3, a4, a5);
        this.am = acewVar;
        this.ao.a(acewVar);
        this.ao.a(this.ap);
        ((abxw) this.ae).b = new abxy();
        abwq abwqVar = this.ae;
        acew acewVar2 = this.am;
        dbsk.s(acewVar2);
        abwqVar.a(acewVar2);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<aceq> cqkfVar = this.at;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.am);
        this.ag.a();
        this.ae.d();
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.w(null);
        egjVar.az(this.aq, new Callable(this) { // from class: abwk
            private final abwn a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                acew acewVar = this.a.am;
                dbsk.s(acewVar);
                return Integer.valueOf(acewVar.k());
            }
        });
        egjVar.t(this.ao);
        egjVar.Y(false);
        egjVar.ai(this.ai.a(jjn.EXPANDED));
        egjVar.ao(true);
        cqkf<acep> cqkfVar2 = this.as;
        dbsk.s(cqkfVar2);
        egjVar.r(cqkfVar2.c());
        cqkf<aceo> cqkfVar3 = this.ar;
        dbsk.s(cqkfVar3);
        egjVar.aw(cqkfVar3.c(), false);
        egjVar.B(false);
        egjVar.f(false);
        egjVar.Q(this.af.e());
        egjVar.O(jjn.HIDDEN);
        egjVar.aj(egn.ONE_THIRD_EXPANDED_MAP);
        egjVar.ak(jkc.c, jkc.l);
        egf a = egf.a();
        a.g = false;
        a.x = false;
        a.l(false);
        a.q();
        a.r();
        a.s = true;
        a.p();
        a.o();
        a.l = new afwn[]{afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false), afwn.e(afwm.REALTIME, false)};
        egjVar.A(a);
        this.g.a(egjVar.a());
        abyh abyhVar = this.ak;
        dbsk.s(abyhVar);
        alad p = abyhVar.d.l().p();
        abyhVar.f = p;
        abyhVar.g = p;
        btrm btrmVar = abyhVar.b;
        abyg abygVar = abyhVar.a;
        dceq a2 = dcet.a();
        a2.b(ardp.class, new abyi(ardp.class, abygVar, bvrj.UI_THREAD));
        btrmVar.g(abygVar, a2.a());
        abyhVar.c.a().k(abyhVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (this.aD) {
            View view = this.aq;
            dbsk.s(view);
            view.saveHierarchyState(this.au);
        }
        bundle.putSparseParcelableArray("view-hierarchy-state", this.au);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ai.c = this.f.l().L();
        abyh abyhVar = this.ak;
        dbsk.s(abyhVar);
        abyhVar.b.a(abyhVar.a);
        abyhVar.c.a().l(abyhVar);
        this.ag.b();
        super.u();
    }
}
