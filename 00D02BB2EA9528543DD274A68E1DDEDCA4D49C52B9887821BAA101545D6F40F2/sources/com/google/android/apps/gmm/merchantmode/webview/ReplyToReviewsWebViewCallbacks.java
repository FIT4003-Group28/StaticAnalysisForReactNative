package com.google.android.apps.gmm.merchantmode.webview;

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
public class ReplyToReviewsWebViewCallbacks implements WebViewCallbacks {
    public apuj a;
    public aptk b;
    @dzsi
    private bwrs<ilo> d;
    private static final dcqe c = dcqe.c("com.google.android.apps.gmm.merchantmode.webview.ReplyToReviewsWebViewCallbacks");
    public static final Parcelable.Creator<ReplyToReviewsWebViewCallbacks> CREATOR = new aptw();

    public ReplyToReviewsWebViewCallbacks(Bundle bundle) {
        try {
            bwrs<ilo> e = ((bwqz) btsr.a(bwqz.class)).rD().e(ilo.class, bundle, "PLACEMARK_KEY");
            dbsk.s(e);
            this.d = e;
        } catch (IOException e2) {
            Object[] objArr = new Object[1];
            objArr[0] = e2.getCause() != null ? e2.getCause() : e2;
            bvoo.h("Unable to fetch placemark storage reference %s", objArr);
        }
    }

    public ReplyToReviewsWebViewCallbacks(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
        ckcw rU = ((ckcu) btsr.a(ckcu.class)).rU();
        ((ckhe) rU.a(ckgp.a)).c();
        ((ckhe) rU.a(ckgp.c)).c();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        ((aptx) btsq.b(aptx.class, ggaVar)).wZ(this);
        Toast.makeText(ggaVar, ggaVar.getString(R.string.ERROR_LOADING_TOAST), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((aptx) btsq.b(aptx.class, ggaVar)).wZ(this);
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar == null) {
            bvoo.h("Unable to register reply to reviews webview callbacks without placemarkRef.", new Object[0]);
            return dcdc.e();
        }
        apuj apujVar = this.a;
        gga a = apujVar.a.a();
        apuj.a(a, 1);
        btrm a2 = apujVar.b.a();
        apuj.a(a2, 2);
        apuj.a(bwrsVar, 3);
        apui apuiVar = new apui(a, a2, bwrsVar);
        aptk aptkVar = this.b;
        bwrs<ilo> bwrsVar2 = this.d;
        dbsk.s(bwrsVar2);
        gga a3 = aptkVar.a.a();
        aptk.a(a3, 1);
        btrm a4 = aptkVar.b.a();
        aptk.a(a4, 2);
        aptk.a(bwrsVar2, 3);
        return dcdc.g(apuiVar, new aptj(a3, a4, bwrsVar2));
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ckcw rU = ((ckcu) btsr.a(ckcu.class)).rU();
        ((ckhe) rU.a(ckgp.b)).c();
        ((ckhe) rU.a(ckgp.d)).c();
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
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void j() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        Bundle bundle = new Bundle();
        rD.c(bundle, "PLACEMARK_KEY", this.d);
        parcel.writeBundle(bundle);
    }
}
