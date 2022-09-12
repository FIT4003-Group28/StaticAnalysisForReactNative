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
public class InsightsReportWebViewCallbacks implements WebViewCallbacks {
    @dzsi
    private bwrs<ilo> b;
    private static final dcqe a = dcqe.c("com.google.android.apps.gmm.merchantmode.webview.InsightsReportWebViewCallbacks");
    public static final Parcelable.Creator<InsightsReportWebViewCallbacks> CREATOR = new aptm();

    public InsightsReportWebViewCallbacks(Bundle bundle) {
        try {
            bwrs<ilo> e = ((bwqz) btsr.a(bwqz.class)).rD().e(ilo.class, bundle, "PLACEMARK_KEY");
            dbsk.s(e);
            this.b = e;
        } catch (IOException e2) {
            Object[] objArr = new Object[1];
            objArr[0] = e2.getCause() != null ? e2.getCause() : e2;
            bvoo.h("Unable to fetch placemark storage reference %s", objArr);
        }
    }

    public InsightsReportWebViewCallbacks(bwrs<ilo> bwrsVar) {
        this.b = bwrsVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        Toast.makeText(ggaVar, ggaVar.getString(R.string.ERROR_LOADING_TOAST), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        return dcdc.e();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
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
        rD.c(bundle, "PLACEMARK_KEY", this.b);
        parcel.writeBundle(bundle);
    }
}
