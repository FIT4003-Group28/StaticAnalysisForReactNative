package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
/* compiled from: PG */
/* renamed from: bvtq  reason: default package */
/* loaded from: classes4.dex */
public final class bvtq extends ges implements egq, gfw, bvvv {
    private static final String d = "bvtq";
    public efg a;
    public bvts b;
    @dzsi
    public bwce c;
    @dzsi
    private bvtr e;

    @Deprecated
    public static ges g(bvxu bvxuVar, @dzsi WebViewCallbacks webViewCallbacks, ddho ddhoVar) {
        bvtq bvtqVar = new bvtq();
        bvtr.a(bvxuVar, webViewCallbacks, ddhoVar, bvtqVar);
        return bvtqVar;
    }

    private final bvtr q() {
        if (this.e == null) {
            this.e = this.b.a(this.c);
        }
        return this.e;
    }

    @Override // defpackage.fd
    public final void Qj(@dzsi Bundle bundle) {
        super.Qj(bundle);
        q().j(bundle);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        q().l(obj);
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (this.aD) {
            q().o(this.P);
        }
    }

    @Override // defpackage.bvvv
    public final boolean Rl() {
        return true;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return q().c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        q().g();
        super.ak();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        q().n();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        q().h();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return q().f();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        q().d(this, this.o, bundle);
        super.l(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return q().k();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.y(q().b);
        egjVar.e(this);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.F(null);
        egjVar.J(this);
        egjVar.j(false);
        this.a.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        q().i(bundle);
    }
}
