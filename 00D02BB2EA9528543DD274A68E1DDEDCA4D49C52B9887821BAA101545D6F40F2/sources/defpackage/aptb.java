package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
/* compiled from: PG */
/* renamed from: aptb  reason: default package */
/* loaded from: classes2.dex */
public final class aptb extends ges implements egq, gfw, bvvv {
    private static final String c = "aptb";
    public efg a;
    public bvts b;
    @dzsi
    private bvtr d;

    public static aptb g(bvxu bvxuVar, WebViewCallbacks webViewCallbacks, ddho ddhoVar) {
        aptb aptbVar = new aptb();
        bvvr e = bvvs.e();
        e.b(bvxuVar);
        ((bvvn) e).b = webViewCallbacks;
        bvtr.c(e.a(), ddhoVar, aptbVar);
        return aptbVar;
    }

    @Override // defpackage.fd
    public final void Qj(@dzsi Bundle bundle) {
        super.Qj(bundle);
        w().j(bundle);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        w().l(obj);
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (this.aD) {
            w().o(this.P);
        }
    }

    @Override // defpackage.bvvv
    public final boolean Rl() {
        return true;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return w().c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        w().g();
        super.ak();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        w().n();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        w().h();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (w().f()) {
            return true;
        }
        bwce bwceVar = w().a;
        if (bwceVar == null) {
            return false;
        }
        bwceVar.k().j("pa.nbp", dbmn.a, (dssr) dbmp.a.cu(7));
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        w().d(this, this.o, bundle);
        super.l(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return w().k();
    }

    public final void q(dbno dbnoVar) {
        bwce bwceVar = w().a;
        if (bwceVar != null) {
            bwceVar.k().j("pa.umi", dbnoVar, (dssr) dbnq.a.cu(7));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.F(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.J(this);
        egjVar.j(false);
        this.a.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        w().i(bundle);
    }

    public final bvtr w() {
        if (this.d == null) {
            this.d = this.b.a(null);
        }
        return this.d;
    }
}
