package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cedu  reason: default package */
/* loaded from: classes4.dex */
public final class cedu extends ges implements cgrd, ceue {
    public bvrb a;
    public bung ae;
    private cqkf<cesj> ah;
    private ceuf ai;
    private int aj;
    @dzsi
    private ProgressDialog ak;
    public akfa b;
    public efg c;
    public cqkj d;
    public ceug e;
    public gga f;
    private final cgrc af = new cgrc();
    private final crzp<btlu> ag = new cedt(this);
    dhtc g = dhtc.l;
    dhtc ad = dhtc.l;

    private final void aJ(String str) {
        Toast.makeText(this.f, str, 0).show();
    }

    public static cedu g(dhtc dhtcVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("displayed_profile_edit_page_profile_info", dhtcVar.bS());
        bundle.putByteArray("saved_profile_edit_page_profile_info", dhtcVar.bS());
        cedu ceduVar = new cedu();
        ceduVar.B(bundle);
        return ceduVar;
    }

    private final boolean w() {
        return !this.ad.c.equals(this.ai.h());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.ah.e(null);
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        ProgressDialog progressDialog = this.ak;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.ak = null;
        }
        aJ(this.f.getString(R.string.GENERIC_ERROR_MESSAGE));
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cesj> e = this.d.e(new cegd());
        this.ah = e;
        e.e(this.ai);
        return this.ah.c();
    }

    @Override // defpackage.cgrd
    public final void b() {
        i();
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int a;
        dhwq dhwqVar = (dhwq) obj;
        ProgressDialog progressDialog = this.ak;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int a2 = dhwp.a(dhwqVar.b);
        if (a2 != 0 && a2 != 1 && ((a = dhwp.a(dhwqVar.b)) == 0 || a != 2)) {
            aJ(this.f.getString(R.string.GENERIC_ERROR_MESSAGE));
            return;
        }
        this.ad = this.ai.o();
        if ((dhwqVar.a & 4) != 0) {
            dhtc dhtcVar = this.ad;
            dsqp dsqpVar = (dsqp) dhtcVar.cu(5);
            dsqpVar.bC(dhtcVar);
            dhtb dhtbVar = (dhtb) dsqpVar;
            String str = dhwqVar.c;
            if (dhtbVar.c) {
                dhtbVar.bF();
                dhtbVar.c = false;
            }
            dhtc dhtcVar2 = (dhtc) dhtbVar.b;
            dhtc dhtcVar3 = dhtc.l;
            str.getClass();
            dhtcVar2.a = 2 | dhtcVar2.a;
            dhtcVar2.c = str;
            this.ad = dhtbVar.bK();
        }
        aJ(this.f.getString(R.string.PROFILE_UPDATE_SUCCESSFUL_TOAST));
        q();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (w()) {
            iii iiiVar = new iii();
            iiiVar.a = this.f.getString(R.string.PROFILE_UNSAVED_CHANGES_DIALOG_TITLE);
            iiiVar.b = this.f.getString(R.string.PROFILE_UNSAVED_CHANGES_DIALOG_CONTENT);
            iiiVar.d(this.f.getString(R.string.PROFILE_UNSAVED_CHANGES_DIALOG_DISCARD_CHANGES), new View.OnClickListener(this) { // from class: cedp
                private final cedu a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.q();
                }
            }, cjtd.a(dtxo.s));
            iiiVar.c(this.f.getString(R.string.PROFILE_UNSAVED_CHANGES_DIALOG_KEEP_EDITING), cedq.a, cjtd.a(dtxo.r));
            iiiVar.a(this.f, this.d).k();
            return true;
        }
        q();
        return true;
    }

    @Override // defpackage.ceue
    public final void i() {
        if (!w()) {
            return;
        }
        String h = this.ai.h();
        if (h.length() > this.ai.i().intValue()) {
            aJ(this.f.getString(R.string.PROFILE_TAGLINE_TOO_LONG_TOAST));
            return;
        }
        gga ggaVar = this.f;
        this.ak = ProgressDialog.show(ggaVar, "", ggaVar.getString(R.string.SENDING), true, false);
        cgrc cgrcVar = this.af;
        bung bungVar = this.ae;
        dhwl bZ = dhwm.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhwm dhwmVar = (dhwm) bZ.b;
        h.getClass();
        dhwmVar.a |= 2;
        dhwmVar.b = h;
        drdv bZ2 = drdw.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdw drdwVar = (drdw) bZ2.b;
        drdwVar.a |= 1;
        drdwVar.b = true;
        drdw drdwVar2 = (drdw) bZ2.b;
        drdwVar2.a |= 2;
        drdwVar2.c = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhwm dhwmVar2 = (dhwm) bZ.b;
        drdw bK = bZ2.bK();
        bK.getClass();
        dhwmVar2.c = bK;
        dhwmVar2.a |= 16;
        cgre.i(cgrcVar, bungVar, bZ.bK());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = bundle != null ? bundle : this.o;
        this.af.a(bundle);
        cgre.g(this.af, dhwm.class, this);
        this.ad = (dhtc) bvrs.g(bundle2, "saved_profile_edit_page_profile_info", (dssr) dhtc.l.cu(7), dhtc.l);
        dhtc dhtcVar = (dhtc) bvrs.g(bundle2, "displayed_profile_edit_page_profile_info", (dssr) dhtc.l.cu(7), this.ad);
        this.g = dhtcVar;
        ceug ceugVar = this.e;
        String str = this.ad.c;
        gga a = ceugVar.a.a();
        ceug.a(a, 1);
        dxio a2 = ((dxjh) ceugVar.b).a();
        ceug.a(a2, 2);
        awnm a3 = ceugVar.c.a();
        ceug.a(a3, 3);
        cqhn a4 = ceugVar.d.a();
        ceug.a(a4, 4);
        btvo a5 = ceugVar.e.a();
        ceug.a(a5, 5);
        cese a6 = ceugVar.f.a();
        ceug.a(a6, 6);
        ceug.a(dhtcVar, 7);
        ceug.a(str, 8);
        ceug.a(this, 9);
        this.ai = new ceuf(a, a2, a3, a4, a5, a6, dhtcVar, str, this);
    }

    public final void q() {
        Nw(new cedr(this));
        if (this.aD) {
            this.f.g().f();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.af.c();
        this.aj = this.f.getWindow().getAttributes().softInputMode;
        this.f.getWindow().setSoftInputMode(16);
        this.b.C().d(this.ag, dege.a);
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.F(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.ah.c());
        egjVar.e(this);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.af.d(bundle);
        dhtc o = this.ai.o();
        this.g = o;
        bundle.putByteArray("displayed_profile_edit_page_profile_info", o.bS());
        bundle.putByteArray("saved_profile_edit_page_profile_info", this.ad.bS());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.b.C().c(this.ag);
        this.f.getWindow().setSoftInputMode(this.aj);
    }
}
