package com.google.android.apps.gmm.merchantmode.webview;

import android.app.Application;
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
public class CreatePostsWebViewCallbacks implements WebViewCallbacks {
    public aptq a;
    public apuf b;
    public apub c;
    private bwrs<ilo> d;
    private static final dcqe e = dcqe.c("com.google.android.apps.gmm.merchantmode.webview.CreatePostsWebViewCallbacks");
    public static final Parcelable.Creator<CreatePostsWebViewCallbacks> CREATOR = new apsz();

    public CreatePostsWebViewCallbacks(Bundle bundle) {
        try {
            bwrs<ilo> e2 = ((bwqz) btsr.a(bwqz.class)).rD().e(ilo.class, bundle, "PLACEMARK_KEY");
            dbsk.s(e2);
            this.d = e2;
        } catch (IOException e3) {
            Object[] objArr = new Object[1];
            objArr[0] = e3.getCause() != null ? e3.getCause() : e3;
            bvoo.h("Unable to fetch placemark storage reference %s", objArr);
        }
    }

    public CreatePostsWebViewCallbacks(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
        ((ckhe) ((ckcu) btsr.a(ckcu.class)).rU().a(ckgp.h)).c();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        ((apta) btsq.b(apta.class, ggaVar)).wX(this);
        Toast.makeText(ggaVar, ggaVar.getString(R.string.ERROR_LOADING_TOAST), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((apta) btsq.b(apta.class, ggaVar)).wX(this);
        if (this.d.c() == null) {
            return dcdc.e();
        }
        aptq aptqVar = this.a;
        Application a = aptqVar.a.a();
        aptq.a(a, 1);
        gga a2 = aptqVar.b.a();
        aptq.a(a2, 2);
        apup a3 = aptqVar.c.a();
        aptq.a(a3, 3);
        bbtk a4 = aptqVar.d.a();
        aptq.a(a4, 4);
        bbtt a5 = aptqVar.e.a();
        aptq.a(a5, 5);
        bbut a6 = aptqVar.f.a();
        aptq.a(a6, 6);
        apto aptoVar = new apto(a, a2, a3, a4, a5, a6);
        aptoVar.g = dwyd.MERCHANT_MODE_CREATE_POST_WEBVIEW;
        ilo c = this.d.c();
        dbsk.s(c);
        aptoVar.h = c;
        aptp aptpVar = new aptp(aptoVar);
        apue a7 = this.b.a(this.d, 10);
        apub apubVar = this.c;
        apup a8 = apubVar.a.a();
        apub.a(a8, 1);
        gga a9 = apubVar.b.a();
        apub.a(a9, 2);
        return dcdc.h(aptpVar, a7, new apua(a8, a9));
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ((ckhe) ((ckcu) btsr.a(ckcu.class)).rU().a(ckgp.i)).c();
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
        webResourceError.toString();
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
