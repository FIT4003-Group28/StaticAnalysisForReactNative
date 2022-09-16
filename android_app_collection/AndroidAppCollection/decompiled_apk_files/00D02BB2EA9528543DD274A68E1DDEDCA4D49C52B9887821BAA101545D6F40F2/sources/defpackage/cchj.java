package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: cchj  reason: default package */
/* loaded from: classes4.dex */
public final class cchj extends ges implements cchk, bxeq {
    public bwqv a;
    public bupr ad;
    public buzm ae;
    private final cgrc af = new cgrc();
    private cqkf<ccid> ag;
    @dzsi
    private ddho ah;
    @dzsi
    private String ai;
    public cqkj b;
    public cafi c;
    public efg d;
    public gfq e;
    public cchu f;
    public cchl g;

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.ag.e(null);
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

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<ccid> d = this.b.d(new cckg(), viewGroup, false);
        this.ag = d;
        d.e(this.g);
        return this.ag.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.af.f();
        super.am();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.g.o(false);
        ppw.b(J(), new cchd(this), new cche());
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        dpvj bZ = dpvk.d.bZ();
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        String str = dxbpVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvk dpvkVar = (dpvk) bZ.b;
        str.getClass();
        dpvkVar.a |= 1;
        dpvkVar.b = str;
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dvzj dvzjVar = dwjjVar2.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        String str2 = dvzjVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvk dpvkVar2 = (dpvk) bZ.b;
        str2.getClass();
        dpvkVar2.a |= 2;
        dpvkVar2.c = str2;
        this.g.p(bZ.bK());
        if (this.e != null) {
            gfq.k(this);
        }
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dpvk dpvkVar;
        cchi cchiVar;
        boolean z;
        boolean z2;
        boolean z3;
        super.l(bundle);
        dpvk dpvkVar2 = dpvk.d;
        cchi cchiVar2 = cchi.NOT_CHECKED;
        Bundle bundle2 = this.o;
        if (bundle2.containsKey("arg_key_entry_point_ve_type")) {
            this.ah = cjth.d(bundle2.getInt("arg_key_entry_point_ve_type"));
        }
        this.ai = bundle2.getString("arg_key_intent_url");
        if (bundle != null) {
            dpvk dpvkVar3 = (dpvk) bvrs.b(bundle.getByteArray("arg_key_local_guide_city"), (dssr) dpvk.d.cu(7));
            int i = bundle.getInt("arg_key_user_eligibility");
            if (i >= 0 && i < cchi.values().length) {
                cchiVar2 = cchi.values()[i];
            }
            if (cchiVar2 == cchi.CHECKING) {
                cchiVar2 = cchi.NOT_CHECKED;
            }
            boolean z4 = bundle.getBoolean("arg_key_terms_checked");
            dpvkVar = dpvkVar3;
            cchiVar = cchiVar2;
            z = z4;
            z2 = bundle.getBoolean("arg_key_emails_checked");
            z3 = bundle.getBoolean("arg_key_show_error_hint");
        } else {
            dpvkVar = dpvkVar2;
            cchiVar = cchiVar2;
            z = false;
            z2 = false;
            z3 = false;
        }
        this.g = new cchl(J(), dpvkVar, cchiVar, this, z, z2, z3);
        this.af.a(bundle);
        cgre.g(this.af, duvz.class, new cchv(this));
        cgrc cgrcVar = this.af;
        cchu cchuVar = this.f;
        cchu.a(this, 1);
        cafi a = cchuVar.a.a();
        cchu.a(a, 2);
        ccif a2 = cchuVar.b.a();
        cchu.a(a2, 3);
        chhr a3 = cchuVar.c.a();
        cchu.a(a3, 4);
        anhk a4 = cchuVar.d.a();
        cchu.a(a4, 5);
        cgre.g(cgrcVar, duvu.class, new ccht(this, a, a2, a3, a4));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.at;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        cgrc cgrcVar = this.af;
        bupr buprVar = this.ad;
        duvy bZ = duvz.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duvz duvzVar = (duvz) bZ.b;
        duvzVar.a |= 4;
        duvzVar.b = false;
        cgre.i(cgrcVar, buprVar, bZ.bK());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.af.c();
        efg efgVar = this.d;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
        if (this.g.a == cchi.NOT_CHECKED) {
            q();
            this.g.n(cchi.CHECKING);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("arg_key_user_eligibility", this.g.a.ordinal());
        bundle.putByteArray("arg_key_local_guide_city", this.g.b.bS());
        bundle.putBoolean("arg_key_terms_checked", this.g.f().booleanValue());
        bundle.putBoolean("arg_key_emails_checked", this.g.h().booleanValue());
        bundle.putBoolean("arg_key_show_error_hint", this.g.l().booleanValue());
        this.af.d(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.af.e();
        super.u();
    }

    public final void w() {
        duvt bZ = duvu.h.bZ();
        djgw a = chiw.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duvu duvuVar = (duvu) bZ.b;
        a.getClass();
        duvuVar.g = a;
        duvuVar.a |= 64;
        duvu duvuVar2 = (duvu) bZ.b;
        duvuVar2.b = 1;
        int i = duvuVar2.a | 1;
        duvuVar2.a = i;
        dpvk dpvkVar = this.g.b;
        dpvkVar.getClass();
        duvuVar2.c = dpvkVar;
        duvuVar2.a = i | 2;
        ddho ddhoVar = this.ah;
        if (ddhoVar != null) {
            int b = ddhoVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duvu duvuVar3 = (duvu) bZ.b;
            duvuVar3.a |= 8;
            duvuVar3.d = b;
        }
        String str = this.ai;
        if (str != null) {
            duvu duvuVar4 = (duvu) bZ.b;
            str.getClass();
            duvuVar4.a |= 16;
            duvuVar4.e = str;
        }
        cgre.i(this.af, this.ae, bZ.bK());
        this.g.o(true);
    }
}
