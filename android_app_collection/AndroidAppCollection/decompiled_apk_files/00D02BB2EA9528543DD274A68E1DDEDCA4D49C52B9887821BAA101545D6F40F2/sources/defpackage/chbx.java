package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: chbx  reason: default package */
/* loaded from: classes4.dex */
public final class chbx extends ges implements chby, chlf {
    public gfq a;
    private chlg ad;
    public bwqv b;
    public chlh c;
    public efg d;
    public cqkj e;
    @dzsi
    private bwrs<ilo> f;
    @dzsi
    private cqkf<chmy> g;

    public static chbx g(chit chitVar, @dzsi bwqv bwqvVar, @dzsi bwrs<ilo> bwrsVar) {
        chbx chbxVar = new chbx();
        Bundle bundle = new Bundle();
        bvrs.k(bundle, "ThanksPageFragment.state", chitVar);
        bwqvVar.c(bundle, "ThanksPageFragment.placemark", bwrsVar);
        chbxVar.B(bundle);
        return chbxVar;
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<chmy> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.g = null;
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj != null) {
            this.ad.p(obj);
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

    @Override // defpackage.bqld
    public final void aS(bqlf bqlfVar) {
        int d = bqlfVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i != 0) {
                return;
            }
            this.ad.p(bqlfVar);
            return;
        }
        throw null;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<chmy> d = this.e.d(new chhb(), viewGroup, false);
        this.g = d;
        d.e(this.ad);
        return this.g.c();
    }

    @Override // defpackage.fd
    public final void ah(View view, @dzsi Bundle bundle) {
        chlg chlgVar = this.ad;
        dbsk.s(chlgVar);
        chlgVar.l(x());
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        this.ad.p(bxmhVar);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        chit chitVar = (chit) bvrs.f(bundle, "ThanksPageFragment.state", (dssr) chit.i.cu(7));
        dbsk.s(chitVar);
        try {
            this.f = this.b.e(ilo.class, bundle, "ThanksPageFragment.placemark");
        } catch (IOException e) {
            bvoo.j(e);
        }
        chlh chlhVar = this.c;
        bwrs<ilo> bwrsVar = this.f;
        cafi a = chlhVar.a.a();
        chlh.a(a, 1);
        chnm a2 = chlhVar.b.a();
        chlh.a(a2, 2);
        chlh.a(chlhVar.c.a(), 3);
        Resources a3 = chlhVar.d.a();
        chlh.a(a3, 4);
        chkv a4 = chlhVar.e.a();
        chlh.a(a4, 5);
        chlh.a(chlhVar.f.a(), 6);
        chgz a5 = chlhVar.g.a();
        chlh.a(a5, 7);
        PublicDisclosureLayout$PublicDisclosureViewModelImpl a6 = chlhVar.h.a();
        chlh.a(a6, 8);
        caxn a7 = chlhVar.i.a();
        chlh.a(a7, 9);
        chlh.a(this, 10);
        chlh.a(this, 11);
        chlh.a(chitVar, 12);
        chlg chlgVar = new chlg(a, a2, a3, a4, a5, a6, a7, this, this, chitVar, bwrsVar);
        chlgVar.a();
        this.ad = chlgVar;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dddv.KU;
    }

    @Override // defpackage.chlf
    public final void q() {
        if (this.aD) {
            gfq.l(this);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.n();
        efg efgVar = this.d;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.k(bundle, "ThanksPageFragment.state", this.ad.m());
        this.b.c(bundle, "ThanksPageFragment.placemark", this.f);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ad.o();
    }
}
