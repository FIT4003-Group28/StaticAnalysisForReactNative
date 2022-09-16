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
public class DeletePostsWebViewCallbacks implements WebViewCallbacks {
    public apuf a;
    private ilo b;
    private static final dcqe c = dcqe.c("com.google.android.apps.gmm.merchantmode.webview.DeletePostsWebViewCallbacks");
    public static final Parcelable.Creator<DeletePostsWebViewCallbacks> CREATOR = new apte();

    public DeletePostsWebViewCallbacks(Bundle bundle) {
        try {
            bwrs e = ((bwqz) btsr.a(bwqz.class)).rD().e(ilo.class, bundle, "PLACEMARK_KEY");
            dbsk.s(e);
            this.b = (ilo) e.c();
        } catch (IOException e2) {
            Object[] objArr = new Object[1];
            objArr[0] = e2.getCause() != null ? e2.getCause() : e2;
            bvoo.h("Unable to fetch placemark storage reference %s", objArr);
        }
    }

    public DeletePostsWebViewCallbacks(ilo iloVar) {
        this.b = iloVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
        ((ckhe) ((ckcu) btsr.a(ckcu.class)).rU().a(ckgp.j)).c();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        ((aptf) btsq.b(aptf.class, ggaVar)).wY(this);
        Toast.makeText(ggaVar, ggaVar.getString(R.string.ERROR_LOADING_TOAST), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((aptf) btsq.b(aptf.class, ggaVar)).wY(this);
        ilo iloVar = this.b;
        if (iloVar == null) {
            bvoo.h("Unable to register delete posts webview callbacks without placemarkRef.", new Object[0]);
            return dcdc.e();
        }
        return dcdc.f(this.a.a(bwrs.a(iloVar), 1));
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ((ckhe) ((ckcu) btsr.a(ckcu.class)).rU().a(ckgp.k)).c();
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
        rD.c(bundle, "PLACEMARK_KEY", bwrs.a(this.b));
        parcel.writeBundle(bundle);
    }
}
