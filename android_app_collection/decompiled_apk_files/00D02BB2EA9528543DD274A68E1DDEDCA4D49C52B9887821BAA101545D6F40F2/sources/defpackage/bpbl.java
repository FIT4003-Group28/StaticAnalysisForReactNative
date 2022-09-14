package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bpbl  reason: default package */
/* loaded from: classes3.dex */
public class bpbl extends bnyu {
    private static final drda aq;
    public static final dcqe ar = dcqe.c("bpbl");
    public boxq aA;
    public gll aB;
    public cqkj aC;
    public befw aO;
    public bwqv aP;
    public dxio<abbl> aQ;
    public bomq aR;
    boxp aS;
    @dzsi
    public btzc aT;
    protected dnqe aU;
    @dzsi
    protected akqq aV;
    protected bowu aW;
    public iny aY;
    @dzsi
    private cqkf<jbk> aZ;
    public btrm as;
    public boxa at;
    public dxio<cqg> au;
    public bnyo av;
    public bpte aw;
    public ioj ax;
    public inq ay;
    public iop az;
    @dzsi
    private cqkf<bpvl> ba;
    @dzsi
    private akqi bb;
    private boolean bc;
    private ioi bd;
    @dzsi
    private ditt be;
    public dcdc<dikx> aX = dcdc.e();
    private final ink bf = new bpbj(this);

