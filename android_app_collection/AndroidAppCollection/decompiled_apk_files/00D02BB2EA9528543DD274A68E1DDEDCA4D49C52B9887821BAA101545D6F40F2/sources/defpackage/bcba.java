package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcba  reason: default package */
/* loaded from: classes3.dex */
public class bcba extends ges implements btzi<dwvf, dwvj> {
    public cjqy a;
    private bcbf ad;
    private Context ae;
    private int af;
    public efg b;
    public cqkj c;
    public bcbk d;
    public eeu e;
    public bcbe f;
    public buzr g;

    private final void g() {
        Toast.makeText(this.ae, (int) R.string.DATA_REQUEST_ERROR, 1).show();
    }

    private final void i(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) J().getSystemService("input_method");
        if (z) {
            inputMethodManager.toggleSoftInput(2, 1);
            return;
        }
        View view = this.P;
        if (view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwvf> btzrVar, btzy btzyVar) {
        g();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwvf> btzrVar, dwvj dwvjVar) {
        int a = dwvi.a(dwvjVar.a);
        if (a == 0 || a == 1) {
            return;
        }
        g();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.getWindow().setSoftInputMode(this.af);
        }
        super.Qd();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ae(Activity activity) {
        this.af = activity.getWindow().getAttributes().softInputMode;
        activity.getWindow().setSoftInputMode(16);
        super.ae(activity);
        this.ae = activity.getApplicationContext();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf d = this.c.d(new bcay(), viewGroup, false);
        d.e(this.ad);
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        bbtw bbtwVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        bcbe bcbeVar = (bcbe) bvrs.e(bundle, bcbe.class, (dssr) bcbe.f.cu(7));
        dbsk.s(bcbeVar);
        this.f = bcbeVar;
        bcbk bcbkVar = this.d;
        if (bcbeVar.c) {
            bbtwVar = bbtw.SEND_TO_SERVER_IMMEDIATELY;
        } else {
            bbtwVar = bbtw.DONT_SEND_YET;
        }
        bbtw bbtwVar2 = bbtwVar;
        dwfl dwflVar = this.f.d;
        if (dwflVar == null) {
            dwflVar = dwfl.w;
        }
        dwfl dwflVar2 = dwflVar;
        String str = this.f.b.isEmpty() ? null : this.f.b;
        String str2 = this.f.e;
        bcbk.a(this, 1);
        bcbk.a(bbtwVar2, 2);
        bcbk.a(dwflVar2, 3);
        bcbk.a(str2, 5);
        Application a = bcbkVar.a.a();
        bcbk.a(a, 6);
        this.ad = new bcbj(this, bbtwVar2, dwflVar2, str, str2, a);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.u;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.e.h()) {
            efg efgVar = this.b;
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.f(false);
            egjVar.w(this.P);
            egjVar.e(this);
            efgVar.a(egjVar.a());
        }
        i(true);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bcbe bcbeVar = this.f;
        dbsk.s(bcbeVar);
        dsqp dsqpVar = (dsqp) bcbeVar.cu(5);
        dsqpVar.bC(bcbeVar);
        bcbd bcbdVar = (bcbd) dsqpVar;
        String charSequence = this.ad.c().toString();
        if (bcbdVar.c) {
            bcbdVar.bF();
            bcbdVar.c = false;
        }
        bcbe bcbeVar2 = (bcbe) bcbdVar.b;
        charSequence.getClass();
        bcbeVar2.a |= 1;
        bcbeVar2.b = charSequence;
        bvrs.l(bundle, bcbdVar.bK());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        i(false);
        super.u();
    }
}
