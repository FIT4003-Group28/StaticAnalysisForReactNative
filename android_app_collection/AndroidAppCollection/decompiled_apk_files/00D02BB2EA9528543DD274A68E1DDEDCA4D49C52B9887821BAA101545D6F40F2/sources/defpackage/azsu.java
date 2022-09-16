package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: azsu  reason: default package */
/* loaded from: classes3.dex */
public final class azsu extends bxel implements bxeq {
    private static final dcqe aq = dcqe.c("azsu");
    public ckcw a;
    public bvrb ad;
    public azsz ae;
    public dxio<cztz> af;
    public cjxo ag;
    public bath ah;
    public batg ai;
    public gfq aj;
    public batd ak;
    @dzsi
    public axvp al;
    @dzsi
    public azsy am;
    @dzsi
    azsq ao;
    @dzsi
    private Object ar;
    private String as;
    private boolean at;
    @dzsi
    private akqq au;
    @dzsi
    private axuc ay;
    public befw b;
    public bwqv c;
    public gdc d;
    public cqkj e;
    public dxio<axwy> f;
    public dxio<brba> g;
    public boolean an = false;
    @dzsi
    private dbsg<anef> av = null;
    @dzsi
    private cqkf<jap> aw = null;
    @dzsi
    private azss ax = null;
    private boolean bg = false;
    public final axwu ap = new azso(this);

    public static azsu aR(azrv azrvVar, gga ggaVar, bwqv bwqvVar) {
        bxko bxkoVar = new bxko();
        bxkoVar.aa();
        if (azrvVar.a() == dndr.HOME) {
            bxkoVar.c(bxla.HOME);
            bxkoVar.g(ggaVar.getString(R.string.SET_HOME_LOCATION));
        } else if (azrvVar.a() == dndr.WORK) {
            bxkoVar.c(bxla.WORK);
            bxkoVar.g(ggaVar.getString(R.string.SET_WORK_LOCATION));
            bxkoVar.I(azrvVar.j() && azrvVar.k() != null);
            bxkoVar.a = azrvVar.k();
        } else if (azrvVar.a() == dndr.NICKNAME) {
            bxkoVar.c(bxla.NICKNAME);
            bxkoVar.g(ggaVar.getString(R.string.CREATE_LABEL_TITLE));
        } else {
            bvoo.h("AliasType should be HOME or WORK or NICKNAME", new Object[0]);
            bxkoVar.c(bxla.UNKNOWN);
        }
        bxkoVar.e(azrvVar.b());
        bxkoVar.q(true);
        bxkoVar.s(false);
        bxkoVar.z(301989894);
        bxkoVar.ae();
        bxkoVar.F(false);
        bxkoVar.O(azrvVar.i());
        bxkoVar.g = !azrvVar.i();
        bxkoVar.U();
        azst azstVar = new azst();
        azstVar.b = azrvVar.g();
        azstVar.a = azrvVar.h();
        azstVar.c = azrvVar.e();
        azstVar.d = azrvVar.f();
        bxkoVar.b = azstVar;
        azsu azsuVar = new azsu();
        azsuVar.bu(bwqvVar, bxkoVar, null);
        Bundle bundle = azsuVar.o;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("initialQuery", azrvVar.b());
        bundle.putSerializable("viewportCenterOverride", azrvVar.k());
        anee m = azrvVar.m();
        if (azrvVar.n() && m != null) {
            bundle.putSerializable("customLayoutProvider", m.q());
        }
        bwqvVar.c(bundle, "aliasFlowData", azrvVar.p(bwqvVar));
        azsuVar.B(bundle);
        return azsuVar;
    }

    private final dehn<ilo> bA(ilo iloVar) {
        if (!dbsd.a(iloVar.ai(), akqi.a) || !dbsj.d(iloVar.y())) {
            deig d = deig.d();
            befu p = befv.p();
            p.j(bwrs.a(iloVar));
            befv m = p.m();
            ((bdvy) this.b).f(new azsn(d), m);
            return d;
        }
        bvoo.h("No featureID or query available to fetch placemark", new Object[0]);
        return deha.b(new RuntimeException("No featureID or query available to fetch placemark"));
    }

