package com.google.android.apps.gmm.experiences.details.modules.webview;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class EventWebResultsWebViewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<EventWebResultsWebViewCallbacks> CREATOR = new aazc();
    public aazk a;
    public aazm b;
    public aagb c;
    private final ckcw d = ((ckcu) btsr.a(ckcu.class)).rU();

    private final void k(gga ggaVar) {
        ((aazd) btsq.b(aazd.class, ggaVar)).wI(this);
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        ((ckco) this.d.a(ckfa.a)).a(1);
        k(ggaVar);
        this.c.a();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        k(ggaVar);
        return dcdc.g(this.a, this.b);
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ((ckhe) this.d.a(ckfa.b)).c();
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
