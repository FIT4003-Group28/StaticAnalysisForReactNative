package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbdo  reason: default package */
/* loaded from: classes3.dex */
public final class bbdo extends itb implements bbdv {
    private static final int[] o = {bzqb.WEB_AND_APP_ACTIVITY.d};
    private static final dcqe p = dcqe.c("bbdo");
    public final dzsj<gga> a;
    public final bwqv b;
    public final anhk c;
    public final dzsj<cjxd> d;
    public final cqat e;
    public final ProgressDialog f;
    public final dxio<bbnd> g;
    public final dxio<ckcw> h;
    @dzsi
    public bwrr<ilo> i;
    public boolean j = false;
    public boolean k = false;
    private final dxio<bvjj> q;
    private final dxio<akfa> r;
    private final dxio<akfc> s;
    private final dxio<begg> t;
    private final bbnc u;
    private final bbeo v;
    private final bzqc w;
    private final dzsj<bzqa> x;
    private final Executor y;
    private final dxio<bbcv> z;

    public bbdo(dzsj<gga> dzsjVar, bwqv bwqvVar, dxio<bvjj> dxioVar, dxio<akfa> dxioVar2, dxio<akfc> dxioVar3, dxio<begg> dxioVar4, anhk anhkVar, bbnc bbncVar, bbeo bbeoVar, bzqc bzqcVar, dzsj<bzqa> dzsjVar2, dzsj<cjxd> dzsjVar3, cqat cqatVar, Executor executor, dxio<bbcv> dxioVar5, dxio<bbnd> dxioVar6, dxio<ckcw> dxioVar7) {
        this.a = dzsjVar;
        this.b = bwqvVar;
        this.q = dxioVar;
        this.r = dxioVar2;
        this.s = dxioVar3;
        this.t = dxioVar4;
        this.c = anhkVar;
        this.u = bbncVar;
        this.v = bbeoVar;
        this.w = bzqcVar;
        this.x = dzsjVar2;
        this.d = dzsjVar3;
        this.e = cqatVar;
        this.y = executor;
        this.z = dxioVar5;
        this.g = dxioVar6;
        this.h = dxioVar7;
        ProgressDialog progressDialog = new ProgressDialog(dzsjVar.a());
        this.f = progressDialog;
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(dzsjVar.a().getString(R.string.LOADING));
        progressDialog.setTitle("");
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(true);
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: bbdc
            private final bbdo a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.a.j = false;
            }
        });
        progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bbdd
            private final bbdo a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.j = true;
            }
        });
    }

    private final boolean L() {
        return this.q.a().o(bvjk.iU, this.r.a().j(), false);
    }

    private static boolean M(bbdt bbdtVar) {
        return (bbdtVar == bbdt.NOT_PRESENT || bbdtVar == bbdt.UNSUPPORTED_USER || bbdtVar == bbdt.FORBIDDEN_PLACE || bbdtVar == bbdt.CLIENT_ERROR) ? false : true;
    }

    @Override // defpackage.bbdv
    public final void B(final ilo iloVar, dpqg dpqgVar, @dzsi bbdu bbduVar) {
        final bbnc bbncVar = this.u;
        final bbmt bbmtVar = new bbmt(dpqgVar);
        deha.q(deew.g(degp.q(bbncVar.a()), new defg(bbncVar, iloVar, bbmtVar) { // from class: bbmu
            private final bbnc a;
            private final ilo b;
            private final bbmt c;

            {
                this.a = bbncVar;
                this.b = iloVar;
                this.c = bbmtVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final bbnc bbncVar2 = this.a;
                ilo iloVar2 = this.b;
                final bbmt bbmtVar2 = this.c;
                bbmn bbmnVar = (bbmn) obj;
                dbsg<bbmo> d = bbmnVar.d(iloVar2.ai());
                dbsg<V> h = d.h(new dbrn(bbmtVar2) { // from class: bbms
                    private final bbmt a;

                    {
                        this.a = bbmtVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        return bbnc.c((bbmo) obj2, this.a);
                    }
                });
                if (!d.a() || !d.b().equals(h.b())) {
                    if (!d.a()) {
                        dpoy a = btpj.a.a(iloVar2);
                        dpoz bZ = dppa.d.bZ();
                        Object a2 = bbmtVar2.a(dpqh.c.bZ());
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dppa dppaVar = (dppa) bZ.b;
                        dpqh dpqhVar = (dpqh) ((dsqp) a2).bK();
                        dpqhVar.getClass();
                        dppaVar.b = dpqhVar;
                        dppaVar.a |= 2;
                        if (a.c) {
                            a.bF();
                            a.c = false;
                        }
                        dppl dpplVar = (dppl) a.b;
                        dppa bK = bZ.bK();
                        dppl dpplVar2 = dppl.m;
                        bK.getClass();
                        dpplVar.k = bK;
                        dpplVar.a |= 2048;
                        dppl bK2 = a.bK();
                        btrg btrgVar = bbncVar2.a;
                        dpov dpovVar = ((bbmk) bbncVar2.f).a.b;
                        if (dpovVar == null) {
                            dpovVar = dpov.f;
                        }
                        dcdc f = dcdc.f(bK2);
                        dhqh bZ2 = dhqi.e.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhqi dhqiVar = (dhqi) bZ2.b;
                        dpovVar.getClass();
                        dhqiVar.b = dpovVar;
                        dhqiVar.a |= 1;
                        dhqi dhqiVar2 = (dhqi) bZ2.b;
                        dsrj<dppl> dsrjVar = dhqiVar2.c;
                        if (!dsrjVar.a()) {
                            dhqiVar2.c = dsqw.cl(dsrjVar);
                        }
                        dsod.bv(f, dhqiVar2.c);
                        dnqh h2 = btrg.h(ddda.ak);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhqi dhqiVar3 = (dhqi) bZ2.b;
                        h2.getClass();
                        dhqiVar3.d = h2;
                        dhqiVar3.a |= 2;
                        return deew.h(degp.q(deew.h(degp.q(btrgVar.f(btrgVar.b, bZ2.bK(), btpz.a, btqa.a)), btrg.g(btqb.a), dege.a)), new dbrn(bbncVar2) { // from class: bbmv
                            private final bbnc a;

                            {
                                this.a = bbncVar2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj2) {
                                bbmn c;
                                bbnc bbncVar3 = this.a;
                                for (dppl dpplVar3 : ((dhqk) obj2).a) {
                                    bbmn bbmnVar2 = bbncVar3.f;
                                    bbmp bbmpVar = new bbmp(dpplVar3);
                                    int e = bbmnVar2.e(bbmpVar.b());
                                    if (e != -1) {
                                        dpot dpotVar = ((bbmk) bbmnVar2).a;
                                        dsqp dsqpVar = (dsqp) dpotVar.cu(5);
                                        dsqpVar.bC(dpotVar);
                                        dpoq dpoqVar = (dpoq) dsqpVar;
                                        dpoqVar.b(e, bbmpVar.a);
                                        c = bbmn.c(dpoqVar.bK());
                                    } else {
                                        dpot dpotVar2 = ((bbmk) bbmnVar2).a;
                                        dsqp dsqpVar2 = (dsqp) dpotVar2.cu(5);
                                        dsqpVar2.bC(dpotVar2);
                                        dpoq dpoqVar2 = (dpoq) dsqpVar2;
                                        dppl dpplVar4 = bbmpVar.a;
                                        if (dpoqVar2.c) {
                                            dpoqVar2.bF();
                                            dpoqVar2.c = false;
                                        }
                                        dpot dpotVar3 = (dpot) dpoqVar2.b;
                                        dpplVar4.getClass();
                                        dpotVar3.b();
                                        dpotVar3.h.add(dpplVar4);
                                        c = bbmn.c(dpoqVar2.bK());
                                    }
                                    bbncVar3.f = c;
                                }
                                return bbncVar3.f;
                            }
                        }, bbncVar2.c);
                    }
                    final bbmo b = d.b();
                    btrg btrgVar2 = bbncVar2.a;
                    dppm bZ3 = dppn.f.bZ();
                    dpov dpovVar2 = ((bbmk) bbncVar2.f).a.b;
                    if (dpovVar2 == null) {
                        dpovVar2 = dpov.f;
                    }
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dppn dppnVar = (dppn) bZ3.b;
                    dpovVar2.getClass();
                    dppnVar.d = dpovVar2;
                    dppnVar.a |= 1;
                    dppt dpptVar = b.a().d;
                    if (dpptVar == null) {
                        dpptVar = dppt.e;
                    }
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dppn dppnVar2 = (dppn) bZ3.b;
                    dpptVar.getClass();
                    dppnVar2.e = dpptVar;
                    dppnVar2.a |= 2;
                    Object a3 = bbmtVar2.a(dpqh.c.bZ());
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dppn dppnVar3 = (dppn) bZ3.b;
                    dpqh dpqhVar2 = (dpqh) ((dsqp) a3).bK();
                    dpqhVar2.getClass();
                    dppnVar3.c = dpqhVar2;
                    dppnVar3.b = 5;
                    final dppn bK3 = bZ3.bK();
                    dkad bZ4 = dkae.d.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dkae dkaeVar = (dkae) bZ4.b;
                    bK3.getClass();
                    dkaeVar.b = bK3;
                    dkaeVar.a |= 1;
                    dnqh h3 = btrg.h(ddda.aC);
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dkae dkaeVar2 = (dkae) bZ4.b;
                    h3.getClass();
                    dkaeVar2.c = h3;
                    dkaeVar2.a |= 2;
                    return deew.h(degp.q(deew.h(deew.h(degp.q(btrgVar2.f(btrgVar2.g, bZ4.bK(), btqs.a, btqt.a)), btrg.g(new bvqg(bK3) { // from class: btqu
                        private final dppn a;

                        {
                            this.a = bK3;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj2) {
                            dpsn dpsnVar;
                            dkag dkagVar = (dkag) obj2;
                            dppt dpptVar2 = this.a.e;
                            if (dpptVar2 == null) {
                                dpptVar2 = dppt.e;
                            }
                            if (dpptVar2.b == 2) {
                                dpsnVar = (dpsn) dpptVar2.c;
                            } else {
                                dpsnVar = dpsn.d;
                            }
                            long j = dpsnVar.c;
                        }
                    }), dege.a), btqv.a, dege.a)), new dbrn(bbncVar2, b, bbmtVar2) { // from class: bbmw
                        private final bbnc a;
                        private final bbmo b;
                        private final bbmt c;

                        {
                            this.a = bbncVar2;
                            this.b = b;
                            this.c = bbmtVar2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            bbnc bbncVar3 = this.a;
                            bbmo bbmoVar = this.b;
                            bbmt bbmtVar3 = this.c;
                            dppn dppnVar4 = (dppn) obj2;
                            bbmn bbmnVar2 = bbncVar3.f;
                            bbmo c = bbnc.c(bbmoVar, bbmtVar3);
                            int e = bbmnVar2.e(c.b());
                            if (e != -1) {
                                dpot dpotVar = ((bbmk) bbmnVar2).a;
                                dsqp dsqpVar = (dsqp) dpotVar.cu(5);
                                dsqpVar.bC(dpotVar);
                                dpoq dpoqVar = (dpoq) dsqpVar;
                                dpoqVar.b(e, ((bbmp) c).a);
                                bbmnVar2 = bbmn.c(dpoqVar.bK());
                            }
                            bbncVar3.f = bbmnVar2;
                            return bbncVar3.f;
                        }
                    }, bbncVar2.c);
                }
                return deha.a(bbmnVar);
            }
        }, bbncVar.c), new bbdk(this, bbduVar), dege.a);
    }

    @Override // defpackage.bbdv
    public final dehn<Boolean> C(final ilo iloVar) {
        bbnc bbncVar = this.u;
        final dpqg dpqgVar = dpqg.TYPE_NOT_INTERESTED;
        return deew.h(degp.q(bbncVar.a()), new dbrn(iloVar, dpqgVar) { // from class: bbmy
            private final ilo a;
            private final dpqg b;

            {
                this.a = iloVar;
                this.b = dpqgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ilo iloVar2 = this.a;
                dpqg dpqgVar2 = this.b;
                dbsg<bbmo> d = ((bbmn) obj).d(iloVar2.ai());
                if (d.a()) {
                    return Boolean.valueOf(d.b().e(dpqgVar2));
                }
                return false;
            }
        }, bbncVar.c);
    }

    @Override // defpackage.bbdv
    public final bbdt D(ilo iloVar) {
        if (!iloVar.cH().a()) {
            dqbi dqbiVar = iloVar.h().bg;
            if (dqbiVar == null) {
                dqbiVar = dqbi.g;
            }
            if ((dqbiVar.a & 2) == 0) {
                return bbdt.NOT_PRESENT;
            }
        }
        dqbi dqbiVar2 = iloVar.h().bg;
        if (dqbiVar2 == null) {
            dqbiVar2 = dqbi.g;
        }
        int a = dqbh.a(dqbiVar2.d);
        if (a == 0) {
            a = 1;
        }
        if (a != 4 || !this.r.a().c()) {
            if (a == 4) {
                return bbdt.NOT_LOGGED_IN;
            }
            bzqb[] bzqbVarArr = {bzqb.WEB_AND_APP_ACTIVITY};
            cjxd a2 = this.d.a();
            if (a2 == null || !a2.b() || this.w.c(bzqbVarArr[0]) == 3) {
                return bbdt.WAA_OFF;
            }
            if (a == 5) {
                return bbdt.UNSUPPORTED_USER;
            }
            if (a == 6) {
                return bbdt.FORBIDDEN_PLACE;
            }
            if (iloVar.s) {
                return bbdt.UPDATING;
            }
            if (iloVar.cH().a()) {
                return bbdt.GOOD_STATE;
            }
            if (a == 3) {
                return bbdt.LOW_CONFIDENCE;
            }
            if (!L()) {
                return bbdt.ONBOARDING_NOT_STARTED;
            }
            if (a == 2) {
                return bbdt.NOT_ENOUGH_DATA;
            }
            bvoo.h("(personal-score): PersonalScoreVeneer encountered a state it couldn't handle: %s", dqbiVar2.toString());
            return bbdt.CLIENT_ERROR;
        }
        return bbdt.CLIENT_ERROR;
    }

    @Override // defpackage.bbdv
    public final void E(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        ily g = c.g();
        g.I = true;
        bwrsVar.d(g.d());
    }

    @Override // defpackage.bbdv
    public final void F(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        ily g = c.g();
        g.I = true;
        g.e = false;
        bwrsVar.d(g.d());
    }

    @Override // defpackage.bbdv
    public final boolean G(ilo iloVar) {
        return M(D(iloVar));
    }

    @Override // defpackage.bbdv
    public final void H(boolean z) {
        this.q.a().T(bvjk.iU, this.r.a().j(), z);
    }

    @Override // defpackage.bbdv
    public final void I(ilo iloVar, cjta cjtaVar) {
        int i;
        float pow;
        dqbi dqbiVar = iloVar.h().bg;
        if (dqbiVar == null) {
            dqbiVar = dqbi.g;
        }
        cjtaVar.g(dqbiVar.f);
        bbdt D = D(iloVar);
        bbdt bbdtVar = bbdt.LOW_CONFIDENCE;
        switch (D.ordinal()) {
            case 0:
                i = 4;
                break;
            case 1:
            case 7:
                i = 6;
                break;
            case 2:
            case 8:
            case 9:
            default:
                i = 1;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 7;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 9;
                break;
            case 10:
                i = 5;
                break;
            case 11:
                i = 8;
                break;
            case 12:
                i = 10;
                break;
        }
        if (i == 1) {
            return;
        }
        ddfi bZ = ddfk.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddfk ddfkVar = (ddfk) bZ.b;
        ddfkVar.b = i - 1;
        ddfkVar.a |= 1;
        dbsg<Float> cH = iloVar.cH();
        if (i == 3 && cH.a()) {
            float floatValue = cH.b().floatValue();
            float round = Math.round(floatValue * pow) / ((float) Math.pow(10.0d, 2.0d));
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddfk ddfkVar2 = (ddfk) bZ.b;
            ddfkVar2.a = 2 | ddfkVar2.a;
            ddfkVar2.c = round;
        }
        ddes bZ2 = ddet.D.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddet ddetVar = (ddet) bZ2.b;
        ddfk bK = bZ.bK();
        bK.getClass();
        ddetVar.f = bK;
        ddetVar.a = 8 | ddetVar.a;
        ddeo bZ3 = ddep.f.bZ();
        dtbk g = iloVar.ai().g();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ddep ddepVar = (ddep) bZ3.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddet ddetVar2 = (ddet) bZ2.b;
        ddep bK2 = bZ3.bK();
        bK2.getClass();
        ddetVar2.c = bK2;
        ddetVar2.a |= 1;
        cjtaVar.s(bZ2.bK());
    }

    @Override // defpackage.bbdv
    public final void J(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        ily g = c.g();
        g.e = false;
        bwrsVar.d(g.d());
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        this.t.a().p(c2, null, new bbdl(this, bwrsVar));
    }

    @Override // defpackage.bbdv
    public final void K(View view, ilo iloVar) {
        bbdt D = D(iloVar);
        if (M(D) && !L()) {
            bbeo bbeoVar = this.v;
            boolean z = D == bbdt.GOOD_STATE;
            bbeoVar.b = new WeakReference<>(view);
            bbeoVar.c = z;
            bbeoVar.a.a(bbeoVar);
        }
    }

    @Override // defpackage.itb
    public final void Nu() {
        bbnc bbncVar = this.u;
        bbncVar.d.C().c(bbncVar.h);
        super.Nu();
    }

    @Override // defpackage.bbdv
    public final void e(final bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        bbdt D = D(c);
        bbdt bbdtVar = bbdt.LOW_CONFIDENCE;
        switch (D.ordinal()) {
            case 4:
            case 9:
            case 10:
            case 11:
                Toast.makeText(this.a.a(), (int) R.string.GENERIC_ERROR_MESSAGE, 1).show();
                bvoo.h("(personal-score): Tried to open personal score page with invalid state \n%s", D.toString());
                return;
            case 5:
            case 12:
                if (this.k) {
                    cjxd a = this.d.a();
                    if (a == null || !a.b() || !this.k) {
                        return;
                    }
                    this.k = false;
                    this.x.a().a(o, new bbdn(bwrsVar, this.w), "personal_score_setup");
                    return;
                }
                this.f.show();
                deha.q(k(), new bbdj(this, bwrsVar), dege.a);
                return;
            case 6:
                f(new akeo(this, bwrsVar) { // from class: bbde
                    private final bbdo a;
                    private final bwrs b;

                    {
                        this.a = this;
                        this.b = bwrsVar;
                    }

                    @Override // defpackage.akeo
                    public final void a(gga ggaVar, btlu btluVar) {
                        final bbdo bbdoVar = this.a;
                        final bwrs bwrsVar2 = this.b;
                        bbdoVar.f.show();
                        bbdoVar.i = new bwrr(bbdoVar, bwrsVar2) { // from class: bbdf
                            private final bbdo a;
                            private final bwrs b;

                            {
                                this.a = bbdoVar;
                                this.b = bwrsVar2;
                            }

                            @Override // defpackage.bwrr
                            public final void PV(Object obj) {
                                bbdo bbdoVar2 = this.a;
                                bwrs<ilo> bwrsVar3 = this.b;
                                ilo iloVar = (ilo) obj;
                                if (iloVar != null && iloVar.h) {
                                    if (!iloVar.f) {
                                        bbdoVar2.f.dismiss();
                                        bbdoVar2.j(bwrsVar3);
                                        return;
                                    }
                                    bbdt bbdtVar2 = bbdt.LOW_CONFIDENCE;
                                    int ordinal = bbdoVar2.D(iloVar).ordinal();
                                    if (ordinal != 4) {
                                        switch (ordinal) {
                                            case 9:
                                            case 10:
                                                break;
                                            case 11:
                                                bbdoVar2.f.dismiss();
                                                bbdoVar2.i(R.string.UNKNOWN_ERROR);
                                                bbdoVar2.j(bwrsVar3);
                                                return;
                                            default:
                                                cjxd a2 = bbdoVar2.d.a();
                                                dehn<UdcCacheResponse> c2 = (bbdoVar2.j || a2 == null || !a2.b()) ? deha.c() : bbdoVar2.k();
                                                bbdoVar2.j(bwrsVar3);
                                                deha.q(c2, new bbdi(bbdoVar2, bwrsVar3), dege.a);
                                                return;
                                        }
                                    }
                                    bbdoVar2.f.dismiss();
                                    bbdoVar2.i(R.string.PERSONAL_SCORE_UNSUPPORTED_USER_MESSAGE);
                                    bbdoVar2.j(bwrsVar3);
                                }
                            }
                        };
                        bbdoVar.b.g(bwrsVar2, bbdoVar.i);
                    }

                    @Override // defpackage.akeo
                    public final void b(gga ggaVar, btlu btluVar) {
                    }
                });
                return;
            case 7:
            case 8:
            default:
                bwqv bwqvVar = this.b;
                Bundle bundle = new Bundle();
                bwqvVar.c(bundle, "pm", bwrsVar);
                bbda bbdaVar = new bbda();
                bundle.putBoolean("fetch", false);
                bbdaVar.B(bundle);
                this.a.a().D(bbdaVar);
                return;
        }
    }

    @Override // defpackage.bbdv
    public final void f(akeo akeoVar) {
        akep j = akeu.j(akeoVar);
        ((akej) j).b = dbsg.i(new bbjm());
        this.s.a().a(j.b());
    }

    public final void i(final int i) {
        this.y.execute(new Runnable(this, i) { // from class: bbdg
            private final bbdo a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbdo bbdoVar = this.a;
                Toast.makeText(bbdoVar.a.a(), this.b, 1).show();
            }
        });
    }

    public final void j(bwrs<ilo> bwrsVar) {
        bwrr<ilo> bwrrVar = this.i;
        if (bwrrVar != null) {
            bwqv.t(bwrsVar, bwrrVar);
            this.i = null;
        }
    }

    public final dehn<UdcCacheResponse> k() {
        return this.w.a(dcdc.f(bzqb.WEB_AND_APP_ACTIVITY));
    }

    @Override // defpackage.bbdv
    public final void l() {
        if (!this.r.a().c()) {
            return;
        }
        Bundle bundle = new Bundle();
        bbct bbctVar = new bbct();
        bbctVar.B(bundle);
        this.a.a().D(bbctVar);
    }

    @Override // defpackage.bbdv
    public final void m(bbdx bbdxVar) {
        n(bbdxVar, null);
    }

    @Override // defpackage.bbdv
    public final void n(bbdx bbdxVar, @dzsi bbdy bbdyVar) {
        bwqv bwqvVar = this.b;
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "pm", bbdxVar.a());
        bundle.putBoolean("filter place sentiment key", bbdxVar.b());
        bundle.putBoolean("enable personalization feedback key", bbdxVar.c());
        bundle.putBoolean("enable dining preferences option", bbdxVar.d());
        bbcq bbcqVar = new bbcq();
        bbcqVar.B(bundle);
        bbcqVar.F(bbdyVar, -1);
        this.a.a().D(bbcqVar);
    }

    @Override // defpackage.bbdv
    public final void o(bwrs<ilo> bwrsVar) {
        bwqv bwqvVar = this.b;
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "pm", bwrsVar);
        bbcx bbcxVar = new bbcx();
        bbcxVar.B(bundle);
        this.a.a().D(bbcxVar);
    }

    @Override // defpackage.bbdv
    public final dehn<djzy> p(final dqem dqemVar) {
        dcdc f = dcdc.f(dqemVar);
        bbdq bbdqVar = this.z.a().a;
        deig d = deig.d();
        buza buzaVar = bbdqVar.b;
        djzv bZ = djzw.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djzw djzwVar = (djzw) bZ.b;
        dsrj<dqem> dsrjVar = djzwVar.a;
        if (!dsrjVar.a()) {
            djzwVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(f, djzwVar.a);
        buzaVar.b(bZ.bK(), new bbdp(bbdqVar, d), dege.a);
        return deew.h(d, new dbrn(this, dqemVar) { // from class: bbdh
            private final bbdo a;
            private final dqem b;

            {
                this.a = this;
                this.b = dqemVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dspd dspdVar;
                bbdo bbdoVar = this.a;
                dqem dqemVar2 = this.b;
                djzy djzyVar = (djzy) obj;
                bbnd a = bbdoVar.g.a();
                dspd dspdVar2 = dqemVar2.d;
                if (dqemVar2.b == 2) {
                    dspdVar = (dspd) dqemVar2.c;
                } else {
                    dspdVar = dspd.b;
                }
                a.a(dspdVar2, dspdVar);
                return djzyVar;
            }
        }, dege.a);
    }

    @Override // defpackage.bbdv
    public final void q(ilo iloVar) {
        r(iloVar, null);
    }

    @Override // defpackage.bbdv
    public final void r(ilo iloVar, @dzsi bbdu bbduVar) {
        B(iloVar, dpqg.TYPE_NOT_INTERESTED, bbduVar);
    }

    @Override // defpackage.bbdv
    public final void s(ilo iloVar, @dzsi bbdu bbduVar) {
        B(iloVar, dpqg.TYPE_INTERESTED, bbduVar);
    }

    @Override // defpackage.bbdv
    public final void t(ilo iloVar, @dzsi bbdu bbduVar) {
        B(iloVar, dpqg.TYPE_PARTIALLY_INTERESTED, bbduVar);
    }
}
