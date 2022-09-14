package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: babb  reason: default package */
/* loaded from: classes3.dex */
public final class babb extends hxf {
    public bajo ad;
    public efg ae;
    public cqkj af;
    public dehq ag;
    public bajn ah;
    public cqkf<baew> ai;
    cqkf<?> aj;
    private boolean al;
    public acyp b;
    public aedv c;
    public gga d;
    public cklq e;
    public dxio<akfa> f;
    public dxio<ixr> g;
    private final baaz am = new baaz(this);
    private final baba an = new baba(this);
    @dzsi
    public SparseArray<Parcelable> ak = null;

    public static babb aR(boolean z, boolean z2) {
        babb babbVar = new babb();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_bottom_tab", z);
        bundle.putBoolean("has_fragment_search_tag", z2);
        babbVar.B(bundle);
        return babbVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        View findViewById = this.ai.c().findViewById(R.id.saved_tab_content);
        if (findViewById instanceof RecyclerView) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.ak = sparseArray;
            ((RecyclerView) findViewById).saveHierarchyState(sparseArray);
        }
        this.ai.e(null);
    }

    @Override // defpackage.ges, defpackage.ggg
    public final List<gfs> aO() {
        if (this.o.getBoolean("has_fragment_search_tag", false)) {
            return dcdc.f(gfs.HOMETAB);
        }
        return dcdc.e();
    }

    public final boolean aS(@dzsi btlu btluVar) {
        bajn bajnVar = this.ah;
        if (bajnVar != null && dbsd.a(bajnVar.t(), btluVar)) {
            return false;
        }
        bajn bajnVar2 = this.ah;
        if (bajnVar2 != null) {
            bajnVar2.r();
        }
        bajo bajoVar = this.ad;
        boolean z = this.al;
        cjqp b = bd().b();
        acyp a = bajoVar.a.a();
        bajo.a(a, 1);
        cqat a2 = bajoVar.b.a();
        bajo.a(a2, 2);
        cqhn a3 = bajoVar.c.a();
        bajo.a(a3, 3);
        btpc a4 = bajoVar.d.a();
        bajo.a(a4, 4);
        Executor a5 = bajoVar.e.a();
        bajo.a(a5, 5);
        Executor a6 = bajoVar.f.a();
        bajo.a(a6, 6);
        btrm a7 = bajoVar.g.a();
        bajo.a(a7, 7);
        gga a8 = bajoVar.h.a();
        bajo.a(a8, 8);
        cklq a9 = bajoVar.i.a();
        bajo.a(a9, 9);
        dxio a10 = ((dxjh) bajoVar.j).a();
        bajo.a(a10, 10);
        dxio a11 = ((dxjh) bajoVar.k).a();
        bajo.a(a11, 11);
        bagk a12 = bajoVar.l.a();
        bajo.a(a12, 12);
        axwg a13 = bajoVar.m.a();
        bajo.a(a13, 13);
        aosp a14 = bajoVar.n.a();
        bajo.a(a14, 14);
        bagz a15 = bajoVar.o.a();
        bajo.a(a15, 15);
        axwq a16 = bajoVar.p.a();
        bajo.a(a16, 16);
        bahj a17 = bajoVar.q.a();
        bajo.a(a17, 17);
        baia a18 = bajoVar.r.a();
        bajo.a(a18, 18);
        aotf a19 = bajoVar.s.a();
        bajo.a(a19, 19);
        cjnx a20 = bajoVar.t.a();
        bajo.a(a20, 20);
        bajo.a(this, 22);
        bajo.a(b, 24);
        this.ah = new bajn(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, btluVar, this, z, b);
        return true;
    }

    @Override // defpackage.hxf, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (this.b.f()) {
            return i(layoutInflater, bundle);
        }
        return super.ag(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        bajn bajnVar = this.ah;
        if (bajnVar != null) {
            bajnVar.r();
        }
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = this.d.getString(R.string.SAVED_TAB_BUTTON);
        a.f(new View.OnClickListener(this) { // from class: baay
            private final babb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.onBackPressed();
            }
        });
        a.x = false;
        a.l = this.d.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        a.n = this.d.getString(R.string.SAVED_PAGE_TITLE_CONTENT_DESCRIPTION);
        if (this.al) {
            a.j = null;
            a.i = null;
            a.k = null;
        }
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        if (this.ai == null || !this.b.f()) {
            this.ai = this.af.e(new bacy());
        }
        if (this.al && this.aj == null) {
            this.aj = this.c.d(null);
        }
        return this.ai.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray;
        super.l(bundle);
        this.al = this.o.getBoolean("show_bottom_tab");
        q(g());
        if (bundle == null || (sparseParcelableArray = bundle.getSparseParcelableArray("top_level_view_state")) == null) {
            return;
        }
        this.ak = sparseParcelableArray;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.aH;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        cqkf<?> cqkfVar;
        super.s();
        this.e.b();
        crzm<btlu> C = this.f.a().C();
        aS(C.l());
        this.ai.e(this.ah);
        C.a(this.am, this.ag);
        this.ah.o();
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egf a = egf.a();
        a.s = true;
        egjVar.A(a);
        if (this.al && (cqkfVar = this.aj) != null) {
            egjVar.av(cqkfVar.c());
            egjVar.au();
        }
        if (this.b.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        if (this.b.f()) {
            dxio<ixr> dxioVar = this.g;
            dbsk.s(dxioVar);
            ixr a2 = dxioVar.a();
            a2.o(false);
            a2.ak(false);
            a2.al(true);
            egjVar.Z();
            egjVar.W(a2);
        }
        if (this.b.g()) {
            egjVar.h();
        }
        this.ae.a(egjVar.a());
        this.ai.c().getViewTreeObserver().addOnPreDrawListener(this.an);
        if (this.al) {
            this.c.b(this);
            this.c.g(dktk.SAVED_LISTS);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putSparseParcelableArray("top_level_view_state", this.ak);
        super.t(bundle);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.c.c(this);
        this.ai.c().getViewTreeObserver().removeOnPreDrawListener(this.an);
        this.ah.q();
        this.f.a().C().c(this.am);
        super.u();
    }
}
