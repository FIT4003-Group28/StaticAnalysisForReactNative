package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import android.widget.EditText;
import java.util.List;
/* compiled from: PG */
/* renamed from: cclk  reason: default package */
/* loaded from: classes4.dex */
public final class cclk extends ges implements gfw, cczt, ccvb, ccxh {
    public static final dcqe a = dcqe.c("cclk");
    public btvo ad;
    public ccsk ae;
    public cczb af;
    public ccsj ag;
    @dzsi
    public cqkf<ccxl> ah;
    private cczu ak;
    public cczv b;
    public gga c;
    public cqkj d;
    public efg e;
    public ccrh f;
    public ccvc g;
    private final cclj aj = new cclj(this);
    public ccww ai = ccww.g;

    private final boolean aR() {
        return this.ad.getUgcOfferingsParameters().h();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<ccxl> cqkfVar = this.ah;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        this.ah = null;
        super.Qe();
    }

    @Override // defpackage.cczt
    public final void aJ(ccwu ccwuVar, int i, @dzsi cjqm cjqmVar) {
        djtw djtwVar;
        ccrh ccrhVar = this.f;
        ccwk ccwkVar = this.ai.d;
        if (ccwkVar == null) {
            ccwkVar = ccwk.m;
        }
        dgfb b = dgfb.b(ccwkVar.b);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        cjst d = cjsu.d();
        d.d(ddda.ev);
        cjry e = cjrz.e();
        e.b(ddcu.E);
        dddf bZ = dddg.g.bZ();
        dddj bZ2 = dddk.h.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dddk dddkVar = (dddk) bZ2.b;
        dddkVar.b = b.f;
        int i2 = 1;
        int i3 = dddkVar.a | 1;
        dddkVar.a = i3;
        int i4 = i - 1;
        dddkVar.c = i4;
        dddkVar.a = i3 | 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddk bK = bZ2.bK();
        bK.getClass();
        dddgVar.f = bK;
        dddgVar.a |= 128;
        ((cjrn) e).b = bZ.bK();
        d.f(e.a());
        ccrh.b(d, cjqmVar);
        ccrhVar.l.l(d.e());
        ccwx bZ3 = ccwy.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ccwy ccwyVar = (ccwy) bZ3.b;
        ccwuVar.getClass();
        ccwyVar.b = ccwuVar;
        ccwyVar.a |= 1;
        dgff bZ4 = dgfg.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dgfg dgfgVar = (dgfg) bZ4.b;
        dgfgVar.b = i4;
        dgfgVar.a |= 1;
        if (i == 5) {
            djtz djtzVar = ccwuVar.c;
            if (djtzVar == null) {
                djtzVar = djtz.c;
            }
            if (djtzVar.a == 1) {
                djtwVar = (djtw) djtzVar.b;
            } else {
                djtwVar = djtw.b;
            }
            String str = djtwVar.a;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dgfg dgfgVar2 = (dgfg) bZ4.b;
            str.getClass();
            dgfgVar2.a |= 2;
            dgfgVar2.c = str;
        }
        dgfg bK2 = bZ4.bK();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ccwy ccwyVar2 = (ccwy) bZ3.b;
        bK2.getClass();
        ccwyVar2.c = bK2;
        ccwyVar2.a |= 2;
        ccwy bK3 = bZ3.bK();
        jmw.d(this.c, null);
        ccme ccmeVar = this.ai.e;
        if (ccmeVar == null) {
            ccmeVar = ccme.f;
        }
        int a2 = ccmd.a(ccmeVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 - 1 == 2) {
            cclj ccljVar = this.aj;
            ccwu ccwuVar2 = bK3.b;
            if (ccwuVar2 == null) {
                ccwuVar2 = ccwu.d;
            }
            if (ccwuVar2.b.isEmpty()) {
                return;
            }
            ccljVar.a = bK3;
            ccsh g = ccsi.g();
            ccme ccmeVar2 = ccljVar.b.ai.e;
            if (ccmeVar2 == null) {
                ccmeVar2 = ccme.f;
            }
            int a3 = dgfe.a(ccmeVar2.d);
            if (a3 != 0) {
                i2 = a3;
            }
            g.i(i2);
            ccme ccmeVar3 = ccljVar.b.ai.e;
            if (ccmeVar3 == null) {
                ccmeVar3 = ccme.f;
            }
            g.f(ccmeVar3.e);
            ccwk ccwkVar2 = ccljVar.b.ai.d;
            if (ccwkVar2 == null) {
                ccwkVar2 = ccwk.m;
            }
            dsqp dsqpVar = (dsqp) ccwkVar2.cu(5);
            dsqpVar.bC(ccwkVar2);
            ccwj ccwjVar = (ccwj) dsqpVar;
            ccwu ccwuVar3 = bK3.b;
            if (ccwuVar3 == null) {
                ccwuVar3 = ccwu.d;
            }
            String str2 = ccwuVar3.b;
            if (ccwjVar.c) {
                ccwjVar.bF();
                ccwjVar.c = false;
            }
            ccwk ccwkVar3 = (ccwk) ccwjVar.b;
            str2.getClass();
            ccwkVar3.a |= 4;
            ccwkVar3.f = str2;
            dgfg dgfgVar3 = bK3.c;
            if (dgfgVar3 == null) {
                dgfgVar3 = dgfg.d;
            }
            if (ccwjVar.c) {
                ccwjVar.bF();
                ccwjVar.c = false;
            }
            ccwk ccwkVar4 = (ccwk) ccwjVar.b;
            dgfgVar3.getClass();
            ccwkVar4.l = dgfgVar3;
            ccwkVar4.a |= 256;
            g.e(ccwjVar.bK());
            if (!URLUtil.isNetworkUrl(ccljVar.b.ai.c)) {
                g.d(dcdc.f(bbtm.y(ccljVar.b.ai.c)));
            }
            ccljVar.b.ag.b(g.j());
            return;
        }
        i(bK3);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<ccxl> d = this.d.d(new ccql(), viewGroup, false);
        this.ah = d;
        return d.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.aD) {
            return this.ak.E();
        }
        return false;
    }

    public final void i(ccwy ccwyVar) {
        this.c.g().f();
        Nw(ccwyVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2;
        super.l(bundle);
        if (bundle == null) {
            bundle2 = this.o;
            dbsk.s(bundle2);
        } else {
            bundle2 = bundle;
        }
        ccww ccwwVar = (ccww) bvrs.e(bundle2, ccww.class, (dssr) ccww.g.cu(7));
        dbsk.s(ccwwVar);
        this.ai = ccwwVar;
        ccwk ccwkVar = ccwwVar.d;
        if (ccwkVar == null) {
            ccwkVar = ccwk.m;
        }
        ccwk ccwkVar2 = ccwkVar;
        ccsj a2 = this.ae.a(this.aj);
        this.ag = a2;
        ccxa ccxaVar = ccwkVar2.c;
        if (ccxaVar == null) {
            ccxaVar = ccxa.f;
        }
        dbsk.a(!ccxaVar.e.isEmpty());
        dbsk.a(!ccxaVar.b.isEmpty());
        ily ilyVar = new ily();
        ilyVar.k(ccxaVar.b);
        ilyVar.F(ccxaVar.e);
        for (String str : ccxaVar.c) {
            ilyVar.e(str);
        }
        if (!ccxaVar.d.isEmpty()) {
            ilyVar.p(ccxaVar.d);
        }
        a2.e = bwrs.a(ilyVar.d());
        cczv cczvVar = this.b;
        cczb cczbVar = this.af;
        gn R = R();
        bbut a3 = cczbVar.a.a();
        cczb.a(a3, 1);
        cczb.a(R, 2);
        ccza cczaVar = new ccza(a3, R);
        cqhn a4 = cczvVar.a.a();
        cczv.a(a4, 1);
        cqhu a5 = cczvVar.b.a();
        cczv.a(a5, 2);
        ff ffVar = (ff) ((dxjd) cczvVar.c).a;
        cczv.a(ffVar, 3);
        cjqy a6 = cczvVar.d.a();
        cczv.a(a6, 4);
        bvrb a7 = cczvVar.e.a();
        cczv.a(a7, 5);
        bvdz a8 = cczvVar.f.a();
        cczv.a(a8, 6);
        ccrh a9 = cczvVar.g.a();
        cczv.a(a9, 7);
        btvo a10 = cczvVar.h.a();
        cczv.a(a10, 8);
        dxio a11 = ((dxjh) cczvVar.i).a();
        cczv.a(a11, 9);
        ccvx a12 = cczvVar.j.a();
        cczv.a(a12, 10);
        cczk a13 = cczvVar.k.a();
        cczv.a(a13, 11);
        cpv a14 = cczvVar.l.a();
        cczv.a(a14, 12);
        bvjj a15 = cczvVar.m.a();
        cczv.a(a15, 13);
        cczv.a(cczaVar, 14);
        cczv.a(this, 15);
        cczu cczuVar = new cczu(a4, a5, ffVar, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, cczaVar, this);
        this.ak = cczuVar;
        dgfb b = dgfb.b(ccwkVar2.b);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        dgfb dgfbVar = b;
        ccww ccwwVar2 = this.ai;
        String str2 = ccwwVar2.b;
        String str3 = ccwwVar2.c;
        ccxa ccxaVar2 = ccwkVar2.c;
        if (ccxaVar2 == null) {
            ccxaVar2 = ccxa.f;
        }
        ccxa ccxaVar3 = ccxaVar2;
        ccme ccmeVar = this.ai.e;
        if (ccmeVar == null) {
            ccmeVar = ccme.f;
        }
        cczuVar.H(dgfbVar, str2, str3, ccxaVar3, ccmeVar, dcdc.r(this.ai.f));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.ar;
    }

    @Override // defpackage.ccvb
    public final void q(List<dwfl> list) {
        if (!aR()) {
            return;
        }
        this.ak.F(dcdc.r(list));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        cknz cknzVar;
        super.s();
        cqkf<ccxl> cqkfVar = this.ah;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.ak);
        this.ak.C(this);
        if (aR()) {
            ccwk ccwkVar = this.ai.d;
            if (ccwkVar == null) {
                ccwkVar = ccwk.m;
            }
            ccxa ccxaVar = ccwkVar.c;
            if (ccxaVar == null) {
                ccxaVar = ccxa.f;
            }
            String str = ccxaVar.b;
            ccvc ccvcVar = this.g;
            synchronized (((ccvf) ccvcVar).c) {
                ((ccvf) ccvcVar).c.n(str, this);
            }
            cknz cknzVar2 = ((ccvf) this.g).d.get(str);
            dcdc<dwfl> e = cknzVar2 == null ? dcdc.e() : ccvf.b(cknzVar2);
            boolean z = false;
            if (e.isEmpty() && ((cknzVar = ((ccvf) this.g).d.get(str)) == null || cknzVar.g())) {
                final ccvf ccvfVar = (ccvf) this.g;
                final cknz cknzVar3 = ccvfVar.d.get(str);
                if (cknzVar3 == null) {
                    ily ilyVar = new ily();
                    ilyVar.k(str);
                    cknzVar3 = new cknz(ilyVar.d(), new ccvg());
                    ccve ccveVar = new ccve(ccvfVar, str, cknzVar3);
                    cknzVar3.r(ccveVar);
                    ccvfVar.d.put(str, cknzVar3);
                    ccvfVar.e.add(ccveVar);
                }
                ccvfVar.a.execute(new Runnable(ccvfVar, cknzVar3) { // from class: ccvd
                    private final ccvf a;
                    private final cknz b;

                    {
                        this.a = ccvfVar;
                        this.b = cknzVar3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.h(this.a.b);
                    }
                });
                z = true;
            }
            this.ak.F(e);
            this.ak.G(Boolean.valueOf(z));
        }
        if (this.ak.d().isEmpty()) {
            this.ak.I();
        }
        View view = this.P;
        dbsk.s(view);
        efg efgVar = this.e;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(view);
        egjVar.J(new egq(this) { // from class: ccli
            private final cclk a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                EditText editText;
                cclk cclkVar = this.a;
                cqkf<ccxl> cqkfVar2 = cclkVar.ah;
                if (cqkfVar2 == null || (editText = (EditText) cqkx.e(cqkfVar2.c(), ccql.c, EditText.class)) == null) {
                    return;
                }
                editText.requestFocus();
                editText.sendAccessibilityEvent(8);
                ((InputMethodManager) cclkVar.J().getSystemService("input_method")).showSoftInput(editText, 1);
            }
        });
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        ccww ccwwVar = this.ai;
        dsqp dsqpVar = (dsqp) ccwwVar.cu(5);
        dsqpVar.bC(ccwwVar);
        ccwv ccwvVar = (ccwv) dsqpVar;
        String charSequence = this.ak.b().toString();
        if (ccwvVar.c) {
            ccwvVar.bF();
            ccwvVar.c = false;
        }
        ccww ccwwVar2 = (ccww) ccwvVar.b;
        ccww ccwwVar3 = ccww.g;
        charSequence.getClass();
        ccwwVar2.a |= 1;
        ccwwVar2.b = charSequence;
        ccwwVar2.f = ccww.ck();
        List<ccwu> D = this.ak.D();
        if (ccwvVar.c) {
            ccwvVar.bF();
            ccwvVar.c = false;
        }
        ccww ccwwVar4 = (ccww) ccwvVar.b;
        dsrj<ccwu> dsrjVar = ccwwVar4.f;
        if (!dsrjVar.a()) {
            ccwwVar4.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(D, ccwwVar4.f);
        ccww bK = ccwvVar.bK();
        this.ai = bK;
        bvrs.l(bundle, bK);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        jmw.d(this.c, null);
        cqkf<ccxl> cqkfVar = this.ah;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.u();
    }

    @Override // defpackage.ccvb
    public final void w() {
        if (!aR()) {
            return;
        }
        this.ak.G(false);
    }

    public static cclk g(String str, @dzsi String str2, ccwk ccwkVar, ccme ccmeVar) {
        int a2 = ccmd.a(ccmeVar.b);
        if (a2 != 0 && a2 == 3) {
            int a3 = dgfe.a(ccmeVar.d);
            dbsk.a((a3 == 0 || a3 == 1) ? false : true);
        }
        Bundle bundle = new Bundle();
        ccwv bZ = ccww.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccww ccwwVar = (ccww) bZ.b;
        str.getClass();
        ccwwVar.a = 1 | ccwwVar.a;
        ccwwVar.b = str;
        if (!dbsj.d(str2)) {
            dbsk.s(str2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccww ccwwVar2 = (ccww) bZ.b;
            str2.getClass();
            ccwwVar2.a |= 2;
            ccwwVar2.c = str2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccww ccwwVar3 = (ccww) bZ.b;
        ccwkVar.getClass();
        ccwwVar3.d = ccwkVar;
        int i = ccwwVar3.a | 4;
        ccwwVar3.a = i;
        ccmeVar.getClass();
        ccwwVar3.e = ccmeVar;
        ccwwVar3.a = i | 8;
        bvrs.l(bundle, bZ.bK());
        cclk cclkVar = new cclk();
        cclkVar.B(bundle);
        return cclkVar;
    }
}
