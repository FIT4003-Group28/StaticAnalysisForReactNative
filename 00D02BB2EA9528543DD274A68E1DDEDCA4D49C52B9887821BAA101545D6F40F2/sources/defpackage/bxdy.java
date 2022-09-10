package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxdy  reason: default package */
/* loaded from: classes4.dex */
public final class bxdy extends bxel implements bxeq {
    public static final dcqe a = dcqe.c("bxdy");
    public akfa ad;
    public bxtx ae;
    public bxkp af;
    public ckmp ag;
    public Executor ah;
    public bxzq ai;
    boolean aj;
    @dzsi
    public btlu ak;
    public bxeg al;
    private boolean am;
    @dzsi
    private ViewTreeObserver.OnWindowFocusChangeListener ao;
    public dxio<nut> b;
    public dxio<brba> c;
    public dxio<cbzd> d;
    public dxio<cbze> e;
    public dxio<begg> f;
    public bnph g;
    private final crzp<btlu> an = new bxdw(this);
    private final bxdx ap = new bxdx(this);

    public static bxko aR(String str, String str2, boolean z, @dzsi bwrs<brln> bwrsVar, @dzsi bxko bxkoVar) {
        bxko bxkoVar2 = new bxko();
        if (bxkoVar != null) {
            bxkoVar2.a(bxkoVar);
        }
        bxkoVar2.c(bxla.SEARCH);
        bxkoVar2.g(str2);
        bxkoVar2.e(str);
        bxkoVar2.q(true);
        bxkoVar2.w(true != z ? 2 : 1);
        bxkoVar2.ad();
        bxkoVar2.z(301989891);
        bxkoVar2.F(false);
        bxkoVar2.d = dtxv.I;
        bxkoVar2.c = bwrsVar;
        bxkoVar2.f = true;
        bxkoVar2.i = true;
        return bxkoVar2;
    }

    private final void bo() {
        this.ai.e();
    }

