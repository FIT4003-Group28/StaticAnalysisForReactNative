package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bhul  reason: default package */
/* loaded from: classes3.dex */
public final class bhul extends ges {
    public static final bhww a = new bhui();
    public dxio<axxh> ad;
    @dzsi
    public bwrs<ilo> ae;
    public bhxy af;
    public boolean ah;
    @dzsi
    private bhww aj;
    public efg b;
    public cqkj c;
    public bwqv d;
    public ckcw e;
    public bhxz f;
    public cjxo g;
    public boolean ag = false;
    final bhxp ai = new bhuj(this);

    public static bhul g(bwqv bwqvVar, bwrs<ilo> bwrsVar, bhww bhwwVar, boolean z, @dzsi axuc axucVar) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "PLACEMARK_REF_KEY", bwrsVar);
        bwqvVar.c(bundle, "LISTENER_KEY", bhwwVar);
        bundle.putBoolean("CONTACT_MODE_KEY", z);
        if (axucVar != null) {
            bwqvVar.c(bundle, "ALIAS_FLOW_DATA_KEY", axucVar);
        }
        bhul bhulVar = new bhul();
        bhulVar.B(bundle);
        return bhulVar;
    }

    public static bhul i(bwqv bwqvVar, bwrs<ilo> bwrsVar) {
        return g(bwqvVar, bwrsVar, a, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void q(View view) {
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setStartDelay(250L).setDuration(250L).setInterpolator(irf.b).start();
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((bhum) btsx.b(bhum.class, this)).cM(this);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        gfw ba = ba();
        if (ba != null) {
            ba.Qn(obj);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf c = this.c.c(new bhwd(), viewGroup);
        c.e(this.af);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            bwqv bwqvVar = this.d;
            Bundle bundle2 = this.o;
            dbsk.s(bundle2);
            this.ae = bwqvVar.e(ilo.class, bundle2, "PLACEMARK_REF_KEY");
            bwqv bwqvVar2 = this.d;
            Bundle bundle3 = this.o;
            dbsk.s(bundle3);
            this.aj = (bhww) bwqvVar2.d(bhww.class, bundle3, "LISTENER_KEY");
            bwqv bwqvVar3 = this.d;
            Bundle bundle4 = this.o;
            dbsk.s(bundle4);
            axuc axucVar = (axuc) bwqvVar3.d(axuc.class, bundle4, "ALIAS_FLOW_DATA_KEY");
            axvp a2 = axucVar != null ? axvb.a(axucVar.a(J())) : null;
            this.ah = this.o.getBoolean("CONTACT_MODE_KEY", false);
            bhxz bhxzVar = this.f;
            bwrs<ilo> bwrsVar = this.ae;
            dbsk.s(bwrsVar);
            bhww bhwwVar = this.aj;
            dbsk.s(bhwwVar);
            bhxp bhxpVar = this.ai;
            boolean z = this.ah;
            ff ffVar = (ff) ((dxjd) bhxzVar.a).a;
            bhxz.a(ffVar, 1);
            bvrb a3 = bhxzVar.b.a();
            bhxz.a(a3, 2);
            cztz a4 = bhxzVar.c.a();
            bhxz.a(a4, 3);
            dxio a5 = ((dxjh) bhxzVar.d).a();
            bhxz.a(a5, 4);
            dzsj<axwy> dzsjVar = bhxzVar.e;
            dxio a6 = ((dxjh) bhxzVar.f).a();
            bhxz.a(a6, 6);
            buju a7 = bhxzVar.g.a();
            bhxz.a(a7, 7);
            cqhn a8 = bhxzVar.h.a();
            bhxz.a(a8, 8);
            btvo a9 = bhxzVar.i.a();
            bhxz.a(a9, 9);
            axws a10 = bhxzVar.j.a();
            bhxz.a(a10, 10);
            Executor a11 = bhxzVar.k.a();
            bhxz.a(a11, 11);
            cjqy a12 = bhxzVar.l.a();
            bhxz.a(a12, 12);
            bhxz.a(this, 13);
            bhxz.a(bwrsVar, 14);
            bhxz.a(bhwwVar, 15);
            bhxz.a(bhxpVar, 16);
            this.af = new bhxy(ffVar, a3, a4, a5, dzsjVar, a6, a7, a8, a9, a10, a11, a12, this, bwrsVar, bhwwVar, bhxpVar, z, a2);
            this.ag = false;
        } catch (IOException e) {
            throw new RuntimeException("Cannot create fragment without Placemark and listener", e);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.aQ;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        EditText editText;
        super.s();
        if (btpf.a(J())) {
            this.g.a(7);
        }
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
        View view = this.P;
        if (view == null || (editText = (EditText) cqkx.e(view, bhwd.a, EditText.class)) == null) {
            return;
        }
        this.af.A(editText);
        bwrs<ilo> bwrsVar = this.ae;
        if (bwrsVar != null && bwrsVar.c() != null) {
            bwrs<ilo> bwrsVar2 = this.ae;
            dbsk.s(bwrsVar2);
            ilo c = bwrsVar2.c();
            dbsk.s(c);
            if (c.bi() && !this.ag && !this.ah) {
                bwrs<ilo> bwrsVar3 = this.ae;
                dbsk.s(bwrsVar3);
                ilo c2 = bwrsVar3.c();
                dbsk.s(c2);
                editText.setText(c2.bh());
                editText.post(new bhuk(this, editText, view));
            }
        }
        editText.setText(dbsj.e(this.af.a()));
        editText.post(new bhuk(this, editText, view));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ag = true;
        if (btpf.a(J())) {
            this.g.b();
        }
        View view = this.P;
        if (view != null) {
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            ((InputMethodManager) ggaVar.getSystemService("input_method")).hideSoftInputFromWindow(((EditText) cqkx.e(view, bhwd.a, EditText.class)).getWindowToken(), 2);
            this.af.A(null);
        }
        this.ad.a().g();
        super.u();
    }
}
