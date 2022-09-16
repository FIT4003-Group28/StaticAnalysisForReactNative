package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: afzm  reason: default package */
/* loaded from: classes2.dex */
public final class afzm extends bbdy implements achd, agxf {
    public agwa a;
    private cqkf<?> aA;
    @dzsi
    private dlcv aS;
    public afzs ad;
    public agae ae;
    public bwft af;
    public agaw ag;
    public agbj ah;
    public ahio ai;
    public efg aj;
    public cjqy ak;
    public cqkj al;
    public dxio<bbdv> am;
    public dxio<cztz> an;
    public cpv ao;
    public agbv<akqi> ap;
    public dehq aq;
    public agxq ar;
    public agad as;
    public RecyclerView at;
    public ahin au;
    @dzsi
    public alad av;
    public boolean aw;
    @dzsi
    public View ax;
    private cqkf<ahac> az;
    public gga b;
    public btrm c;
    public bwqv d;
    public aedv e;
    public dxio<akfa> f;
    public dxio<akpm> g;
    private final cjqv ay = new afzb(this);
    private final afzg aB = new afzg(this);
    private final afzi aC = new afzi(this);
    private final afzj aO = new afzj(this);
    private final afzl aP = new afzl(this);
    private final View.OnLayoutChangeListener aQ = new afzc(this);
    private final aeds aR = new aeds(this) { // from class: afza
        private final afzm a;

        {
            this.a = this;
        }

        @Override // defpackage.aeds
        public final void a(dktk dktkVar) {
            this.a.g();
        }
    };

    private final boolean aR() {
        return this.ad.a();
    }