    private final void bB(dndr dndrVar, String str, boolean z, @dzsi String str2, @dzsi akqq akqqVar, @dzsi azst azstVar) {
        axvp axvpVar;
        bxlz.b(this);
        axwy a = this.f.a();
        this.ao = null;
        boolean z2 = false;
        if (azstVar != null && azstVar.a) {
            z2 = true;
        }
        if (z) {
            axvpVar = new azsp(this);
        } else {
            axvpVar = this.al;
        }
        if (dbsj.d(str) || dndrVar.equals(dndr.NICKNAME)) {
            if (dbsj.d(str) || !dndrVar.equals(dndr.NICKNAME)) {
                if (dbsj.d(this.as)) {
                    bC();
                    return;
                } else {
                    a.Q(dndrVar, this.ap, this.al, z2, 0L);
                    return;
                }
            }
            ily ilyVar = new ily();
            ilyVar.u = str;
            ilyVar.z = dndrVar;
            if (str2 != null) {
                ilyVar.k(str2);
            }
            if (akqqVar != null) {
                ilyVar.q(akqqVar);
            }
            bp(a, ilyVar.d());
            return;
        }
        a.I(dndrVar, this.ap, axvpVar, z2, str, str2, akqqVar, p(), azstVar != null ? azstVar.d : null);
    }

    private final void bC() {
        gn gnVar = this.A;
        if (gnVar == null || !bg()) {
            return;
        }
        gnVar.f();
    }

