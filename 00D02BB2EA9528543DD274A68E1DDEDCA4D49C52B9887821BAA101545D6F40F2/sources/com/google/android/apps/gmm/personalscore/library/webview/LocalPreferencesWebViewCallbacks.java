package com.google.android.apps.gmm.personalscore.library.webview;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.personalscore.library.webview.LocalPreferencesWebViewCallbacks;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocalPreferencesWebViewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<LocalPreferencesWebViewCallbacks> CREATOR = new bbmd();
    @dzsi
    public bwrs<ilo> a;
    public boolean b;
    public bbmj c;
    public bbmg d;
    public dxio<bbdv> e;

    public LocalPreferencesWebViewCallbacks(Bundle bundle) {
        this.b = false;
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        this.b = ((Boolean) bundle.getSerializable("PREFERENCE_CHANGE_KEY")).booleanValue();
        try {
            this.a = rD.e(ilo.class, bundle, "PLACEMARK_KEY");
        } catch (IOException unused) {
        }
    }

    public LocalPreferencesWebViewCallbacks(@dzsi bwrs<ilo> bwrsVar) {
        this.b = false;
        this.a = bwrsVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        Toast.makeText(ggaVar, ggaVar.getString(R.string.LOCAL_PREFERENCES_OFFLINE_SNACKBAR_TEXT), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((bbme) btsq.b(bbme.class, ggaVar)).xk(this);
        bbmj bbmjVar = this.c;
        Runnable runnable = new Runnable(this) { // from class: bbmc
            private final LocalPreferencesWebViewCallbacks a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LocalPreferencesWebViewCallbacks localPreferencesWebViewCallbacks = this.a;
                if (localPreferencesWebViewCallbacks.a == null) {
                    return;
                }
                bwrs<ilo> bwrsVar = localPreferencesWebViewCallbacks.a;
                dbsk.s(bwrsVar);
                localPreferencesWebViewCallbacks.e.a().E(bwrsVar);
                localPreferencesWebViewCallbacks.b = true;
            }
        };
        anhk a = bbmjVar.a.a();
        bbmj.a(a, 1);
        bbnd a2 = bbmjVar.b.a();
        bbmj.a(a2, 2);
        return dcdc.g(new bbmi(a, a2, runnable), this.d);
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ((bvjq) btsr.a(bvjq.class)).rB().T(bvjk.aQ, ((akfb) btsr.a(akfb.class)).rK().j(), true);
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
        if (this.a == null || !this.b) {
            return;
        }
        bwrs<ilo> bwrsVar = this.a;
        dbsk.s(bwrsVar);
        this.e.a().J(bwrsVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PREFERENCE_CHANGE_KEY", Boolean.valueOf(this.b));
        rD.c(bundle, "PLACEMARK_KEY", this.a);
        parcel.writeBundle(bundle);
    }
}