    @Override // defpackage.ges
    public final void Nv() {
        dxix.a(this);
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.bxel
    protected final void QD(egj egjVar) {
        if (this.az.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
    }

    @Override // defpackage.bxel
    protected final void QE(egj egjVar) {
        if (this.az.g()) {
            egjVar.h();
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bnpg) {
            amvh c = ((bnpg) obj).c();
            akqi akqiVar = c.d;
            if (!akqi.d(akqiVar) || c.c == null) {
                return;
            }
            String o = akqiVar.o();
            String str = c.c;
            ily ilyVar = new ily();
            ilyVar.k(o);
            ilyVar.u = str;
            ilo d = ilyVar.d();
            begj begjVar = new begj();
            begjVar.b(d);
            begjVar.d = null;
            begjVar.K = true;
            begjVar.F = true;
            begjVar.J = false;
            begjVar.p = false;
            this.c.a().C(true);
            this.f.a().o(begjVar, false, null);
        } else if (obj instanceof aneh) {
            akqq a2 = ((aneh) obj).a();
            ily ilyVar2 = new ily();
            ilyVar2.q(a2);
            ilyVar2.g = true;
            ilyVar2.f = false;
            ilo d2 = ilyVar2.d();
            begj begjVar2 = new begj();
            begjVar2.b(d2);
            begjVar2.d = null;
            begjVar2.K = true;
            this.c.a().C(false);
            this.ba.a(ckls.TYPED_SUGGESTION_CLICKED);
            this.f.a().o(begjVar2, false, null);
        } else if (!(obj instanceof ilo)) {
        } else {
            ilo iloVar = (ilo) obj;
            begj begjVar3 = new begj();
            begjVar3.b(iloVar);
            if (iloVar.i) {
                begjVar3.K = true;
            }
            this.c.a().C(false);
            this.f.a().o(begjVar3, false, null);
        }
    }

    @Override // defpackage.bxel
    protected final bxeq aJ() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
        bxem bxemVar = this.bc;
        if (bxemVar == null || !this.aD) {
            return;
        }
        bxemVar.c(str, str.length());
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List<dwjj> list) {
        this.g.b(dbpy.a, bxmhVar, list, this);
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxel
    @dzsi
    public final bxnw aT() {
        gga ggaVar;
        if (!this.aQ.getEnableFeatureParameters().ac || (ggaVar = this.aE) == null) {
            return null;
        }
        return this.aZ.a(ggaVar.getString(R.string.CHOOSE_ON_MAP_MISSING_PLACE_CARD_TEXT), ggaVar.getString(R.string.CHOOSE_ON_MAP_MISSING_PLACE_TITLE), ggaVar.getString(R.string.CHOOSE_ON_MAP_MISSING_PLACE_SUBTITLE), false, this, null, null, null, dtxl.C, dtxl.E, cjtd.a(dtxl.D), false, false, null);
    }

    public final void aU() {
        if (this.aD) {
            bo();
        } else {
            this.aj = true;
        }
    }

    public final void aV() {
        if (this.ai.g()) {
            this.ai.f();
            this.aj = false;
            this.am = false;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        if (Build.VERSION.SDK_INT < 28) {
            if (!this.am) {
                return;
            }
            aV();
        } else if (J().hasWindowFocus()) {
            aV();
        } else {
            ViewTreeObserver viewTreeObserver = J().getWindow().getDecorView().getViewTreeObserver();
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.ao;
            dbsk.s(onWindowFocusChangeListener);
            viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        if (Build.VERSION.SDK_INT < 28) {
            this.am = true;
            return;
        }
        ViewTreeObserver viewTreeObserver = J().getWindow().getDecorView().getViewTreeObserver();
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.ao;
        dbsk.s(onWindowFocusChangeListener);
        viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.aS.a(this.ap);
        this.c.a().B();
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        if (!this.aD) {
            return;
        }
        ((ckcn) this.af.a.a(ckjw.k)).a();
        bxkp bxkpVar = this.af;
        bxmg b = bxmg.b(bxmhVar.e);
        if (b == null) {
            b = bxmg.UNKNOWN;
        }
        ((ckco) bxkpVar.a.a(ckjw.ay)).a(b.r);
        this.ag.b(ckmk.SEARCH_TO_LIST);
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbi.a(dxbpVar.f);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = dwjjVar.a;
        if ((i & 2) != 0 && (i & 1) != 0) {
            dxbp dxbpVar2 = dwjjVar.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            int a3 = dxbi.a(dxbpVar2.f);
            if (a3 != 0 && a3 == 3) {
                ((ckco) this.af.a.a(ckjw.aw)).a(a2 == 3 ? ckju.a(2) : ckju.a(1));
                iqy iqyVar = new iqy();
                iqyVar.b();
                this.c.a().D(bxmhVar, dnqhVar, bxkvVar, iqyVar, cjqmVar);
                return;
            }
        }
        if ((dwjjVar.a & 32) == 0) {
            if (this.e.a().b) {
                cbzd a4 = this.d.a();
                dxbp dxbpVar3 = dwjjVar.b;
                if (dxbpVar3 == null) {
                    dxbpVar3 = dxbp.x;
                }
                if (a4.c(dxbpVar3.b).booleanValue()) {
                    ((ckco) this.af.a.a(ckjw.aw)).a(a2 == 3 ? ckju.a(6) : ckju.a(5));
                    dxbp dxbpVar4 = dwjjVar.b;
                    if (dxbpVar4 == null) {
                        dxbpVar4 = dxbp.x;
                    }
                    String substring = dxbpVar4.b.substring(1);
                    cbzb c = cbzc.c();
                    cbyz cbyzVar = (cbyz) c;
                    cbyzVar.a = dnqhVar.d;
                    cbyzVar.b = true;
                    this.d.a().a(substring, c.a());
                    return;
                }
            }
            ((ckco) this.af.a.a(ckjw.aw)).a(a2 == 3 ? ckju.a(8) : ckju.a(7));
            bxkp bxkpVar2 = this.af;
            bxkpVar2.a(ckjw.x);
            bxkpVar2.a(ckjw.y);
            bxkpVar2.a(ckjw.ap);
            bxkpVar2.a(ckjw.aq);
            this.ba.a(ckls.TYPED_SUGGESTION_CLICKED);
            iqy iqyVar2 = new iqy();
            iqyVar2.b();
            this.c.a().k(bxmhVar, dnqhVar, bxkvVar, iqyVar2);
            return;
        }
        ((ckco) this.af.a.a(ckjw.aw)).a(a2 == 3 ? ckju.a(4) : ckju.a(3));
        bxkp bxkpVar3 = this.af;
        bxkpVar3.a(ckjw.ar);
        bxkpVar3.a(ckjw.as);
        this.ba.a(ckls.TYPED_SUGGESTION_CLICKED);
        dvzj dvzjVar = dwjjVar.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        dxbp dxbpVar5 = dwjjVar.b;
        if (dxbpVar5 == null) {
            dxbpVar5 = dxbp.x;
        }
        ily ilyVar = new ily();
        ilyVar.k(dvzjVar.b);
        ilyVar.F(dxbpVar5.c);
        ilyVar.u = dvzjVar.c;
        int a5 = dxbg.a(dxbpVar5.s);
        ilyVar.o(a5 != 0 && a5 == 2);
        int a6 = dxbg.a(dxbpVar5.s);
        ilyVar.n(a6 != 0 && a6 == 4);
        int a7 = dxbg.a(dxbpVar5.s);
        ilyVar.l = a7 != 0 && a7 == 3;
        if (dvzjVar.b.isEmpty() && (dvzjVar.a & 4) != 0) {
            dhjz dhjzVar = dvzjVar.d;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            ilyVar.r(dhjzVar);
        }
        if ((dvzjVar.a & 4096) != 0) {
            dnqh dnqhVar2 = dvzjVar.l;
            if (dnqhVar2 == null) {
                dnqhVar2 = dnqh.p;
            }
            cjta b2 = cjtd.b();
            b2.b = dnqhVar2.d;
            b2.g(dnqhVar2.e);
            ilyVar.y = b2.a();
        }
        gga ggaVar = this.aE;
        if (ggaVar == null) {
            return;
        }
        boolean a8 = this.al.a();
        if (!a8) {
            this.c.a().C(true);
        }
        bxtx bxtxVar = this.ae;
        dptc bZ = dpte.g.bZ();
        dxbp dxbpVar6 = dwjjVar.b;
        if (dxbpVar6 == null) {
            dxbpVar6 = dxbp.x;
        }
        dvzj dvzjVar2 = dwjjVar.g;
        if (dvzjVar2 == null) {
            dvzjVar2 = dvzj.y;
        }
        dptf bZ2 = dptg.q.bZ();
        String str = dxbpVar6.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar = (dptg) bZ2.b;
        str.getClass();
        int i2 = dptgVar.a | 1;
        dptgVar.a = i2;
        dptgVar.b = str;
        String str2 = dxbpVar6.c;
        str2.getClass();
        int i3 = i2 | 2;
        dptgVar.a = i3;
        dptgVar.c = str2;
        String str3 = dxbpVar6.d;
        str3.getClass();
        int i4 = i3 | 4;
        dptgVar.a = i4;
        dptgVar.d = str3;
        int i5 = dxbpVar6.h;
        boolean z = i5 == 4;
        int i6 = i4 | 128;
        dptgVar.a = i6;
        dptgVar.i = z;
        dptgVar.a = i6 | 256;
        dptgVar.j = i5;
        int a9 = dxbg.a(dxbpVar6.s);
        boolean z2 = a9 != 0 && a9 == 2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar2 = (dptg) bZ2.b;
        dptgVar2.a |= 8192;
        dptgVar2.n = z2;
        int a10 = dxbg.a(dxbpVar6.s);
        boolean z3 = a10 != 0 && a10 == 4;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar3 = (dptg) bZ2.b;
        int i7 = dptgVar3.a | 16384;
        dptgVar3.a = i7;
        dptgVar3.o = z3;
        String str4 = dvzjVar2.b;
        str4.getClass();
        dptgVar3.a = i7 | 8;
        dptgVar3.e = str4;
        if ((dxbpVar6.a & ImageMetadata.LENS_APERTURE) != 0) {
            int a11 = dplr.a(dxbpVar6.m);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dptg dptgVar4 = (dptg) bZ2.b;
            int i8 = a11 - 2;
            if (a11 == 0) {
                throw null;
            }
            dptgVar4.h = i8;
            dptgVar4.a |= 64;
        }
        if ((dvzjVar2.a & 4) != 0) {
            dhjz dhjzVar2 = dvzjVar2.d;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            dpum h = akqq.j(dhjzVar2).h();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dptg dptgVar5 = (dptg) bZ2.b;
            h.getClass();
            dptgVar5.f = h;
            dptgVar5.a |= 16;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar = (dpte) bZ.b;
        dptg bK = bZ2.bK();
        bK.getClass();
        dpteVar.c = bK;
        dpteVar.b = 4;
        bxrt bxrtVar = (bxrt) bxtxVar;
        long e = bxrt.e(bxrtVar.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar2 = (dpte) bZ.b;
        dpteVar2.a |= 2;
        dpteVar2.e = e;
        bxrtVar.b.f(bZ.bK(), 1);
        ilo d = ilyVar.d();
        brlu brluVar = new brlu();
        dnqg ca = dnqh.p.ca(dnqhVar);
        if (bxkvVar != null) {
            ddgg d2 = bxkvVar.d();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnqh dnqhVar3 = (dnqh) ca.b;
            d2.getClass();
            dnqhVar3.k = d2;
            dnqhVar3.a |= 32768;
        }
        String str5 = dxbpVar5.o;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnqh dnqhVar4 = (dnqh) ca.b;
        str5.getClass();
        dnqhVar4.a |= 4;
        dnqhVar4.d = str5;
        if (d.ba() && this.aQ.getEnableFeatureParameters().aA) {
            int i9 = ddda.fn.b;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnqh dnqhVar5 = (dnqh) ca.b;
            dnqhVar5.a |= 64;
            dnqhVar5.g = i9;
        } else if (d.bb()) {
            int i10 = ddda.fm.b;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnqh dnqhVar6 = (dnqh) ca.b;
            dnqhVar6.a |= 64;
            dnqhVar6.g = i10;
        } else {
            int a12 = dxbk.a(dxbpVar5.g);
            if (a12 != 0 && a12 == 17) {
                int i11 = ddda.fx.b;
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dnqh dnqhVar7 = (dnqh) ca.b;
                dnqhVar7.a |= 64;
                dnqhVar7.g = i11;
            } else {
                ddxw bZ3 = ddxx.j.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddxx ddxxVar = (ddxx) bZ3.b;
                ddxxVar.a |= 8;
                ddxxVar.d = 5361;
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dnqh dnqhVar8 = (dnqh) ca.b;
                ddxx bK2 = bZ3.bK();
                bK2.getClass();
                dnqhVar8.f = bK2;
                dnqhVar8.a |= 16;
            }
        }
        int a13 = dxbi.a(dxbpVar5.f);
        boolean z4 = a13 != 0 && a13 == 3;
        dwiv dwivVar = dwjjVar.c;
        if (dwivVar == null) {
            dwivVar = dwiv.M;
        }
        brluVar.I(dwivVar, ggaVar.getApplication(), this.aQ.getSearchParameters().e(), this.aQ);
        begj begjVar = new begj();
        begjVar.b(d);
        begjVar.g = bwrs.a(brluVar);
        begjVar.t = true;
        begjVar.d = ca.bK();
        begjVar.K = true;
        begjVar.F = true;
        begjVar.D = false;
        begjVar.J = z4;
        begjVar.p = z4;
        begjVar.E = true;
        this.f.a().n(begjVar, a8, null);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        if (this.aD) {
            bxkp bxkpVar = this.af;
            bxkpVar.a(ckjw.v);
            bxkpVar.a(ckjw.w);
            bxkpVar.a(ckjw.ag);
            bxkpVar.a(ckjw.ah);
            ((ckcn) this.af.a.a(ckjw.j)).a();
            this.ag.b(ckmk.SEARCH_TO_LIST);
            this.ba.a(ckls.QUERY_ENTERED);
            this.b.a().f().e(str, str, dnqhVar);
        }
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        btrm btrmVar = this.aS;
        bxdx bxdxVar = this.ap;
        dceq a2 = dcet.a();
        a2.b(azqv.class, new bxdz(0, azqv.class, bxdxVar, bvrj.UI_THREAD));
        a2.b(anlb.class, new bxdz(1, anlb.class, bxdxVar, bvrj.UI_THREAD));
        a2.b(wdz.class, new bxdz(2, wdz.class, bxdxVar, bvrj.UI_THREAD));
        a2.b(bxtw.class, new bxdz(3, bxtw.class, bxdxVar, bvrj.UI_THREAD));
        a2.b(bxtz.class, new bxdz(4, bxtz.class, bxdxVar, bvrj.UI_THREAD));
        a2.b(bxua.class, new bxdz(5, bxua.class, bxdxVar, bvrj.UI_THREAD));
        a2.b(bxub.class, new bxdz(6, bxub.class, bxdxVar, bvrj.UI_THREAD));
        btrmVar.g(bxdxVar, a2.a());
        if (bundle != null) {
            this.aj = bundle.getBoolean("isZeroSuggestUpdatePending", false);
        } else {
            this.aj = false;
        }
        if (this.bd != null) {
            this.ai.e();
            this.bd.e(new bxvr(), this.ai);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.ao = new ViewTreeObserver.OnWindowFocusChangeListener(this) { // from class: bxdv
                private final bxdy a;

                {
                    this.a = this;
                }

                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    bxdy bxdyVar = this.a;
                    if (z) {
                        bxdyVar.aV();
                    }
                }
            };
        }
    }

    @Override // defpackage.bxel, defpackage.ges
    public final ddho p() {
        return dtyb.aG;
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bxqh bxqhVar = this.be;
        if (bxqhVar != null) {
            bxqhVar.ag(ibl.ax());
        }
        if (this.aj) {
            bo();
            this.aj = false;
            this.am = false;
        }
        this.ak = this.ad.j();
        this.ad.C().d(this.an, this.ah);
        this.af.a(ckjw.at);
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("isZeroSuggestUpdatePending", this.aj);
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void u() {
        bxkp bxkpVar = this.af;
        ((ckhe) bxkpVar.a.a(ckjw.at)).c();
        this.ad.C().c(this.an);
        super.u();
    }
}
