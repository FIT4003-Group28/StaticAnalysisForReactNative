package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cedy  reason: default package */
/* loaded from: classes4.dex */
public final class cedy extends ges implements egq, cevb {
    private static final dcqe al = dcqe.c("cedy");
    public gga a;
    public cevh ad;
    public cpv ae;
    public cevg<?, ?> af;
    dhtc ag;
    @dzsi
    drfs ah;
    @dzsi
    String ai;
    @dzsi
    dpyv aj;
    private cqkf<cesp> ao;
    @dzsi
    private View ap;
    private drds aq;
    public bvrb b;
    public akfa c;
    public bvjj d;
    public auhi e;
    public efg f;
    public cqkj g;
    private final cgrc am = new cgrc();
    private final crzp<btlu> an = new cedx(this);
    private boolean ar = false;
    public String ak = "";

    public static cedy g(@dzsi String str, drds drdsVar, cees ceesVar) {
        cedy cedyVar = new cedy();
        Bundle bundle = new Bundle();
        cery bZ = cerz.i.bZ();
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cerz cerzVar = (cerz) bZ.b;
            str.getClass();
            cerzVar.a |= 1;
            cerzVar.b = str;
        }
        dpyv b = ceesVar.b();
        if (b != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cerz cerzVar2 = (cerz) bZ.b;
            cerzVar2.d = b.dm;
            cerzVar2.a |= 4;
            cedyVar.ar = true;
        }
        dhtc a = ceesVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cerz cerzVar3 = (cerz) bZ.b;
        a.getClass();
        cerzVar3.f = a;
        cerzVar3.a |= 16;
        drfs d = ceesVar.d();
        if (d != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cerz cerzVar4 = (cerz) bZ.b;
            d.getClass();
            cerzVar4.g = d;
            cerzVar4.a |= 32;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cerz cerzVar5 = (cerz) bZ.b;
        cerzVar5.e = drdsVar.j;
        cerzVar5.a |= 8;
        boolean e = ceesVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cerz cerzVar6 = (cerz) bZ.b;
        cerzVar6.a |= 64;
        cerzVar6.h = e;
        bundle.putByteArray("profile_leaf_page_fragment_state_key", bZ.bK().bS());
        cedyVar.B(bundle);
        return cedyVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.ao.e(null);
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        gga ggaVar = this.aE;
        if (!this.ar || ggaVar == null) {
            return;
        }
        dpyv dpyvVar = this.aj;
        avac.bp(ggaVar, dpyvVar == null ? null : Integer.valueOf(dpyvVar.dm), this.d, this.b, this.e);
        this.ar = false;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cesp> e = this.g.e(new cegm());
        this.ao = e;
        e.e(this.af);
        View c = this.ao.c();
        this.ap = c;
        return c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.af.s();
        this.am.f();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        Nw(new cedv(this));
        return false;
    }

