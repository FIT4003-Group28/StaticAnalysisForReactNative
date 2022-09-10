package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjoo  reason: default package */
/* loaded from: classes4.dex */
public final class cjoo extends bbdy implements achd, agxf, ggg {
    public acyp a;
    public apyx aA;
    public dehq aB;
    public cjpj aC;
    public cjpl aO;
    public cqkf<cjps> aQ;
    @dzsi
    public ahin aR;
    @dzsi
    public aurp aS;
    public aqnd aT;
    public cjpx aU;
    @dzsi
    public alad aV;
    @dzsi
    public cjpp aW;
    public boolean aY;
    @dzsi
    public View aZ;
    public bwqv ad;
    public aedv ae;
    public dxio<akfa> af;
    public dxio<akpm> ag;
    public afzu ah;
    public bwft ai;
    public agaw aj;
    public agbj ak;
    public ahio al;
    public aurq am;
    public aqne an;
    public dxio<aqrp> ao;
    public dxio<apyz> ap;
    public efg aq;
    public cjpy ar;
    public cjqy as;
    public cqkj at;
    public dxio<bbdv> au;
    public dxio<cztz> av;
    public agbv<akqi> aw;
    public akzh ax;
    public cpv ay;
    public dxio<ixr> az;
    public auom b;
    public auql bb;
    private cjph bd;
    private cqkf<?> be;
    private ixr bf;
    @dzsi
    private afzt bm;
    private bvqg<auql> bn;
    private crzp<Integer> bo;
    @dzsi
    private dlcv bp;
    public apyv c;
    public agwa d;
    public gga e;
    public btrm f;
    public bvjj g;
    private final cjqv bc = new cjoc(this);
    @dzsi
    public SparseArray<Parcelable> aP = null;
    public List<gfs> aX = dcdc.e();
    private final cjog bg = new cjog(this);
    private final cjoi bh = new cjoi(this);
    private final cjoj bi = new cjoj(this);
    private final cjon bj = new cjon(this);
    private final View.OnLayoutChangeListener bk = new cjod(this);
    final hzz ba = new cjoe(this);
    private final aeds bl = new aeds(this) { // from class: cjny
        private final cjoo a;

        {
            this.a = this;
        }

        @Override // defpackage.aeds
        public final void a(dktk dktkVar) {
            RecyclerView recyclerView;
            cjoo cjooVar = this.a;
            ahin ahinVar = cjooVar.aR;
            if ((ahinVar == null || !ahinVar.u().a().booleanValue()) && (recyclerView = (RecyclerView) cqkx.e(cjooVar.aQ.c(), agun.a, RecyclerView.class)) != null) {
                aag aagVar = (aag) recyclerView.l;
                if (aagVar == null || aagVar.ac() <= 4) {
                    recyclerView.n(0);
                    return;
                }
                recyclerView.l(4);
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new cjof(recyclerView));
                recyclerView.requestLayout();
            }
        }
    };

    private final <T extends dssj> T aR(Bundle bundle, String str, dssr<T> dssrVar, T t) {
        try {
            bvrt bvrtVar = (bvrt) this.ad.d(bvrt.class, bundle, str);
            if (bvrtVar != null) {
                return (T) bvrtVar.e(dssrVar, t);
            }
        } catch (IOException unused) {
        }
        return t;
    }

    private final boolean aS() {
        return this.a.a();
    }

    private final void aT() {
        if (this.aY) {
            this.aY = false;
            this.aQ.e(null);
            this.ak.d();
            this.ak.b();
        }
        ahin ahinVar = this.aR;
        if (ahinVar != null) {
            ahinVar.M();
        }
        this.aR = null;
        this.aU = null;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((cjop) btsx.b(cjop.class, this)).dv(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<?> a;
        this.aT.p();
        RecyclerView recyclerView = (RecyclerView) cqkx.e(this.aQ.c(), agun.a, RecyclerView.class);
        if (recyclerView != null && (a = cqke.a(recyclerView)) != null) {
            a.h();
        }
        this.aQ.e(null);
        cqkf<?> cqkfVar = this.be;
        if (cqkfVar != null) {
            cqkfVar.c().removeOnLayoutChangeListener(this.bk);
        }
        super.Qe();
    }

    @Override // defpackage.bbdy
    public final void aJ(int i) {
        if (i != 1) {
            gga ggaVar = this.e;
            cjxu.i(ggaVar, ggaVar.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION));
            return;
        }
        dlcv dlcvVar = this.bp;
        ahin ahinVar = this.aR;
        if (ahinVar != null && dlcvVar != null && dlcvVar.i) {
            ahinVar.O(dlcvVar.d);
        }
        this.av.a().d(this.e.getWindowManager(), true);
        cztq a = cztt.a(this.av.a());
        a.e(R.string.LOCALSTREAM_RECOMMENDATION_FEEDBACK_SUCCESS_MESSAGE, new Object[0]);
        a.d(cztr.LONG);
        a.b().b();
    }

    @Override // defpackage.ges, defpackage.ggg
    public final List<gfs> aO() {
        return this.aX;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (this.aQ == null) {
            this.aQ = this.at.e(new cjpe());
        }
        if (aS()) {
            cqkf<?> d = this.ae.d(viewGroup);
            this.be = d;
            d.c().addOnLayoutChangeListener(this.bk);
        }
        return this.aQ.c();
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
        this.aj.d(z, achcVar, deha.a(achb.b().b()));
        return true;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        ahin ahinVar = this.aR;
        if (ahinVar == null || !ahinVar.u().a().booleanValue()) {
            return false;
        }
        this.ak.d();
        return true;
    }

    public final void g(boolean z) {
        cqkf<?> cqkfVar;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.e(this);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egf a = egf.a();
        a.l = new afwn[]{afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
        a.l(false);
        a.r();
        a.g = false;
        a.j();
        a.n = false;
        a.s = true;
        egjVar.A(a);
        this.ak.e(egjVar);
        if (z && aS() && (cqkfVar = this.be) != null) {
            egjVar.av(cqkfVar.c());
        }
        if (this.a.f()) {
            egjVar.Z();
            egjVar.W(this.bf);
        }
        if (this.a.g()) {
            egjVar.h();
        }
        this.aq.a(egjVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.btlu r33, @defpackage.dzsi defpackage.agwo r34) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjoo.i(btlu, agwo):void");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.bm = new cjom(this);
        this.bn = new bvqg(this) { // from class: cjnz
            private final cjoo a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final cjoo cjooVar = this.a;
                final auql auqlVar = (auql) obj;
                cjooVar.aB.execute(new Runnable(cjooVar, auqlVar) { // from class: cjob
                    private final cjoo a;
                    private final auql b;

                    {
                        this.a = cjooVar;
                        this.b = auqlVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cjoo cjooVar2 = this.a;
                        auql auqlVar2 = this.b;
                        cjpx cjpxVar = cjooVar2.aU;
                        if (cjpxVar != null) {
                            cjpxVar.m(cjpp.INBOX, auqlVar2.c());
                        }
                    }
                });
            }
        };
        this.bo = new cjol(this);
        this.ai.l();
        if (bundle == null && (bundle = this.o) == null) {
            bundle = new Bundle();
        }
        cjpk cjpkVar = (cjpk) aR(bundle, "us", (dssr) cjpk.e.cu(7), cjpk.e);
        dsqp dsqpVar = (dsqp) cjpkVar.cu(5);
        dsqpVar.bC(cjpkVar);
        this.aC = (cjpj) dsqpVar;
        cjpg cjpgVar = (cjpg) aR(bundle, "uffs", (dssr) cjpg.d.cu(7), cjpg.d);
        dsqp dsqpVar2 = (dsqp) cjpgVar.cu(5);
        dsqpVar2.bC(cjpgVar);
        cjpf cjpfVar = (cjpf) dsqpVar2;
        cjpm cjpmVar = (cjpm) aR(bundle, "uss", (dssr) cjpm.f.cu(7), cjpm.f);
        dsqp dsqpVar3 = (dsqp) cjpmVar.cu(5);
        dsqpVar3.bC(cjpmVar);
        this.aO = (cjpl) dsqpVar3;
        cjpi cjpiVar = (cjpi) aR(bundle, "ms", (dssr) cjpi.c.cu(7), cjpi.c);
        dsqp dsqpVar4 = (dsqp) cjpiVar.cu(5);
        dsqpVar4.bC(cjpiVar);
        this.bd = (cjph) dsqpVar4;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("usclvhs");
        if (sparseParcelableArray != null) {
            this.aP = sparseParcelableArray;
        }
        try {
            this.aV = (alad) this.ad.d(alad.class, bundle, "uv");
        } catch (IOException unused) {
        }
        if (this.aV == null) {
            this.aV = this.ax.p();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxr.bk;
    }

    @Override // defpackage.agxf
    public final void q(dlcv dlcvVar, ilo iloVar) {
        this.bp = dlcvVar;
        bbdw e = bbdx.e();
        ((bbdr) e).a = bwrs.a(iloVar);
        e.d(true);
        e.b(false);
        this.au.a().n(e.a(), this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        aurp aurpVar;
        ahin ahinVar;
        ahin ahinVar2;
        super.s();
        crzm<btlu> C = this.af.a().C();
        i(btlu.q(C.l()), this.d.c());
        C.a(this.bi, this.aB);
        this.d.a(this.bh);
        btrm btrmVar = this.f;
        cjog cjogVar = this.bg;
        dceq a = dcet.a();
        a.b(azre.class, new cjoq(azre.class, cjogVar, bvrj.UI_THREAD));
        btrmVar.g(cjogVar, a.a());
        this.as.z(this.bc);
        afzt afztVar = this.bm;
        if (afztVar != null) {
            this.ah.d(afztVar);
        }
        if (this.b.b) {
            this.bb.a(this.bn);
        }
        this.ap.a().r().d(this.bo, this.aB);
        if (this.c.a()) {
            this.ao.a().b();
        }
        boolean z = false;
        if (this.aV != null && ((ahinVar2 = this.aR) == null || !ahinVar2.u().a().booleanValue())) {
            akyc e = akyt.e(this.aV);
            e.b = 0;
            this.ag.a().p(e);
        }
        ahin ahinVar3 = this.aR;
        if (ahinVar3 == null || ahinVar3.h().booleanValue()) {
            z = true;
        }
        g(z);
        if (aS()) {
            this.ae.k(this.bl);
            this.ae.b(this);
            this.ae.g(dktk.UPDATES);
        }
        this.aQ.c().getViewTreeObserver().addOnPreDrawListener(this.bj);
        if (this.aU.o() == cjpp.FOR_YOU && (ahinVar = this.aR) != null) {
            ahinVar.L();
        }
        if (!this.b.b || this.aU.o() != cjpp.INBOX || (aurpVar = this.aS) == null) {
            return;
        }
        aurpVar.o();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        cjpj cjpjVar = this.aC;
        cjpq q = this.aU.q();
        if (cjpjVar.c) {
            cjpjVar.bF();
            cjpjVar.c = false;
        }
        cjpk cjpkVar = (cjpk) cjpjVar.b;
        cjpk cjpkVar2 = cjpk.e;
        q.getClass();
        cjpkVar.d = q;
        cjpkVar.a |= 4;
        cjph cjphVar = this.bd;
        apzv r = this.aT.r();
        if (cjphVar.c) {
            cjphVar.bF();
            cjphVar.c = false;
        }
        cjpi cjpiVar = (cjpi) cjphVar.b;
        cjpi cjpiVar2 = cjpi.c;
        r.getClass();
        cjpiVar.b = r;
        cjpiVar.a |= 1;
        this.ad.c(bundle, "us", bvrt.b(this.aC.bK()));
        this.ad.c(bundle, "ms", bvrt.b(this.bd.bK()));
        this.ad.c(bundle, "uv", this.aV);
        ahin ahinVar = this.aR;
        if (ahinVar != null) {
            cjpl cjplVar = this.aO;
            agyp D = ahinVar.D();
            if (cjplVar.c) {
                cjplVar.bF();
                cjplVar.c = false;
            }
            cjpm cjpmVar = (cjpm) cjplVar.b;
            cjpm cjpmVar2 = cjpm.f;
            D.getClass();
            cjpmVar.c = D;
            cjpmVar.a |= 2;
            this.ad.c(bundle, "uss", bvrt.b(this.aO.bK()));
            RecyclerView recyclerView = (RecyclerView) cqkx.e(this.aQ.c(), agun.a, RecyclerView.class);
            if (recyclerView != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.aP = sparseArray;
                recyclerView.saveHierarchyState(sparseArray);
            }
            bundle.putSparseParcelableArray("usclvhs", this.aP);
        }
        super.t(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        ahin ahinVar = this.aR;
        if (ahinVar != null) {
            ahinVar.M();
        }
        this.aQ.c().getViewTreeObserver().removeOnPreDrawListener(this.bj);
        this.aZ = this.ay.e(this.e) ? agxk.l(this.aQ.c()) : null;
        this.f.a(this.bg);
        this.d.b(this.bh);
        this.as.A(this.bc);
        afzt afztVar = this.bm;
        if (afztVar != null) {
            this.ah.e(afztVar);
        }
        if (this.b.b) {
            this.bb.b(this.bn);
        }
        if (aS()) {
            this.ae.n(this.bl);
            this.ae.c(this);
        }
        this.aY = false;
        this.ak.b();
        this.aT.o();
        this.ap.a().r().c(this.bo);
        this.af.a().C().c(this.bi);
        super.u();
    }

    public final void w() {
        if (this.aA.f()) {
            return;
        }
        btlu j = this.aU.j();
        if (btlu.p(j) || btlu.n(j)) {
            return;
        }
        this.g.T(bvjk.bp, j, true);
        this.ap.a().s();
    }
}