    static {
        drcz bZ = drda.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drda drdaVar = (drda) bZ.b;
        drdaVar.a |= 2;
        drdaVar.c = true;
        drda drdaVar2 = (drda) bZ.b;
        drdaVar2.a |= 4;
        drdaVar2.d = true;
        drcf bZ2 = drcg.e.bZ();
        dgge dggeVar = dgge.IMAGE_FIFE;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drcg drcgVar = (drcg) bZ2.b;
        drcgVar.b = dggeVar.l;
        drcgVar.a |= 1;
        dggc dggcVar = dggc.PHOTO;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drcg drcgVar2 = (drcg) bZ2.b;
        drcgVar2.d = dggcVar.f;
        drcgVar2.a |= 4;
        drcg bK = bZ2.bK();
        drcf bZ3 = drcg.e.bZ();
        dgge dggeVar2 = dgge.IMAGE_CONTENT_FIFE;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drcg drcgVar3 = (drcg) bZ3.b;
        drcgVar3.b = dggeVar2.l;
        drcgVar3.a |= 1;
        dggc dggcVar2 = dggc.PHOTO;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drcg drcgVar4 = (drcg) bZ3.b;
        drcgVar4.d = dggcVar2.f;
        drcgVar4.a |= 4;
        drcg bK2 = bZ3.bK();
        drcf bZ4 = drcg.e.bZ();
        dgge dggeVar3 = dgge.MEDIA_GUESSABLE_FIFE;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drcg drcgVar5 = (drcg) bZ4.b;
        drcgVar5.b = dggeVar3.l;
        drcgVar5.a |= 1;
        dggc dggcVar3 = dggc.PHOTO;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drcg drcgVar6 = (drcg) bZ4.b;
        drcgVar6.d = dggcVar3.f;
        drcgVar6.a |= 4;
        drcg bK3 = bZ4.bK();
        drcf bZ5 = drcg.e.bZ();
        dgge dggeVar4 = dgge.IMAGE_PANORAMIO;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drcg drcgVar7 = (drcg) bZ5.b;
        drcgVar7.b = dggeVar4.l;
        drcgVar7.a |= 1;
        dggc dggcVar4 = dggc.PHOTO;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drcg drcgVar8 = (drcg) bZ5.b;
        drcgVar8.d = dggcVar4.f;
        drcgVar8.a |= 4;
        drcg bK4 = bZ5.bK();
        drcf bZ6 = drcg.e.bZ();
        dgge dggeVar5 = dgge.IMAGE_ALLEYCAT;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drcg drcgVar9 = (drcg) bZ6.b;
        drcgVar9.b = dggeVar5.l;
        drcgVar9.a |= 1;
        dggc dggcVar5 = dggc.PHOTO;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drcg drcgVar10 = (drcg) bZ6.b;
        drcgVar10.d = dggcVar5.f;
        drcgVar10.a |= 4;
        drcg bK5 = bZ6.bK();
        drcf bZ7 = drcg.e.bZ();
        dgge dggeVar6 = dgge.IMAGE_ALLEYCAT;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        drcg drcgVar11 = (drcg) bZ7.b;
        drcgVar11.b = dggeVar6.l;
        drcgVar11.a |= 1;
        dggc dggcVar6 = dggc.PANO;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        drcg drcgVar12 = (drcg) bZ7.b;
        drcgVar12.d = dggcVar6.f;
        int i = drcgVar12.a | 4;
        drcgVar12.a = i;
        drcgVar12.a = i | 2;
        drcgVar12.c = true;
        drcg bK6 = bZ7.bK();
        drcf bZ8 = drcg.e.bZ();
        dgge dggeVar7 = dgge.IMAGE_ALLEYCAT_SEARCH;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        drcg drcgVar13 = (drcg) bZ8.b;
        drcgVar13.b = dggeVar7.l;
        drcgVar13.a |= 1;
        dggc dggcVar7 = dggc.PANO;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        drcg drcgVar14 = (drcg) bZ8.b;
        drcgVar14.d = dggcVar7.f;
        int i2 = drcgVar14.a | 4;
        drcgVar14.a = i2;
        drcgVar14.a = i2 | 2;
        drcgVar14.c = true;
        drcg bK7 = bZ8.bK();
        drcf bZ9 = drcg.e.bZ();
        dgge dggeVar8 = dgge.IMAGE_INTERNET;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        drcg drcgVar15 = (drcg) bZ9.b;
        drcgVar15.b = dggeVar8.l;
        drcgVar15.a = 1 | drcgVar15.a;
        dggc dggcVar8 = dggc.PHOTO;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        drcg drcgVar16 = (drcg) bZ9.b;
        drcgVar16.d = dggcVar8.f;
        drcgVar16.a |= 4;
        dcdc m = dcdc.m(bK, bK2, bK3, bK4, bK5, bK6, bK7, bZ9.bK());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drda drdaVar3 = (drda) bZ.b;
        dsrj<drcg> dsrjVar = drdaVar3.b;
        if (!dsrjVar.a()) {
            drdaVar3.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(m, drdaVar3.b);
        aq = bZ.bK();
    }

    public static dcdc<ilo> bI(dcdc<dikx> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dikx dikxVar = dcdcVar.get(i);
            drdg drdgVar = dikxVar.a;
            if (drdgVar == null) {
                drdgVar = drdg.q;
            }
            ily ilyVar = new ily();
            ilyVar.k(drdgVar.d);
            dpum dpumVar = drdgVar.f;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            ilyVar.q(akqq.f(dpumVar));
            ilyVar.F(drdgVar.g);
            doaw bZ = doaz.k.bZ();
            doay b = doay.b(dikxVar.b);
            if (b == null) {
                b = doay.TYPE_ROAD;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doaz doazVar = (doaz) bZ.b;
            doazVar.b = b.j;
            doazVar.a |= 1;
            ilyVar.z(bZ.bK());
            dpxf dpxfVar = drdgVar.n;
            if (dpxfVar == null) {
                dpxfVar = dpxf.f;
            }
            ilyVar.s(dpxfVar);
            if (drdgVar.m.size() > 0) {
                ilyVar.f(drdgVar.m.get(0).b);
            }
            if (drdgVar.i.size() > 0) {
                ilyVar.A(drdgVar.i.get(0));
            }
            F.g(ilyVar.d());
        }
        return F.f();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.aY.c();
        super.Qe();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final egf aR() {
        egf aR = super.aR();
        aR.l = new afwn[]{afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false)};
        return aR;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final boolean aS() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final void aX() {
    }

    @Override // defpackage.ggo, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        this.ba = this.aC.e(new bpis());
        return ag;
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        bN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final boolean bB(alhr alhrVar) {
        return bL(alhrVar.a.S(), dbpy.a, true);
    }

    public void bE() {
        cqf b = cqf.b(dnqb.RAP_FEATURE_PICKER_CARD, this.aV);
        akqq akqqVar = this.aV;
        dbsk.s(akqqVar);
        this.au.a().c(b, akqqVar.h(), true);
    }

    public void bF(ilo iloVar) {
        if (!this.aD) {
            return;
        }
        if (bH(bowu.ROAD_CLOSURE) || iloVar.ce() == doay.TYPE_ROAD) {
            dnqe dnqeVar = this.aU;
            dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
            dsqpVar.bC(dnqeVar);
            dnps dnpsVar = (dnps) dsqpVar;
            if (dnpsVar.c) {
                dnpsVar.bF();
                dnpsVar.c = false;
            }
            dnqe dnqeVar2 = (dnqe) dnpsVar.b;
            dnqe dnqeVar3 = dnqe.i;
            dnqeVar2.c = 2;
            dnqeVar2.a = 2 | dnqeVar2.a;
            dnqe bK = dnpsVar.bK();
            if (bH(bowu.ROAD_CLOSURE)) {
                if (iloVar.ce() != doay.TYPE_ROAD) {
                    bvoo.h("Selected feature is not a road when starting ReportRoadClosed", new Object[0]);
                    return;
                } else {
                    this.at.J(dcdc.f(iloVar), null, bK, this.be);
                    return;
                }
            }
            this.at.k(dcdc.f(iloVar), null, bK);
            return;
        }
        bN();
        final ProgressDialog progressDialog = new ProgressDialog(H(), 0);
        progressDialog.setMessage(Rp(R.string.VIEWPORT_CHECK_WAIT));
        progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bpbh
            private final bpbl a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.bN();
            }
        });
        progressDialog.show();
        bwrs<ilo> a = bwrs.a(iloVar);
        befu p = befv.p();
        p.j(a);
        p.g(true);
        p.k(true);
        doba bZ = dobd.d.bZ();
        dobb bZ2 = dobc.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dobc dobcVar = (dobc) bZ2.b;
        dobcVar.a |= 2;
        dobcVar.c = true;
        dobc dobcVar2 = (dobc) bZ2.b;
        dobcVar2.a |= 1;
        dobcVar2.b = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dobd dobdVar = (dobd) bZ.b;
        dobc bK2 = bZ2.bK();
        bK2.getClass();
        dobdVar.c = bK2;
        dobdVar.a = 2 | dobdVar.a;
        ((befp) p).e = dbsg.i(bZ.bK());
        befv m = p.m();
        this.aP.f(a, new bwrr(this, progressDialog) { // from class: bpbi
            private final bpbl a;
            private final ProgressDialog b;

            {
                this.a = this;
                this.b = progressDialog;
            }

            @Override // defpackage.bwrr
            public final void PV(Object obj) {
                bpbl bpblVar = this.a;
                ProgressDialog progressDialog2 = this.b;
                bpblVar.bM((ilo) obj);
                progressDialog2.dismiss();
            }
        }, false);
        this.bb = iloVar.ai();
        this.aO.d(m);
    }

    public final void bG() {
        View c;
        View bq = bq();
        if (bq == null || (c = this.az.c(bq)) == null) {
            return;
        }
        this.aR.a(c);
    }

    final boolean bH(bowu bowuVar) {
        return this.aW.equals(bowuVar);
    }

    public final void bJ(dcdc<ilo> dcdcVar) {
        this.aS.j(false);
        this.aS.i(dcdcVar);
        this.aY.d(dcdcVar);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.bd.g(dcdcVar.get(i));
        }
        if (dcdcVar.isEmpty()) {
            this.aY.e(true);
            return;
        }
        iop iopVar = this.az;
        View bq = bq();
        dbsk.s(bq);
        iopVar.d(bq, new Runnable(this) { // from class: bpbf
            private final bpbl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bpbl bpblVar = this.a;
                bpblVar.aY.e(true);
                bpblVar.bG();
            }
        });
    }

    public final void bK() {
        akqr a = akqs.a();
        if (!this.aX.isEmpty()) {
            dcdc<dikx> dcdcVar = this.aX;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                drdg drdgVar = dcdcVar.get(i).a;
                if (drdgVar == null) {
                    drdgVar = drdg.q;
                }
                dpum dpumVar = drdgVar.f;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                a.d(akqq.f(dpumVar));
            }
            akqs b = a.b();
            akqq akqqVar = this.aV;
            dbsk.s(akqqVar);
            this.ad.a().p(akyt.o(bpup.a(b, akqqVar), bpup.b(this.aB.b(), Rn().getDimensionPixelSize(R.dimen.min_viewport_bounds_for_map_pins))));
        }
    }

    public final boolean bL(akqq akqqVar, dbsg<akqi> dbsgVar, final boolean z) {
        if (!this.aD) {
            return false;
        }
        this.aV = akqqVar;
        bN();
        this.aS.j(true);
        bnyo bnyoVar = this.av;
        dikq bZ = dikt.b.bZ();
        if (this.aW.e) {
            dikr bZ2 = diks.c.bZ();
            doay doayVar = doay.TYPE_ROAD;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            diks diksVar = (diks) bZ2.b;
            diksVar.b = doayVar.j;
            diksVar.a |= 1;
            bZ.a(bZ2);
        }
        if (this.aW.f) {
            dikr bZ3 = diks.c.bZ();
            doay doayVar2 = doay.TYPE_ESTABLISHMENT;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            diks diksVar2 = (diks) bZ3.b;
            diksVar2.b = doayVar2.j;
            diksVar2.a |= 1;
            bZ.a(bZ3);
        }
        dikp bZ4 = diku.h.bZ();
        dhjz i = akqqVar.i();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        diku dikuVar = (diku) bZ4.b;
        i.getClass();
        dikuVar.b = i;
        dikuVar.a |= 1;
        dhjx aa = this.ad.a().aa();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        diku dikuVar2 = (diku) bZ4.b;
        aa.getClass();
        dikuVar2.d = aa;
        dikuVar2.a |= 4;
        dikt bK = bZ.bK();
        bK.getClass();
        dikuVar2.e = bK;
        dikuVar2.a |= 8;
        drdh bZ5 = drdi.d.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drdi.f((drdi) bZ5.b);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drdi.h((drdi) bZ5.b);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drdi.i((drdi) bZ5.b);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drdi.e((drdi) bZ5.b);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drdi.b((drdi) bZ5.b);
        drda drdaVar = aq;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drdi drdiVar = (drdi) bZ5.b;
        drdaVar.getClass();
        drdiVar.c = drdaVar;
        drdiVar.a |= 128;
        drdi.g(drdiVar);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        diku dikuVar3 = (diku) bZ4.b;
        drdi bK2 = bZ5.bK();
        bK2.getClass();
        dikuVar3.f = bK2;
        dikuVar3.a |= 16;
        dnqg bZ6 = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ6.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        diku dikuVar4 = (diku) bZ4.b;
        dnqh bK3 = bZ6.bK();
        bK3.getClass();
        dikuVar4.g = bK3;
        dikuVar4.a |= 32;
        if (dbsgVar.a()) {
            String o = dbsgVar.b().o();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            diku dikuVar5 = (diku) bZ4.b;
            o.getClass();
            dikuVar5.a |= 2;
            dikuVar5.c = o;
        }
        this.aT = bnyoVar.b(bZ4.bK(), new bnyn(this, z) { // from class: bpbg
            private final bpbl a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.bnyn
            public final void Rb(dssj dssjVar, dssj dssjVar2) {
                ff J;
                bpbl bpblVar = this.a;
                boolean z2 = this.b;
                diku dikuVar6 = (diku) dssjVar;
                diky dikyVar = (diky) dssjVar2;
                bpblVar.aT = null;
                if (!bpblVar.aD) {
                    return;
                }
                if (dikyVar == null) {
                    Toast.makeText(bpblVar.J(), bpblVar.Rp(R.string.NET_FAIL_TITLE), 0).show();
                    bpblVar.aS.j(false);
                    return;
                }
                bvrj.UI_THREAD.c();
                if (!bpblVar.aD) {
                    return;
                }
                if (dikyVar.a.size() == 0 && (J = bpblVar.J()) != null) {
                    if (dikyVar.b) {
                        new bnyw().aJ(J);
                    } else if (z2) {
                        Toast.makeText(J, (int) R.string.NO_RESULTS_FOR_THIS_AREA, 0).show();
                    }
                }
                bpblVar.aX = dcdc.r(dikyVar.a);
                bpblVar.bJ(bpbl.bI(bpblVar.aX));
                if (!bpblVar.aX.isEmpty()) {
                    iop iopVar = bpblVar.az;
                    View bq = bpblVar.bq();
                    dbsk.s(bq);
                    iopVar.e(0, bq, bpblVar.H());
                }
                bpblVar.bK();
            }
        });
        return true;
    }

    public final synchronized void bM(@dzsi ilo iloVar) {
        if (!this.aD) {
            return;
        }
        if (iloVar == null || !iloVar.f || (iloVar.h().b & 4096) == 0 || !iloVar.ai().equals(this.bb)) {
            return;
        }
        dnqe dnqeVar = this.aU;
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = (dnqe) dnpsVar.b;
        dnqe dnqeVar3 = dnqe.i;
        dnqeVar2.c = 2;
        dnqeVar2.a = 2 | dnqeVar2.a;
        this.at.f(bwrs.a(iloVar), dnpsVar.bK());
        this.bb = null;
    }

    public final void bN() {
        btzc btzcVar = this.aT;
        if (btzcVar != null) {
            btzcVar.a();
        }
        this.aO.c();
        this.bb = null;
    }

    @Override // defpackage.ggo
    protected final View bp() {
        cqkf<jbk> c = this.aC.c(new hxj(), null);
        this.aZ = c;
        return c.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    @dzsi
    public final View bq() {
        cqkf<bpvl> cqkfVar = this.ba;
        if (cqkfVar != null) {
            return cqkfVar.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final void br() {
        if (this.aX.isEmpty()) {
            if (this.be == null || (this.ah != dnqb.EXPERIENCE_STRUCTURED_FEEDBACK && this.ah != dnqb.EXPERIENCE_EVENT_DISRUPTION_MODULE)) {
                bD(this.aV, 18.0f);
                return;
            } else {
                this.aQ.a().e();
                return;
            }
        }
        bK();
    }

    @Override // defpackage.ggo
    protected final String bt() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String g() {
        return Rp(R.string.EDIT_THE_MAP_TITLE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String i() {
        return "";
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        dssr dssrVar = (dssr) ditt.n.cu(7);
        dbsk.s(dssrVar);
        this.be = (ditt) bvrs.e(bundle2, ditt.class, dssrVar);
        if (bundle != null) {
            bpct bpctVar = (bpct) bvrs.e(bundle, bpct.class, (dssr) bpct.d.cu(7));
            dbsk.s(bpctVar);
            this.aX = dcdc.r(bpctVar.b);
            if ((bpctVar.a & 1) != 0) {
                dpum dpumVar = bpctVar.c;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                this.aV = akqq.f(dpumVar);
            }
        }
        Bundle bundle3 = this.o;
        dbsk.s(bundle3);
        this.aW = bowu.a(bundle3.getString("RAP_FLOW_KEY"));
        Bundle bundle4 = this.o;
        dbsk.s(bundle4);
        this.bc = bundle4.getBoolean("HIDE_AAP_CARD", false);
        Bundle bundle5 = this.o;
        dssr dssrVar2 = (dssr) dnqe.i.cu(7);
        dbsk.s(dssrVar2);
        this.aU = (dnqe) bvrs.e(bundle5, dnqe.class, dssrVar2);
        this.bd = this.ax.a(this.bf, false, dtya.cd, dtya.bZ);
        this.aY = inz.a(new dbty(this) { // from class: bpbb
            private final bpbl a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bpbl bpblVar = this.a;
                View bq = bpblVar.bq();
                if (bq != null) {
                    for (ioo iooVar : bpblVar.az.b(bpblVar.aS.c(), bq)) {
                        if (iooVar.c()) {
                            return dcdc.f(iooVar);
                        }
                    }
                }
                return dcdc.e();
            }
        }, dcdc.h(this.aw.a(this), this.bd, this.ay.a(this.bf, dtya.cb)));
        bpbk bpbkVar = new bpbk(this);
        boxq boxqVar = this.aA;
        bowu bowuVar = this.aW;
        boolean z = this.bc;
        bpbc bpbcVar = new bpbc(this);
        bpbd bpbdVar = new bpbd(this);
        boxq.a(bowuVar, 1);
        boxq.a(bpbkVar, 3);
        boxq.a(bpbcVar, 4);
        bnjv a = boxqVar.a.a();
        boxq.a(a, 6);
        boxq.a(boxqVar.b.a(), 7);
        Resources a2 = boxqVar.c.a();
        boxq.a(a2, 8);
        this.aS = new boxp(bowuVar, z, bpbkVar, bpbcVar, bpbdVar, a, a2);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.ce;
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void s() {
        akqi ai;
        dbsg<akqi> i;
        ilo iloVar;
        cqkf<jbk> cqkfVar = this.aZ;
        dbsk.s(cqkfVar);
        jhz a = jhz.a();
        a.e = cqtt.g(ibm.b());
        a.r = 0;
        a.x = false;
        a.h = false;
        a.f(new View.OnClickListener(this) { // from class: bpbe
            private final bpbl a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.bn();
            }
        });
        cqkfVar.e(new iyl(a.b()));
        super.s();
        cqkf<bpvl> cqkfVar2 = this.ba;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(this.aS);
        btrm btrmVar = this.as;
        dceq a2 = dcet.a();
        a2.b(alia.class, new bpbm(0, alia.class, this, bvrj.UI_THREAD));
        a2.b(alho.class, new bpbm(1, alho.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.aY.a();
        if (this.aX.isEmpty()) {
            ilo iloVar2 = this.ag;
            if (iloVar2 != null && iloVar2.aj() != null) {
                ilo iloVar3 = this.ag;
                bowu bowuVar = this.aW;
                if (bowuVar.e && !bowuVar.f && doay.TYPE_GEOCODED_ADDRESS.equals(iloVar3.ce())) {
                    dnnc dnncVar = iloVar3.cd().i;
                    if (dnncVar == null) {
                        dnncVar = dnnc.e;
                    }
                    if ((dnncVar.a & 2) != 0) {
                        ai = akqi.b(dnncVar.d);
                        i = dbsg.i(ai);
                        iloVar = this.ag;
                        if (iloVar != null && iloVar.aj() != null) {
                            bL(this.ag.aj(), i, false);
                        }
                    }
                }
                ai = iloVar3.ai();
                i = dbsg.i(ai);
                iloVar = this.ag;
                if (iloVar != null) {
                    bL(this.ag.aj(), i, false);
                }
            }
        } else {
            bJ(bI(this.aX));
            iop iopVar = this.az;
            View bq = bq();
            dbsk.s(bq);
            iopVar.g(bq, H());
        }
        this.aO.a();
        if (this.be != null) {
            abbj d = abbk.d();
            ditt dittVar = this.be;
            dbsk.s(dittVar);
            d.c(dittVar.c);
            d.b(false);
            d.d(deic.a);
            this.aQ.a().a(d.a());
            ditt dittVar2 = this.be;
            dbsk.s(dittVar2);
            this.aQ.a().d(dittVar2);
        }
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bpcs bZ = bpct.d.bZ();
        dcdc<dikx> dcdcVar = this.aX;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpct bpctVar = (bpct) bZ.b;
        dsrj<dikx> dsrjVar = bpctVar.b;
        if (!dsrjVar.a()) {
            bpctVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(dcdcVar, bpctVar.b);
        akqq akqqVar = this.aV;
        if (akqqVar != null) {
            dpum h = akqqVar.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpct bpctVar2 = (bpct) bZ.b;
            h.getClass();
            bpctVar2.c = h;
            bpctVar2.a |= 1;
        }
        bvrs.l(bundle, bZ.bK());
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void u() {
        this.aQ.a().b();
        this.aO.b();
        this.aY.b();
        this.as.a(this);
        iop iopVar = this.az;
        View bq = bq();
        dbsk.s(bq);
        iopVar.f(bq);
        cqkf<jbk> cqkfVar = this.aZ;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<bpvl> cqkfVar2 = this.ba;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        this.aS.j(false);
        super.u();
    }

    @Override // defpackage.ggo
    protected final String w() {
        return "";
    }
}