    @Override // defpackage.cevb
    public final void i(String str) {
        View view = this.ap;
        if (view == null) {
            return;
        }
        this.ae.f(view, str);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dpyv dpyvVar;
        cevg ceyfVar;
        cevg cevnVar;
        super.l(bundle);
        cerz cerzVar = (cerz) bvrs.g(bundle != null ? bundle : this.o, "profile_leaf_page_fragment_state_key", (dssr) cerz.i.cu(7), cerz.i);
        if (!cerzVar.equals(cerz.i)) {
            this.ai = (cerzVar.a & 1) != 0 ? cerzVar.b : null;
            String str = cerzVar.c;
            this.ak = str;
            if (str.isEmpty()) {
                this.ak = dbsj.e(btlu.h(this.c.j()));
            }
            if ((cerzVar.a & 4) != 0) {
                dpyvVar = dpyv.b(cerzVar.d);
                if (dpyvVar == null) {
                    dpyvVar = dpyv.UNKNOWN_NOTIFICATION_ID;
                }
            } else {
                dpyvVar = null;
            }
            this.aj = dpyvVar;
            drds b = drds.b(cerzVar.e);
            if (b == null) {
                b = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
            }
            this.aq = b;
            dhtc dhtcVar = cerzVar.f;
            if (dhtcVar == null) {
                dhtcVar = dhtc.l;
            }
            this.ag = dhtcVar;
            drfs drfsVar = cerzVar.g;
            if (drfsVar == null) {
                drfsVar = drfs.c;
            }
            drfs drfsVar2 = drfsVar;
            this.ah = drfsVar2;
            cevh cevhVar = this.ad;
            cgrc cgrcVar = this.am;
            drds drdsVar = this.aq;
            dhtc dhtcVar2 = this.ag;
            String str2 = this.ai;
            boolean z = cerzVar.h;
            Integer num = cevh.a.get(drdsVar);
            String string = num != null ? cevhVar.b.getString(num.intValue()) : "";
            switch (drdsVar.ordinal()) {
                case 1:
                case 7:
                    if (cevhVar.j.c()) {
                        ceyk ceykVar = cevhVar.c;
                        Activity activity = (Activity) ((dxjd) ceykVar.a).a;
                        ceyk.a(activity, 1);
                        btrm a = ceykVar.b.a();
                        ceyk.a(a, 2);
                        cqhn a2 = ceykVar.c.a();
                        ceyk.a(a2, 3);
                        btvo a3 = ceykVar.d.a();
                        ceyk.a(a3, 4);
                        cese a4 = ceykVar.e.a();
                        ceyk.a(a4, 5);
                        cefh a5 = ceykVar.f.a();
                        ceyk.a(a5, 6);
                        ceyb a6 = ceykVar.g.a();
                        ceyk.a(a6, 7);
                        cebr a7 = ceykVar.h.a();
                        ceyk.a(a7, 8);
                        ceyk.a(cgrcVar, 9);
                        ceyk.a(string, 10);
                        ceyk.a(drfsVar2, 12);
                        ceyfVar = new ceyj(activity, a, a2, a3, a4, a5, a6, a7, cgrcVar, string, str2, drfsVar2, z);
                    } else {
                        ceyg ceygVar = cevhVar.d;
                        Activity activity2 = (Activity) ((dxjd) ceygVar.a).a;
                        ceyg.a(activity2, 1);
                        btrm a8 = ceygVar.b.a();
                        ceyg.a(a8, 2);
                        cqhn a9 = ceygVar.c.a();
                        ceyg.a(a9, 3);
                        btvo a10 = ceygVar.d.a();
                        ceyg.a(a10, 4);
                        cefh a11 = ceygVar.e.a();
                        ceyg.a(a11, 5);
                        ceuo a12 = ceygVar.f.a();
                        ceyg.a(a12, 6);
                        nvh a13 = ceygVar.g.a();
                        ceyg.a(a13, 7);
                        isd a14 = ceygVar.h.a();
                        ceyg.a(a14, 8);
                        cese a15 = ceygVar.i.a();
                        ceyg.a(a15, 9);
                        cebr a16 = ceygVar.j.a();
                        ceyg.a(a16, 10);
                        ceyg.a(cgrcVar, 11);
                        ceyg.a(this, 12);
                        ceyg.a(string, 13);
                        ceyfVar = new ceyf(activity2, a8, a9, a10, a11, a12, a13, a14, a15, a16, cgrcVar, this, string, str2, drfsVar2);
                    }
                    ceyfVar.n();
                    break;
                case 2:
                    cese ceseVar = cevhVar.j;
                    cewo cewoVar = cevhVar.e;
                    Activity activity3 = (Activity) ((dxjd) cewoVar.a).a;
                    cewo.a(activity3, 1);
                    cqhn a17 = cewoVar.b.a();
                    cewo.a(a17, 2);
                    btvo a18 = cewoVar.c.a();
                    cewo.a(a18, 3);
                    cefd a19 = cewoVar.d.a();
                    cewo.a(a19, 4);
                    ceuo a20 = cewoVar.e.a();
                    cewo.a(a20, 5);
                    nvh a21 = cewoVar.f.a();
                    cewo.a(a21, 6);
                    isd a22 = cewoVar.g.a();
                    cewo.a(a22, 7);
                    cese a23 = cewoVar.h.a();
                    cewo.a(a23, 8);
                    cewo.a(cgrcVar, 9);
                    cewo.a(this, 10);
                    cewo.a(string, 11);
                    cevg cewnVar = new cewn(activity3, a17, a18, a19, a20, a21, a22, a23, cgrcVar, this, string, str2);
                    cewnVar.n();
                    ceyfVar = cewnVar;
                    break;
                case 3:
                    cevo cevoVar = cevhVar.f;
                    Activity activity4 = (Activity) ((dxjd) cevoVar.a).a;
                    cevo.a(activity4, 1);
                    btrm a24 = cevoVar.b.a();
                    cevo.a(a24, 2);
                    cqhn a25 = cevoVar.c.a();
                    cevo.a(a25, 3);
                    cefb a26 = cevoVar.d.a();
                    cevo.a(a26, 4);
                    ceuo a27 = cevoVar.e.a();
                    cevo.a(a27, 5);
                    nvh a28 = cevoVar.f.a();
                    cevo.a(a28, 6);
                    cevo.a(cgrcVar, 7);
                    cevo.a(string, 8);
                    cevnVar = new cevn(activity4, a24, a25, a26, a27, a28, cgrcVar, string, str2);
                    cevnVar.n();
                    ceyfVar = cevnVar;
                    break;
                case 4:
                    cese ceseVar2 = cevhVar.j;
                    ceuk ceukVar = cevhVar.i;
                    Activity activity5 = (Activity) ((dxjd) ceukVar.a).a;
                    ceuk.a(activity5, 1);
                    cqhn a29 = ceukVar.b.a();
                    ceuk.a(a29, 2);
                    akfa a30 = ceukVar.c.a();
                    ceuk.a(a30, 3);
                    bvjj a31 = ceukVar.d.a();
                    ceuk.a(a31, 4);
                    btvo a32 = ceukVar.e.a();
                    ceuk.a(a32, 5);
                    cklf a33 = ceukVar.f.a();
                    ceuk.a(a33, 6);
                    ceev a34 = ceukVar.g.a();
                    ceuk.a(a34, 7);
                    nvh a35 = ceukVar.h.a();
                    ceuk.a(a35, 8);
                    ceuo a36 = ceukVar.i.a();
                    ceuk.a(a36, 9);
                    ceuk.a(cgrcVar, 10);
                    ceuk.a(string, 11);
                    cevnVar = new ceuj(activity5, a29, a30, a31, a32, a33, a34, a35, a36, cgrcVar, string);
                    cevnVar.n();
                    ceyfVar = cevnVar;
                    break;
                case 5:
                    cexf cexfVar = cevhVar.g;
                    gga a37 = cexfVar.a.a();
                    cexf.a(a37, 1);
                    cqhn a38 = cexfVar.b.a();
                    cexf.a(a38, 2);
                    bjgj a39 = cexfVar.c.a();
                    cexf.a(a39, 3);
                    bjgl a40 = cexfVar.d.a();
                    cexf.a(a40, 4);
                    cjqq a41 = cexfVar.e.a();
                    cexf.a(a41, 5);
                    cjqy a42 = cexfVar.f.a();
                    cexf.a(a42, 6);
                    ceff a43 = cexfVar.g.a();
                    cexf.a(a43, 7);
                    cexb a44 = cexfVar.h.a();
                    cexf.a(a44, 8);
                    btvo a45 = cexfVar.i.a();
                    cexf.a(a45, 9);
                    cese a46 = cexfVar.j.a();
                    cexf.a(a46, 10);
                    cexf.a(cgrcVar, 11);
                    cexf.a(dhtcVar2, 12);
                    cexf.a(string, 13);
                    cevnVar = new cexe(a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, cgrcVar, dhtcVar2, string, str2);
                    cevnVar.n();
                    ceyfVar = cevnVar;
                    break;
                case 6:
                    ceum ceumVar = cevhVar.h;
                    Activity activity6 = (Activity) ((dxjd) ceumVar.a).a;
                    ceum.a(activity6, 1);
                    cqhn a47 = ceumVar.b.a();
                    ceum.a(a47, 2);
                    ceex a48 = ceumVar.c.a();
                    ceum.a(a48, 3);
                    nvh a49 = ceumVar.d.a();
                    ceum.a(a49, 4);
                    ceuo a50 = ceumVar.e.a();
                    ceum.a(a50, 5);
                    cbea a51 = ceumVar.f.a();
                    ceum.a(a51, 6);
                    ceum.a(cgrcVar, 7);
                    ceum.a(string, 8);
                    cevnVar = new ceul(activity6, a47, a48, a49, a50, a51, cgrcVar, string);
                    cevnVar.n();
                    ceyfVar = cevnVar;
                    break;
                default:
                    ceyfVar = null;
                    break;
            }
            if (ceyfVar == null) {
                bvoo.h("Failed to create leaf page view model.", new Object[0]);
                return;
            }
            this.af = ceyfVar;
            this.am.a(bundle);
            this.af.r();
            if (bundle == null) {
                return;
            }
            this.af.l(bundle);
            return;
        }
        bvoo.h("Failed to parse LeafPageFragmentState.", new Object[0]);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.am.c();
        this.af.o();
        this.c.C().d(this.an, dege.a);
        efg efgVar = this.f;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.F(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.ao.c());
        egjVar.e(this);
        egjVar.J(this);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.am.d(bundle);
        cery bZ = cerz.i.bZ();
        String str = this.ai;
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cerz cerzVar = (cerz) bZ.b;
            str.getClass();
            cerzVar.a |= 1;
            cerzVar.b = str;
        }
        if (!this.ak.isEmpty()) {
            String str2 = this.ak;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cerz cerzVar2 = (cerz) bZ.b;
            str2.getClass();
            cerzVar2.a |= 2;
            cerzVar2.c = str2;
        }
        dpyv dpyvVar = this.aj;
        if (dpyvVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cerz cerzVar3 = (cerz) bZ.b;
            cerzVar3.d = dpyvVar.dm;
            cerzVar3.a |= 4;
        }
        drfs drfsVar = this.ah;
        if (drfsVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cerz cerzVar4 = (cerz) bZ.b;
            drfsVar.getClass();
            cerzVar4.g = drfsVar;
            cerzVar4.a |= 32;
        }
        dhtc dhtcVar = this.ag;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cerz cerzVar5 = (cerz) bZ.b;
        dhtcVar.getClass();
        cerzVar5.f = dhtcVar;
        int i = cerzVar5.a | 16;
        cerzVar5.a = i;
        cerzVar5.e = this.aq.j;
        cerzVar5.a = i | 8;
        bundle.putByteArray("profile_leaf_page_fragment_state_key", bZ.bK().bS());
        this.af.k(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.c.C().c(this.an);
        this.af.p();
        this.am.e();
    }
}