    private final void aS() {
        if (this.aw) {
            this.aw = false;
            this.az.e(null);
            agad agadVar = this.as;
            dbsk.s(agadVar);
            agadVar.a();
            this.ah.d();
            this.ah.b();
        }
        ahin ahinVar = this.au;
        if (ahinVar != null) {
            ahinVar.M();
        }
        this.au = null;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((afzn) btsx.b(afzn.class, this)).bU(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        View c = this.as.c();
        this.ao.b(c, c.getContentDescription());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.az.h();
        cqkf<?> cqkfVar = this.aA;
        if (cqkfVar != null) {
            cqkfVar.c().removeOnLayoutChangeListener(this.aQ);
            this.aA.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (this.az == null) {
            cqkf<ahac> e = this.al.e(new agun(false));
            this.az = e;
            RecyclerView recyclerView = (RecyclerView) cqkx.e(e.c(), agun.a, RecyclerView.class);
            dbsk.s(recyclerView);
            this.at = recyclerView;
            agae agaeVar = this.ae;
            afzd afzdVar = new afzd(this);
            cqhn a = agaeVar.a.a();
            agae.a(a, 1);
            agae.a(agaeVar.b.a(), 2);
            btrm a2 = agaeVar.c.a();
            agae.a(a2, 3);
            agzo a3 = agaeVar.d.a();
            agae.a(a3, 4);
            cqkj a4 = agaeVar.e.a();
            agae.a(a4, 5);
            agae.a(recyclerView, 6);
            agae.a(afzdVar, 7);
            this.as = new agad(a, a2, a3, a4, recyclerView, afzdVar);
        }
        if (aR()) {
            cqkf<?> d = this.e.d(viewGroup);
            this.aA = d;
            d.c().addOnLayoutChangeListener(this.aQ);
        }
        return this.az.c();
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.LD_FOR_YOU_PAGE;
    }

    @Override // defpackage.ges, defpackage.achd
    public final achc bl(@dzsi achc achcVar) {
        return (achcVar == null || achcVar == achc.DRAWER_MENU) ? achc.LD_FOR_YOU_PAGE : achcVar;
    }

    @Override // defpackage.ges, defpackage.achd
    public final boolean bm(boolean z, achc achcVar) {
        this.ag.d(z, achcVar, deha.a(achb.b().b()));
        return true;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.au.u().a().booleanValue()) {
            this.ah.d();
            return true;
        }
        return false;
    }

    public final void g() {
        if (this.au.u().a().booleanValue()) {
            return;
        }
        if (((aag) this.at.l).ac() <= 4) {
            this.at.n(0);
            return;
        }
        this.at.l(4);
        this.at.getViewTreeObserver().addOnGlobalLayoutListener(new afzf(this));
        this.at.requestLayout();
    }

    public final void i(boolean z) {
        cqkf<?> cqkfVar;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.e(this);
        egjVar.G(this.as.c(), 5);
        egf a = egf.a();
        a.l = new afwn[]{afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
        a.l(false);
        a.r();
        a.g = false;
        a.j();
        a.n = false;
        a.s = true;
        egjVar.A(a);
        this.ah.e(egjVar);
        if (z && aR() && (cqkfVar = this.aA) != null) {
            egjVar.av(cqkfVar.c());
        }
        this.aj.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.af.l();
        if (bundle == null && (bundle = this.o) == null) {
            bundle = new Bundle();
        }
        agxr agxrVar = agxr.i;
        try {
            bvrt bvrtVar = (bvrt) this.d.d(bvrt.class, bundle, "s");
            if (bvrtVar != null) {
                agxrVar = (agxr) bvrtVar.e((dssr) agxr.i.cu(7), agxrVar);
            }
        } catch (IOException unused) {
        }
        dsqp dsqpVar = (dsqp) agxrVar.cu(5);
        dsqpVar.bC(agxrVar);
        this.ar = (agxq) dsqpVar;
        try {
            this.av = (alad) this.d.d(alad.class, bundle, "v");
        } catch (IOException unused2) {
        }
        if (this.av == null) {
            this.av = this.g.a().n();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.bV;
    }

    @Override // defpackage.agxf
    public final void q(dlcv dlcvVar, ilo iloVar) {
        this.aS = dlcvVar;
        bbdw e = bbdx.e();
        ((bbdr) e).a = bwrs.a(iloVar);
        e.d(true);
        e.b(false);
        this.am.a().n(e.a(), this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        crzm<btlu> C = this.f.a().C();
        w(btlu.q(C.l()), this.a.c());
        C.a(this.aO, this.aq);
        this.a.a(this.aC);
        btrm btrmVar = this.c;
        afzg afzgVar = this.aB;
        dceq a = dcet.a();
        a.b(azre.class, new afzo(azre.class, afzgVar, bvrj.UI_THREAD));
        btrmVar.g(afzgVar, a.a());
        this.ak.z(this.ay);
        if (this.av != null && !this.au.u().a().booleanValue()) {
            akyc e = akyt.e(this.av);
            e.b = 0;
            this.g.a().p(e);
        }
        i(this.au.h().booleanValue());
        if (aR()) {
            this.e.k(this.aR);
            this.e.b(this);
            this.e.g(dktk.FEED);
        }
        this.az.c().getViewTreeObserver().addOnPreDrawListener(this.aP);
        this.au.L();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        agxq agxqVar = this.ar;
        agyp D = this.au.D();
        if (agxqVar.c) {
            agxqVar.bF();
            agxqVar.c = false;
        }
        agxr agxrVar = (agxr) agxqVar.b;
        agxr agxrVar2 = agxr.i;
        D.getClass();
        agxrVar.c = D;
        agxrVar.a |= 2;
        agxq agxqVar2 = this.ar;
        agxp b = this.as.b();
        if (agxqVar2.c) {
            agxqVar2.bF();
            agxqVar2.c = false;
        }
        agxr agxrVar3 = (agxr) agxqVar2.b;
        b.getClass();
        agxrVar3.d = b;
        agxrVar3.a |= 4;
        this.d.c(bundle, "s", bvrt.b(this.ar.bK()));
        this.d.c(bundle, "v", this.av);
        super.t(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.au.M();
        this.az.c().getViewTreeObserver().removeOnPreDrawListener(this.aP);
        this.ax = this.ao.e(this.b) ? agxk.l(this.az.c()) : null;
        agxq agxqVar = this.ar;
        agxp b = this.as.b();
        if (agxqVar.c) {
            agxqVar.bF();
            agxqVar.c = false;
        }
        agxr agxrVar = (agxr) agxqVar.b;
        agxr agxrVar2 = agxr.i;
        b.getClass();
        agxrVar.d = b;
        agxrVar.a |= 4;
        this.ak.A(this.ay);
        this.c.a(this.aB);
        this.a.b(this.aC);
        if (aR()) {
            this.e.n(this.aR);
            this.e.c(this);
        }
        this.aw = false;
        this.as.a();
        this.ah.b();
        this.f.a().C().c(this.aO);
        super.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.btlu r15, @defpackage.dzsi defpackage.agwo r16) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzm.w(btlu, agwo):void");
    }

    @Override // defpackage.bbdy
    public final void aJ(int i) {
        if (i - 1 == 0) {
            dlcv dlcvVar = this.aS;
            if (dlcvVar != null && dlcvVar.i) {
                this.au.O(dlcvVar.d);
            }
            this.an.a().d(this.b.getWindowManager(), true);
            cztq a = cztt.a(this.an.a());
            a.e(R.string.LOCALSTREAM_RECOMMENDATION_FEEDBACK_SUCCESS_MESSAGE, new Object[0]);
            a.d(cztr.LONG);
            cztt b = a.b();
            View findViewById = b.b.findViewById(R.id.toastbar_message);
            if (findViewById instanceof TextView) {
                findViewById.setClickable(false);
                findViewById.setLongClickable(false);
            }
            b.b.setImportantForAccessibility(2);
            b.b();
            return;
        }
        gga ggaVar = this.b;
        cjxu.i(ggaVar, ggaVar.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION));
    }
}