    @Override // defpackage.bxel
    @dzsi
    protected final View OM() {
        anef bz = bz();
        if (bz == null) {
            return null;
        }
        this.aw = this.e.c(bz.a(), null);
        azss azssVar = new azss(this);
        this.ax = azssVar;
        this.aw.e(azssVar);
        return this.aw.c();
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
        if (!this.aD) {
            return;
        }
        if (aU() == dndr.UNKNOWN_ALIAS_TYPE) {
            br();
            return;
        }
        bs(izr.LOADING);
        dvyw dvywVar = dwjbVar.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ily ilyVar = new ily();
        ilyVar.k(dvywVar.g);
        deha.q(bA(ilyVar.d()), new azsm(this), this.ad.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bxel
    public final void QC(egj egjVar) {
        if (this.am != null) {
            egjVar.V(new aztv(), this.am);
        } else {
            super.QC(egjVar);
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if ((obj instanceof aneh) || (obj instanceof ilo)) {
            this.ar = obj;
        } else if (!(obj instanceof axwc)) {
        } else {
            this.at = true;
        }
    }

    @Override // defpackage.bxel
    protected final bxeq aJ() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void aK() {
        if (this.ak.a(aU())) {
            this.aO.a().b();
        }
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxel
    @dzsi
    public final bxnw aT() {
        gga ggaVar;
        if (!this.aQ.getEnableFeatureParameters().ab || !this.bb.g || (ggaVar = this.aE) == null) {
            return null;
        }
        bxon a = this.aZ.a(ggaVar.getString(R.string.CHOOSE_ON_MAP_HOME_WORK_CARD_TEXT), this.ai.a(aU(), batf.POINT_PICKER_TITLE), ggaVar.getString(R.string.CHOOSE_ON_MAP_HOME_WORK_SUBTITLE), this.ah.a(aU()).h, this, ggaVar.getString(R.string.SAVE), this.au, dtxo.e, dtxl.z, dtxl.B, cjtd.a(dtxl.A), this.au != null, true, new bxov(this) { // from class: azsh
            private final azsu a;

            {
                this.a = this;
            }

            @Override // defpackage.bxov
            public final ancv a(aneb anebVar) {
                azsu azsuVar = this.a;
                Integer aX = azsuVar.aX();
                if (aX != null) {
                    anebVar.k(aX.intValue());
                }
                anebVar.s(new azta());
                anebVar.n(true);
                return azsd.i(azsuVar.aU(), anebVar.a(), dtxo.e, null, null, true, false, azsuVar.c);
            }
        });
        if (this.ah.a(aU()).i) {
            a.H(this.ai.a(aU(), batf.DROPPED_PIN_CALLOUT));
        }
        if (this.ah.a(aU()).g) {
            a.I(this.ai.a(aU(), batf.NO_MOVE_SAVE_WARNING));
        }
        return a;
    }

    public final dndr aU() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        bxla bxlaVar = bxla.UNKNOWN;
        int ordinal = this.bb.b().ordinal();
        return ordinal != 6 ? ordinal != 7 ? ordinal != 8 ? dndr.UNKNOWN_ALIAS_TYPE : dndr.NICKNAME : dndr.WORK : dndr.HOME;
    }

    @dzsi
    public final String aV() {
        Serializable serializable = this.bb.b;
        if (serializable != null) {
            return ((azst) serializable).d;
        }
        return null;
    }

    @dzsi
    public final Integer aX() {
        int i;
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        bxla bxlaVar = bxla.UNKNOWN;
        int ordinal = aU().ordinal();
        if (ordinal == 1) {
            i = 2131232034;
        } else if (ordinal != 2) {
            return null;
        } else {
            i = 2131232038;
        }
        return Integer.valueOf(i);
    }

    public final void bn(bxmh bxmhVar, dnqh dnqhVar) {
        bo(bxmhVar, dnqhVar, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.io.Serializable] */
    public final void bo(bxmh bxmhVar, dnqh dnqhVar, boolean z, @dzsi Boolean bool) {
        akqq akqqVar;
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dwjj dwjjVar2 = dwjjVar;
        dxbp dxbpVar = dwjjVar2.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        dxbp dxbpVar2 = dxbpVar;
        dvzj dvzjVar = dwjjVar2.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        int i = dvzjVar.a;
        String str = (i & 1) != 0 ? dvzjVar.b : null;
        if ((i & 4) != 0) {
            dhjz dhjzVar = dvzjVar.d;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqqVar = akqq.j(dhjzVar);
        } else {
            akqqVar = null;
        }
        ?? r11 = this.bb.b;
        azst azstVar = new azst();
        if (r11 != 0 && bool != null) {
            azst azstVar2 = (azst) r11;
            azstVar.d = azstVar2.d;
            azstVar.b = azstVar2.b;
            azstVar.c = azstVar2.c;
            azstVar.a = bool.booleanValue();
        }
        dndr aU = aU();
        String str2 = dxbpVar2.b;
        if (bool == null) {
            azstVar = r11;
        }
        bB(aU, str2, z, str, akqqVar, azstVar);
        Nw(new axvq(str));
        if (r11 == 0 || !((azst) r11).b || this.bb.H()) {
            return;
        }
        iqy iqyVar = new iqy();
        iqyVar.b();
        dwim bZ = dwir.R.bZ();
        String str3 = dxbpVar2.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        str3.getClass();
        int i2 = dwirVar.a | 1;
        dwirVar.a = i2;
        dwirVar.c = str3;
        dspd dspdVar = dwjjVar2.d;
        dspdVar.getClass();
        int i3 = i2 | 8192;
        dwirVar.a = i3;
        dwirVar.k = dspdVar;
        dnqhVar.getClass();
        dwirVar.s = dnqhVar;
        dwirVar.a = 33554432 | i3;
        iqyVar.e = aU;
        this.g.a().m(bZ, iqyVar);
    }

    public final void bp(axwy axwyVar, ilo iloVar) {
        bxlz.b(this);
        axwyVar.l(bwrs.a(iloVar.g().d()), this.ay);
    }

    public final void bq(Context context) {
        azsq azsqVar;
        String string;
        bC();
        azsq azsqVar2 = this.ao;
        if (azsqVar2 != null && azsqVar2.a) {
            dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
            bxla bxlaVar = bxla.UNKNOWN;
            int ordinal = aU().ordinal();
            if (ordinal != 1) {
                string = ordinal != 2 ? null : context.getString(R.string.WORK_LOCATION);
            } else {
                string = context.getString(R.string.HOME_LOCATION);
            }
            if (string != null) {
                cztq a = cztt.a(this.af.a());
                a.e(R.string.ALIAS_ADDRESS_SAVED, string);
                a.d(cztr.LONG);
                a.c();
            }
        }
        axvp axvpVar = this.al;
        if (axvpVar == null || (azsqVar = this.ao) == null) {
            return;
        }
        axvpVar.E(azsqVar.a, azsqVar.b, azsqVar.c);
    }

    public final void br() {
        dndr aU = aU();
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        bxla bxlaVar = bxla.UNKNOWN;
        int ordinal = aU.ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? R.string.FAILED_TO_UPDATE_NICKNAME : R.string.FAILED_TO_UPDATE_WORK_LOCATION : R.string.FAILED_TO_UPDATE_HOME_LOCATION;
        cztq a = cztt.a(this.af.a());
        a.e(i, new Object[0]);
        a.d(cztr.LONG);
        a.c();
    }

    public final void bs(izr izrVar) {
        bxqh bxqhVar = this.be;
        if (bxqhVar != null) {
            bxqhVar.QF(izrVar);
            cqkx.p(this.be);
        }
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.an) {
            bq(H());
            return true;
        } else if (super.e()) {
            return true;
        } else {
            if (!this.bg) {
                this.bg = true;
                try {
                    ff J = J();
                    if (J != null) {
                        J.onBackPressed();
                        return true;
                    }
                } finally {
                    this.bg = false;
                }
            }
            return false;
        }
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        if (!this.aD || aU() == dndr.UNKNOWN_ALIAS_TYPE) {
            return;
        }
        bs(izr.LOADING);
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dvzj dvzjVar = dwjjVar.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        String str = dvzjVar.b;
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar2.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        String str2 = dxbpVar.b;
        ily ilyVar = new ily();
        ilyVar.k(str);
        ilyVar.u = str2;
        deha.q(bA(ilyVar.d()), new azsl(this, bxmhVar, dnqhVar), this.ad.h());
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        dndr aU = aU();
        if (!this.aD || aU == dndr.UNKNOWN_ALIAS_TYPE) {
            return;
        }
        bB(aU, str, false, null, null, (azst) this.bb.b);
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (this.ah.a(aU()).d) {
            this.bb.ab();
        }
        azsz azszVar = this.ae;
        bxek bxekVar = new bxek(this);
        dndr aU = aU();
        boolean z = aV() != null;
        boolean z2 = bz() != null;
        bxqd a = azszVar.a.a();
        azsz.a(a, 1);
        gga a2 = azszVar.b.a();
        azsz.a(a2, 2);
        azsz.a(azszVar.c.a(), 3);
        bath a3 = azszVar.d.a();
        azsz.a(a3, 4);
        azsz.a(bxekVar, 5);
        azsz.a(aU, 6);
        azsy azsyVar = new azsy(a, a2, a3, bxekVar, aU, z, z2);
        this.am = azsyVar;
        this.be = azsyVar;
        Bundle bundle2 = this.o;
        try {
            this.au = (akqq) bundle2.getSerializable("viewportCenterOverride");
            axuc axucVar = (axuc) this.c.d(axuc.class, bundle2, "aliasFlowData");
            this.ay = axucVar;
            if (axucVar != null) {
                this.al = axvb.a(axucVar.a(J()));
            }
        } catch (IOException unused) {
            bvoo.h("AliasCallbackData not found in args", new Object[0]);
        }
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle != null) {
            this.as = bundle.getString("initialQuery");
        }
        this.at = false;
    }

    @Override // defpackage.bxel, defpackage.ges
    @dzsi
    public final ddho p() {
        ddho ddhoVar;
        Serializable serializable = this.bb.b;
        if (serializable == null || (ddhoVar = ((azst) serializable).c) == null) {
            dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
            bxla bxlaVar = bxla.UNKNOWN;
            int ordinal = aU().ordinal();
            return ordinal != 1 ? ordinal != 2 ? super.p() : dtxj.ar : dtxj.ao;
        }
        return ddhoVar;
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void s() {
        akpm akpmVar;
        ilo d;
        super.s();
        if (this.at) {
            gfq.l(this);
            return;
        }
        if (btpf.a(J())) {
            this.ag.a(7);
        }
        Object obj = this.ar;
        if (obj != null) {
            dndr aU = aU();
            if (aU == dndr.UNKNOWN_ALIAS_TYPE) {
                return;
            }
            if (obj instanceof aneh) {
                akqq a = ((aneh) obj).a();
                ily ilyVar = new ily();
                ilyVar.z = aU;
                ilyVar.q(a);
                d = ilyVar.d();
            } else if (!(obj instanceof ilo)) {
                return;
            } else {
                ily g = ((ilo) obj).g();
                g.z = aU;
                d = g.d();
            }
            ilo iloVar = d;
            if (!aU.equals(dndr.NICKNAME)) {
                this.f.a().ac(aU, this.ap, this.al, true, null, null, p(), aV(), iloVar, null);
                return;
            } else {
                bp(this.f.a(), iloVar);
                return;
            }
        }
        bxqh bxqhVar = this.be;
        if (bxqhVar != null) {
            bxqhVar.ah(false);
            this.be.al(null);
            this.be.am(false);
            akqq akqqVar = this.au;
            if (akqqVar != null && (akpmVar = this.aP) != null) {
                akyc i = akyt.i(akqqVar, 16.0f);
                i.b = 0;
                akpmVar.p(i);
            }
            cqkx.p(this.be);
        }
        this.b.a();
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void u() {
        this.b.b();
        if (btpf.a(J())) {
            this.ag.b();
        }
        super.u();
    }

    @dzsi
    private final anef bz() {
        dbsg<anef> dbsgVar = this.av;
        if (dbsgVar == null) {
            dbsgVar = (dbsg) this.o.getSerializable("customLayoutProvider");
            this.av = dbsgVar;
        }
        if (dbsgVar == null) {
            return null;
        }
        return dbsgVar.b();
    }
}
