package com.google.android.apps.gmm.place.riddler.webview;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.place.riddler.webview.RiddlerWebViewCallbacks;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RiddlerWebViewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<RiddlerWebViewCallbacks> CREATOR = new bmac();
    public btvo b;
    public blzy c;
    public dxio<bmaa> d;
    public bmag e;
    public dxio<blzv> f;
    private final ckcw g = ((ckcu) btsr.a(ckcu.class)).rU();
    public final btrm a = ((btri) btsr.a(btri.class)).rz();

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        Toast.makeText(ggaVar, ggaVar.getString(R.string.RIDDLER_WEBVIEW_ERROR_TOAST), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        dcdc e;
        dcdc e2;
        ((bmad) btsq.b(bmad.class, ggaVar)).xq(this);
        dccx F = dcdc.F();
        F.g(new bvwx(new Runnable(this) { // from class: bmab
            private final RiddlerWebViewCallbacks a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(new blpn());
            }
        }));
        F.g(this.c);
        F.g(this.e);
        if (this.b.getEnableFeatureParameters().bg) {
            e = dcdc.f(this.d.a());
        } else {
            e = dcdc.e();
        }
        F.i(e);
        if (this.b.getEnableFeatureParameters().aY) {
            e2 = dcdc.f(this.f.a());
        } else {
            e2 = dcdc.e();
        }
        F.i(e2);
        return F.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ((ckhe) this.g.a(ckjw.L)).c();
        ((ckhe) this.g.a(ckjw.M)).c();
        ((ckhe) this.g.a(ckjw.O)).c();
        ((ckhe) this.g.a(ckjw.P)).c();
        ((ckhe) this.g.a(ckjw.J)).c();
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
