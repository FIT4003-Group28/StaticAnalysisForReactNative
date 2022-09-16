package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bpbw  reason: default package */
/* loaded from: classes3.dex */
public class bpbw extends ges implements DialogInterface.OnClickListener, egq, bxeq, bpvb {
    private static final dcqe am = dcqe.c("bpbw");
    bpcq a;
    public bwqv ad;
    public bpcr ae;
    public dzsj<bnyj> af;
    public dxio<ache> ag;
    public bvrb ah;
    public dxio<hwe> ai;
    public bpsq aj;
    public cpv ak;
    public cqkf<bpvt> al;
    private bowv an;
    private bwrs<ilo> ao;
    private bnyj ap;
    @dzsi
    private bomu aq;
    private boolean ar;
    private boolean as;
    Handler b = new Handler();
    final bvpk c = bvpk.a(new bpbu(this));
    public cqkj d;
    public efg e;
    public gfq f;
    public hwd g;

    static int aS(bowv bowvVar) {
        dnqb dnqbVar = dnqb.UNKNOWN_ENTRY_POINT;
        dnqb b = dnqb.b(bowvVar.i().b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        int ordinal = b.ordinal();
        return (ordinal == 1 || ordinal == 16) ? bowvVar.f() ? R.string.PLACE_SUGGEST_AN_EDIT : R.string.REPORT_A_PROBLEM : (ordinal == 19 || ordinal == 27) ? R.string.PLACE_ADD_MISSING_INFO : ordinal != 29 ? (ordinal == 46 && bowvVar.g()) ? R.string.RAP_FIX_ADDRESS_DETAILS : R.string.REPORT_A_PROBLEM : R.string.PLACE_SUGGEST_AN_EDIT;
    }

    @dzsi
    private final bpvs aT() {
        return this.a.q().e();
    }

    public static bpbw g(bowv bowvVar, bwrs<ilo> bwrsVar, bwqv bwqvVar, @dzsi bomu bomuVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("MODEL_KEY", bowvVar);
        if (bomuVar != null) {
            bundle.putSerializable("FOCUS_ON_FIELD_KEY", bomuVar);
        }
        bpbw bpbwVar = new bpbw();
        bpbwVar.B(bundle);
        bwqvVar.c(bundle, "PLACEMARK_KEY", bwrsVar);
        return bpbwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        View a = cqhu.a(this.al.c(), bpjs.a);
        if (a != null) {
            this.ak.f(a, J().getString(aS(this.an)));
        }
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bomv) {
            bpvs aT = aT();
            bomv bomvVar = (bomv) obj;
            bomn b = bomvVar.b();
            akqq a = bomvVar.a();
            if (this.a.y().booleanValue()) {
                this.a.v(a);
                this.ar = true;
            } else if (!this.a.z().booleanValue() || aT == null) {
                bvoo.h("Received a LatLng result but the RAP main layout and closed options layout are both hidden!", new Object[0]);
            } else {
                aT.n(a, true);
            }
            if (b == null || aT == null) {
                return;
            }
            aT.l(b.a, false);
        } else if (obj instanceof bbuf) {
            bbuf bbufVar = (bbuf) obj;
            if (bbufVar.b().isEmpty()) {
                this.a.H(bbufVar.a());
            } else if (!bbufVar.b().startsWith("business_hours_photo")) {
            } else {
                this.a.I(bbufVar.a());
            }
        } else if (obj instanceof bosj) {
            bosr M = this.a.M();
            bosj bosjVar = (bosj) obj;
            if (M != null) {
                M.h(bosjVar);
            }
            this.an.z = bosjVar.g().booleanValue();
            this.an.y = bosjVar.f().booleanValue();
            this.aq = bomu.BUSINESS_HOURS;
        } else {
            Object[] objArr = new Object[1];
            if (obj == null) {
                obj = "null";
            }
            objArr[0] = obj;
            bvoo.h("Received fragment result of an unsupported type: %s", objArr);
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (this.aD) {
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            q();
            bopw i = this.a.i();
            String k = (i == null || i.l().booleanValue()) ? null : i.k();
            if (k != null && !this.as && this.ar) {
                this.as = true;
                new AlertDialog.Builder(ggaVar).setTitle(R.string.PROMPT_UPDATE_ADDRESS_TITLE).setMessage(k).setNegativeButton(R.string.PROMPT_MARKER_MOVE_DIALOG_LOOKS_OK, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.PROMPT_MARKER_MOVE_DIALOG_EDIT, new bpbv(this)).show();
            }
            bomu bomuVar = this.aq;
            if (bomuVar == null) {
                return;
            }
            this.aq = null;
            this.a.E(bomuVar, true, this.al.c());
        }
    }

    @Override // defpackage.bxeq
    public final void aK() {
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

    @Override // defpackage.bpvb
    public final void aR() {
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bpvt> c = this.d.c(new bpjs(), null);
        this.al = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.c.b();
        boms.a(this.ah, this.ag.a());
        this.a.c();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return this.a.b();
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        bpvs aT = aT();
        if ((bxmhVar.a & 2) != 0) {
            boqc o = this.a.o();
            dbsk.s(o);
            dnfv bZ = dnfw.d.bZ();
            String str = bxmhVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfw dnfwVar = (dnfw) bZ.b;
            str.getClass();
            dnfwVar.a = 1 | dnfwVar.a;
            dnfwVar.b = str;
            dwjj dwjjVar = bxmhVar.b;
            if (dwjjVar == null) {
                dwjjVar = dwjj.k;
            }
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            String str2 = dxbpVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfw dnfwVar2 = (dnfw) bZ.b;
            str2.getClass();
            dnfwVar2.a |= 2;
            dnfwVar2.c = str2;
            o.b(bZ.bK());
        } else if (aT != null) {
            dwjj dwjjVar2 = bxmhVar.b;
            if (dwjjVar2 == null) {
                dwjjVar2 = dwjj.k;
            }
            dxbp dxbpVar2 = dwjjVar2.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            aT.l(dxbpVar2.b, true);
        }
        gfq.k(this);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        bpvs aT = aT();
        if (aT == null || !aT.f().booleanValue()) {
            return;
        }
        aT.l(str, true);
        gfq.k(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = bundle != null ? bundle : this.o;
        dbsk.s(bundle2);
        try {
            bwrs<ilo> e = this.ad.e(ilo.class, this.o, "PLACEMARK_KEY");
            dbsk.s(e);
            this.ao = e;
            bomu bomuVar = (bomu) bundle2.getSerializable("FOCUS_ON_FIELD_KEY");
            this.aq = bomuVar;
            if (bomuVar != null) {
                bundle2.remove("FOCUS_ON_FIELD_KEY");
            }
            Serializable serializable = bundle2.getSerializable("MODEL_KEY");
            dbsk.s(serializable);
            bowv bowvVar = (bowv) serializable;
            this.an = bowvVar;
            bpcr bpcrVar = this.ae;
            bwrs<ilo> bwrsVar = this.ao;
            bomt bomtVar = new bomt(this);
            String Rp = Rp(aS(bowvVar));
            String f = bowvVar.g() ? null : dbsj.f(bowvVar.b.e);
            bpcr.a(this, 1);
            bpcr.a(bowvVar, 2);
            bpcr.a(bwrsVar, 3);
            bpcr.a(bomtVar, 4);
            bpcr.a(Rp, 5);
            jmx a = bpcrVar.a.a();
            bpcr.a(a, 7);
            btvo a2 = bpcrVar.b.a();
            bpcr.a(a2, 8);
            cqkj a3 = bpcrVar.c.a();
            bpcr.a(a3, 9);
            bwqv a4 = bpcrVar.d.a();
            bpcr.a(a4, 10);
            bbtk a5 = bpcrVar.e.a();
            bpcr.a(a5, 11);
            bbul a6 = bpcrVar.f.a();
            bpcr.a(a6, 12);
            bpcr.a(bpcrVar.g.a(), 13);
            bpcr.a(bpcrVar.h.a(), 14);
            dzsj<boxa> dzsjVar = bpcrVar.i;
            dzsj<bbut> dzsjVar2 = bpcrVar.j;
            eeu a7 = bpcrVar.k.a();
            bpcr.a(a7, 17);
            bpto a8 = bpcrVar.l.a();
            bpcr.a(a8, 18);
            akfa a9 = bpcrVar.m.a();
            bpcr.a(a9, 19);
            bpsw a10 = bpcrVar.n.a();
            bpcr.a(a10, 20);
            bpca a11 = bpcrVar.o.a();
            bpcr.a(a11, 21);
            boss a12 = bpcrVar.p.a();
            bpcr.a(a12, 22);
            bnxt a13 = bpcrVar.q.a();
            bpcr.a(a13, 23);
            bnxx a14 = bpcrVar.r.a();
            bpcr.a(a14, 24);
            akpm a15 = bpcrVar.s.a();
            bpcr.a(a15, 25);
            bnyd a16 = bpcrVar.t.a();
            bpcr.a(a16, 26);
            bonw a17 = bpcrVar.u.a();
            bpcr.a(a17, 27);
            Executor a18 = bpcrVar.v.a();
            bpcr.a(a18, 28);
            this.a = new bpcq(this, bowvVar, bwrsVar, bomtVar, Rp, f, a, a2, a3, a4, a5, a6, dzsjVar, dzsjVar2, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18);
            if (this.an.s) {
                bvoo.h("Road features should use new attribute selection flow", new Object[0]);
            }
            this.aj.d(bundle);
        } catch (IOException e2) {
            dbue.b(e2.getCause() == null ? e2 : e2.getCause());
            Throwable cause = e2.getCause();
            Throwable th = e2;
            if (cause != null) {
                th = e2.getCause();
            }
            throw new RuntimeException(th);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        q();
        if (i == -1) {
            bpcq bpcqVar = this.a;
            if (!bpcqVar.i) {
                return;
            }
            bpcqVar.d();
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 0) {
            this.a.G();
        }
        bpvs aT = aT();
        if (aT == null || !aT.f().booleanValue()) {
            return;
        }
        this.b.post(this.c);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.ad;
    }

    public final void q() {
        if (this.aD && w() != null) {
            cqjg w = w();
            MapViewContainer mapViewContainer = w == null ? null : (MapViewContainer) cqkx.e(this.al.c(), w, MapViewContainer.class);
            if (mapViewContainer == null) {
                return;
            }
            mapViewContainer.h(this.g);
            bpvs aT = aT();
            if (!this.a.z().booleanValue() || aT == null || !aT.f().booleanValue() || aT.i() != null) {
                return;
            }
            this.ai.a().h();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.aj.f();
        if (this.ap == null) {
            this.ap = this.af.a();
        }
        this.ag.a().t(true);
        this.ap.a(this);
        bnxs j = this.a.j();
        if (j != null) {
            j.a();
        }
        this.al.e(this.a);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.F(null);
        egjVar.J(this);
        egjVar.j(false);
        this.e.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("MODEL_KEY", this.an);
        this.aj.c(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        bnxs j = this.a.j();
        if (j != null) {
            j.b();
        }
        this.aj.b();
        this.al.e(null);
        super.u();
    }

    @dzsi
    final cqjg w() {
        bpvs aT = aT();
        if (this.a.y().booleanValue()) {
            return boin.a;
        }
        if (this.a.z().booleanValue() && aT != null && aT.f().booleanValue()) {
            return bpjo.a;
        }
        return null;
    }
}
