package com.google.android.apps.gmm.shared.webview.api;

import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public interface WebViewCallbacks extends Parcelable {
    void a();

    void b(gga ggaVar);

    List<bvwz> c(gga ggaVar);

    void d();

    boolean e(@dzsi WebView webView);

    void f(bvxh bvxhVar);

    boolean g(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void h();

    void i(gga ggaVar);

    void j();
}
