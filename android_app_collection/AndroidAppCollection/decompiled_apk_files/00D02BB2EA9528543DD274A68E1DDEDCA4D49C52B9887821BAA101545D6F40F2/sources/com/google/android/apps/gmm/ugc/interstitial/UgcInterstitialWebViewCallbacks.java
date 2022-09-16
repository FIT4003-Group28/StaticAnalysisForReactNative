package com.google.android.apps.gmm.ugc.interstitial;

import android.content.Intent;
import android.os.Parcel;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UgcInterstitialWebViewCallbacks implements WebViewCallbacks {
    private final ccgo a;
    private final Intent b;
    private final gga c;
    private final ccgn d;

    public UgcInterstitialWebViewCallbacks(ccgo ccgoVar, Intent intent, gga ggaVar, ccgn ccgnVar) {
        this.a = ccgoVar;
        this.b = intent;
        this.c = ggaVar;
        this.d = ccgnVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        gga ggaVar2 = this.c;
        Toast.makeText(ggaVar2, ggaVar2.getString(R.string.ERROR_LOADING_TOAST), 0).show();
        gn g = this.c.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ccgn ccgnVar = this.d;
        ccgo ccgoVar = this.a;
        Intent intent = this.b;
        ccgn.a(ccgoVar, 1);
        ccgn.a(intent, 2);
        gga a = ccgnVar.a.a();
        ccgn.a(a, 3);
        dxio a2 = ((dxjh) ccgnVar.b).a();
        ccgn.a(a2, 4);
        return dcdc.f(new ccgm(ccgoVar, intent, a, a2));
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ccgo ccgoVar = this.a;
        ((ckhe) ccgoVar.e.a(ckko.a)).c();
        ccgq ccgqVar = ccgoVar.g;
        if (ccgqVar == null || ccgoVar.f == null) {
            return;
        }
        ccgoVar.f.d(cjtd.a(((ccgj) ccgqVar).a));
        ccgoVar.h = ccgoVar.f.d(cjtd.a(((ccgj) ccgoVar.g).b));
        ccgoVar.f.d(cjtd.a(((ccgj) ccgoVar.g).c));
        ccgoVar.i = ccgoVar.f.d(cjtd.a(((ccgj) ccgoVar.g).d));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final boolean e(@dzsi WebView webView) {
        ccgo ccgoVar = this.a;
        ccgq ccgqVar = ccgoVar.g;
        if (ccgqVar != null) {
            ccgoVar.a(ccgoVar.i, ((ccgj) ccgqVar).d);
            return false;
        }
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
