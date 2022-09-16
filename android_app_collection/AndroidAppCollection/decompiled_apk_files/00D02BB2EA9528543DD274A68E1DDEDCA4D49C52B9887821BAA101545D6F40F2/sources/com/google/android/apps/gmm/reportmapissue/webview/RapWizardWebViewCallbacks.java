package com.google.android.apps.gmm.reportmapissue.webview;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class RapWizardWebViewCallbacks implements WebViewCallbacks {
    public bpwt a;
    public bpww b;
    public bpxc c;
    public bpxh d;
    public bpxi e;
    public bpxl f;
    public bpxm g;
    public bpxp h;
    public bpxq i;
    public bpxs j;
    public bpxz k;
    public bpxr l;
    public bpxf m;
    public bpvf n;
    @dzsi
    private List<bvwz> p;
    @dzsi
    private bpxy q;
    @dzsi
    private bwrs<ilo> r;
    private final boolean s;
    private static final dcqe o = dcqe.c("com.google.android.apps.gmm.reportmapissue.webview.RapWizardWebViewCallbacks");
    public static final Parcelable.Creator<RapWizardWebViewCallbacks> CREATOR = new bpxt();

    public RapWizardWebViewCallbacks(Bundle bundle) {
        try {
            this.r = ((bwqz) btsr.a(bwqz.class)).rD().e(ilo.class, bundle, "PLACEMARK_KEY");
        } catch (IOException e) {
            Object[] objArr = new Object[1];
            objArr[0] = e.getCause() != null ? e.getCause() : e;
            bvoo.h("Unable to fetch placemark storage reference %s", objArr);
        }
        this.s = bundle.getBoolean("CLEANUP_FEEDBACK_FLOW_KEY", false);
    }

    public RapWizardWebViewCallbacks(@dzsi bwrs<ilo> bwrsVar, boolean z) {
        this.r = bwrsVar;
        this.s = z;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        Toast.makeText(ggaVar, ggaVar.getString(R.string.REPORT_A_PROBLEM_NOT_AVAILABLE_OFFLINE), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        List<bvwz> list = this.p;
        if (list != null) {
            return list;
        }
        ((bpxu) btsq.b(bpxu.class, ggaVar)).xx(this);
        bpxz bpxzVar = this.k;
        bwrs<ilo> bwrsVar = this.r;
        gga a = bpxzVar.a.a();
        bpxz.a(a, 1);
        bwqv a2 = bpxzVar.b.a();
        bpxz.a(a2, 2);
        befw a3 = bpxzVar.c.a();
        bpxz.a(a3, 3);
        bpxy bpxyVar = new bpxy(a, a2, a3, bwrsVar);
        this.q = bpxyVar;
        bpwt bpwtVar = this.a;
        bpww bpwwVar = this.b;
        dbsk.s(bpxyVar);
        gga a4 = bpwwVar.a.a();
        bpww.a(a4, 1);
        bvvw a5 = bpwwVar.b.a();
        bpww.a(a5, 2);
        dxio a6 = ((dxjh) bpwwVar.c).a();
        bpww.a(a6, 3);
        bovv a7 = bpwwVar.d.a();
        bpww.a(a7, 4);
        bpww.a(bpxyVar, 5);
        bpwv bpwvVar = new bpwv(a4, a5, a6, a7, bpxyVar);
        bpxc bpxcVar = this.c;
        bpvf bpvfVar = this.n;
        gga a8 = bpxcVar.a.a();
        bpxc.a(a8, 1);
        bwqv a9 = bpxcVar.b.a();
        bpxc.a(a9, 2);
        bpxc.a(bpvfVar, 3);
        bpxb bpxbVar = new bpxb(a8, a9, bpvfVar);
        bpxf bpxfVar = this.m;
        akfa a10 = bpxfVar.a.a();
        bpxf.a(a10, 1);
        akfc a11 = bpxfVar.b.a();
        bpxf.a(a11, 2);
        bpxe bpxeVar = new bpxe(a10, a11);
        bpxh bpxhVar = this.d;
        bpvf bpvfVar2 = this.n;
        gga a12 = bpxhVar.a.a();
        bpxh.a(a12, 1);
        bwqv a13 = bpxhVar.b.a();
        bpxh.a(a13, 2);
        boyd a14 = bpxhVar.c.a();
        bpxh.a(a14, 3);
        bpxh.a(bpvfVar2, 4);
        bpxg bpxgVar = new bpxg(a12, a13, a14, bpvfVar2);
        bpxi bpxiVar = this.e;
        bpxl bpxlVar = this.f;
        bpxy bpxyVar2 = this.q;
        dbsk.s(bpxyVar2);
        dxio a15 = ((dxjh) bpxlVar.a).a();
        bpxl.a(a15, 1);
        btvo a16 = bpxlVar.b.a();
        bpxl.a(a16, 2);
        bpxl.a(bpxyVar2, 3);
        bpxk bpxkVar = new bpxk(a15, a16, bpxyVar2);
        bpxp bpxpVar = this.h;
        bpxy bpxyVar3 = this.q;
        dbsk.s(bpxyVar3);
        bpxp.a(bpxpVar.a.a(), 1);
        bvvw a17 = bpxpVar.b.a();
        bpxp.a(a17, 2);
        boxa a18 = bpxpVar.c.a();
        bpxp.a(a18, 3);
        bpxp.a(bpxyVar3, 4);
        dcdc p = dcdc.p(bpwtVar, bpwvVar, bpxbVar, bpxeVar, bpxgVar, bpxiVar, bpxkVar, new bpxo(a17, a18, bpxyVar3), this.i, this.g, this.j, this.l, new bvwz[0]);
        this.p = p;
        return p;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ((ckhe) ((ckcu) btsr.a(ckcu.class)).rU().a(ckji.a)).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final boolean e(WebView webView) {
        return false;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void f(bvxh bvxhVar) {
        bvxhVar.k().i();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final boolean g(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        return false;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void h() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void i(gga ggaVar) {
        if (!this.s || ggaVar.isChangingConfigurations()) {
            return;
        }
        ((btri) btsr.a(btri.class)).rz().b(new acfl(acfk.INACTIVE, null));
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void j() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        bpxy bpxyVar = this.q;
        bwrs<ilo> bwrsVar = bpxyVar != null ? bpxyVar.a : this.r;
        Bundle bundle = new Bundle();
        rD.c(bundle, "PLACEMARK_KEY", bwrsVar);
        bundle.putBoolean("CLEANUP_FEEDBACK_FLOW_KEY", this.s);
        parcel.writeBundle(bundle);
    }
}
