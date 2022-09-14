package com.google.android.apps.gmm.customchevron.webview;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CustomChevronWebViewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<CustomChevronWebViewCallbacks> CREATOR = new ppf();
    public ppu a;
    public ppl b;
    public ppp c;
    private final String d;
    private final String e;
    private final int f;
    private final Runnable g;
    private ppt h;
    private ppk i;
    private ppo j;

    public CustomChevronWebViewCallbacks(String str, String str2, int i, Runnable runnable) {
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = runnable;
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
        ((ppg) btsq.b(ppg.class, ggaVar)).wC(this);
        ppu ppuVar = this.a;
        int i = this.f;
        Runnable runnable = this.g;
        gga a = ppuVar.a.a();
        ppu.a(a, 1);
        Executor a2 = ppuVar.b.a();
        ppu.a(a2, 2);
        pnq a3 = ppuVar.c.a();
        ppu.a(a3, 3);
        bvjj a4 = ppuVar.d.a();
        ppu.a(a4, 4);
        araj a5 = ppuVar.e.a();
        ppu.a(a5, 5);
        pot a6 = ppuVar.f.a();
        ppu.a(a6, 6);
        ppu.a(runnable, 8);
        this.h = new ppt(a, a2, a3, a4, a5, a6, i, runnable);
        ppl pplVar = this.b;
        String str = this.d;
        String str2 = this.e;
        int i2 = this.f;
        gga a7 = pplVar.a.a();
        ppl.a(a7, 1);
        pnq a8 = pplVar.b.a();
        ppl.a(a8, 2);
        Executor a9 = pplVar.c.a();
        ppl.a(a9, 3);
        ppl.a(str, 4);
        ppl.a(str2, 5);
        this.i = new ppk(a7, a8, a9, str, str2, i2);
        ppp pppVar = this.c;
        gga a10 = pppVar.a.a();
        ppp.a(a10, 1);
        pnq a11 = pppVar.b.a();
        ppp.a(a11, 2);
        bvjj a12 = pppVar.c.a();
        ppp.a(a12, 3);
        ppo ppoVar = new ppo(a10, a11, a12);
        this.j = ppoVar;
        return dcdc.h(this.h, this.i, ppoVar);
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
