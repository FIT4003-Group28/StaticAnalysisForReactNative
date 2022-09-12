package com.google.android.apps.gmm.personalplaces.constellations.details.webview;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RelatedListsWebViewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<RelatedListsWebViewCallbacks> CREATOR = new ayrn();
    public ayrj a;
    public ayrl b;
    @dzsi
    aymv c;

    public RelatedListsWebViewCallbacks(@dzsi aymv aymvVar) {
        this.c = aymvVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((ayro) btsq.b(ayro.class, ggaVar)).xj(this);
        return dcdc.g(this.a, this.b);
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
        aymv aymvVar = this.c;
        if (aymvVar != null) {
            aymvVar.c(true);
        }
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
