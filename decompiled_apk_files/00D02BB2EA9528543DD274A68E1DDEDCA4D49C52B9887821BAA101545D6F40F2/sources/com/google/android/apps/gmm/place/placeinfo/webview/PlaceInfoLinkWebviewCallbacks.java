package com.google.android.apps.gmm.place.placeinfo.webview;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlaceInfoLinkWebviewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<PlaceInfoLinkWebviewCallbacks> CREATOR = new biyk();

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        Toast.makeText(ggaVar, (int) R.string.UNKNOWN_ERROR, 1).show();
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
    }
}
