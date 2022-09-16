package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
@Deprecated
/* renamed from: bpax  reason: default package */
/* loaded from: classes3.dex */
public final class bpax extends bnyu implements begr, gfw {
    private static final dcqe aB = dcqe.c("bpax");
    final bpaw aA = new bpaw(this);
    @dzsi
    private bttu aC;
    private bowu aO;
    private dnqe aP;
    @dzsi
    private ditt aQ;
    public hwe aq;
    public btrm ar;
    public boxa as;
    public dxio<begg> at;
    public bnyo au;
    public bpsz av;
    public dxio<abbl> aw;
    @dzsi
    public dwhf ax;
    @dzsi
    public btzc ay;
    public bpsy az;

    private final boolean bJ() {
        return !bE(bowu.EDIT_THE_MAP);
    }

    private final boolean bK() {
        return this.aQ != null && (this.ah == dnqb.EXPERIENCE_STRUCTURED_FEEDBACK || this.ah == dnqb.EXPERIENCE_EVENT_DISRUPTION_MODULE);
    }

    private final void bL() {
        boolean z = false;
        if (this.ag == null) {
            bA(false);
            return;
        }
        if (this.az.b() || !this.az.a().isEmpty()) {
            z = true;
        }
        bA(z);
    }

    private final boolean bM() {
        ilo iloVar = this.ag;
        if (iloVar != null) {
            if (this.az.b() || !bN(iloVar)) {
                return iloVar.aY();
            }
            if (!this.az.a().isEmpty()) {
                for (ilo iloVar2 : this.az.a()) {
                    if (!iloVar2.aY()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean bN(ilo iloVar) {
        return iloVar.ce() == doay.TYPE_ROAD;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((bpay) btsx.b(bpay.class, this)).dd(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ad.a().D(false);
        this.az.h();
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof boxy) {
            boxy boxyVar = (boxy) obj;
            int c = boxyVar.c();
            if (c == 0) {
                throw null;
            }
            if (c != 1 || dodb.d.equals(boxyVar.a())) {
                int c2 = boxyVar.c();
                if (c2 == 0) {
                    throw null;
                }
                if (c2 != 2) {
                    return;
                }
                bpsy bpsyVar = this.az;
                for (dodb dodbVar : boxyVar.b()) {
                    bpsyVar.d.put(dodbVar.b, true);
                }
                return;
            }
            bpsy bpsyVar2 = this.az;
            dodb a = boxyVar.a();
            bpsyVar2.h();
            bpsyVar2.e = a;
            bpsyVar2.b.e(akqi.b(a.b));
            bpsyVar2.a.p(akyt.b(13.0f));
            bs();
            return;
        }
        int i = 0;
        if (obj instanceof bpbq) {
            bpbq bpbqVar = (bpbq) obj;
            if (bpbqVar.a().a()) {
                dodb b = bpbqVar.a().b();
                if (this.az.b() || dodb.d.equals(b)) {
                    bpsy bpsyVar3 = this.az;
                    dodb dodbVar2 = bpsyVar3.e;
                    if (dodbVar2 != null) {
                        bpsyVar3.b.f(akqi.b(dodbVar2.b));
                        bpsyVar3.e = null;
                    }
                    ilo b2 = bpbqVar.b();
                    dcdc r = dcdc.r(this.az.a());
                    int size = r.size();
                    while (i < size) {
                        ilo iloVar = (ilo) r.get(i);
                        if (!b2.cr(iloVar)) {
                            this.az.c(iloVar);
                        }
                        i++;
                    }
                } else {
                    dcdc r2 = dcdc.r(this.az.a());
                    int size2 = r2.size();
                    while (i < size2) {
                        ilo iloVar2 = (ilo) r2.get(i);
                        String str = b.b;
                        dodc dodcVar = iloVar2.cd().e;
                        if (dodcVar == null) {
                            dodcVar = dodc.i;
                        }
                        Iterator<dodb> it = dodcVar.f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().b.equals(str)) {
                                    break;
                                }
                            } else {
                                this.az.c(iloVar2);
                                break;
                            }
                        }
                        i++;
                    }
                }
            } else {
                this.az.c(bpbqVar.b());
                this.ag = (ilo) dcft.r(this.az.a(), null);
            }
            bs();
        } else if (obj instanceof bpan) {
            bpan bpanVar = (bpan) obj;
            if (!bpanVar.a().a()) {
                this.ag = (ilo) dcft.r(this.az.a(), null);
                bH();
            } else if (this.ag != null && bpanVar.a().b().ai().equals(this.ag.ai())) {
                this.az.f();
            }
            bs();
        } else {
            Object[] objArr = new Object[1];
            if (obj == null) {
                obj = "null";
            }
            objArr[0] = obj;
            bvoo.h("Received fragment result of an unsupported type: %s", objArr);
        }
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        if (this.aD && bttuVar == this.aC) {
            this.aC = null;
            this.ag = iloVar.g().d();
            bI();
            bs();
        }
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
        ilo iloVar = this.ag;
        return iloVar != null && !bN(iloVar);
    }

    @Override // defpackage.ggo
    protected final cjtd aT() {
        return cjtd.a(dtya.bT);
    }

    @Override // defpackage.ggo
    protected final cjtd aU() {
        return cjtd.a(dtya.bY);
    }

    @Override // defpackage.ggo
    @dzsi
    protected final cjtd aV() {
        return cjtd.a(dtya.bX);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final void aX() {
        dbsg i;
        dcdc<ilo> r = dcdc.r(this.az.a());
        dnqe dnqeVar = this.aP;
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
        dnqeVar2.a |= 2;
        if (!r.isEmpty()) {
            if (bE(bowu.ROAD_CLOSURE)) {
                this.as.J(r, this.az.e, dnpsVar.bK(), this.aQ);
            } else if (!bE(bowu.WRONG_ROAD_INFO) && !bE(bowu.EDIT_THE_MAP)) {
            } else {
                bpsy bpsyVar = this.az;
                if (!bpsyVar.b()) {
                    Collection<ilo> a = bpsyVar.a();
                    if (!a.isEmpty()) {
                        Iterator<dodb> it = bpsyVar.e(a.iterator().next()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!bpsyVar.d.containsKey(it.next().b)) {
                                    i = dbpy.a;
                                    break;
                                }
                            } else {
                                i = dbsg.i("No");
                                break;
                            }
                        }
                    } else {
                        i = dbpy.a;
                    }
                } else {
                    i = dbsg.i("Yes");
                }
                if (i.a()) {
                    dnpt bZ = dnpw.d.bZ();
                    dnpv dnpvVar = dnpv.ROUTE_PICKER_DIALOG_RESULT;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnpw dnpwVar = (dnpw) bZ.b;
                    dnpwVar.b = dnpvVar.v;
                    dnpwVar.a |= 1;
                    String str = (String) i.b();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnpw dnpwVar2 = (dnpw) bZ.b;
                    str.getClass();
                    dnpwVar2.a = 2 | dnpwVar2.a;
                    dnpwVar2.c = str;
                    dnpsVar.a(bZ);
                }
                this.as.k(r, this.az.e, dnpsVar.bK());
            }
        } else if (this.ag == null || (!this.az.b() && !bE(bowu.EDIT_THE_MAP))) {
            if (bE(bowu.ROAD_CLOSURE)) {
                bvoo.k(new RuntimeException("No road feature selected when starting ReportRoadClosed"));
            } else if (bE(bowu.WRONG_ROAD_INFO)) {
                bvoo.k(new RuntimeException("No road feature selected when starting ReportAProblem"));
            } else {
                bvoo.k(new RuntimeException("No road feature selected or placemark is null when starting ReportAProblem"));
            }
        } else {
            this.as.f(bwrs.a(this.ag), dnpsVar.bK());
        }
    }

    @Override // defpackage.ggo, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        bpsy bpsyVar = this.az;
        dodb dodbVar = bpsyVar.e;
        if (dodbVar != null) {
            bpsyVar.b.e(akqi.b(dodbVar.b));
        } else {
            for (ilo iloVar : bpsyVar.c.b()) {
                bpsyVar.b.e(iloVar.ai());
            }
        }
        return ag;
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        btzc btzcVar = this.ay;
        if (btzcVar != null) {
            btzcVar.a();
            this.ay = null;
            this.ax = null;
        }
        bttu bttuVar = this.aC;
        if (bttuVar != null) {
            bttuVar.i();
            this.aC = null;
        }
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        if (!this.aD) {
            return;
        }
        this.aC = null;
        J().runOnUiThread(new bpau(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final boolean bB(alhr alhrVar) {
        return bG(alhrVar.a.S());
    }

    final boolean bE(bowu bowuVar) {
        return this.aO.equals(bowuVar);
    }

    public final void bF(ilo iloVar) {
        this.aC = this.at.a().p(iloVar, null, this);
        bz(false);
        bx();
        by(true);
    }

    public final boolean bG(akqq akqqVar) {
        if (!this.aD) {
            return false;
        }
        this.ak = this.aq.i(akpp.o(akqqVar), true);
        btzc btzcVar = this.ay;
        if (btzcVar != null) {
            btzcVar.a();
        }
        dwhe bZ = dwhf.i.bZ();
        dhjz i = akqqVar.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwhf dwhfVar = (dwhf) bZ.b;
        i.getClass();
        dwhfVar.b = i;
        dwhfVar.a |= 1;
        dhjx Z = this.ad.a().Z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwhf dwhfVar2 = (dwhf) bZ.b;
        Z.getClass();
        dwhfVar2.c = Z;
        int i2 = dwhfVar2.a | 2;
        dwhfVar2.a = i2;
        dwhfVar2.a = i2 | 16;
        dwhfVar2.f = true;
        dwhf dwhfVar3 = (dwhf) bZ.b;
        dwhfVar3.a |= 32;
        dwhfVar3.g = true;
        dwhf bK = bZ.bK();
        this.ax = bK;
        this.ay = this.au.b(bK, new bpav(this));
        bz(false);
        bx();
        by(true);
        return true;
    }

    public final void bH() {
        hwb hwbVar = this.ak;
        if (hwbVar != null) {
            this.aq.j(hwbVar);
            this.ak = null;
        }
    }

    public final void bI() {
        if (bN(this.ag)) {
            bH();
            this.az.d(this.ag);
            return;
        }
        Collection<ilo> a = this.az.a();
        final ilo iloVar = (ilo) dcft.r(a, null);
        if (a.size() == 1) {
            this.az.f();
            View view = this.P;
            if (view == null) {
                return;
            }
            dafk a2 = ckos.a(view, Rq(R.string.RAP_PLACE_SELECTED_TOAST, bw()), 0);
            a2.t(R.string.UNDO, new View.OnClickListener(this, iloVar) { // from class: bpas
                private final bpax a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    bpax bpaxVar = this.a;
                    ilo iloVar2 = this.b;
                    if (bpaxVar.aD) {
                        bpaxVar.bH();
                        bpaxVar.ag = iloVar2;
                        bpaxVar.bI();
                        bpaxVar.bs();
                    }
                }
            });
            a2.c();
        } else if (a.isEmpty()) {
        } else {
            bpao bpaoVar = new bpao();
            ilo iloVar2 = this.ag;
            String bw = bw();
            Bundle bundle = new Bundle();
            bundle.putSerializable("poi_key", iloVar2);
            bundle.putSerializable("poi_name_key", bw);
            bpaoVar.B(bundle);
            bpaoVar.g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final void bo() {
        this.ag = null;
        bH();
        this.az.f();
        bs();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final void br() {
        if (bK()) {
            dxio<abbl> dxioVar = this.aw;
            if (dxioVar == null) {
                return;
            }
            dxioVar.a().e();
            return;
        }
        ilo iloVar = this.ag;
        float f = 17.0f;
        if (iloVar == null) {
            bD(null, 17.0f);
            return;
        }
        if (!bN(iloVar)) {
            f = 18.0f;
        } else if (true == this.az.b()) {
            f = 13.0f;
        }
        ilo iloVar2 = this.ag;
        dbsk.s(iloVar2);
        bD(iloVar2.aj(), f);
    }

    @Override // defpackage.ggo
    public final void bs() {
        super.bs();
        bL();
        bz(bM());
    }

    @Override // defpackage.ggo
    protected final String bt() {
        ilo iloVar = this.ag;
        if (iloVar != null) {
            if (!bN(iloVar)) {
                return bJ() ? "" : bw();
            } else if (this.az.b()) {
                dodb dodbVar = this.az.e;
                dbsk.s(dodbVar);
                return Rq(R.string.FEATURE_SELECTION_HEADER_ROUTE, dodbVar.c);
            } else if (this.az.a().isEmpty()) {
                return "";
            } else {
                if (this.az.c.a(this.ag) || !this.az.g()) {
                    return bw();
                }
            }
        }
        return "";
    }

    @Override // defpackage.ggo
    protected final String bu() {
        if (!bN(this.ag) || this.az.b()) {
            return "";
        }
        Collection<ilo> a = this.az.a();
        return a.isEmpty() ? "" : bqq.c(H(), R.string.FEATURE_SELECTION_HEADER_SELECTION_INFO, "segment_count", Integer.valueOf(a.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String g() {
        bowu bowuVar = this.aO;
        bowu bowuVar2 = bowu.EDIT_THE_MAP;
        int ordinal = bowuVar.ordinal();
        return Rp(ordinal != 1 ? ordinal != 2 ? R.string.EDIT_THE_MAP_TITLE : R.string.REPORT_WRONG_ROAD_INFO_PICKER_TITLE : R.string.REPORT_ROAD_CLOSED_ROAD_PICKER_TITLE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String i() {
        bowu bowuVar = this.aO;
        bowu bowuVar2 = bowu.EDIT_THE_MAP;
        int ordinal = bowuVar.ordinal();
        return Rp(ordinal != 1 ? ordinal != 2 ? R.string.FEATURE_SELECTION_HINT_V2_PLURAL : R.string.FEATURE_SELECTION_HINT_REPORT_A_PROBLEM_ON_ROAD : R.string.REPORT_ROAD_CLOSED_ROAD_PICKER_SUBTITLE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpax.l(android.os.Bundle):void");
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.ca;
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bC();
        btrm btrmVar = this.ar;
        dceq a = dcet.a();
        a.b(alia.class, new bpba(alia.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        if (bJ()) {
            ilo iloVar = this.ag;
            if (iloVar != null && !bN(iloVar)) {
                if (this.ag.ce() == doay.TYPE_GEOCODED_ADDRESS) {
                    dnnc dnncVar = this.ag.cd().i;
                    if (dnncVar == null) {
                        dnncVar = dnnc.e;
                    }
                    if ((dnncVar.a & 2) != 0) {
                        ily ilyVar = new ily();
                        ilyVar.k(dnncVar.d);
                        bF(ilyVar.d());
                    }
                }
                this.ag = null;
                this.aq.h();
            }
        } else {
            btrm btrmVar2 = this.ar;
            bpaw bpawVar = this.aA;
            dceq a2 = dcet.a();
            a2.b(alho.class, new bpaz(alho.class, bpawVar, bvrj.UI_THREAD));
            btrmVar2.g(bpawVar, a2.a());
        }
        if (this.ag == null) {
            bx();
        }
        ditt dittVar = this.aQ;
        dxio<abbl> dxioVar = this.aw;
        if (dxioVar != null && dittVar != null) {
            abbj d = abbk.d();
            d.c(dittVar.c);
            d.b(false);
            d.d(deic.a);
            dxioVar.a().a(d.a());
            this.aw.a().d(dittVar);
        }
        if (!bK()) {
            bomy bomyVar = this.ap;
            dosc doscVar = dosc.TYPE_REPORT_MAPS_ISSUE;
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            bomyVar.a(doscVar, ggaVar, new bnyw(), ((bnyu) this).al, this);
        }
        this.ad.a().D(true);
        bL();
        bz(bM());
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bwqv bwqvVar = this.a;
        bwqvVar.c(bundle, "SELECTED_ROAD_FEATURES_KEY", dcdc.r(this.az.a()));
        bwqvVar.c(bundle, "SELECTED_ROUTE_KEY", bvrt.a(this.az.e));
        bwqvVar.c(bundle, "HAS_SHOWN_SELECTION_PROMPT_FOR_ROUTE_KEY", dcdn.r(this.az.d));
    }

    @Override // defpackage.bnyu, defpackage.ggo, defpackage.ges, defpackage.fd
    public final void u() {
        if (!bJ()) {
            this.ar.a(this.aA);
        }
        this.ar.a(this);
        dxio<abbl> dxioVar = this.aw;
        if (dxioVar != null) {
            dxioVar.a().b();
        }
        super.u();
    }

    @Override // defpackage.ggo
    protected final String w() {
        return Rp(R.string.NEXT);
    }
}
